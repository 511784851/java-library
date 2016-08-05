package com.blemobi.library.client;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 好友系统调用类
 */
public class SocialHttpClient extends BaseHttpClient {
	@Override
	public String createServerUrl(String basePath) {
		String[] accountInfo = Constant.getSocialServer();
		return super.createUrl(accountInfo, basePath);
	}
}
