package com.blemobi.library.health;

import java.util.ArrayList;
import java.util.List;

import com.blemobi.sep.probuf.ResultProtos.PHealthItem;
import com.blemobi.sep.probuf.ResultProtos.PServiceHealth;

/**
 * 健康服务
 * 
 * @author zhaoyong
 *
 */
public class HealthHandler extends HandlerAbstract {

	/**
	 * 构造方法
	 * 
	 * @param serviceName
	 */
	public HealthHandler(String serviceName) {
		super(serviceName);
	}

	/**
	 * 返回数据
	 */
	@Override
	protected byte[] getRespData() {
		List<PHealthItem> list = new ArrayList<PHealthItem>();
		PServiceHealth serviceHealth = PServiceHealth.newBuilder().setServiceName(serviceName).setStatus(1)
				.addAllHealInfoList(list).build();
		return serviceHealth.toByteArray();
	}
}