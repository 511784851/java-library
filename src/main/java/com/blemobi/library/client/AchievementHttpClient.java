package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.AchievementApiProtos.PAchievementActions;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * 成就系统调用类
 * 
 * @author zhaoyong
 *
 */
public class AchievementHttpClient extends BaseHttpClient {
	public AchievementHttpClient() {
		super("achievement");
	}

	/**
	 * 发送成就消息
	 * 
	 * @param achievementActions
	 * @return
	 * @throws IOException
	 */
	public PMessage action(PAchievementActions achievementActions) throws IOException {
		StringBuilder basePath = new StringBuilder("/v1/achievement/inside/action?from=");
		basePath.append(JettyServer.getServerName());

		PMessage messagebody = PMessage.newBuilder().setType("PAchievementActions")
				.setData(achievementActions.toByteString()).build();

		super.body = messagebody.toByteArray();
		super.contentType = "application/x-protobuf";
		return super.postBodyMethod(basePath.toString());
	}
}