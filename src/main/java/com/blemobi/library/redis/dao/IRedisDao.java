package com.blemobi.library.redis.dao;

import redis.clients.jedis.Jedis;

/**
 * Redis操作接口类
 * 
 * @author zhaoyong
 *
 * @param <T>
 */
@FunctionalInterface
public interface IRedisDao<T> {
	/**
	 * Redis操作方式
	 * 
	 * @param jedis
	 * @return
	 */
	public abstract T exec(Jedis jedis);
}
