package com.blemobi.library.client;

/**
 * 通用调用类
 * 
 * @author zhaoyong
 *
 */
public class CommonHttpClient extends BaseHttpClient {
	public CommonHttpClient(String sername) {
		super(sername);
	}

	/**
	 * 发送订阅消息给其它服务
	 * 
	 * @param basePath
	 * @param list
	 * @return
	 * @throws IOException
	 */
//	public PMessage subscribe(String basePath, List<PSubscribe> list) throws IOException {
//		PSubscribeArray subscribeArray = PSubscribeArray.newBuilder().addAllSubscribe(list).build();
//		super.basePath = new StringBuilder(basePath);
//		super.basePath.append(JettyServer.getServerName());
//		super.body = subscribeArray.toByteArray();
//		super.contentType = "application/x-protobuf";
//		return super.postBodyMethod();
//	}
}