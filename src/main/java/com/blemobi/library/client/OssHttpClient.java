package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * OSS系统调用类
 * 
 * @author zhaoyong
 *
 */
public class OssHttpClient extends BaseHttpClient {
	public OssHttpClient() {
		super("oss");
	}

	/**
	 * 内网获取多个下载文件的URL
	 * 
	 * @param filenames
	 * @return
	 * @throws IOException
	 */
	public PMessage getDownloadurls(String filenames) throws IOException {
		StringBuilder basePath = new StringBuilder("/oss/downloadurls?from=");
		basePath.append(JettyServer.getServerName()).append("&bucket=1").append("&objectkeys=").append(filenames);
		return super.getMethod(basePath.toString());
	}

	/**
	 * 内网访问批量获取带签名的文件上传URL
	 * 
	 * @param body
	 * @return
	 * @throws IOException
	 */
	public PMessage uploadurls(byte[] body) throws IOException {
		StringBuilder basePath = new StringBuilder("/oss/uploadurls?from=");
		basePath.append(JettyServer.getServerName()).append("&bucket=0");
		super.body = body;
		super.contentType = "form-data";
		return super.postBodyMethod(basePath.toString());
	}

	/**
	 * 获取单个下载文件的URL
	 * 
	 * @param objectkey
	 * @return
	 * @throws IOException
	 */
	public PMessage getDownloadurl(String objectkey) throws IOException {
		StringBuilder basePath = new StringBuilder("/oss/downloadurl?from=");
		basePath.append(JettyServer.getServerName()).append("&bucket=1").append("&objectkey=").append(objectkey);
		return super.getMethod(basePath.toString());
	}
}