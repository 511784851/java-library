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
import com.blemobi.sep.probuf.NotificationApiProtos;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * 通知系统RPC服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: notification_inside.proto")
public class NotifyGrpc {

  private NotifyGrpc() {}

  public static final String SERVICE_NAME = "bbproto.Notify";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.Notify", "Send"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifyStub newStub(io.grpc.Channel channel) {
    return new NotifyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotifyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static NotifyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotifyFutureStub(channel);
  }

  /**
   * <pre>
   * 通知系统RPC服务
   * </pre>
   */
  public static abstract class NotifyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 发送单个通知消息，单个通知消息可能有多个接收者
     * </pre>
     */
    public void send(com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   * <pre>
   * 通知系统RPC服务
   * </pre>
   */
  public static final class NotifyStub extends io.grpc.stub.AbstractStub<NotifyStub> {
    private NotifyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送单个通知消息，单个通知消息可能有多个接收者
     * </pre>
     */
    public void send(com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 通知系统RPC服务
   * </pre>
   */
  public static final class NotifyBlockingStub extends io.grpc.stub.AbstractStub<NotifyBlockingStub> {
    private NotifyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送单个通知消息，单个通知消息可能有多个接收者
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty send(com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 通知系统RPC服务
   * </pre>
   */
  public static final class NotifyFutureStub extends io.grpc.stub.AbstractStub<NotifyFutureStub> {
    private NotifyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotifyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotifyFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发送单个通知消息，单个通知消息可能有多个接收者
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> send(
        com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotifyImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(NotifyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList) request,
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
        METHOD_SEND);
  }

}
