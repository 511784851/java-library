package com.blemobi.library.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.ClientProtocolException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.NewsProtos.PFollowOrFansList;
import com.blemobi.sep.probuf.NewsProtos.PRecommendUser;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.google.protobuf.ProtocolStringList;

/**
 * 新闻系统调用类
 * 
 * @author zhaoyong
 *
 */
public class NewsHttpClient extends BaseHttpClient {
	public NewsHttpClient() {
		super("news");
	}

	/**
	 * 分页获取用户粉丝用户
	 * 
	 * @param uuid
	 * @param offset
	 * @param count
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public PMessage getFansList(String uuid, int offset, int count) throws ClientProtocolException, IOException {
		super.basePath = new StringBuilder("/v1/news/inside/fans?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&offset=")
				.append(offset).append("&count=").append(count);
		return super.getMethod();
	}

	/**
	 * 获取用户全部粉丝用户
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	public List<String> getAllFansList(String uuid) throws IOException {
		List<String> allUserList = new ArrayList<String>();
		int offset = 0;
		int count = 1000;
		do {
			PMessage message = getFansList(uuid, offset, count);
			PStringList stringList = PStringList.parseFrom(message.getData());
			ProtocolStringList list = stringList.getListList();
			if (list != null && list.size() > 0) {
				allUserList.addAll(list);
				offset += count;
			} else {
				break;
			}
		} while (true);
		return allUserList;
	}

	/**
	 * 分页获取用户关注用户
	 * 
	 * @param uuid
	 * @param offset
	 * @param count
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	public PMessage getFollowList(String uuid, int offset, int count) throws ClientProtocolException, IOException {
		super.basePath = new StringBuilder("/v1/news/inside/follow?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuidb=").append(uuid).append("&offset=")
				.append(offset).append("&count=").append(count);
		return super.getMethod();
	}

	/**
	 * 获取用户全部关注用户
	 * 
	 * @param uuid
	 * @return
	 * @throws IOException
	 */
	public List<PRecommendUser> getAllFollowList(String uuid) throws IOException {
		List<PRecommendUser> allUserList = new ArrayList<PRecommendUser>();
		int offset = 0;
		int count = 100;
		do {
			PMessage message = getFollowList(uuid, offset, count);
			PFollowOrFansList stringList = PFollowOrFansList.parseFrom(message.getData());
			List<PRecommendUser> list = stringList.getListList();
			if (list != null && list.size() > 0) {
				allUserList.addAll(list);
				offset = stringList.getIndex();
			} else {
				break;
			}
		} while (true);
		return allUserList;
	}

	/**
	 * 获取用户关注关系
	 * 
	 * @param uuid
	 * @param uuids
	 * @return
	 * @throws IOException
	 */
	public PMessage getFollowStatu(String uuid, String uuids) throws IOException {
		super.basePath = new StringBuilder("/v1/news/inside/multi/follow/status?from=");
		super.basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid).append("&targetuuids=")
				.append(uuids);
		return super.getMethod();
	}
}