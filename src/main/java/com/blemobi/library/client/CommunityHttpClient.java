package com.blemobi.library.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.CommunityProtos.PInsideCommunityUser;
import com.blemobi.sep.probuf.CommunityProtos.PInsideCommunityUserList;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * 社区系统调用类
 * 
 * @author zhaoyong
 *
 */
public class CommunityHttpClient extends BaseHttpClient {
	public CommunityHttpClient() {
		super("community");
	}

	/**
	 * 获取社区信息
	 * 
	 * @param communityId
	 * @return
	 * @throws IOException
	 */
	public PMessage getCommunityInfo(String communityId) throws IOException {
		super.basePath = new StringBuffer("/v1/community/inside/communityinfo?from=");
		super.basePath.append(JettyServer.getServerName()).append("&id=").append(communityId);
		return super.getMethod();
	}

	/**
	 * 分页获取社区用户列表
	 * 
	 * @param communityId
	 * @param offset
	 * @param count
	 * @return
	 * @throws IOException
	 */
	public PMessage getUserList(String communityId, int offset, int count) throws IOException {
		super.basePath = new StringBuffer("/v1/community/inside/userlist/follow?from=");
		super.basePath.append(JettyServer.getServerName()).append("&level=&offset=").append(offset).append("&count=")
				.append(count).append("&id=").append(communityId);
		return super.getMethod();
	}

	/**
	 * 获取社区全部用户列表
	 * 
	 * @param communityId
	 * @return
	 * @throws IOException
	 */
	public List<PInsideCommunityUser> getUserList(String communityId) throws IOException {
		List<PInsideCommunityUser> userList = new ArrayList<PInsideCommunityUser>();
		int offset = 0;
		int count = 50;
		do {
			PMessage message = getUserList(communityId, offset, count);
			PInsideCommunityUserList indiseCommunityUserList = PInsideCommunityUserList.parseFrom(message.getData());
			List<PInsideCommunityUser> list = indiseCommunityUserList.getListList();
			if (list != null && list.size() > 0) {
				userList.addAll(list);
				offset += count;
			} else {
				break;
			}
		} while (true);
		return userList;
	}

	/**
	 * 获取用户是否为社区成员
	 * 
	 * @param communityId
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	public PMessage getUserStatus(String communityId, String uuid) throws IOException {
		super.basePath = new StringBuffer("/v1/community/inside/user/member_status?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&id=")
				.append(communityId);
		return super.getMethod();
	}
}