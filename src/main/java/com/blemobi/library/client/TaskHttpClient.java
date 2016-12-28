package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.blemobi.sep.probuf.TaskProtos.PCallbackArray;

/*
 * 任务系统调用类
 */
public class TaskHttpClient extends BaseHttpClient {
	public TaskHttpClient() {
		super("task");
	}

	/*
	 * 回调
	 */
	public PMessage callback(PCallbackArray callbackArray) throws IOException {
		super.basePath = new StringBuffer("/task/callback/msgid?from=");
		super.basePath.append(JettyServer.getServerName());
		super.body = PMessage.newBuilder().setType("PCallbackArray").setData(callbackArray.toByteString()).build()
				.toByteArray();
		super.contentType = "application/x-protobuf";
		return super.postBodyMethod();
	}
}