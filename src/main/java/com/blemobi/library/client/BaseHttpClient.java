package com.blemobi.library.client;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

import lombok.extern.log4j.Log4j;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 远程调用类
 */
@Log4j
public abstract class BaseHttpClient {
	private String basePath;
	private List<NameValuePair> params;
	private Cookie[] cookies;
	private StringBuffer url;
	protected String[] serverInfo;

	/**
	 * 构造方法
	 * 
	 * @param basePath
	 *            服务路径
	 * @param params
	 *            参数信息
	 * @param cookies
	 *            cookies信息
	 */
	public BaseHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies) {
		this.basePath = basePath;
		this.params = params;
		this.cookies = cookies;
	}

	/**
	 * post方式
	 * 
	 * @return PMessage PMessage对象
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	public PMessage postMethod() throws ClientProtocolException, IOException {
		HttpPost httpPost = new HttpPost(url.toString());

		if (params != null) {
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
			httpPost.setEntity(entity);// 设置参数
		}

		return execute(httpPost);
	}

	/**
	 * get方式调用
	 * 
	 * @return PMessage PMessage对象
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	public PMessage getMethod() throws ClientProtocolException, IOException {
		resetGetUrl();// 生成带参数的url
		log.info("Exec getMethod() request url = [" + url + "]");
		HttpGet httpGet = new HttpGet(url.toString());

		return execute(httpGet);
	}

	/**
	 * 调用
	 * 
	 * @param httpRequestBase
	 *            http请求信息
	 * @return PMessage PMessage对象
	 * @throws IOException
	 * @throws ClientProtocolException
	 */
	private PMessage execute(HttpRequestBase httpRequestBase) throws ClientProtocolException, IOException {
		if (cookies != null) {
			// 设置cookie参数
			StringBuilder sb = new StringBuilder();
			for (Cookie ck : cookies) {
				sb.append(ck.getName()).append('=').append(ck.getValue()).append(";");
			}
			httpRequestBase.setHeader("Cookie", sb.toString());
		}
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(httpRequestBase);
		HttpEntity entity = response.getEntity();
		byte[] data = EntityUtils.toByteArray(entity);
		ResultProtos.PMessage message = ResultProtos.PMessage.parseFrom(data);

		return message;
	}

	// 生成GET带参数的完整url
	private void resetGetUrl() {
		if (params != null) {
			if (url.indexOf("?") < 0) {
				url.append("?v=1");
			}
			for (NameValuePair nvp : params) {
				url.append("&");
				url.append(nvp.getName());
				url.append("=");
				url.append(nvp.getValue());
			}
		}
	}

	// 生成服务的URL
	protected void createUrl() {
		String address = serverInfo[0];
		int port = Integer.parseInt(serverInfo[1]);

		url = new StringBuffer("http://");
		url.append(address);
		url.append(":");
		url.append(port);
		url.append(basePath);
	}
}
