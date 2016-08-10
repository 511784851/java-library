package com.blemobi.library.client;

import java.util.List;

import javax.servlet.http.Cookie;

import org.apache.http.NameValuePair;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> oss系统调用类
 */
public class OssHttpClient extends BaseHttpClient {
	public OssHttpClient(String basePath, List<NameValuePair> params, Cookie[] cookies) {
		super(basePath, params, cookies);
		String[] serverInfo = Constant.getOssServer();
		super.serverInfo = serverInfo;
		super.createUrl();
	}
}
