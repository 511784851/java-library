package com.blemobi.library.client;

import java.io.IOException;
import java.util.List;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.blemobi.sep.probuf.TaskProtos.PSubscribe;
import com.blemobi.sep.probuf.TaskProtos.PSubscribeArray;

/*
 * 通用调用类
 */
public class CommonHttpClient extends BaseHttpClient {
	public CommonHttpClient(String sername) {
		super(sername);
	}

	/*
	 * 发送订阅消息给其它服务
	 */
	public PMessage subscribe(String basePath, List<PSubscribe> list) throws IOException {
		PSubscribeArray subscribeArray = PSubscribeArray.newBuilder().addAllSubscribe(list).build();
		super.basePath = new StringBuffer(basePath);
		super.basePath.append(JettyServer.getServerName());
		super.body = subscribeArray.toByteArray();
		super.contentType = "application/x-protobuf";
		return super.postBodyMethod();
	}
}