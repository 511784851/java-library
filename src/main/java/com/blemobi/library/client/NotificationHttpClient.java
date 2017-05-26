package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.blemobi.sep.probuf.ResultProtos.PStringList;

/**
 * 通知系统调用类
 * 
 * @author zhaoyong
 *
 */
public class NotificationHttpClient extends BaseHttpClient {
	public NotificationHttpClient() {
		super("notification");
	}

	/**
	 * 通知消息
	 * 
	 * @param stringList
	 *            消息接受者
	 * @param uuid
	 *            消息发送者
	 * @param type
	 *            消息id
	 * @param type
	 *            自定义参数值
	 * @return
	 * @throws IOException
	 */
	public PMessage msg(PStringList stringList, String uuid, String type, String task) throws IOException {
		super.basePath = new StringBuilder("/v2/notification/inside/system?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&type=").append(type)
				.append("&task=").append(task);
		super.body = stringList.toByteArray();
		super.contentType = "form-data";
		return super.postBodyMethod();
	}
}