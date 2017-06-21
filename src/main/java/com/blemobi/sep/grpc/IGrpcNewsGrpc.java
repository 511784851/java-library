package com.blemobi.sep.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: news_inside.proto")
public class IGrpcNewsGrpc {

  private IGrpcNewsGrpc() {}

  public static final String SERVICE_NAME = "bbproto.IGrpcNews";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_POST_EDIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcPostEdit"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_POST_PUBLISH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcPostPublish"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_POST_VOTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcPostVote"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction,
      com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist> METHOD_GRPC_POST_VOTE_EXIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcPostVoteExist"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GRPC_GET_POSTS_VOTE_CNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcGetPostsVoteCnt"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_NEWS_FOLLOW =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcNewsFollow"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction,
      com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist> METHOD_GRPC_NEWS_FOLLOW_EXIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcNewsFollowExist"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PInt64Single,
      com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> METHOD_GET_COMMUNITY_POST_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GetCommunityPostCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt64Single.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> METHOD_GET_GLOBAL_POST_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GetGlobalPostCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam,
      com.blemobi.sep.probuf.NewsProtos.PPostViewList> METHOD_GET_POST_INFO_BY_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GetPostInfoByIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostViewList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_POST_STATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "SetPostState"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GET_POST_STATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GetPostState"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam,
      com.blemobi.sep.probuf.NewsProtos.PPostViewList> METHOD_REFRESH_GLOBAL_TIMELINE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "RefreshGlobalTimeline"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostViewList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GET_USERS_FANS_COUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GetUsersFansCount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam,
      com.blemobi.sep.probuf.NewsProtos.PPostViewList> METHOD_GRPC_GET_USER_POST_HISTORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcGetUserPostHistory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostViewList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList> METHOD_GRPC_GET_POST_BRIEF =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcGetPostBrief"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam,
      com.blemobi.sep.probuf.NewsProtos.PPostViewList> METHOD_GRPC_GET_POST_EXTRA_INFO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcGetPostExtraInfo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostViewList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_DELETE_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcDeletePost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_UN_DELETE_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcUnDeletePost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam,
      com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList> METHOD_GRPC_GET_USER_STATISTIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "GrpcGetUserStatistic"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_CHECK_MSG_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcNews", "checkMsgIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IGrpcNewsStub newStub(io.grpc.Channel channel) {
    return new IGrpcNewsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcNewsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IGrpcNewsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcNewsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IGrpcNewsFutureStub(channel);
  }

  /**
   */
  public static abstract class IGrpcNewsImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 编辑帖子
     *&#64;param PPostEditParam 编辑后的帖子 
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPostEdit(com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_POST_EDIT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 发布帖子
     *&#64;param PInsidePostNew 发布的帖子
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPostPublish(com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_POST_PUBLISH, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量点赞帖子
     *&#64;param PBetchVoteAction 期望点赞的帖子ID、执行动作的用户列表
     *&#64;return PEmpty 
     * </pre>
     */
    public void grpcPostVote(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_POST_VOTE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否点赞过帖子
     *&#64;param PBetchVoteAction 期望判断的帖子ID、用户UUID     
     *&#64;return PNewsVoteExist 
     * </pre>
     */
    public void grpcPostVoteExist(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_POST_VOTE_EXIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取帖子点赞数(视频服务)
     *&#64;param PStringList 帖子ID    
     *&#64;return PInt32List 
     * </pre>
     */
    public void grpcGetPostsVoteCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_POSTS_VOTE_CNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量关注用户
     *&#64;param PBetchFollowAction 目标uuid，发起关注的uuid列表    
     *&#64;return PEmpty 
     * </pre>
     */
    public void grpcNewsFollow(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_NEWS_FOLLOW, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断是否关注用户
     *&#64;param PBetchFollowAction 目标uuid，待判断的uuid列表    
     *&#64;return PNewsFollowExist 
     * </pre>
     */
    public void grpcNewsFollowExist(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_NEWS_FOLLOW_EXIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区各类帖子数量
     *&#64;param PInt64Single 社区ID    
     *&#64;return PPostCountStatistic 
     * </pre>
     */
    public void getCommunityPostCount(com.blemobi.sep.probuf.ResultProtos.PInt64Single request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_POST_COUNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取系统帖子总数   
     *&#64;return 帖子数 
     * </pre>
     */
    public void getGlobalPostCount(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_GLOBAL_POST_COUNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过帖子ID获取帖子详情
     *&#64;param PGetPostsParam 帖子ID列表,访客的用户id
     *&#64;return PPostViewList 
     * </pre>
     */
    public void getPostInfoByIds(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_POST_INFO_BY_IDS, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置帖子状态
     *&#64;param PSetPostStateParam 帖子ID列表、状态    
     *&#64;return PEmpty 
     * </pre>
     */
    public void setPostState(com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_POST_STATE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询帖子状态
     *&#64;param PStringList 帖子ID   
     *&#64;return PInt32List 帖子状态
     * </pre>
     */
    public void getPostState(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_POST_STATE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 刷新全局timeline
     *&#64;param PRefreshTimelineParam 参数    
     *&#64;return PPostViewList 
     * </pre>
     */
    public void refreshGlobalTimeline(com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REFRESH_GLOBAL_TIMELINE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询用户粉丝数(监管)
     *&#64;param PStringList 用户列表   
     *&#64;return PInt32List 用户的粉丝数
     * </pre>
     */
    public void getUsersFansCount(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USERS_FANS_COUNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查看用户的发帖历史
     *&#64;param PQueryHitoryParam 查询参数   
     *&#64;return PPostViewList
     * </pre>
     */
    public void grpcGetUserPostHistory(com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_USER_POST_HISTORY, responseObserver);
    }

    /**
     * <pre>
     *&#64;note  查询帖子简要信息(大数据)
     *&#64;param    PStringList 帖子ID列表
     *&#64;return   PPostBriefList
     * </pre>
     */
    public void grpcGetPostBrief(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_POST_BRIEF, responseObserver);
    }

    /**
     * <pre>
     *&#64;note  查询帖子状态和统计(网盘服务使用、大数据)
     *&#64;param    PGetPostsParam 帖子ID列表, viewType字段忽略
     *&#64;return   PPostViewList 只填充状态信息和统计信息 
     * </pre>
     */
    public void grpcGetPostExtraInfo(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_POST_EXTRA_INFO, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    删除帖子(网盘服务使用删除原创录播帖)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public void grpcDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_DELETE_POST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    恢复被删除的帖子(粉丝管理系统)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public void grpcUnDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_UN_DELETE_POST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    查询用户的统计信息(粉丝数、关注数、帖子数)
     *&#64;param    PNewsQueryUserParam 帖子ID
     *&#64;return   PNewsUserStatisticList
     * </pre>
     */
    public void grpcGetUserStatistic(com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_USER_STATISTIC, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    检查消息状态(由其它服务提供)
     *&#64;param   请求中count表示要检查的消息进行次数
     *&#64;return  uuid-msigId对应的消息触发次数
     * </pre>
     */
    public void checkMsgIds(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_MSG_IDS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GRPC_POST_EDIT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_POST_EDIT)))
          .addMethod(
            METHOD_GRPC_POST_PUBLISH,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_POST_PUBLISH)))
          .addMethod(
            METHOD_GRPC_POST_VOTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_POST_VOTE)))
          .addMethod(
            METHOD_GRPC_POST_VOTE_EXIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction,
                com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist>(
                  this, METHODID_GRPC_POST_VOTE_EXIST)))
          .addMethod(
            METHOD_GRPC_GET_POSTS_VOTE_CNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GRPC_GET_POSTS_VOTE_CNT)))
          .addMethod(
            METHOD_GRPC_NEWS_FOLLOW,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_NEWS_FOLLOW)))
          .addMethod(
            METHOD_GRPC_NEWS_FOLLOW_EXIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction,
                com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist>(
                  this, METHODID_GRPC_NEWS_FOLLOW_EXIST)))
          .addMethod(
            METHOD_GET_COMMUNITY_POST_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PInt64Single,
                com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic>(
                  this, METHODID_GET_COMMUNITY_POST_COUNT)))
          .addMethod(
            METHOD_GET_GLOBAL_POST_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic>(
                  this, METHODID_GET_GLOBAL_POST_COUNT)))
          .addMethod(
            METHOD_GET_POST_INFO_BY_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam,
                com.blemobi.sep.probuf.NewsProtos.PPostViewList>(
                  this, METHODID_GET_POST_INFO_BY_IDS)))
          .addMethod(
            METHOD_SET_POST_STATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_POST_STATE)))
          .addMethod(
            METHOD_GET_POST_STATE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GET_POST_STATE)))
          .addMethod(
            METHOD_REFRESH_GLOBAL_TIMELINE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam,
                com.blemobi.sep.probuf.NewsProtos.PPostViewList>(
                  this, METHODID_REFRESH_GLOBAL_TIMELINE)))
          .addMethod(
            METHOD_GET_USERS_FANS_COUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GET_USERS_FANS_COUNT)))
          .addMethod(
            METHOD_GRPC_GET_USER_POST_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam,
                com.blemobi.sep.probuf.NewsProtos.PPostViewList>(
                  this, METHODID_GRPC_GET_USER_POST_HISTORY)))
          .addMethod(
            METHOD_GRPC_GET_POST_BRIEF,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList>(
                  this, METHODID_GRPC_GET_POST_BRIEF)))
          .addMethod(
            METHOD_GRPC_GET_POST_EXTRA_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam,
                com.blemobi.sep.probuf.NewsProtos.PPostViewList>(
                  this, METHODID_GRPC_GET_POST_EXTRA_INFO)))
          .addMethod(
            METHOD_GRPC_DELETE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_DELETE_POST)))
          .addMethod(
            METHOD_GRPC_UN_DELETE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_UN_DELETE_POST)))
          .addMethod(
            METHOD_GRPC_GET_USER_STATISTIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam,
                com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList>(
                  this, METHODID_GRPC_GET_USER_STATISTIC)))
          .addMethod(
            METHOD_CHECK_MSG_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_CHECK_MSG_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class IGrpcNewsStub extends io.grpc.stub.AbstractStub<IGrpcNewsStub> {
    private IGrpcNewsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcNewsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcNewsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcNewsStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 编辑帖子
     *&#64;param PPostEditParam 编辑后的帖子 
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPostEdit(com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_EDIT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 发布帖子
     *&#64;param PInsidePostNew 发布的帖子
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPostPublish(com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_PUBLISH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量点赞帖子
     *&#64;param PBetchVoteAction 期望点赞的帖子ID、执行动作的用户列表
     *&#64;return PEmpty 
     * </pre>
     */
    public void grpcPostVote(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_VOTE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否点赞过帖子
     *&#64;param PBetchVoteAction 期望判断的帖子ID、用户UUID     
     *&#64;return PNewsVoteExist 
     * </pre>
     */
    public void grpcPostVoteExist(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_VOTE_EXIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取帖子点赞数(视频服务)
     *&#64;param PStringList 帖子ID    
     *&#64;return PInt32List 
     * </pre>
     */
    public void grpcGetPostsVoteCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POSTS_VOTE_CNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量关注用户
     *&#64;param PBetchFollowAction 目标uuid，发起关注的uuid列表    
     *&#64;return PEmpty 
     * </pre>
     */
    public void grpcNewsFollow(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_NEWS_FOLLOW, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断是否关注用户
     *&#64;param PBetchFollowAction 目标uuid，待判断的uuid列表    
     *&#64;return PNewsFollowExist 
     * </pre>
     */
    public void grpcNewsFollowExist(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_NEWS_FOLLOW_EXIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区各类帖子数量
     *&#64;param PInt64Single 社区ID    
     *&#64;return PPostCountStatistic 
     * </pre>
     */
    public void getCommunityPostCount(com.blemobi.sep.probuf.ResultProtos.PInt64Single request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_POST_COUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取系统帖子总数   
     *&#64;return 帖子数 
     * </pre>
     */
    public void getGlobalPostCount(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_GLOBAL_POST_COUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过帖子ID获取帖子详情
     *&#64;param PGetPostsParam 帖子ID列表,访客的用户id
     *&#64;return PPostViewList 
     * </pre>
     */
    public void getPostInfoByIds(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_POST_INFO_BY_IDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置帖子状态
     *&#64;param PSetPostStateParam 帖子ID列表、状态    
     *&#64;return PEmpty 
     * </pre>
     */
    public void setPostState(com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_POST_STATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询帖子状态
     *&#64;param PStringList 帖子ID   
     *&#64;return PInt32List 帖子状态
     * </pre>
     */
    public void getPostState(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_POST_STATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 刷新全局timeline
     *&#64;param PRefreshTimelineParam 参数    
     *&#64;return PPostViewList 
     * </pre>
     */
    public void refreshGlobalTimeline(com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REFRESH_GLOBAL_TIMELINE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询用户粉丝数(监管)
     *&#64;param PStringList 用户列表   
     *&#64;return PInt32List 用户的粉丝数
     * </pre>
     */
    public void getUsersFansCount(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USERS_FANS_COUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查看用户的发帖历史
     *&#64;param PQueryHitoryParam 查询参数   
     *&#64;return PPostViewList
     * </pre>
     */
    public void grpcGetUserPostHistory(com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_USER_POST_HISTORY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note  查询帖子简要信息(大数据)
     *&#64;param    PStringList 帖子ID列表
     *&#64;return   PPostBriefList
     * </pre>
     */
    public void grpcGetPostBrief(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POST_BRIEF, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note  查询帖子状态和统计(网盘服务使用、大数据)
     *&#64;param    PGetPostsParam 帖子ID列表, viewType字段忽略
     *&#64;return   PPostViewList 只填充状态信息和统计信息 
     * </pre>
     */
    public void grpcGetPostExtraInfo(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POST_EXTRA_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    删除帖子(网盘服务使用删除原创录播帖)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public void grpcDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_DELETE_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    恢复被删除的帖子(粉丝管理系统)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public void grpcUnDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_UN_DELETE_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    查询用户的统计信息(粉丝数、关注数、帖子数)
     *&#64;param    PNewsQueryUserParam 帖子ID
     *&#64;return   PNewsUserStatisticList
     * </pre>
     */
    public void grpcGetUserStatistic(com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_USER_STATISTIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note    检查消息状态(由其它服务提供)
     *&#64;param   请求中count表示要检查的消息进行次数
     *&#64;return  uuid-msigId对应的消息触发次数
     * </pre>
     */
    public void checkMsgIds(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_MSG_IDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IGrpcNewsBlockingStub extends io.grpc.stub.AbstractStub<IGrpcNewsBlockingStub> {
    private IGrpcNewsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcNewsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcNewsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcNewsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 编辑帖子
     *&#64;param PPostEditParam 编辑后的帖子 
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcPostEdit(com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_POST_EDIT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 发布帖子
     *&#64;param PInsidePostNew 发布的帖子
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcPostPublish(com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_POST_PUBLISH, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量点赞帖子
     *&#64;param PBetchVoteAction 期望点赞的帖子ID、执行动作的用户列表
     *&#64;return PEmpty 
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcPostVote(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_POST_VOTE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否点赞过帖子
     *&#64;param PBetchVoteAction 期望判断的帖子ID、用户UUID     
     *&#64;return PNewsVoteExist 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist grpcPostVoteExist(com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_POST_VOTE_EXIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取帖子点赞数(视频服务)
     *&#64;param PStringList 帖子ID    
     *&#64;return PInt32List 
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List grpcGetPostsVoteCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_POSTS_VOTE_CNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量关注用户
     *&#64;param PBetchFollowAction 目标uuid，发起关注的uuid列表    
     *&#64;return PEmpty 
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcNewsFollow(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_NEWS_FOLLOW, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断是否关注用户
     *&#64;param PBetchFollowAction 目标uuid，待判断的uuid列表    
     *&#64;return PNewsFollowExist 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist grpcNewsFollowExist(com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_NEWS_FOLLOW_EXIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区各类帖子数量
     *&#64;param PInt64Single 社区ID    
     *&#64;return PPostCountStatistic 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic getCommunityPostCount(com.blemobi.sep.probuf.ResultProtos.PInt64Single request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_POST_COUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取系统帖子总数   
     *&#64;return 帖子数 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic getGlobalPostCount(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_GLOBAL_POST_COUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过帖子ID获取帖子详情
     *&#64;param PGetPostsParam 帖子ID列表,访客的用户id
     *&#64;return PPostViewList 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PPostViewList getPostInfoByIds(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_POST_INFO_BY_IDS, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置帖子状态
     *&#64;param PSetPostStateParam 帖子ID列表、状态    
     *&#64;return PEmpty 
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setPostState(com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_POST_STATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查询帖子状态
     *&#64;param PStringList 帖子ID   
     *&#64;return PInt32List 帖子状态
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List getPostState(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_POST_STATE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 刷新全局timeline
     *&#64;param PRefreshTimelineParam 参数    
     *&#64;return PPostViewList 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PPostViewList refreshGlobalTimeline(com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REFRESH_GLOBAL_TIMELINE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查询用户粉丝数(监管)
     *&#64;param PStringList 用户列表   
     *&#64;return PInt32List 用户的粉丝数
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List getUsersFansCount(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USERS_FANS_COUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查看用户的发帖历史
     *&#64;param PQueryHitoryParam 查询参数   
     *&#64;return PPostViewList
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PPostViewList grpcGetUserPostHistory(com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_USER_POST_HISTORY, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note  查询帖子简要信息(大数据)
     *&#64;param    PStringList 帖子ID列表
     *&#64;return   PPostBriefList
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList grpcGetPostBrief(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_POST_BRIEF, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note  查询帖子状态和统计(网盘服务使用、大数据)
     *&#64;param    PGetPostsParam 帖子ID列表, viewType字段忽略
     *&#64;return   PPostViewList 只填充状态信息和统计信息 
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsProtos.PPostViewList grpcGetPostExtraInfo(com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_POST_EXTRA_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note    删除帖子(网盘服务使用删除原创录播帖)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_DELETE_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note    恢复被删除的帖子(粉丝管理系统)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcUnDeletePost(com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_UN_DELETE_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note    查询用户的统计信息(粉丝数、关注数、帖子数)
     *&#64;param    PNewsQueryUserParam 帖子ID
     *&#64;return   PNewsUserStatisticList
     * </pre>
     */
    public com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList grpcGetUserStatistic(com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_USER_STATISTIC, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note    检查消息状态(由其它服务提供)
     *&#64;param   请求中count表示要检查的消息进行次数
     *&#64;return  uuid-msigId对应的消息触发次数
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List checkMsgIds(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_MSG_IDS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IGrpcNewsFutureStub extends io.grpc.stub.AbstractStub<IGrpcNewsFutureStub> {
    private IGrpcNewsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcNewsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcNewsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcNewsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 编辑帖子
     *&#64;param PPostEditParam 编辑后的帖子 
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcPostEdit(
        com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_EDIT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 发布帖子
     *&#64;param PInsidePostNew 发布的帖子
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcPostPublish(
        com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_PUBLISH, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量点赞帖子
     *&#64;param PBetchVoteAction 期望点赞的帖子ID、执行动作的用户列表
     *&#64;return PEmpty 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcPostVote(
        com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_VOTE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否点赞过帖子
     *&#64;param PBetchVoteAction 期望判断的帖子ID、用户UUID     
     *&#64;return PNewsVoteExist 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist> grpcPostVoteExist(
        com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_POST_VOTE_EXIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取帖子点赞数(视频服务)
     *&#64;param PStringList 帖子ID    
     *&#64;return PInt32List 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> grpcGetPostsVoteCnt(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POSTS_VOTE_CNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量关注用户
     *&#64;param PBetchFollowAction 目标uuid，发起关注的uuid列表    
     *&#64;return PEmpty 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcNewsFollow(
        com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_NEWS_FOLLOW, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断是否关注用户
     *&#64;param PBetchFollowAction 目标uuid，待判断的uuid列表    
     *&#64;return PNewsFollowExist 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist> grpcNewsFollowExist(
        com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_NEWS_FOLLOW_EXIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区各类帖子数量
     *&#64;param PInt64Single 社区ID    
     *&#64;return PPostCountStatistic 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> getCommunityPostCount(
        com.blemobi.sep.probuf.ResultProtos.PInt64Single request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_POST_COUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取系统帖子总数   
     *&#64;return 帖子数 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic> getGlobalPostCount(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_GLOBAL_POST_COUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过帖子ID获取帖子详情
     *&#64;param PGetPostsParam 帖子ID列表,访客的用户id
     *&#64;return PPostViewList 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PPostViewList> getPostInfoByIds(
        com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_POST_INFO_BY_IDS, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置帖子状态
     *&#64;param PSetPostStateParam 帖子ID列表、状态    
     *&#64;return PEmpty 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setPostState(
        com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_POST_STATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查询帖子状态
     *&#64;param PStringList 帖子ID   
     *&#64;return PInt32List 帖子状态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> getPostState(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_POST_STATE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 刷新全局timeline
     *&#64;param PRefreshTimelineParam 参数    
     *&#64;return PPostViewList 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PPostViewList> refreshGlobalTimeline(
        com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REFRESH_GLOBAL_TIMELINE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查询用户粉丝数(监管)
     *&#64;param PStringList 用户列表   
     *&#64;return PInt32List 用户的粉丝数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> getUsersFansCount(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USERS_FANS_COUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查看用户的发帖历史
     *&#64;param PQueryHitoryParam 查询参数   
     *&#64;return PPostViewList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PPostViewList> grpcGetUserPostHistory(
        com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_USER_POST_HISTORY, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note  查询帖子简要信息(大数据)
     *&#64;param    PStringList 帖子ID列表
     *&#64;return   PPostBriefList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList> grpcGetPostBrief(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POST_BRIEF, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note  查询帖子状态和统计(网盘服务使用、大数据)
     *&#64;param    PGetPostsParam 帖子ID列表, viewType字段忽略
     *&#64;return   PPostViewList 只填充状态信息和统计信息 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsProtos.PPostViewList> grpcGetPostExtraInfo(
        com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_POST_EXTRA_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note    删除帖子(网盘服务使用删除原创录播帖)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcDeletePost(
        com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_DELETE_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note    恢复被删除的帖子(粉丝管理系统)
     *&#64;param    PDeletePostsParam 帖子ID
     *&#64;return   PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcUnDeletePost(
        com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_UN_DELETE_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note    查询用户的统计信息(粉丝数、关注数、帖子数)
     *&#64;param    PNewsQueryUserParam 帖子ID
     *&#64;return   PNewsUserStatisticList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList> grpcGetUserStatistic(
        com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_USER_STATISTIC, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note    检查消息状态(由其它服务提供)
     *&#64;param   请求中count表示要检查的消息进行次数
     *&#64;return  uuid-msigId对应的消息触发次数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> checkMsgIds(
        com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_MSG_IDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_POST_EDIT = 0;
  private static final int METHODID_GRPC_POST_PUBLISH = 1;
  private static final int METHODID_GRPC_POST_VOTE = 2;
  private static final int METHODID_GRPC_POST_VOTE_EXIST = 3;
  private static final int METHODID_GRPC_GET_POSTS_VOTE_CNT = 4;
  private static final int METHODID_GRPC_NEWS_FOLLOW = 5;
  private static final int METHODID_GRPC_NEWS_FOLLOW_EXIST = 6;
  private static final int METHODID_GET_COMMUNITY_POST_COUNT = 7;
  private static final int METHODID_GET_GLOBAL_POST_COUNT = 8;
  private static final int METHODID_GET_POST_INFO_BY_IDS = 9;
  private static final int METHODID_SET_POST_STATE = 10;
  private static final int METHODID_GET_POST_STATE = 11;
  private static final int METHODID_REFRESH_GLOBAL_TIMELINE = 12;
  private static final int METHODID_GET_USERS_FANS_COUNT = 13;
  private static final int METHODID_GRPC_GET_USER_POST_HISTORY = 14;
  private static final int METHODID_GRPC_GET_POST_BRIEF = 15;
  private static final int METHODID_GRPC_GET_POST_EXTRA_INFO = 16;
  private static final int METHODID_GRPC_DELETE_POST = 17;
  private static final int METHODID_GRPC_UN_DELETE_POST = 18;
  private static final int METHODID_GRPC_GET_USER_STATISTIC = 19;
  private static final int METHODID_CHECK_MSG_IDS = 20;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IGrpcNewsImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IGrpcNewsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_POST_EDIT:
          serviceImpl.grpcPostEdit((com.blemobi.sep.probuf.NewsApiProtos.PPostEditParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_POST_PUBLISH:
          serviceImpl.grpcPostPublish((com.blemobi.sep.probuf.NewsApiProtos.PInsidePostNew) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_POST_VOTE:
          serviceImpl.grpcPostVote((com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_POST_VOTE_EXIST:
          serviceImpl.grpcPostVoteExist((com.blemobi.sep.probuf.NewsProtos.PBetchVoteAction) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsVoteExist>) responseObserver);
          break;
        case METHODID_GRPC_GET_POSTS_VOTE_CNT:
          serviceImpl.grpcGetPostsVoteCnt((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GRPC_NEWS_FOLLOW:
          serviceImpl.grpcNewsFollow((com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_NEWS_FOLLOW_EXIST:
          serviceImpl.grpcNewsFollowExist((com.blemobi.sep.probuf.NewsProtos.PBetchFollowAction) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PNewsFollowExist>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_POST_COUNT:
          serviceImpl.getCommunityPostCount((com.blemobi.sep.probuf.ResultProtos.PInt64Single) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic>) responseObserver);
          break;
        case METHODID_GET_GLOBAL_POST_COUNT:
          serviceImpl.getGlobalPostCount((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostCountStatistic>) responseObserver);
          break;
        case METHODID_GET_POST_INFO_BY_IDS:
          serviceImpl.getPostInfoByIds((com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList>) responseObserver);
          break;
        case METHODID_SET_POST_STATE:
          serviceImpl.setPostState((com.blemobi.sep.probuf.NewsApiProtos.PSetPostStateParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_POST_STATE:
          serviceImpl.getPostState((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_REFRESH_GLOBAL_TIMELINE:
          serviceImpl.refreshGlobalTimeline((com.blemobi.sep.probuf.NewsApiProtos.PRefreshTimelineParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList>) responseObserver);
          break;
        case METHODID_GET_USERS_FANS_COUNT:
          serviceImpl.getUsersFansCount((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GRPC_GET_USER_POST_HISTORY:
          serviceImpl.grpcGetUserPostHistory((com.blemobi.sep.probuf.NewsApiProtos.PQueryHitoryParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList>) responseObserver);
          break;
        case METHODID_GRPC_GET_POST_BRIEF:
          serviceImpl.grpcGetPostBrief((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PPostBriefList>) responseObserver);
          break;
        case METHODID_GRPC_GET_POST_EXTRA_INFO:
          serviceImpl.grpcGetPostExtraInfo((com.blemobi.sep.probuf.NewsApiProtos.PGetPostsParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsProtos.PPostViewList>) responseObserver);
          break;
        case METHODID_GRPC_DELETE_POST:
          serviceImpl.grpcDeletePost((com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_UN_DELETE_POST:
          serviceImpl.grpcUnDeletePost((com.blemobi.sep.probuf.NewsApiProtos.PDeletePostsParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_GET_USER_STATISTIC:
          serviceImpl.grpcGetUserStatistic((com.blemobi.sep.probuf.NewsApiProtos.PNewsQueryUserParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.NewsApiProtos.PNewsUserStatisticList>) responseObserver);
          break;
        case METHODID_CHECK_MSG_IDS:
          serviceImpl.checkMsgIds((com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_GRPC_POST_EDIT,
        METHOD_GRPC_POST_PUBLISH,
        METHOD_GRPC_POST_VOTE,
        METHOD_GRPC_POST_VOTE_EXIST,
        METHOD_GRPC_GET_POSTS_VOTE_CNT,
        METHOD_GRPC_NEWS_FOLLOW,
        METHOD_GRPC_NEWS_FOLLOW_EXIST,
        METHOD_GET_COMMUNITY_POST_COUNT,
        METHOD_GET_GLOBAL_POST_COUNT,
        METHOD_GET_POST_INFO_BY_IDS,
        METHOD_SET_POST_STATE,
        METHOD_GET_POST_STATE,
        METHOD_REFRESH_GLOBAL_TIMELINE,
        METHOD_GET_USERS_FANS_COUNT,
        METHOD_GRPC_GET_USER_POST_HISTORY,
        METHOD_GRPC_GET_POST_BRIEF,
        METHOD_GRPC_GET_POST_EXTRA_INFO,
        METHOD_GRPC_DELETE_POST,
        METHOD_GRPC_UN_DELETE_POST,
        METHOD_GRPC_GET_USER_STATISTIC,
        METHOD_CHECK_MSG_IDS);
  }

}
