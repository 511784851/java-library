package com.blemobi.sep.grpc;

import com.blemobi.sep.probuf.CommonApiProtos;
import com.blemobi.sep.probuf.NetdiskApiProtos;
import com.blemobi.sep.probuf.ResultProtos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

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
  public static final io.grpc.MethodDescriptor<NetdiskApiProtos.PSetFileParam,
      CommonApiProtos.PEmpty> METHOD_SET_VIDEO_STATUS_BY_POST_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "setVideoStatusByPostId"),
          io.grpc.protobuf.ProtoUtils.marshaller(NetdiskApiProtos.PSetFileParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<NetdiskApiProtos.POPFileParam,
      CommonApiProtos.PEmpty> METHOD_OP_VIDEO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "opVideo"),
          io.grpc.protobuf.ProtoUtils.marshaller(NetdiskApiProtos.POPFileParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResultProtos.PStringSingle,
      ResultProtos.PBoolSingle> METHOD_IS_EXISTS_VIDEO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "isExistsVideo"),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<NetdiskApiProtos.PTipOffPostParam,
      ResultProtos.PBoolSingle> METHOD_TIPOFF_VIDEO_BY_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "tipoffVideoByPost"),
          io.grpc.protobuf.ProtoUtils.marshaller(NetdiskApiProtos.PTipOffPostParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<NetdiskApiProtos.PTipOffObjkeyParam,
      ResultProtos.PBoolSingle> METHOD_TIPOFF_VIDEO_BY_OBJECTKEY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "tipoffVideoByObjectkey"),
          io.grpc.protobuf.ProtoUtils.marshaller(NetdiskApiProtos.PTipOffObjkeyParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<NetdiskApiProtos.PHiddenParam,
      ResultProtos.PBoolSingle> METHOD_HIDDEN_VIDEO =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.NetDiskService", "hiddenVideo"),
          io.grpc.protobuf.ProtoUtils.marshaller(NetdiskApiProtos.PHiddenParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PBoolSingle.getDefaultInstance()));

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
    public void setVideoStatusByPostId(NetdiskApiProtos.PSetFileParam request,
        io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 当新建、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void opVideo(NetdiskApiProtos.POPFileParam request,
        io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_OP_VIDEO, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 查询社区中是否存在视频
     *&#64;param PStringSingle communityId
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void isExistsVideo(ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_EXISTS_VIDEO, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByPost(NetdiskApiProtos.PTipOffPostParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIPOFF_VIDEO_BY_POST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByObjectkey(NetdiskApiProtos.PTipOffObjkeyParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 隐藏视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void hiddenVideo(NetdiskApiProtos.PHiddenParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HIDDEN_VIDEO, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SET_VIDEO_STATUS_BY_POST_ID,
            asyncUnaryCall(
              new MethodHandlers<
                NetdiskApiProtos.PSetFileParam,
                CommonApiProtos.PEmpty>(
                  this, METHODID_SET_VIDEO_STATUS_BY_POST_ID)))
          .addMethod(
            METHOD_OP_VIDEO,
            asyncUnaryCall(
              new MethodHandlers<
                NetdiskApiProtos.POPFileParam,
                CommonApiProtos.PEmpty>(
                  this, METHODID_OP_VIDEO)))
          .addMethod(
            METHOD_IS_EXISTS_VIDEO,
            asyncUnaryCall(
              new MethodHandlers<
                ResultProtos.PStringSingle,
                ResultProtos.PBoolSingle>(
                  this, METHODID_IS_EXISTS_VIDEO)))
          .addMethod(
            METHOD_TIPOFF_VIDEO_BY_POST,
            asyncUnaryCall(
              new MethodHandlers<
                NetdiskApiProtos.PTipOffPostParam,
                ResultProtos.PBoolSingle>(
                  this, METHODID_TIPOFF_VIDEO_BY_POST)))
          .addMethod(
            METHOD_TIPOFF_VIDEO_BY_OBJECTKEY,
            asyncUnaryCall(
              new MethodHandlers<
                NetdiskApiProtos.PTipOffObjkeyParam,
                ResultProtos.PBoolSingle>(
                  this, METHODID_TIPOFF_VIDEO_BY_OBJECTKEY)))
          .addMethod(
            METHOD_HIDDEN_VIDEO,
            asyncUnaryCall(
              new MethodHandlers<
                NetdiskApiProtos.PHiddenParam,
                ResultProtos.PBoolSingle>(
                  this, METHODID_HIDDEN_VIDEO)))
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

    @Override
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
    public void setVideoStatusByPostId(NetdiskApiProtos.PSetFileParam request,
        io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 当新建、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void opVideo(NetdiskApiProtos.POPFileParam request,
        io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty> responseObserver) {
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
    public void isExistsVideo(ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_EXISTS_VIDEO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByPost(NetdiskApiProtos.PTipOffPostParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void tipoffVideoByObjectkey(NetdiskApiProtos.PTipOffObjkeyParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 隐藏视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public void hiddenVideo(NetdiskApiProtos.PHiddenParam request,
        io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HIDDEN_VIDEO, getCallOptions()), request, responseObserver);
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

    @Override
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
    public CommonApiProtos.PEmpty setVideoStatusByPostId(NetdiskApiProtos.PSetFileParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 当新建、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public CommonApiProtos.PEmpty opVideo(NetdiskApiProtos.POPFileParam request) {
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
    public ResultProtos.PBoolSingle isExistsVideo(ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_EXISTS_VIDEO, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public ResultProtos.PBoolSingle tipoffVideoByPost(NetdiskApiProtos.PTipOffPostParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public ResultProtos.PBoolSingle tipoffVideoByObjectkey(NetdiskApiProtos.PTipOffObjkeyParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 隐藏视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public ResultProtos.PBoolSingle hiddenVideo(NetdiskApiProtos.PHiddenParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HIDDEN_VIDEO, getCallOptions(), request);
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

    @Override
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
    public com.google.common.util.concurrent.ListenableFuture<CommonApiProtos.PEmpty> setVideoStatusByPostId(
        NetdiskApiProtos.PSetFileParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_VIDEO_STATUS_BY_POST_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 当新建、删除（动态、咨询）帖子时，需要将帖子中的视频通知netdisk进行对应操作
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<CommonApiProtos.PEmpty> opVideo(
        NetdiskApiProtos.POPFileParam request) {
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
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PBoolSingle> isExistsVideo(
        ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_EXISTS_VIDEO, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 举报帖子
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PBoolSingle> tipoffVideoByPost(
        NetdiskApiProtos.PTipOffPostParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 举报单个视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PBoolSingle> tipoffVideoByObjectkey(
        NetdiskApiProtos.PTipOffObjkeyParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TIPOFF_VIDEO_BY_OBJECTKEY, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 隐藏视频
     *&#64;return 成功返回 PBoolSingle，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PBoolSingle> hiddenVideo(
        NetdiskApiProtos.PHiddenParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HIDDEN_VIDEO, getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_VIDEO_STATUS_BY_POST_ID = 0;
  private static final int METHODID_OP_VIDEO = 1;
  private static final int METHODID_IS_EXISTS_VIDEO = 2;
  private static final int METHODID_TIPOFF_VIDEO_BY_POST = 3;
  private static final int METHODID_TIPOFF_VIDEO_BY_OBJECTKEY = 4;
  private static final int METHODID_HIDDEN_VIDEO = 5;

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

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_VIDEO_STATUS_BY_POST_ID:
          serviceImpl.setVideoStatusByPostId((NetdiskApiProtos.PSetFileParam) request,
              (io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_OP_VIDEO:
          serviceImpl.opVideo((NetdiskApiProtos.POPFileParam) request,
              (io.grpc.stub.StreamObserver<CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_IS_EXISTS_VIDEO:
          serviceImpl.isExistsVideo((ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_TIPOFF_VIDEO_BY_POST:
          serviceImpl.tipoffVideoByPost((NetdiskApiProtos.PTipOffPostParam) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_TIPOFF_VIDEO_BY_OBJECTKEY:
          serviceImpl.tipoffVideoByObjectkey((NetdiskApiProtos.PTipOffObjkeyParam) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_HIDDEN_VIDEO:
          serviceImpl.hiddenVideo((NetdiskApiProtos.PHiddenParam) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PBoolSingle>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
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
        METHOD_TIPOFF_VIDEO_BY_OBJECTKEY,
        METHOD_HIDDEN_VIDEO);
  }

}
