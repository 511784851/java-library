package com.blemobi.library.cache;

/**
 * 用户缓存信息失效接口类
 * 
 * @author zhaoyong
 *
 */
@FunctionalInterface
public interface ICacheInvalid {

	/**
	 * 业务系统可实现此方法
	 * 
	 * @param uuid
	 */
	public abstract void callback(String uuid);
}
