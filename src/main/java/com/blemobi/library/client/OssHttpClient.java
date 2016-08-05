package com.blemobi.library.client;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> oss系统调用类
 */
public class OssHttpClient extends BaseHttpClient {
	@Override
	public String createServerUrl(String basePath) {
		String[] accountInfo = Constant.getOssServer();
		return super.createUrl(accountInfo, basePath);
	}
}
