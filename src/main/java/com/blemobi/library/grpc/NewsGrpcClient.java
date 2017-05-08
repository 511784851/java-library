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

import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.blemobi.sep.grpc.IGrpcNewsGrpc;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NewsApiProtos.EStateOperType;
import com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam;
import com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam;
import com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew;
import com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam;
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

	public void deletePost(String postId, String uuid) {
		PDeletePostsParam param = PDeletePostsParam.newBuilder().setPostId(postId).setUuid(uuid).build();
		this.execute(param, new GrpcCallback<Boolean>() {
			@Override
			public Boolean doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				stub.grpcDeletePost(param);
				return true;
			}
		});
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
	
	public void setPostState(List<Long> value){
		if(value == null || value.isEmpty()){
			log.debug("要设置为审核不通过的帖子ID为空");
			return;
		}
		log.debug("设置为审核不通过的帖子ID->" + StringUtils.join(value, ","));
		PSetPostStateParam param = PSetPostStateParam.newBuilder().addAllPostIds(value).setState(EStateOperType.OpReject).build();
		this.execute(param, new GrpcCallback<Boolean>() {
			@Override
			public Boolean doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				stub.setPostState(param);
				return true;
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
	
	
	public PPostView getPostInfoById(String postId) {
		PGetPostsParam param = PGetPostsParam.newBuilder().addPostIds(Long.parseLong(postId)).build();
		return this.execute(param, new GrpcCallback<PPostView>() {
			@Override
			public PPostView doGrpcRequest() {
				stub = IGrpcNewsGrpc.newBlockingStub(channel);
				PPostViewList list = stub.getPostInfoByIds(param);
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
