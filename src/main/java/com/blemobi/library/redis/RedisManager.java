package com.blemobi.library.redis;

import com.blemobi.library.global.Constant;

import lombok.extern.log4j.Log4j;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Log4j
public class RedisManager {
	private static JedisPool pool = initPool();

	// 获取redis连接对象
	public static Jedis getRedis() {
		Jedis jedis = getRedisFromPool();
		if (jedis == null) {
			// 如果第一次获取失败，重复五次
			int n = 0;
			while (jedis == null && n < 5) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

				}
				jedis = getRedisFromPool();
				n++;
			}
			if (jedis == null) {
				log.info("获取redis连接对象失败");
				// throw new Exception("redis commount fail");
			}
		}
		return jedis;
	}

	// 获取redis连接对象
	private static Jedis getRedisFromPool() {
		Jedis jedis = null;
		try {
			jedis = pool.getResource();
			String redisAuth = Constant.getRedisUserAuth();
			jedis.auth(redisAuth);
		} catch (Exception e) {

		}
		return jedis;
	}

	// 初始化redis连接池
	private static JedisPool initPool() {
		String[] redisInfo = Constant.getRedisServer();

		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(Constant.getRedisMaxConnectNum());
		config.setMaxIdle(3);
		config.setMaxWaitMillis(10 * 1000);
		JedisPool pool = new JedisPool(config, redisInfo[0], Integer.parseInt(redisInfo[1]));

		return pool;
	}

	// 释放redis对象
	public static void returnResource(Jedis jedis) {
		pool.returnResource(jedis);
	}
}