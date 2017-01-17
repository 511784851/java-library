package com.blemobi.library.health;

import com.blemobi.sep.probuf.ResultProtos.PServicesStatus;

/**
 * 服务状态
 * 
 * @author zhaoyong
 *
 */
public class StatusHandler extends HandlerAbstract {

	/**
	 * 构造方法
	 * 
	 * @param serviceName
	 */
	public StatusHandler(String serviceName) {
		super(serviceName);
	}

	/**
	 * 返回数据
	 */
	@Override
	protected byte[] getRespData() {
		PServicesStatus servicesStatus = PServicesStatus.newBuilder().setStatus(1).build();
		return servicesStatus.toByteArray();
	}
}