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

import com.blemobi.library.consul.BaseService;
import com.blemobi.library.consul.SocketInfo;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

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
	 * 最终请求的url
	 */
	protected StringBuffer url;
	/**
	 * 接口地址
	 */
	protected StringBuffer basePath;
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
	public PMessage postMethod() throws ClientProtocolException, IOException {
		getServerURL();
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
	public PMessage getMethod() throws ClientProtocolException, IOException {
		getServerURL();
		HttpGet httpGet = new HttpGet(url.toString());
		return execute(httpGet);
	}

	/**
	 * post方式(body数据)
	 * 
	 * @return
	 * @throws IOException
	 */
	public PMessage postBodyMethod() throws IOException {
		getServerURL();
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
	private PMessage execute(HttpRequestBase httpRequestBase) throws ClientProtocolException, IOException {
		HttpClient client = HttpClients.custom().setConnectionManager(HttpClientPool.getManager()).build();
		HttpResponse response = client.execute(httpRequestBase);
		HttpEntity entity = response.getEntity();
		byte[] data = EntityUtils.toByteArray(entity);
		return ResultProtos.PMessage.parseFrom(data);
	}

	/**
	 * 生成服务的URL
	 */
	protected void getServerURL() {
		SocketInfo socketInfo = BaseService.getActiveServer(serverName);// Consul中获取服务信息
		url = new StringBuffer("http://");
		url.append(socketInfo.getIpAddr()).append(":").append(socketInfo.getPort()).append(basePath.toString());
		log.debug("Http Request url=[" + url + "]");
	}
}