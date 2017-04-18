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

import com.blemobi.sep.probuf.CommentApiProtos;
import com.blemobi.sep.probuf.CommentProtos;
import com.blemobi.sep.probuf.CommonApiProtos;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam;
import com.blemobi.sep.probuf.CommentApiProtos.PCommentParam;
import com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam;
import com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote;
import com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist;
import com.blemobi.sep.probuf.CommentProtos.PClientCommentList;
import com.blemobi.sep.probuf.CommentProtos.PCommentExtList;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.ResultProtos.PInt32Single;
import com.blemobi.sep.probuf.ResultProtos.PStringList;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: comment_inside.proto")
public class IGrpcCommentGrpc {

  private IGrpcCommentGrpc() {}

  public static final String SERVICE_NAME = "bbproto.IGrpcComment";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentProtos.PClientCommentList,
      com.blemobi.sep.probuf.ResultProtos.PInt32Single> METHOD_GRPC_COMMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcComment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PClientCommentList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32Single.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentProtos.PClientCommentList,
      com.blemobi.sep.probuf.ResultProtos.PInt32Single> METHOD_GRPC_COMMENT_REPLY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcCommentReply"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PClientCommentList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32Single.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_COMMENT_VOTE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcCommentVote"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote,
      com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist> METHOD_GRPC_COMMENT_VOTE_EXIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcCommentVoteExist"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GRPC_GET_COMMENT_CNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcGetCommentCnt"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GRPC_GET_COMMENT_REPLY_CNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcGetCommentReplyCnt"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentApiProtos.PCommentParam,
      com.blemobi.sep.probuf.CommentProtos.PCommentExtList> METHOD_GRPC_LOAD_COMMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcLoadComment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentApiProtos.PCommentParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PCommentExtList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam,
      com.blemobi.sep.probuf.CommentProtos.PCommentExtList> METHOD_GRPC_LOAD_COMMENT_COMMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcLoadCommentComment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PCommentExtList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam,
      com.blemobi.sep.probuf.CommentProtos.PCommentExtList> METHOD_GRPC_GET_COMMENT_BY_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcComment", "GrpcGetCommentByIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommentProtos.PCommentExtList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IGrpcCommentStub newStub(io.grpc.Channel channel) {
    return new IGrpcCommentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcCommentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IGrpcCommentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcCommentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IGrpcCommentFutureStub(channel);
  }

  /**
   */
  public static abstract class IGrpcCommentImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 批量评论微博
     *&#64;param PClientCommentList 评论的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public void grpcComment(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_COMMENT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量回复微博评论
     *&#64;param PClientCommentList 回复的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public void grpcCommentReply(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_COMMENT_REPLY, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量赞微博评论
     *&#64;param PBetchCommentVote 动作类型,期望赞的评论ID、用户列表
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcCommentVote(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_COMMENT_VOTE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否赞过评论
     *&#64;param PBetchCommentVote 期望判断的评论ID、用户UUID
     *&#64;return PCommentVoteExist
     * </pre>
     */
    public void grpcCommentVoteExist(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_COMMENT_VOTE_EXIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询帖子的评论数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public void grpcGetCommentCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_COMMENT_CNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询评论的回复数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public void grpcGetCommentReplyCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_COMMENT_REPLY_CNT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 加载帖子评论
     *&#64;param PCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcLoadComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_LOAD_COMMENT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 加载评论的二级评论
     *&#64;param PCommentCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcLoadCommentComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_LOAD_COMMENT_COMMENT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过评论ID获取评论内容
     *&#64;param PQueryByIdsParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcGetCommentByIds(com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_COMMENT_BY_IDS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GRPC_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentProtos.PClientCommentList,
                com.blemobi.sep.probuf.ResultProtos.PInt32Single>(
                  this, METHODID_GRPC_COMMENT)))
          .addMethod(
            METHOD_GRPC_COMMENT_REPLY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentProtos.PClientCommentList,
                com.blemobi.sep.probuf.ResultProtos.PInt32Single>(
                  this, METHODID_GRPC_COMMENT_REPLY)))
          .addMethod(
            METHOD_GRPC_COMMENT_VOTE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_COMMENT_VOTE)))
          .addMethod(
            METHOD_GRPC_COMMENT_VOTE_EXIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote,
                com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist>(
                  this, METHODID_GRPC_COMMENT_VOTE_EXIST)))
          .addMethod(
            METHOD_GRPC_GET_COMMENT_CNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GRPC_GET_COMMENT_CNT)))
          .addMethod(
            METHOD_GRPC_GET_COMMENT_REPLY_CNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GRPC_GET_COMMENT_REPLY_CNT)))
          .addMethod(
            METHOD_GRPC_LOAD_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentApiProtos.PCommentParam,
                com.blemobi.sep.probuf.CommentProtos.PCommentExtList>(
                  this, METHODID_GRPC_LOAD_COMMENT)))
          .addMethod(
            METHOD_GRPC_LOAD_COMMENT_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam,
                com.blemobi.sep.probuf.CommentProtos.PCommentExtList>(
                  this, METHODID_GRPC_LOAD_COMMENT_COMMENT)))
          .addMethod(
            METHOD_GRPC_GET_COMMENT_BY_IDS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam,
                com.blemobi.sep.probuf.CommentProtos.PCommentExtList>(
                  this, METHODID_GRPC_GET_COMMENT_BY_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class IGrpcCommentStub extends io.grpc.stub.AbstractStub<IGrpcCommentStub> {
    private IGrpcCommentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommentStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量评论微博
     *&#64;param PClientCommentList 评论的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public void grpcComment(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量回复微博评论
     *&#64;param PClientCommentList 回复的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public void grpcCommentReply(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_REPLY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量赞微博评论
     *&#64;param PBetchCommentVote 动作类型,期望赞的评论ID、用户列表
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcCommentVote(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_VOTE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否赞过评论
     *&#64;param PBetchCommentVote 期望判断的评论ID、用户UUID
     *&#64;return PCommentVoteExist
     * </pre>
     */
    public void grpcCommentVoteExist(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_VOTE_EXIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询帖子的评论数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public void grpcGetCommentCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_CNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询评论的回复数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public void grpcGetCommentReplyCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_REPLY_CNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 加载帖子评论
     *&#64;param PCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcLoadComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_LOAD_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 加载评论的二级评论
     *&#64;param PCommentCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcLoadCommentComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_LOAD_COMMENT_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过评论ID获取评论内容
     *&#64;param PQueryByIdsParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public void grpcGetCommentByIds(com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_BY_IDS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IGrpcCommentBlockingStub extends io.grpc.stub.AbstractStub<IGrpcCommentBlockingStub> {
    private IGrpcCommentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommentBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量评论微博
     *&#64;param PClientCommentList 评论的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32Single grpcComment(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_COMMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量回复微博评论
     *&#64;param PClientCommentList 回复的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32Single grpcCommentReply(com.blemobi.sep.probuf.CommentProtos.PClientCommentList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_COMMENT_REPLY, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量赞微博评论
     *&#64;param PBetchCommentVote 动作类型,期望赞的评论ID、用户列表
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcCommentVote(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_COMMENT_VOTE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否赞过评论
     *&#64;param PBetchCommentVote 期望判断的评论ID、用户UUID
     *&#64;return PCommentVoteExist
     * </pre>
     */
    public com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist grpcCommentVoteExist(com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_COMMENT_VOTE_EXIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查询帖子的评论数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List grpcGetCommentCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_COMMENT_CNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查询评论的回复数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List grpcGetCommentReplyCnt(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_COMMENT_REPLY_CNT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 加载帖子评论
     *&#64;param PCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.blemobi.sep.probuf.CommentProtos.PCommentExtList grpcLoadComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_LOAD_COMMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 加载评论的二级评论
     *&#64;param PCommentCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.blemobi.sep.probuf.CommentProtos.PCommentExtList grpcLoadCommentComment(com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_LOAD_COMMENT_COMMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过评论ID获取评论内容
     *&#64;param PQueryByIdsParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.blemobi.sep.probuf.CommentProtos.PCommentExtList grpcGetCommentByIds(com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_COMMENT_BY_IDS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IGrpcCommentFutureStub extends io.grpc.stub.AbstractStub<IGrpcCommentFutureStub> {
    private IGrpcCommentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommentFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量评论微博
     *&#64;param PClientCommentList 评论的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32Single> grpcComment(
        com.blemobi.sep.probuf.CommentProtos.PClientCommentList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量回复微博评论
     *&#64;param PClientCommentList 回复的内容列表 
     *&#64;return PInt32Single失败的评论的下标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32Single> grpcCommentReply(
        com.blemobi.sep.probuf.CommentProtos.PClientCommentList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_REPLY, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量赞微博评论
     *&#64;param PBetchCommentVote 动作类型,期望赞的评论ID、用户列表
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcCommentVote(
        com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_VOTE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量判断用户是否赞过评论
     *&#64;param PBetchCommentVote 期望判断的评论ID、用户UUID
     *&#64;return PCommentVoteExist
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist> grpcCommentVoteExist(
        com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_COMMENT_VOTE_EXIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查询帖子的评论数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> grpcGetCommentCnt(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_CNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查询评论的回复数
     *&#64;param PStringList 帖子ID列表
     *&#64;return PInt32List
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> grpcGetCommentReplyCnt(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_REPLY_CNT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 加载帖子评论
     *&#64;param PCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> grpcLoadComment(
        com.blemobi.sep.probuf.CommentApiProtos.PCommentParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_LOAD_COMMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 加载评论的二级评论
     *&#64;param PCommentCommentParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> grpcLoadCommentComment(
        com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_LOAD_COMMENT_COMMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过评论ID获取评论内容
     *&#64;param PQueryByIdsParam
     *&#64;return PCommentExtList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommentProtos.PCommentExtList> grpcGetCommentByIds(
        com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_COMMENT_BY_IDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_COMMENT = 0;
  private static final int METHODID_GRPC_COMMENT_REPLY = 1;
  private static final int METHODID_GRPC_COMMENT_VOTE = 2;
  private static final int METHODID_GRPC_COMMENT_VOTE_EXIST = 3;
  private static final int METHODID_GRPC_GET_COMMENT_CNT = 4;
  private static final int METHODID_GRPC_GET_COMMENT_REPLY_CNT = 5;
  private static final int METHODID_GRPC_LOAD_COMMENT = 6;
  private static final int METHODID_GRPC_LOAD_COMMENT_COMMENT = 7;
  private static final int METHODID_GRPC_GET_COMMENT_BY_IDS = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IGrpcCommentImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IGrpcCommentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_COMMENT:
          serviceImpl.grpcComment((com.blemobi.sep.probuf.CommentProtos.PClientCommentList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single>) responseObserver);
          break;
        case METHODID_GRPC_COMMENT_REPLY:
          serviceImpl.grpcCommentReply((com.blemobi.sep.probuf.CommentProtos.PClientCommentList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single>) responseObserver);
          break;
        case METHODID_GRPC_COMMENT_VOTE:
          serviceImpl.grpcCommentVote((com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_COMMENT_VOTE_EXIST:
          serviceImpl.grpcCommentVoteExist((com.blemobi.sep.probuf.CommentProtos.PBetchCommentVote) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PBetchCommentVoteExist>) responseObserver);
          break;
        case METHODID_GRPC_GET_COMMENT_CNT:
          serviceImpl.grpcGetCommentCnt((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GRPC_GET_COMMENT_REPLY_CNT:
          serviceImpl.grpcGetCommentReplyCnt((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GRPC_LOAD_COMMENT:
          serviceImpl.grpcLoadComment((com.blemobi.sep.probuf.CommentApiProtos.PCommentParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList>) responseObserver);
          break;
        case METHODID_GRPC_LOAD_COMMENT_COMMENT:
          serviceImpl.grpcLoadCommentComment((com.blemobi.sep.probuf.CommentApiProtos.PCommentCommentParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList>) responseObserver);
          break;
        case METHODID_GRPC_GET_COMMENT_BY_IDS:
          serviceImpl.grpcGetCommentByIds((com.blemobi.sep.probuf.CommentApiProtos.PQueryByIdsParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommentProtos.PCommentExtList>) responseObserver);
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
        METHOD_GRPC_COMMENT,
        METHOD_GRPC_COMMENT_REPLY,
        METHOD_GRPC_COMMENT_VOTE,
        METHOD_GRPC_COMMENT_VOTE_EXIST,
        METHOD_GRPC_GET_COMMENT_CNT,
        METHOD_GRPC_GET_COMMENT_REPLY_CNT,
        METHOD_GRPC_LOAD_COMMENT,
        METHOD_GRPC_LOAD_COMMENT_COMMENT,
        METHOD_GRPC_GET_COMMENT_BY_IDS);
  }

}
