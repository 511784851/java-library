package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.SocialGrpc;
import com.blemobi.sep.grpc.SocialGrpc.SocialBlockingStub;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.blemobi.sep.probuf.SocialApiProtos.PRelationReq;

/**
 * 好友系统gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class SocialGrpcClient extends BaseGRPCClient {

	public SocialGrpcClient() {
		super("social");
	}

	/**
	 * 获取用户的社交关系
	 * 
	 * @param request
	 *            用户和好友uuid
	 * @return 成功返回 PStringList ，失败返回 PResult
	 */
	public PStringList relations(PRelationReq request) {
		PStringList list = this.execute(request, new GrpcCallback<PStringList>() {
			@Override
			public PStringList doGrpcRequest() {
				SocialBlockingStub stub = SocialGrpc.newBlockingStub(channel);
				return stub.relations(request);
			}
		});
		return list;
	}
}