package com.blemobi.library.redis;

import java.util.List;

import com.blemobi.library.consul.BaseService;
import com.google.common.base.Strings;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;

public class RedisManager {
	/*
	 * 获得Redis连接
	 */
	public static Jedis getRedis() {
		JedisPool jedisPool = getJedisPool();
		Jedis jedis = jedisPool.getResource();

		String auth = BaseService.getProperty("redis_user_auth");
		if (!Strings.isNullOrEmpty(auth)) {
			jedis.auth(auth);
		}

		return jedis;
	}

	/*
	 * 释放Redis连接
	 */
	@SuppressWarnings("deprecation")
	public static void returnResource(Jedis jedis) {
		JedisPool jedisPool = getJedisPool();
		jedisPool.returnResource(jedis);
	}

	/*
	 * 释放Redis连接
	 */
	public static List<Object> returnResource(Jedis jedis, Transaction tx) {
		List<Object> list = tx.exec();
		returnResource(jedis);
		return list;
	}

	private static JedisPool getJedisPool() {
		RedisPoolSingleton redisPool = RedisPoolSingleton.getInstance();
		JedisPool jedisPool = redisPool.getJedisPool();
		return jedisPool;
	}
}