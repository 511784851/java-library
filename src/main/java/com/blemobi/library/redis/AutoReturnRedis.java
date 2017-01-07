package com.blemobi.library.redis;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;

/**
 * 自动回收程序中未正常回收的Redis连接对象
 * 
 * @author zhaoyong
 *
 */
public class AutoReturnRedis {
	/**
	 * 存放活跃的连接对象
	 */
	private static Map<Integer, Jedis> map = new HashMap<Integer, Jedis>();
	private static Map<Integer, Long> mapTime = new HashMap<Integer, Long>();

	/**
	 * 存放连接对象，并设置失效时间
	 * 
	 * @param jedis
	 * @return
	 */
	public static boolean putJedis(Jedis jedis) {
		map.put(jedis.hashCode(), jedis);
		mapTime.put(jedis.hashCode(), System.currentTimeMillis());
		return true;
	}

	/**
	 * 清楚正常回收的连接对象
	 * 
	 * @param jedis
	 * @return
	 */
	public static boolean remJedis(Jedis jedis) {
		return remJedis(jedis.hashCode());
	}

	public static boolean remJedis(int hashCode) {
		map.remove(hashCode);
		mapTime.remove(hashCode);
		return true;
	}

	/**
	 * 启动线程，自动回收程序中未正常回收的Redis连接对象
	 */
	static {
		AutoReturnThread autoReturnThread = new AutoReturnThread(map, mapTime);
		autoReturnThread.start();
	}
}