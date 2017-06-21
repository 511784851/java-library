package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.IGrpcCommunityGrpc;
import com.blemobi.sep.grpc.IGrpcCommunityGrpc.IGrpcCommunityBlockingStub;
import com.blemobi.sep.probuf.CommunityProtos;
import com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;
import com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class CommunityGrpcClient extends BaseGRPCClient {

	public CommunityGrpcClient() {
		super("community");
	}

	/**
	 * 获取社区成员列表
	 * 
	 * @param request
	 *            社区id的列表
	 * @return 成功返回 PStringList ，失败返回 PResult
	 */
	public PStringList getCommunityMemberList(PStringSingle request) {
		PStringList list = this.execute(request, new GrpcCallback<PStringList>() {
			@Override
			public PStringList doGrpcRequest() {
				IGrpcCommunityBlockingStub stub = IGrpcCommunityGrpc.newBlockingStub(channel);
				return stub.getCommunityMemberList(request);
			}
		});
		return list;
	}

	/**
	 * 获取PCommunityBaseList,不填充Membership字段
	 * 
	 * @param request
	 *            社区id的列表
	 * @return 成功返回 PCommunityBaseList ，失败返回 PResult
	 */
	public PCommunityBaseList getCommunityBaseList(PStringList request) {
		PCommunityBaseList list = this.execute(request, new GrpcCallback<PCommunityBaseList>() {
			@Override
			public PCommunityBaseList doGrpcRequest() {
				IGrpcCommunityBlockingStub stub = IGrpcCommunityGrpc.newBlockingStub(channel);
				return stub.getCommunityBaseList(request);
			}
		});
		return list;
	}

	public int getUsrAndCommunityMembership(String uuid, Integer communityId){
		PStringList req = PStringList.newBuilder().addList(communityId + "").addList(uuid).build();
		CommunityProtos.PCommunityManagerRightList list = this.execute(req, new GrpcCallback<CommunityProtos.PCommunityManagerRightList>() {
			@Override
			public CommunityProtos.PCommunityManagerRightList doGrpcRequest() {
				IGrpcCommunityBlockingStub stub = IGrpcCommunityGrpc.newBlockingStub(channel);
				return stub.getCommunityRightWithCommunityID(req);
			}
		});
		return list.getList(0).getMembership();
	}
	
	public PInt32List checkMsgIds(PTaskMsgs request) {
		PInt32List list = this.execute(request, new GrpcCallback<PInt32List>() {
			@Override
			public PInt32List doGrpcRequest() {
				IGrpcCommunityBlockingStub stub = IGrpcCommunityGrpc.newBlockingStub(channel);
				return stub.checkMsgIds(request);
			}
		});
		return list;
	}
}