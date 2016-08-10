package com.blemobi.library.client;

import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.NameValuePair;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 当前系统测试调用类
 */
public class LocalHttpClient extends BaseHttpClient {
	public LocalHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies) {
		super(basePath, params, cookies);
		String[] serverInfo = new String[] { "127.0.0.1", "9018" };
		super.serverInfo = serverInfo;
		super.createUrl();
	}
}