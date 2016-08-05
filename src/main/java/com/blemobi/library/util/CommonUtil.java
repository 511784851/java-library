package com.blemobi.library.util;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.Cookie;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

/**
 * @author 赵勇<andy.zhao@blemobi.com> 常用函数定义
 */
public class CommonUtil {
	/**
	 * 生成请求uuid和token参数
	 * 
	 * @param uuid
	 *            用户uuid
	 * @param token
	 *            用token
	 * @return Cookie[] uuid和token参数
	 */
	public static Cookie[] createLoginCookieParams(String uuid, String token) {
		Cookie[] cookies = new Cookie[2];
		cookies[0] = new Cookie("uuid", uuid);
		cookies[1] = new Cookie("token", token);
		return cookies;
	}

	/**
	 * 把一个对象串行化到json字符串
	 * 
	 * @param obj
	 *            进行json串行化的对象
	 * @return 字符串
	 */
	public static String objToString(Object obj) {
		String str = "";
		if (obj instanceof Collection) {
			str = JSON.toJSONString(obj);
		} else {
			str = JSONArray.toJSONString(obj);
		}

		return str;
	}

	/**
	 * 反解析一个json对象
	 * 
	 * @param jsonStr
	 *            进行反解析的的字符串
	 * @param clazz
	 *            对象的类型
	 * @return 一个java对象
	 */
	public static <T> T parseObject(String jsonStr, Class clazz) {
		T rtn = (T) JSON.parseObject(jsonStr, clazz);
		return rtn;
	}

	/**
	 * 反解析一个json对象到集合类，如list
	 * 
	 * @param jsonStr
	 *            进行反解析的的字符串
	 * @param clazz
	 *            对象的类型
	 * @return 一个java集合对象
	 */
	public static <T> List<T> parseToList(String jsonStr, Class clazz) {
		List<T> rtn = (List<T>) JSONArray.parseArray(jsonStr, clazz);
		return rtn;
	}
}
