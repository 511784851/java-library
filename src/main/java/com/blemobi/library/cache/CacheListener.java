package com.blemobi.library.cache;

/**
 * 缓存过期机制
 * 
 * @author zhaoyong
 *
 */
public class CacheListener {

	/**
	 * 用户信息失效回调类
	 */
	private ICacheInvalid cacheInvalid;

	/**
	 * 失效时间（单位：毫秒）
	 */
	private long invalid_time;

	/**
	 * 扫描间隔时间（单位：毫秒）
	 */
	private long sleep_time;

	/**
	 * 构造方法
	 * 
	 * @param live_time
	 *            失效时间（单位：毫秒）
	 * @param cacheInvalid
	 *            CacheInvalid的子类，重写失效回调方法
	 */
	public CacheListener(long invalid_time, long sleep_time) {
		this.invalid_time = invalid_time;
		this.sleep_time = sleep_time;
	}

	public CacheListener(long invalid_time, long sleep_time, ICacheInvalid cacheInvalid) {
		this(invalid_time, sleep_time);
		this.cacheInvalid = cacheInvalid;
	}

	public void run() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(sleep_time);
					scan();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	/**
	 * 扫描缓存数据
	 */
	private void scan() {
		long now = System.currentTimeMillis();
		UserBaseCache.chcheUserBaseTime.entrySet().forEach(entry -> {
			long time = entry.getValue();
			if (checkInvalid(now, time)) {// 失效了
				String key = entry.getKey();
				UserBaseCache.chcheUserBaseTime.remove(key);
				UserBaseCache.chcheUserBase.remove(key);
				if (cacheInvalid != null)
					cacheInvalid.callback(key);
			}
		});
	}

	/**
	 * 是否失效
	 * 
	 * @param now
	 * @param time
	 * @return
	 */
	private boolean checkInvalid(long now, long time) {
		return (now - time) >= invalid_time;
	}

}