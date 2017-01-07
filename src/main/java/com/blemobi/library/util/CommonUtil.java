package com.blemobi.library.util;

import java.util.Collection;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * 常用方法定义
 * 
 * @author zhaoyong
 *
 */
public class CommonUtil {
	/**
	 * 从cookie中获取参数值
	 * 
	 * @param request
	 * @param key
	 * @return
	 */
	public static String getCookieParam(HttpServletRequest request, String key) {
		String value = "";
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals(key)) {
					value = cookie.getValue();
					break;
				}
			}
		}
		return value;
	}

	/**
	 * 生成请求uuid和token参数
	 * 
	 * @param uuid
	 * @param token
	 * @return
	 */
	public static Cookie[] createLoginCookieParams(String uuid, String token) {
		Cookie[] cookies = new Cookie[2];
		cookies[0] = new Cookie("uuid", uuid);
		cookies[1] = new Cookie("token", token);
		return cookies;
	}

	/**
	 * 集合转化为带逗号隔开的字符串
	 * 
	 * @param list
	 * @return
	 */
	public static String collectionToString(Collection<String> list) {
		StringBuffer sb = new StringBuffer();
		for (String s : list) {
			if (sb.length() > 0)
				sb.append(",");
			sb.append(s);
		}
		return sb.toString();
	}
}
