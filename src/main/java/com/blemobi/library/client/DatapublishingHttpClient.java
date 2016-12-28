package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/*
 * 边缘系统调用类
 */
public class DatapublishingHttpClient extends BaseHttpClient {
	public DatapublishingHttpClient() {
		super("datapublishing");
	}

	/*
	 * 获取用户最后心跳时间
	 */
	public PMessage getLastHeartbeat(String uuids) throws IOException {
		super.basePath = new StringBuffer("/datapublishing/inside/heartbeat/last?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuids=").append(uuids);
		return super.getMethod();
	}
}