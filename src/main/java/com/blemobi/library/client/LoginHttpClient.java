package com.blemobi.library.client;

import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.NameValuePair;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 登录系统调用类
 */
public class LoginHttpClient extends BaseHttpClient {
	public LoginHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies) {
		super(basePath, params, cookies);
		String[] serverInfo = Constant.getLoginServer();
		super.serverInfo = serverInfo;
		super.createUrl();
	}
}
