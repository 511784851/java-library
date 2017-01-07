package com.blemobi.library.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.blemobi.library.client.AccountHttpClient;
import com.blemobi.sep.probuf.AccountProtos.PUser;
import com.blemobi.sep.probuf.AccountProtos.PUserBase;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

import lombok.extern.log4j.Log4j;

/**
 * 缓存用户基础信息
 * 
 * @author zhaoyong
 *
 */
@Log4j
public class UserBaseCache {
	public static Map<String, PUserBase> chcheUserBase = new HashMap<String, PUserBase>();
	public static Map<String, Long> chcheUserBaseTime = new HashMap<String, Long>();

	private UserBaseCache() {

	}

	/**
	 * 获取用户基础信息（如果还未缓存就重新缓存）
	 * 
	 * @param uuid
	 * @return PUserBase 用户基础信息
	 * @throws IOException
	 */
	public static PUserBase get(String uuid) throws IOException {
		PUserBase userBase = chcheUserBase.get(uuid);
		if (userBase == null)
			userBase = cache(uuid);
		return userBase;
	}

	/**
	 * 查询用户缓存是否存在
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	public static boolean exist(String uuid) throws IOException {
		return chcheUserBase.get(uuid) != null ? true : false;
	}

	/**
	 * 缓存用户基础信息
	 * 
	 * @param uuid
	 * @param userBase
	 *            用户基础信息
	 */
	public static void put(String uuid, PUserBase userBase) {
		chcheUserBase.put(uuid, userBase);
		chcheUserBaseTime.put(uuid, System.currentTimeMillis());
		log.debug("缓存了用户[" + uuid + "]的数据");
	}

	/**
	 * 获取用户信息并缓存
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	private static PUserBase cache(String uuid) throws IOException {
		PUser user = getUserInfo(uuid);
		PUserBase userBase = userToUserBase(user);
		put(uuid, userBase);
		return userBase;
	}

	/**
	 * 从账户系统获取用户信息
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	private static PUser getUserInfo(String uuid) throws IOException {
		AccountHttpClient httpClient = new AccountHttpClient();
		PMessage message = httpClient.getUser(uuid);
		return PUser.parseFrom(message.getData());
	}

	/**
	 * PUser转化为PUserBase
	 * 
	 * @param user
	 *            用户信息
	 * @return
	 */
	private static PUserBase userToUserBase(PUser user) {
		return PUserBase.newBuilder().setUUID(user.getUuid()).setNickname(user.getNickname())
				.setHeadImgURL(user.getHeadImgURL()).setLevel(user.getLevelInfo().getLevelType())
				.setLanguage(user.getLocale()).build();
	}
}