package com.blemobi.library.client;

import java.util.List;

import org.apache.http.NameValuePair;

import lombok.extern.log4j.Log4j;

/**
 * 测试调用类
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class LocalHttpClient extends BaseHttpClient {
	private String address;
	private int port;

	public LocalHttpClient(String address, int port, List<NameValuePair> params, String cookie, byte[] body,
			String contentType) {
		super("");
		this.address = address;
		this.port = port;
		super.params = params;
		super.cookie = cookie;
		super.body = body;
		super.contentType = contentType;
	}

	/**
	 * 生成服务的URL
	 */
	@Override
	protected String getServerURL(String basePath) {
		StringBuilder url = new StringBuilder("http://");
		url.append(address).append(":").append(port).append(basePath);
		log.debug("Http Request url=[" + url + "]");
		return url.toString();
	}
}