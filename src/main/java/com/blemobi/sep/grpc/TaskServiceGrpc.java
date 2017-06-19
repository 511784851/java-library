package com.blemobi.sep.grpc;

import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.TaskApiProtos;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * 规定所有任务消息默认为订阅状态
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: task_inside.proto")
public class TaskServiceGrpc {

  private TaskServiceGrpc() {}

  public static final String SERVICE_NAME = "bbproto.TaskService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<TaskApiProtos.PTaskMsgs,
      ResultProtos.PInt64List> METHOD_NOTIFY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.TaskService", "notify"),
          io.grpc.protobuf.ProtoUtils.marshaller(TaskApiProtos.PTaskMsgs.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PInt64List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<ResultProtos.PStringList,
      ResultProtos.PInt32List> METHOD_GET_USER_GOLD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.TaskService", "getUserGold"),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<TaskApiProtos.PGoldExchg,
      ResultProtos.PResult> METHOD_EXCHG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.TaskService", "exchg"),
          io.grpc.protobuf.ProtoUtils.marshaller(TaskApiProtos.PGoldExchg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(ResultProtos.PResult.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TaskServiceStub newStub(io.grpc.Channel channel) {
    return new TaskServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TaskServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static TaskServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TaskServiceFutureStub(channel);
  }

  /**
   * <pre>
   * 规定所有任务消息默认为订阅状态
   * </pre>
   */
  public static abstract class TaskServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 任务消息通知
     * 返回对应msgID的订阅状态：-1-永久取消订阅，0-保持默认，其它-取消订阅的有效时间戳（保留到天）
     * </pre>
     */
    public void notify(TaskApiProtos.PTaskMsgs request,
        io.grpc.stub.StreamObserver<ResultProtos.PInt64List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NOTIFY, responseObserver);
    }

    /**
     * <pre>
     * 批量查询用户金币
     * PStringList为要查询的用户uuid，返回对应的用户可用金币数量
     * </pre>
     */
    public void getUserGold(ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_GOLD, responseObserver);
    }

    /**
     * <pre>
     * 商城兑换金币
     * 同一个订单号不可重复兑换
     * </pre>
     */
    public void exchg(TaskApiProtos.PGoldExchg request,
        io.grpc.stub.StreamObserver<ResultProtos.PResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXCHG, responseObserver);
    }

    @Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_NOTIFY,
            asyncUnaryCall(
              new MethodHandlers<
                TaskApiProtos.PTaskMsgs,
                ResultProtos.PInt64List>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            METHOD_GET_USER_GOLD,
            asyncUnaryCall(
              new MethodHandlers<
                ResultProtos.PStringList,
                ResultProtos.PInt32List>(
                  this, METHODID_GET_USER_GOLD)))
          .addMethod(
            METHOD_EXCHG,
            asyncUnaryCall(
              new MethodHandlers<
                TaskApiProtos.PGoldExchg,
                ResultProtos.PResult>(
                  this, METHODID_EXCHG)))
          .build();
    }
  }

  /**
   * <pre>
   * 规定所有任务消息默认为订阅状态
   * </pre>
   */
  public static final class TaskServiceStub extends io.grpc.stub.AbstractStub<TaskServiceStub> {
    private TaskServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 任务消息通知
     * 返回对应msgID的订阅状态：-1-永久取消订阅，0-保持默认，其它-取消订阅的有效时间戳（保留到天）
     * </pre>
     */
    public void notify(TaskApiProtos.PTaskMsgs request,
        io.grpc.stub.StreamObserver<ResultProtos.PInt64List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NOTIFY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量查询用户金币
     * PStringList为要查询的用户uuid，返回对应的用户可用金币数量
     * </pre>
     */
    public void getUserGold(ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_GOLD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 商城兑换金币
     * 同一个订单号不可重复兑换
     * </pre>
     */
    public void exchg(TaskApiProtos.PGoldExchg request,
        io.grpc.stub.StreamObserver<ResultProtos.PResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXCHG, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 规定所有任务消息默认为订阅状态
   * </pre>
   */
  public static final class TaskServiceBlockingStub extends io.grpc.stub.AbstractStub<TaskServiceBlockingStub> {
    private TaskServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 任务消息通知
     * 返回对应msgID的订阅状态：-1-永久取消订阅，0-保持默认，其它-取消订阅的有效时间戳（保留到天）
     * </pre>
     */
    public ResultProtos.PInt64List notify(TaskApiProtos.PTaskMsgs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NOTIFY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量查询用户金币
     * PStringList为要查询的用户uuid，返回对应的用户可用金币数量
     * </pre>
     */
    public ResultProtos.PInt32List getUserGold(ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_GOLD, getCallOptions(), request);
    }

    /**
     * <pre>
     * 商城兑换金币
     * 同一个订单号不可重复兑换
     * </pre>
     */
    public ResultProtos.PResult exchg(TaskApiProtos.PGoldExchg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXCHG, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 规定所有任务消息默认为订阅状态
   * </pre>
   */
  public static final class TaskServiceFutureStub extends io.grpc.stub.AbstractStub<TaskServiceFutureStub> {
    private TaskServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TaskServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected TaskServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TaskServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 任务消息通知
     * 返回对应msgID的订阅状态：-1-永久取消订阅，0-保持默认，其它-取消订阅的有效时间戳（保留到天）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PInt64List> notify(
        TaskApiProtos.PTaskMsgs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NOTIFY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量查询用户金币
     * PStringList为要查询的用户uuid，返回对应的用户可用金币数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PInt32List> getUserGold(
        ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_GOLD, getCallOptions()), request);
    }

    /**
     * <pre>
     * 商城兑换金币
     * 同一个订单号不可重复兑换
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ResultProtos.PResult> exchg(
        TaskApiProtos.PGoldExchg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXCHG, getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY = 0;
  private static final int METHODID_GET_USER_GOLD = 1;
  private static final int METHODID_EXCHG = 2;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TaskServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(TaskServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY:
          serviceImpl.notify((TaskApiProtos.PTaskMsgs) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PInt64List>) responseObserver);
          break;
        case METHODID_GET_USER_GOLD:
          serviceImpl.getUserGold((ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_EXCHG:
          serviceImpl.exchg((TaskApiProtos.PGoldExchg) request,
              (io.grpc.stub.StreamObserver<ResultProtos.PResult>) responseObserver);
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
        METHOD_NOTIFY,
        METHOD_GET_USER_GOLD,
        METHOD_EXCHG);
  }

}
