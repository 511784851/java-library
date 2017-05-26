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

	public LocalHttpClient(String address, int port, StringBuilder basePath, List<NameValuePair> params, byte[] body,
			String contentType) {
		super("");
		this.address = address;
		this.port = port;
		super.basePath = basePath;
		super.params = params;
		super.body = body;
		super.contentType = contentType;
	}

	/**
	 * 生成服务的URL
	 */
	@Override
	protected void getServerURL() {
		url = new StringBuilder("http://");
		url.append(address).append(":").append(port).append(basePath.toString());
		log.debug("Http Request url=[" + url + "]");
	}
}