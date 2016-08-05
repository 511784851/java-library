package com.blemobi.library.client;

import com.blemobi.library.global.Constant;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 评论系统调用类
 */
public class CommentHttpClient extends BaseHttpClient {
	@Override
	public String createServerUrl(String basePath) {
		String[] accountInfo = Constant.getCommentServer();
		return super.createUrl(accountInfo, basePath);
	}
}
