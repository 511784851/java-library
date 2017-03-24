package com.blemobi.library.cache;

import java.util.Map;

import com.blemobi.sep.probuf.AccountProtos.PUserBase;

/**
 * 缓存过期机制
 * 
 * @author zhaoyong
 *
 */
public class LiveThread extends Thread {
	private Map<String, PUserBase> chcheUserBase = UserBaseCache.chcheUserBase;
	private Map<String, Long> chcheUserBaseTime = UserBaseCache.chcheUserBaseTime;
	/**
	 * 回调类
	 */
	private CacheInvalid cacheInvalid;
	/**
	 * 失效时间（单位：毫秒）
	 */
	private long live_time = 0;

	/**
	 * 构造方法
	 * 
	 * @param live_time
	 *            失效时间（单位：毫秒）
	 * @param cacheInvalid
	 *            CacheInvalid的子类，重写失效回调方法
	 */
	public LiveThread(long live_time, CacheInvalid cacheInvalid) {
		this.live_time = live_time;
		this.cacheInvalid = cacheInvalid;
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1 * 60 * 60 * 1000);
				liveStep();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 缓存失效管理
	 */
	private void liveStep() {
		long now = System.currentTimeMillis();
		for (Map.Entry<String, Long> entry : chcheUserBaseTime.entrySet()) {
			String key = entry.getKey();
			long puttime = chcheUserBaseTime.get(key);
			if (checkLive(now, puttime)) {
				// 失效了
				chcheUserBaseTime.remove(entry);
				chcheUserBase.remove(key);
				cacheInvalid.callback(key);
			}
		}
	}

	/**
	 * 是否失效
	 * 
	 * @param now
	 * @param puttime
	 * @return
	 */
	private boolean checkLive(long now, long puttime) {
		return (now - puttime) >= live_time;
	}

}