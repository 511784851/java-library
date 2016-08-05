package com.blemobi.library.client;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 登录系统调用类
 */
public class LoginHttpClient extends BaseHttpClient {
	@Override
	public String createServerUrl(String basePath) {
		String[] accountInfo = Constant.getLoginServer();
		return super.createUrl(accountInfo, basePath);
	}
}
