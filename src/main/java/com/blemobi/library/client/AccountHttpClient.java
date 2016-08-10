package com.blemobi.library.client;

import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.NameValuePair;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 账户系统调用类
 */
public class AccountHttpClient extends BaseHttpClient {
	public AccountHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies) {
		super(basePath, params, cookies);
		String[] serverInfo = Constant.getAccountServer();
		super.serverInfo = serverInfo;
		super.createUrl();
	}
}
