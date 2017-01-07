package com.blemobi.library.cache;

import lombok.extern.log4j.Log4j;

/**
 * 用户缓存信息失效父类
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class CacheInvalid {

	/**
	 * 业务系统可重写此方法
	 * 
	 * @param uuid
	 */
	public void callback(String uuid) {
		log.debug("用户[" + uuid + "]缓存信息过期了");
	}
}
