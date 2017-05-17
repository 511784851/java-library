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
    comments = "Source: social_inside.proto")
public class SocialGrpc {

  private SocialGrpc() {}

  public static final String SERVICE_NAME = "bbproto.Social";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts> METHOD_FRIEND_COUNTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.Social", "FriendCounts"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.SocialApiProtos.PRelationReq,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_RELATIONS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.Social", "Relations"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.SocialApiProtos.PRelationReq.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SocialStub newStub(io.grpc.Channel channel) {
    return new SocialStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SocialBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SocialBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static SocialFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SocialFutureStub(channel);
  }

  /**
   */
  public static abstract class SocialImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 批量获取用户好友数量
     *&#64;param PStringList 用户uuid列表
     *&#64;return PSocialFriendCounts uuid对应的好友数量
     * </pre>
     */
    public void friendCounts(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FRIEND_COUNTS, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户的社交关系
     *&#64;param PRelationReq 社交关系请求
     *&#64;return PStringList 对应用户列表下标的关系。值说明：0: A --- B; 1: A --&gt; B; 2: A &lt;-- B; 3: A &lt;-&gt; B
     * </pre>
     */
    public void relations(com.blemobi.sep.probuf.SocialApiProtos.PRelationReq request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RELATIONS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_FRIEND_COUNTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts>(
                  this, METHODID_FRIEND_COUNTS)))
          .addMethod(
            METHOD_RELATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.SocialApiProtos.PRelationReq,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_RELATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class SocialStub extends io.grpc.stub.AbstractStub<SocialStub> {
    private SocialStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SocialStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SocialStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户好友数量
     *&#64;param PStringList 用户uuid列表
     *&#64;return PSocialFriendCounts uuid对应的好友数量
     * </pre>
     */
    public void friendCounts(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FRIEND_COUNTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户的社交关系
     *&#64;param PRelationReq 社交关系请求
     *&#64;return PStringList 对应用户列表下标的关系。值说明：0: A --- B; 1: A --&gt; B; 2: A &lt;-- B; 3: A &lt;-&gt; B
     * </pre>
     */
    public void relations(com.blemobi.sep.probuf.SocialApiProtos.PRelationReq request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RELATIONS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SocialBlockingStub extends io.grpc.stub.AbstractStub<SocialBlockingStub> {
    private SocialBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SocialBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SocialBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户好友数量
     *&#64;param PStringList 用户uuid列表
     *&#64;return PSocialFriendCounts uuid对应的好友数量
     * </pre>
     */
    public com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts friendCounts(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FRIEND_COUNTS, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户的社交关系
     *&#64;param PRelationReq 社交关系请求
     *&#64;return PStringList 对应用户列表下标的关系。值说明：0: A --- B; 1: A --&gt; B; 2: A &lt;-- B; 3: A &lt;-&gt; B
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList relations(com.blemobi.sep.probuf.SocialApiProtos.PRelationReq request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RELATIONS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SocialFutureStub extends io.grpc.stub.AbstractStub<SocialFutureStub> {
    private SocialFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SocialFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SocialFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SocialFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户好友数量
     *&#64;param PStringList 用户uuid列表
     *&#64;return PSocialFriendCounts uuid对应的好友数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts> friendCounts(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FRIEND_COUNTS, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户的社交关系
     *&#64;param PRelationReq 社交关系请求
     *&#64;return PStringList 对应用户列表下标的关系。值说明：0: A --- B; 1: A --&gt; B; 2: A &lt;-- B; 3: A &lt;-&gt; B
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> relations(
        com.blemobi.sep.probuf.SocialApiProtos.PRelationReq request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RELATIONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_FRIEND_COUNTS = 0;
  private static final int METHODID_RELATIONS = 1;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SocialImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(SocialImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FRIEND_COUNTS:
          serviceImpl.friendCounts((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.SocialApiProtos.PSocialFriendCounts>) responseObserver);
          break;
        case METHODID_RELATIONS:
          serviceImpl.relations((com.blemobi.sep.probuf.SocialApiProtos.PRelationReq) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
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
        METHOD_FRIEND_COUNTS,
        METHOD_RELATIONS);
  }

}
