package com.blemobi.library.health;

import java.io.IOException;
import java.io.OutputStream;

import com.pakulov.jersey.protobuf.internal.MediaTypeExt;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

/**
 * 健康服务handle
 * 
 * @author zhaoyong
 *
 */
@SuppressWarnings("restriction")
abstract class HandlerAbstract implements HttpHandler {

	protected String serviceName;

	/**
	 * 构造方法
	 * 
	 * @param serviceName
	 */
	protected HandlerAbstract(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * handle
	 */
	public void handle(HttpExchange httpExchange) throws IOException {
		byte[] message = getRespData();
		httpExchange.sendResponseHeaders(200, message.length);
		Headers headers = httpExchange.getResponseHeaders();
		headers.set("Content-Type", MediaTypeExt.APPLICATION_PROTOBUF);
		OutputStream os = httpExchange.getResponseBody();
		os.write(message);
		os.close();
	}

	/**
	 * 子类实现
	 * 
	 * @return
	 */
	protected abstract byte[] getRespData();
}
