package com.blemobi.library.redis.dao;

import java.io.IOException;
import java.util.List;

import com.blemobi.library.redis.LockManager;
import com.blemobi.library.redis.RedisManager;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

/**
 * Redis操作封装类
 * 
 * 目的：保证Redis资源在任何情况下得到释放
 * 
 * @author zhaoyong
 *
 * @param <T>
 */
public class RedisDao<T> {

	/**
	 * Redis操作（不带事物）
	 * 
	 * @param redisDao
	 * @return
	 */
	public T exec(IRedisDao<T> redisDao) {
		Jedis jedis = RedisManager.getRedis();
		try {
			return redisDao.exec(jedis);
		} finally {
			RedisManager.returnResource(jedis);
		}
	}

	/**
	 * Redis操作（带事物机制）
	 * 
	 * @param redisTDao
	 * @return
	 */
	public List<Object> exectx(IRedisTxDao redisTxDao) {
		Jedis jedis = RedisManager.getRedis();
		Transaction tx = null;
		try {
			tx = jedis.multi();
			redisTxDao.exec(tx);
			return tx.exec();
		} catch (Exception e) {
			tx.discard();
			throw e;
		} finally {
			if (tx != null) {
				try {
					tx.close();
				} catch (IOException e) {
				}
			}
			RedisManager.returnResource(jedis);
		}
	}

	public T execLock(String lock, ILockDao<T> lockDao) {
		if (LockManager.getLock(lock, 30)) {
			try {
				return lockDao.sync();
			} finally {
				LockManager.releaseLock(lock);
			}
		} else
			throw new RuntimeException("获得同步锁失败！");
	}

	/**
	 * 例子
	 * 
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = new RedisDao<String>().exec((redis) -> {
			return redis.set("a", "1");
		});

		List<Object> list = new RedisDao<>().exectx((redis) -> {
			redis.set("b", "1");
			redis.hset("m", "c", "1");
		});
	}
}
