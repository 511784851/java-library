package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.NotificationApiProtos.PPushMsg;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/*
 * 通知系统调用类
 */
public class NotificationHttpClient extends BaseHttpClient {
	public NotificationHttpClient() {
		super("notification");
	}

	/*
	 * 通知消息
	 */
	public PMessage msg(PPushMsg pushMsg) throws IOException {
		super.basePath = new StringBuffer("/v1/notification/inside/msg?from=");
		super.basePath.append(JettyServer.getServerName());
		super.body = pushMsg.toByteArray();
		super.contentType = "form-data";
		return super.postBodyMethod();
	}
}