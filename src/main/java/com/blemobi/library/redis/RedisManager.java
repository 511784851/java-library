package com.blemobi.library.redis;

import com.blemobi.library.consul.BaseService;
import com.google.common.base.Strings;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/*
 * Redis连接管理
 */
public class RedisManager {
	/*
	 * 获得Redis连接（超时自动释放连接）
	 */
	public static Jedis getRedis() {
		Jedis jedis = getLongRedis();
		AutoReturnRedis.putJedis(jedis);
		return jedis;
	}

	/*
	 * 获得Redis连接（不会自动释放连接）
	 */
	public static Jedis getLongRedis() {
		JedisPool jedisPool = getJedisPool();
		Jedis jedis = jedisPool.getResource();

		String auth = BaseService.getProperty("redis_user_auth");
		if (!Strings.isNullOrEmpty(auth)) {
			jedis.auth(auth);
		}

		return jedis;
	}

	/*
	 * 释放连接
	 */
	@SuppressWarnings("deprecation")
	public static void returnResource(Jedis... jediss) {
		JedisPool jedisPool = getJedisPool();
		for (Jedis jedis : jediss) {
			jedisPool.returnResource(jedis);
			AutoReturnRedis.remJedis(jedis);
		}
	}

	/*
	 * 连接池中获取一个 连接
	 */
	private static JedisPool getJedisPool() {
		RedisPoolSingleton redisPool = RedisPoolSingleton.getInstance();
		JedisPool jedisPool = redisPool.getJedisPool();
		return jedisPool;
	}
}