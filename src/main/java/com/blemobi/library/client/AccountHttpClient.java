package com.blemobi.library.client;

import java.io.IOException;

import com.blemobi.library.jetty.JettyServer;
import com.blemobi.sep.probuf.ResultProtos.PMessage;

/**
 * 账户系统调用类
 * 
 * @author zhaoyong
 *
 */
public class AccountHttpClient extends BaseHttpClient {
	/**
	 * 构造方法
	 */
	public AccountHttpClient() {
		super("account");
	}

	/**
	 * 获取用户信息
	 * 
	 * @param uuid
	 * @return PMessage
	 * @throws IOException
	 */
	public PMessage getUser(String uuid) throws IOException {
		StringBuilder basePath = new StringBuilder("/account/user/profile?from=");
		basePath.append(JettyServer.getServerName()).append("&uuid=").append(uuid);
		return super.getMethod(basePath.toString());
	}

	/**
	 * 校验是不是VO与VIP+关系
	 * 
	 * @param vo_uuid
	 *            VO用户uuid
	 * @param uuid
	 *            要匹配的用户uuid
	 * @return PMessage
	 * @throws IOException
	 */
	public PMessage isVOTOVIP(String vo_uuid, String uuid) throws IOException {
		StringBuilder basePath = new StringBuilder("/v1/account/inside/vo/member/state?from=");
		basePath.append(JettyServer.getServerName()).append("&project=sep&void=").append(vo_uuid).append("&uuid=")
				.append(uuid);
		return super.getMethod(basePath.toString());
	}

	/**
	 * 批量获取用户基础信息
	 * 
	 * @param uuids
	 *            要匹配的用户（使用“，”隔开）
	 * @return PMessage
	 * @throws IOException
	 */
	public PMessage getUserInfo(String uuids) throws IOException {
		StringBuilder basePath = new StringBuilder("/v1/account/users/baseinfo?from=");
		basePath.append(JettyServer.getServerName()).append("&uuids=").append(uuids.toString());
		return super.getMethod(basePath.toString());
	}

	/**
	 * 获取成员的VO信息
	 * 
	 * @param body
	 *            uuid内容
	 * @return
	 * @throws IOException
	 */
	public PMessage getUserVOInfo(byte[] body) throws IOException {
		StringBuilder basePath = new StringBuilder("/v1/account/inside/users/vo?from=");
		basePath.append(JettyServer.getServerName()).append("&project=sep");
		super.body = body;
		super.contentType = "form-data";
		return super.postBodyMethod(basePath.toString());
	}
}