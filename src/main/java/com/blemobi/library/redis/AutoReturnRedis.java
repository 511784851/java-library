package com.blemobi.library.redis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j;
import redis.clients.jedis.Jedis;

/*
 * 自动回收程序中未正常回收的Redis连接对象
 */
@Log4j
public class AutoReturnRedis {
	// 存放活跃的连接对象
	private static Map<Jedis, Long> map = new HashMap<Jedis, Long>();
	// 连接对象的最大使用时间:2分钟
	private static final long expire = 2 * 60 * 1000;

	/*
	 * 存放连接对象，并设置失效时间
	 */
	public static boolean putJedis(Jedis jedis) {
		long now = System.currentTimeMillis();
		long end = now + expire;
		map.put(jedis, end);
		return true;
	}

	/*
	 * 清楚正常回收的连接对象
	 */
	public static boolean remJedis(Jedis jedis) {
		map.remove(jedis);
		return true;
	}

	/*
	 * 启动线程，自动回收程序中未正常回收的Redis连接对象
	 */
	static {
		Thread t = new Thread() {
			public void run() {
				while (true) {
					try {
						Thread.sleep(60 * 1000);
						long now = System.currentTimeMillis();
						Set<Jedis> keys = map.keySet();
						for (Jedis jedis : keys) {
							long end = map.get(jedis);
							if (now >= end) {
								RedisManager.returnResource(jedis);
								log.warn("系统自动回收了一个Redis Pool连接对象");
							}
						}
					} catch (Exception e) {
						log.error("系统自动回收Reids Pool连接对象异常");
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}
}