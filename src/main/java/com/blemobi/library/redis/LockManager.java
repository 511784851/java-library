package com.blemobi.library.redis;

import lombok.extern.log4j.Log4j;
import redis.clients.jedis.Jedis;

/**
 * Redis锁的实现，解决分布式多环境对Redis共享数据的处理
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class LockManager {

	/**
	 * 间隔时间
	 */
	private static final long sleepTime = 200;
	/**
	 * 延迟时间
	 */
	private static final long delayTime = 1000;

	/**
	 * 获得锁
	 * 
	 * @param lock
	 *            锁的key
	 * @param expire
	 *            获得锁失效时间（单位：秒）
	 * @return
	 */
	public static boolean getLock(String lock, int expire) {
		long end = System.currentTimeMillis() + (expire * 1000) + delayTime;// 结束时间
		Jedis jedis = RedisManager.getRedis();
		long nx = 0;
		do {
			try {
				nx = getRedisLock(lock, expire, end, jedis);
				if (end > System.currentTimeMillis())
					break;
			} catch (InterruptedException e) {
				log.error("获取Redis锁异常：" + e.getMessage());
				e.printStackTrace();
			}
		} while (nx != 1);
		RedisManager.returnResource(jedis);
		if (nx != 1)
			log.warn("获取Redis锁失败");
		return nx == 1;
	}

	/**
	 * 使用Redis的setnx实现锁机制
	 * 
	 * @param lock
	 * @param expire
	 * @param end
	 * @param jedis
	 * @return
	 * @throws InterruptedException
	 */
	private static long getRedisLock(String lock, int expire, long end, Jedis jedis) throws InterruptedException {
		long nx = jedis.setnx(lock, expire + "");
		if (nx == 1) // 获得锁成功
			jedis.expire(lock, expire);// 设置锁的自动失效时间
		else // 获得锁失败
			Thread.sleep(sleepTime);// 睡眠一会儿
		return nx;
	}

	/**
	 * 释放锁
	 * 
	 * @param lock
	 * @return
	 */
	public static boolean releaseLock(String lock) {
		Jedis jedis = RedisManager.getRedis();
		jedis.del(lock);
		RedisManager.returnResource(jedis);
		return true;
	}
}