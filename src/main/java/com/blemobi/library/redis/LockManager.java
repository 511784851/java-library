package com.blemobi.library.redis;

import com.blemobi.library.redis.dao.RedisDao;

/**
 * Redis锁的实现，解决分布式多环境对Redis共享数据的处理
 * 
 * @author zhaoyong
 *
 */
public class LockManager {

	/**
	 * 间隔时间（单位：毫秒）
	 */
	private static final int SLEEP_TIME = 10;

	/**
	 * 获得锁
	 * 
	 * @param lock
	 *            锁的key
	 * @param expire
	 *            失效时间（单位：秒）,同一个业务锁，清保证失效时间一致
	 * @return
	 */
	public static boolean getLock(String lock, int expire) {
		int count = (expire * 1000) / SLEEP_TIME;// 可重复的次数
		do {
			if (setnxLock(lock, expire))
				return true;
			else
				try {
					Thread.sleep(SLEEP_TIME);
				} catch (InterruptedException e) {
				}
		} while (count-- > 0);
		return false;
	}

	/**
	 * 使用Redis的setnx实现锁机制
	 * 
	 * @param lock
	 * @param expire
	 * @return
	 */
	private static boolean setnxLock(String lock, int expire) {
		return new RedisDao<Boolean>().exec(redis -> {
			long r = redis.setnx(lock, "");
			if (r == 1) // 获得锁成功
				redis.expire(lock, expire);// 设置锁的自动失效时间
			return r == 1;
		});
	}

	/**
	 * 释放锁
	 * 
	 * @param lock
	 * @return
	 */
	public static boolean releaseLock(String lock) {
		return new RedisDao<Long>().exec(redis -> {
			return redis.del(lock);
		}) > 0;
	}
}