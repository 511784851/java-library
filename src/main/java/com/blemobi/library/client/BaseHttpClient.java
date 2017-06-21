package com.blemobi.library.client;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.blemobi.library.consul_v1.ConsulServiceMgr;
import com.blemobi.library.consul_v1.ServiceInfo;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.google.common.base.Strings;

import lombok.extern.log4j.Log4j;

/**
 * Http调用类
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class BaseHttpClient {
	/**
	 * 服务名称
	 */
	private String serverName;
	/**
	 * POST方式参数
	 */
	protected List<NameValuePair> params;
	/**
	 * body数据流
	 */
	protected byte[] body;
	/**
	 * body数据发送格式
	 */
	protected String contentType;
	/**
	 * cookie信息
	 */
	protected String cookie;

	/**
	 * 构造方法
	 * 
	 * @param serverName
	 *            服务名称
	 */
	protected BaseHttpClient(String serverName) {
		this.serverName = serverName;
	}

	/**
	 * post方式
	 * 
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public PMessage postMethod(String basePath) throws ClientProtocolException, IOException {
		String url = getServerURL(basePath);
		HttpPost httpPost = new HttpPost(url.toString());

		if (params != null) {
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(params, "UTF-8");
			httpPost.setEntity(entity);
		}

		return execute(httpPost);
	}

	/**
	 * get方式调用
	 * 
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public PMessage getMethod(String basePath) throws ClientProtocolException, IOException {
		String url = getServerURL(basePath);
		HttpGet httpGet = new HttpGet(url.toString());
		return execute(httpGet);
	}

	/**
	 * post方式(body数据)
	 * 
	 * @return
	 * @throws IOException
	 */
	public PMessage postBodyMethod(String basePath) throws IOException {
		String url = getServerURL(basePath);
		HttpPost httpPost = new HttpPost(url.toString());
		ByteArrayEntity entity = new ByteArrayEntity(body, ContentType.create(contentType));
		httpPost.setEntity(entity);// 设置参数
		return execute(httpPost);
	}

	/**
	 * Http请求
	 * 
	 * @param httpRequestBase
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	protected PMessage execute(HttpRequestBase httpRequestBase) throws ClientProtocolException, IOException {
		if (!Strings.isNullOrEmpty(cookie))
			httpRequestBase.setHeader("Cookie", cookie);// 设置cookie参数
		HttpClient client = HttpClients.custom().setConnectionManager(HttpClientPool.getManager()).build();
		HttpResponse response = client.execute(httpRequestBase);
		HttpEntity entity = response.getEntity();
		byte[] data = EntityUtils.toByteArray(entity);
		return ResultProtos.PMessage.parseFrom(data);
	}

	/**
	 * 生成服务的URL
	 */
	protected String getServerURL(String basePath) {
		ServiceInfo serviceInfo = ConsulServiceMgr.getHealthlyServiceByNm(serverName);// Consul中获取服务信息
		StringBuilder url = new StringBuilder("http://");
		url.append(serviceInfo.getAddr()).append(":").append(serviceInfo.getPort()).append(basePath);
		log.debug("Http Request url=[" + url + "]");
		return url.toString();
	}
}