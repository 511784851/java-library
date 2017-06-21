package com.blemobi.library.client;

/**
 * 任务系统调用类
 * 
 * @author zhaoyong
 *
 */
public class TaskHttpClient extends BaseHttpClient {
	public TaskHttpClient() {
		super("task");
	}

	/**
	 * 回调
	 * 
	 * @param callbackArray
	 * @return
	 * @throws IOException
	 */
//	public PMessage callback(PCallbackArray callbackArray) throws IOException {
//		super.basePath = new StringBuilder("/task/callback/msgid?from=");
//		super.basePath.append(JettyServer.getServerName());
//		super.body = PMessage.newBuilder().setType("PCallbackArray").setData(callbackArray.toByteString()).build()
//				.toByteArray();
//		super.contentType = "application/x-protobuf";
//		return super.postBodyMethod();
//	}
}