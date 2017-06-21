package com.blemobi.library.redis.dao;

/**
 * Redis操作接口类
 * 
 * @author zhaoyong
 *
 * @param <T>
 */
@FunctionalInterface
public interface ILockDao<T> {
	/**
	 * Redis操作方式
	 * 
	 * @param jedis
	 * @return
	 */
	public abstract T sync();
}
