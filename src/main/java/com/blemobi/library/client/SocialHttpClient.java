package com.blemobi.library.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.AccountProtos.PUserBase;
import com.blemobi.sep.probuf.AccountProtos.PUserBaseList;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * 好友系统调用类
 * 
 * @author zhaoyong
 *
 */
public class SocialHttpClient extends BaseHttpClient {
	public SocialHttpClient() {
		super("social");
	}

	/**
	 * 分页获取用户好友列表
	 * 
	 * @param uuid
	 * @param start
	 * @param count
	 * @return
	 * @throws IOException
	 */
	public PMessage getFriendList(String uuid, int start, int count) throws IOException {
		StringBuilder basePath = new StringBuilder("/social/listfriendsex?from=");
		basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&start=").append(start)
				.append("&count=").append(count);
		return super.getMethod(basePath.toString());
	}

	/**
	 * 获取用户全部好友列表
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	public List<PUserBase> getAllFriendList(String uuid) throws IOException {
		List<PUserBase> allUserList = new ArrayList<PUserBase>();
		int start = 0;
		int count = 1000;
		do {
			PMessage message = getFriendList(uuid, start, count);
			PUserBaseList userlist = PUserBaseList.parseFrom(message.getData());
			List<PUserBase> list = userlist.getListList();
			if (list != null && list.size() > 0) {
				allUserList.addAll(list);
				start += count;
			} else {
				break;
			}
		} while (true);
		return allUserList;
	}

	/**
	 * 批量获取用户好友关系
	 * 
	 * @param uuid
	 * @param uuids
	 * @return
	 * @throws IOException
	 */
	public PMessage getFriendStatu(String uuid, String uuids) throws IOException {
		StringBuilder basePath = new StringBuilder("/social/isfriends?from=");
		basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&uuids=").append(uuids);
		return super.getMethod(basePath.toString());
	}
}