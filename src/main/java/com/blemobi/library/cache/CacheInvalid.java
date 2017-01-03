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
	 * 需要业务系统重写的方法
	 * 
	 * @param uuid
	 */
	public void callback(String uuid) {
		log.debug("用户[" + uuid + "]缓存信息过期了");
	}
}
