/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.grpc
 *
 *    Filename:    NewsGrpcClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月14日 下午3:36:54
 *
 *    Revision:
 *
 *    2017年4月14日 下午3:36:54
 *
 *****************************************************************/
package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.IGrpcNewsGrpc;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam;
import com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew;
import com.blemobi.sep.probuf.NewsProtos.PPostView;
import com.blemobi.sep.probuf.NewsProtos.PPostViewList;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.ResultProtos.PStringList;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName NewsGrpcClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月14日 下午3:36:54
 * @version 1.0.0
 */
@Log4j
public class NewsGrpcClient extends BaseGRPCClient {
	private IGrpcNewsGrpc.IGrpcNewsBlockingStub stub;

	public NewsGrpcClient() {
		super("news");
	}

	public PPostView getPostExtraInfo(String postId, String uuid) {
		PGetPostsParam param = PGetPostsParam.newBuilder().addPostIds(Long.parseLong(postId)).setUuid(uuid)
				.setViewType(0).build();
		return this.execute(param, new GrpcCallback<PPostView>() {
			@Override
			public PPostView doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				PPostViewList list = stub.grpcGetPostExtraInfo(param);
				return list.getList(0);
			}
		});
	}

	public int getVoteCnt(String postId) {
		PStringList param = PStringList.newBuilder().addList(postId).build();
		return this.execute(param, new GrpcCallback<Integer>() {
			@Override
			public Integer doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				PInt32List list = stub.grpcGetPostsVoteCnt(param);
				return list.getList(0);
			}
		});
	}

	public void createPost(PInsidePostNew post) {
		this.execute(post, new GrpcCallback<PEmpty>() {
			@Override
			public PEmpty doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				return stub.grpcPostPublish(post);
			}
		});
	}
}