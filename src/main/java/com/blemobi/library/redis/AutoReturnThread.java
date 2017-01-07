package com.blemobi.library.redis;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lombok.extern.log4j.Log4j;
import redis.clients.jedis.Jedis;

/**
 * Redis回收
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class AutoReturnThread extends Thread {

	/**
	 * 连接对象的最大使用时间:3分钟
	 */
	private static final long expire = 3 * 60 * 1000;

	/**
	 * 存放活跃的连接对象
	 */
	private Map<Integer, Jedis> map;
	private Map<Integer, Long> mapTime;

	public AutoReturnThread(Map<Integer, Jedis> map, Map<Integer, Long> mapTime) {
		this.map = map;
		this.mapTime = mapTime;
	}

	/**
	 * 启动线程，自动回收程序中未正常回收的Redis连接对象
	 */
	public void run() {
		while (true) {
			try {
				Thread.sleep(1 * 60 * 1000);
				long end = getEndTime();
				Map<Integer, Long> copyMapTime = copyMapTime();
				for (Entry<Integer, Long> entry : copyMapTime.entrySet())
					check(end, entry);
			} catch (Exception e) {
				log.error("系统自动回收Reids Pool连接对象异常");
				e.printStackTrace();
			}
		}
	}

	/**
	 * 获得结束比对时间
	 * 
	 * @return
	 */
	private long getEndTime() {
		long now = System.currentTimeMillis();
		long end = now - expire;
		return end;
	}

	/**
	 * 复制数据
	 * 
	 * @return
	 */
	private Map<Integer, Long> copyMapTime() {
		Map<Integer, Long> copyMapTime = new HashMap<Integer, Long>();
		copyMapTime.putAll(mapTime);
		return copyMapTime;
	}

	/**
	 * 检查是否过期
	 * 
	 * @param now
	 * @param redisExpire
	 */
	private void check(long end, Entry<Integer, Long> entry) {
		if (end >= entry.getValue()) {
			Jedis jedis = map.get(entry.getKey());
			RedisManager.returnResource(jedis);
			log.warn("系统自动回收了一个Redis连接对象");
		}
	}

}