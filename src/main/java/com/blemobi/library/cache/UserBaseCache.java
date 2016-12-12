package com.blemobi.library.cache;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.blemobi.library.client.AccountHttpClient;
import com.blemobi.library.client.BaseHttpClient;
import com.blemobi.sep.probuf.AccountProtos.PUser;
import com.blemobi.sep.probuf.AccountProtos.PUserBase;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

import lombok.extern.log4j.Log4j;

/*
 * 缓存用户基础信息
 */
@Log4j
public class UserBaseCache {
	private static Map<String, PUserBase> chcheUserBase = new HashMap<String, PUserBase>();

	/*
	 * 获取用户基础信息
	 */
	public static PUserBase getUserBase(String uuid) throws IOException {
		PUserBase userBase = chcheUserBase.get(uuid);
		if (userBase == null) {
			userBase = getUserBaseFromAcc(uuid);
			setUserBase(uuid, userBase);
		}
		return userBase;
	}

	/*
	 * 缓存用户基础信息
	 */
	public static boolean setUserBase(String uuid, PUserBase userBase) {
		chcheUserBase.put(uuid, userBase);
		log.debug("缓存了用户[" + uuid + "]的数据");
		return true;
	}

	/*
	 * 账户系统获取用户基础信息
	 */
	private static PUserBase getUserBaseFromAcc(String uuid) throws IOException {
		String url = "/account/user/profile?from=chat&uuid=" + uuid;
		BaseHttpClient httpClient = new AccountHttpClient(url, null, null);
		PMessage message = httpClient.getMethod();
		PUser user = PUser.parseFrom(message.getData());

		PUserBase userBase = PUserBase.newBuilder().setNickname(user.getNickname()).setHeadImgURL(user.getHeadImgURL())
				.setLevel(user.getLevelInfo().getLevelType()).setLanguage(user.getLocale()).build();

		return userBase;
	}

}