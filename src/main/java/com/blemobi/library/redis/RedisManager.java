package com.blemobi.library.redis;

import com.blemobi.library.consul_v1.PropsUtils;
import com.google.common.base.Strings;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Redis连接管理
 * 
 * @author zhaoyong
 *
 */
public class RedisManager {

	private static String auth = PropsUtils.getString("redis_user_auth");

	/**
	 * 获得Redis连接
	 * 
	 * @return
	 */
	public static Jedis getRedis() {
		return getLongRedis();
	}

	/**
	 * 获得Redis连接
	 * 
	 * @return
	 */
	public static Jedis getLongRedis() {
		JedisPool pool = getJedisPool();
		Jedis jedis = pool.getResource();

		if (!Strings.isNullOrEmpty(auth))
			jedis.auth(auth);

		return jedis;
	}

	/**
	 * 释放连接
	 * 
	 * @param jediss
	 */
	public static void returnResource(Jedis... jediss) {
		for (Jedis jedis : jediss)
			returnResource(jedis);
	}

	/**
	 * 释放连接
	 * 
	 * @param jediss
	 */
	@SuppressWarnings("deprecation")
	public static void returnResource(Jedis jedis) {
		JedisPool jedisPool = getJedisPool();
		jedisPool.returnResource(jedis);
	}

	/**
	 * 连接池中获取一个 连接
	 * 
	 * @return
	 */
	private static JedisPool getJedisPool() {
		RedisPoolSingleton instance = RedisPoolSingleton.getInstance();
		return instance.getJedisPool();
	}
}