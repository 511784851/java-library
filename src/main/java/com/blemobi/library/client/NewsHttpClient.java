package com.blemobi.library.client;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 新闻系统调用类
 */
public class NewsHttpClient extends BaseHttpClient {
	@Override
	public String createServerUrl(String basePath) {
		String[] accountInfo = Constant.getNewsServer();
		return super.createUrl(accountInfo, basePath);
	}
}
