package com.blemobi.library.redis;

import com.blemobi.library.consul_v1.PropsUtils;

import lombok.extern.log4j.Log4j;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Redis连接池单列类
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class RedisPoolSingleton {

	private final int maxIdle = 3;
	private final int maxWaitMillis = 30 * 1000;
	private JedisPool jedisPool;

	/**
	 * 私有构造方法
	 */
	private RedisPoolSingleton() {
		log.debug("初始化Redis连接池...");

		String[] redisInfo = PropsUtils.getString("redis_user_addr").split(":");
		String address = redisInfo[0];
		int port = Integer.parseInt(redisInfo[1]);

		JedisPoolConfig config = createConfig();
		jedisPool = new JedisPool(config, address, port);
		log.debug("Redis连接池的初始化成功!");
	}

	/**
	 * 配置信息
	 * 
	 * @return
	 */
	private JedisPoolConfig createConfig() {
		int maxTotal = PropsUtils.getInteger("redis_max_connect_num");
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(maxTotal);
		config.setMaxIdle(maxIdle);
		config.setMaxWaitMillis(maxWaitMillis);
		return config;
	}

	/**
	 * 使用内部类来维护单例
	 * 
	 * @author zhaoyong
	 *
	 */
	private static class SingletonFactory {
		private static final RedisPoolSingleton instance = new RedisPoolSingleton();
	}

	/**
	 * 获得单例对象
	 * 
	 * @return
	 */
	public static RedisPoolSingleton getInstance() {
		return SingletonFactory.instance;
	}

	/**
	 * 获得Redis连接池
	 * 
	 * @return
	 */
	public JedisPool getJedisPool() {
		return jedisPool;
	}
}