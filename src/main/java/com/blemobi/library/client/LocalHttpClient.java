package com.blemobi.library.client;

import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.NameValuePair;

import com.blemobi.library.consul.SocketInfo;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 当前系统测试调用类
 */
public class LocalHttpClient extends BaseHttpClient {
	public LocalHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies, int port) {
		super(basePath, params, cookies);
		SocketInfo socketInfo = new SocketInfo("127.0.0.1", port);
		super.socketInfo = socketInfo;
		super.createUrl();
	}
}