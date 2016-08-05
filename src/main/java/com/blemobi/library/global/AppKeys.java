package com.blemobi.library.global;
/**
 * @author 李子才<davis.lee@blemobi.com>
 * 这是跟前段App相关的全局变量值的工具类，前端App需要的参数，都是重这里获取。
 */
import java.util.HashMap;
import java.util.Map;

import com.blemobi.library.consul.ConsulChangeListener;

public class AppKeys {
	private static final String KEY_Domain = "wk_server_domain";
	private static final String KEY_AppToken = "wk_server_appToken";
	private static final String KEY_Android_appKey = "wk_android_appKey";
	private static final String KEY_Android_appSecret = "wk_android_appSecret";
	private static final String KEY_Ios_appKey = "wk_ios_appKey";
	private static final String KEY_Ios_appSecret = "wk_ios_appSecret";

	/***
	 * appkey与appsecret的对应
	 */
	private static Map<String, String> appkeys = new HashMap<String, String>();
	/***
	 * 设备类型与appkey的对应
	 */
	private static Map<String, String> devkeys = new HashMap<String, String>();

	/***
	 * domain信息
	 */
	private static String domain = null;

	/***
	 * server端的 appToken信息
	 */
	private static String appToken = null;

	private static ConsulChangeListener adapter = new ConsulChangeListener() {
		public void onEnvChange(Map<String, String> prop) {
			domain = prop.get(KEY_Domain);
			appToken = prop.get(KEY_AppToken);
			appkeys.put(prop.get(KEY_Ios_appKey), prop.get(KEY_Ios_appSecret));
			appkeys.put(prop.get(KEY_Android_appKey), prop.get(KEY_Android_appSecret));
			devkeys.put("ios", prop.get(KEY_Ios_appKey));
			devkeys.put("android", prop.get(KEY_Android_appKey));
		}

		public void onServiceChange(String serviceName, String[][] serverInfo) {}
	};

	/**
	 * 获取appkey对应的appsecret信息
	 * 
	 * @desc
	 * @time 2:59:41 pm
	 * @param appKey
	 * @return
	 */
	public static String getAppSecret(String appKey) {
		return appkeys.get(appKey);
	}

	public static String getAppSecretByDevType(String devType) {
		String appKey = devkeys.get(devType);
		return getAppSecret(appKey);
	}

	public static String getAppKeyByDevType(String devType) {
		return devkeys.get(devType);
	}

	public static String getDomain() {
		return domain;
	}

	public static String getAppToken() {
		return appToken;
	}

	public static ConsulChangeListener getAdapter() {
		return adapter;
	}

}
