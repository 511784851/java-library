package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * 大数据系统调用类
 * 
 * @author zhaoyong
 *
 */
public class DatapublishingHttpClient extends BaseHttpClient {
	public DatapublishingHttpClient() {
		super("datapublishing");
	}

	/**
	 * 获取用户最后心跳时间
	 * 
	 * @param uuids
	 * @return
	 * @throws IOException
	 */
	public PMessage getLastHeartbeat(String uuids) throws IOException {
		super.basePath = new StringBuilder("/datapublishing/inside/heartbeat/last?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuids=").append(uuids);
		return super.getMethod();
	}
}