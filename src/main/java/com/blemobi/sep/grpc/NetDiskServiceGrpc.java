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

import com.blemobi.sep.probuf.CommonApiProtos;
import com.blemobi.sep.probuf.NetdiskApiProtos;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam;
import com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam;
import com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam;
import com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam;
import com.blemobi.sep.probuf.ResultProtos.PBoolSingle;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: netdisk_inside.proto")
public class NetDiskServiceGrpc {

  private NetDiskServiceGrpc() {}

  public static final String SERVICE_NAME = "bbproto.NetDiskService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_VIDEO_STATUS_BY_POST_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "setVideoStatusByPostId"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_OP_VIDEO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "opVideo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PBoolSingle> METHOD_IS_EXISTS_VIDEO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "isExistsVideo"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam,
      com.blemobi.sep.probuf.ResultProtos.PBoolSingle> METHOD_TIPOFF_VIDEO_BY_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "tipoffVideoByPost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam,
      com.blemobi.sep.probuf.ResultProtos.PBoolSingle> METHOD_TIPOFF_VIDEO_BY_OBJECTKEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "tipoffVideoByObjectkey"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolSingle.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetDiskServiceStub newStub(io.grpc.Channel channel) {
    return new NetDiskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetDiskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NetDiskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NetDiskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NetDiskServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class NetDiskServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 根据帖子ID，设置所属帖子视频的状态
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setVideoStatusByPostId(com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 当新建、审核拒绝、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void opVideo(com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_OP_VIDEO, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询社区中是否存在视频
     *&#64;param PStringSingle communityId
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void isExistsVideo(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_EXISTS_VIDEO, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByPost(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIPOFF_VIDEO_BY_POST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByObjectkey(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SET_VIDEO_STATUS_BY_POST_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_VIDEO_STATUS_BY_POST_ID)))
          .addMethod(
            METHOD_OP_VIDEO,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_OP_VIDEO)))
          .addMethod(
            METHOD_IS_EXISTS_VIDEO,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PBoolSingle>(
                  this, METHODID_IS_EXISTS_VIDEO)))
          .addMethod(
            METHOD_TIPOFF_VIDEO_BY_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam,
                com.blemobi.sep.probuf.ResultProtos.PBoolSingle>(
                  this, METHODID_TIPOFF_VIDEO_BY_POST)))
          .addMethod(
            METHOD_TIPOFF_VIDEO_BY_OBJECTKEY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam,
                com.blemobi.sep.probuf.ResultProtos.PBoolSingle>(
                  this, METHODID_TIPOFF_VIDEO_BY_OBJECTKEY)))
          .build();
    }
  }

  /**
   */
  public static final class NetDiskServiceStub extends io.grpc.stub.AbstractStub<NetDiskServiceStub> {
    private NetDiskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetDiskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetDiskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetDiskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 根据帖子ID，设置所属帖子视频的状态
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setVideoStatusByPostId(com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 当新建、审核拒绝、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void opVideo(com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_OP_VIDEO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询社区中是否存在视频
     *&#64;param PStringSingle communityId
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void isExistsVideo(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_EXISTS_VIDEO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByPost(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByObjectkey(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetDiskServiceBlockingStub extends io.grpc.stub.AbstractStub<NetDiskServiceBlockingStub> {
    private NetDiskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetDiskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetDiskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetDiskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 根据帖子ID，设置所属帖子视频的状态
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setVideoStatusByPostId(com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 当新建、审核拒绝、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty opVideo(com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_OP_VIDEO, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 查询社区中是否存在视频
     *&#64;param PStringSingle communityId
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolSingle isExistsVideo(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_EXISTS_VIDEO, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolSingle tipoffVideoByPost(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolSingle tipoffVideoByObjectkey(com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetDiskServiceFutureStub extends io.grpc.stub.AbstractStub<NetDiskServiceFutureStub> {
    private NetDiskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NetDiskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetDiskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NetDiskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 根据帖子ID，设置所属帖子视频的状态
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setVideoStatusByPostId(
        com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 当新建、审核拒绝、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> opVideo(
        com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_OP_VIDEO, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 查询社区中是否存在视频
     *&#64;param PStringSingle communityId
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> isExistsVideo(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_EXISTS_VIDEO, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> tipoffVideoByPost(
        com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> tipoffVideoByObjectkey(
        com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_VIDEO_STATUS_BY_POST_ID = 0;
  private static final int METHODID_OP_VIDEO = 1;
  private static final int METHODID_IS_EXISTS_VIDEO = 2;
  private static final int METHODID_TIPOFF_VIDEO_BY_POST = 3;
  private static final int METHODID_TIPOFF_VIDEO_BY_OBJECTKEY = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetDiskServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(NetDiskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_VIDEO_STATUS_BY_POST_ID:
          serviceImpl.setVideoStatusByPostId((com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_OP_VIDEO:
          serviceImpl.opVideo((com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_IS_EXISTS_VIDEO:
          serviceImpl.isExistsVideo((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_TIPOFF_VIDEO_BY_POST:
          serviceImpl.tipoffVideoByPost((com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffPostParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_TIPOFF_VIDEO_BY_OBJECTKEY:
          serviceImpl.tipoffVideoByObjectkey((com.blemobi.sep.probuf.NetdiskApiProtos.PTipOffObjkeyParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle>) responseObserver);
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
        METHOD_SET_VIDEO_STATUS_BY_POST_ID,
        METHOD_OP_VIDEO,
        METHOD_IS_EXISTS_VIDEO,
        METHOD_TIPOFF_VIDEO_BY_POST,
        METHOD_TIPOFF_VIDEO_BY_OBJECTKEY);
  }

}
