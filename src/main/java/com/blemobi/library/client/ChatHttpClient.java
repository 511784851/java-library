package com.blemobi.library.client;

import java.io.IOException;
import java.util.List;

import org.apache.http.NameValuePair;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/*
 * 聊天系统调用类
 */
public class ChatHttpClient extends BaseHttpClient {
	public ChatHttpClient() {
		super("chat");
	}

	public PMessage multi(List<NameValuePair> params) throws IOException {
		super.basePath = new StringBuffer("/chat/push/msg/multi?from=");
		super.basePath.append(JettyServer.getServerName());
		super.params = params;
		return super.postMethod();
	}
}