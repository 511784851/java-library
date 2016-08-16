package com.blemobi.library.redis;

import com.blemobi.library.consul.BaseService;
import com.google.common.base.Strings;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisManager {
	/*
	 * 获得Redis连接
	 */
	public static Jedis getRedis() {
		String auth = BaseService.getProperty("redis_user_auth");
		RedisPoolSingleton redisPool = RedisPoolSingleton.getInstance();
		JedisPool jedisPool = redisPool.getJedisPool();
		Jedis jedis = jedisPool.getResource();
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
		RedisPoolSingleton redisPool = RedisPoolSingleton.getInstance();
		JedisPool jedisPool = redisPool.getJedisPool();
		jedisPool.returnResource(jedis);
	}
}