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
 * @author 赵勇<andy.zhao@blemobi.com>
 * 远程调用类
 */
@Log4j
public abstract class BaseHttpClient {
	/**
	 * post方式调用
	 * @param url 路径
	 * @param params 参数信息
	 * @return PMessage PMessage对象
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public PMessage postMethod(String basePath, List<NameValuePair> params, Cookie[] cookies) throws ClientProtocolException, IOException {
		String url = createServerUrl(basePath);
		
		HttpPost httpPost = new HttpPost(url);

		if (params != null) {
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
			httpPost.setEntity(entity);// 设置参数
		}

		return clientExecute(httpPost,cookies);
	}

	/**
	 * get方式调用
	 * @param url 路径
	 * @param params 参数信息
	 * @return PMessage PMessage对象
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	public PMessage getMethod(String basePath, List<NameValuePair> params, Cookie[] cookies) throws ClientProtocolException, IOException {
		String url = createServerUrl(basePath);
		url = resetGetUrl(url, params);// 生成带参数的url
		log.info("Exec getMethod() request url = [" + url + "]");
		HttpGet httpGet = new HttpGet(url);

		return clientExecute(httpGet,cookies);
	}
	public PMessage getMethod(String url, List<NameValuePair> params) throws ClientProtocolException, IOException {
		return getMethod(url, params, null);
	}

	/**
	 * 调用
	 * @param httpRequestBase http请求信息
	 * @return PMessage PMessage对象
	 * @throws IOException 
	 * @throws ClientProtocolException 
	 */
	private static PMessage clientExecute(HttpRequestBase httpRequestBase, Cookie[] cookies) throws ClientProtocolException, IOException {
		if (cookies != null) {
			StringBuilder sb = new StringBuilder();
			for (Cookie ck : cookies) {
				sb.append(ck.getName()).append('=').append(ck.getValue()).append(";");
			}
			httpRequestBase.setHeader("Cookie", sb.toString());// 设置cookie参数
		}
		HttpClient client = HttpClientBuilder.create().build();

		//httpRequestBase.addHeader("accept", MediaTypeExt.APPLICATION_PROTOBUF);

		HttpResponse response = client.execute(httpRequestBase);

		HttpEntity entity = response.getEntity();
		byte[] data = EntityUtils.toByteArray(entity);

		ResultProtos.PMessage message = ResultProtos.PMessage.parseFrom(data);

		return message;
	}

	/**
	 * 生成Get请求方式完整url
	 * @param path 路径
	 * @param params 参数信息
	 * @return String 最终的url
	 */
	private String resetGetUrl(String path, List<NameValuePair> params){
		StringBuffer url = new StringBuffer(path);
		if (params != null) {
			if(url.indexOf("?") < 0){
				url.append("?v=1");
			}
			for (NameValuePair nvp : params) {
				url.append("&");
				url.append(nvp.getName());
				url.append("=");
				url.append(nvp.getValue());
			}
		}
		return url.toString();
	}
	
	/**
	 * 生成各个系统的URL，需要子类实现
	 * @param basePath 资源路径
	 * @return String 账户系统资源URL
	 */
	protected abstract String createServerUrl(String basePath);
	
	/**
	 * 生成服务的URL
	 * @param address IP地址
	 * @param port IP端口
	 * @param basePath 资源路径
	 * @return String url路径
	 */
	protected String createUrl(String[] accountInfo, String basePath) {
		String address = accountInfo[0];
		int port = Integer.parseInt(accountInfo[1]);
		
		StringBuffer url = new StringBuffer("http://");
		url.append(address);
		url.append(":");
		url.append(port);
		url.append(basePath);

		return url.toString();
	}
}
