package com.blemobi.library.redis.dao;

import redis.clients.jedis.Transaction;

/**
 * Redis操作接口类
 * 
 * @author zhaoyong
 *
 */
@FunctionalInterface
public interface IRedisTxDao {
	/**
	 * Redis操作方法（事物机制）
	 * 
	 * @param tx
	 */
	public abstract void exec(Transaction tx);
}
