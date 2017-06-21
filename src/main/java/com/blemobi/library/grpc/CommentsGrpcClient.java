/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.grpc
 *
 *    Filename:    CommentsGrpcClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月14日 下午4:08:16
 *
 *    Revision:
 *
 *    2017年4月14日 下午4:08:16
 *
 *****************************************************************/
package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.IGrpcCommentGrpc;
import com.blemobi.sep.grpc.IGrpcCommentGrpc.IGrpcCommentBlockingStub;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs;

/**
 * @ClassName CommentsGrpcClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月14日 下午4:08:16
 * @version 1.0.0
 */
public class CommentsGrpcClient extends BaseGRPCClient {
	private IGrpcCommentGrpc.IGrpcCommentBlockingStub stub;

	public CommentsGrpcClient() {
		super("comment");
	}

	public int getCommentsCnt(String postId) {
		PStringList param = PStringList.newBuilder().addList(postId).build();
		return this.execute(param, new GrpcCallback<Integer>() {
			@Override
			public Integer doGrpcRequest() {
				stub = IGrpcCommentGrpc.newBlockingStub(channel);
				PInt32List list = stub.grpcGetCommentCnt(param);
				return list.getList(0);
			}
		});
	}

	public PInt32List checkMsgIds(PTaskMsgs request) {
		PInt32List list = this.execute(request, new GrpcCallback<PInt32List>() {
			@Override
			public PInt32List doGrpcRequest() {
				stub = IGrpcCommentGrpc.newBlockingStub(channel);
				return stub.checkMsgIds(request);
			}
		});
		return list;
	}
}
