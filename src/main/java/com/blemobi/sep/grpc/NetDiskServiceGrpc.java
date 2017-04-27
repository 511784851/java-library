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
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NetdiskApiProtos.POPFileParam;
import com.blemobi.sep.probuf.NetdiskApiProtos.PSetFileParam;

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
  }

  private static final int METHODID_SET_VIDEO_STATUS_BY_POST_ID = 0;
  private static final int METHODID_OP_VIDEO = 1;

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
        METHOD_OP_VIDEO);
  }

}
