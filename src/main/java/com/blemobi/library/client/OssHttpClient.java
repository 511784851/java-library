package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/*
 * OSS系统调用类
 */
public class OssHttpClient extends BaseHttpClient {
	public OssHttpClient() {
		super("oss");
	}

	/*
	 * 内网获取多个下载文件的URL
	 */
	public PMessage getDownloadurls(String filenames) throws IOException {
		super.basePath = new StringBuffer("/oss/downloadurls?from=");
		super.basePath.append(JettyServer.getServerName()).append("&bucket=0").append("&objectkeys=").append(filenames);
		return super.getMethod();
	}

	/*
	 * 内网访问批量获取带签名的文件上传URL
	 */
	public PMessage uploadurls(byte[] body) throws IOException {
		super.basePath = new StringBuffer("/oss/uploadurls?from=");
		super.basePath.append(JettyServer.getServerName()).append("&bucket=0");
		super.body = body;
		super.contentType = "form-data";
		return super.postBodyMethod();
	}

	/*
	 * 获取单个下载文件的URL
	 */
	public PMessage getDownloadurl(String objectkey) throws IOException {
		super.basePath = new StringBuffer("/oss/downloadurl?from=");
		super.basePath.append(JettyServer.getServerName()).append("&bucket=1").append("&objectkey=").append(objectkey);
		return super.getMethod();
	}
}