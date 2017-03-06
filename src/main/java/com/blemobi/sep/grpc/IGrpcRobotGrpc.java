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
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.RobotApiProtos;
import com.blemobi.sep.probuf.RobotProtos;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.ResultProtos.PInt32Single;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;
import com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma;
import com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma;
import com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam;
import com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery;
import com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList;
import com.blemobi.sep.probuf.RobotProtos.PBRemind;
import com.blemobi.sep.probuf.RobotProtos.PBRemindList;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: robot_inside.proto")
public class IGrpcRobotGrpc {

  private IGrpcRobotGrpc() {}

  public static final String SERVICE_NAME = "bbproto.IGrpcRobot";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_SET_MSG_NUM_PER_DAY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcSetMsgNumPerDay"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PInt32Single> METHOD_GRPC_GET_MSG_NUM_PER_DAY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcGetMsgNumPerDay"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32Single.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotProtos.PBRemind,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_CREATE_REMIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcCreateRemind"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotProtos.PBRemind.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery,
      com.blemobi.sep.probuf.RobotProtos.PBRemindList> METHOD_GRPC_GET_REMIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcGetRemind"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotProtos.PBRemindList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_DELETE_REMIND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcDeleteRemind"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_GRPC_PUSH =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcPush"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma,
      com.blemobi.sep.probuf.ResultProtos.PStringSingle> METHOD_GRPC_GENERATE_ORDER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcRobot", "GrpcGenerateOrder"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IGrpcRobotStub newStub(io.grpc.Channel channel) {
    return new IGrpcRobotStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcRobotBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IGrpcRobotBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcRobotFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IGrpcRobotFutureStub(channel);
  }

  /**
   */
  public static abstract class IGrpcRobotImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 设置B端每天(0-24时)推送消息数
     *&#64;param PInt32Single 每天最大推送消息数
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcSetMsgNumPerDay(com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_SET_MSG_NUM_PER_DAY, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取B端每天(0-24时)推送消息数
     *&#64;param PStringSingle 网红UUID
     *&#64;return PInt32Single
     * </pre>
     */
    public void grpcGetMsgNumPerDay(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_MSG_NUM_PER_DAY, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:设置生日提醒(CEO祝福)
     *&#64;param   PBRemind 消息数据
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcCreateRemind(com.blemobi.sep.probuf.RobotProtos.PBRemind request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_CREATE_REMIND, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:查询未来7天(或历史)的CEO提醒列表
     *&#64;param  PRemindQuery
     *&#64;return PRemindList
     * </pre>
     */
    public void grpcGetRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.RobotProtos.PBRemindList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GET_REMIND, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:删除提醒消息
     *&#64;param  PRemindDeleteParam      提醒消息创建者和id
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcDeleteRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_DELETE_REMIND, responseObserver);
    }

    /**
     * <pre>
     *&#64;note   推送消息
     *&#64;param  PRobotNotifyMsgList   消息
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPush(com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_PUSH, responseObserver);
    }

    /**
     * <pre>
     *&#64;note   生成支付订单号
     *&#64;param  PPayOrderParma   订单参数
     *&#64;return PStringSingle
     * </pre>
     */
    public void grpcGenerateOrder(com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GRPC_GENERATE_ORDER, responseObserver);
    }

    public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GRPC_SET_MSG_NUM_PER_DAY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_SET_MSG_NUM_PER_DAY)))
          .addMethod(
            METHOD_GRPC_GET_MSG_NUM_PER_DAY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PInt32Single>(
                  this, METHODID_GRPC_GET_MSG_NUM_PER_DAY)))
          .addMethod(
            METHOD_GRPC_CREATE_REMIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotProtos.PBRemind,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_CREATE_REMIND)))
          .addMethod(
            METHOD_GRPC_GET_REMIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery,
                com.blemobi.sep.probuf.RobotProtos.PBRemindList>(
                  this, METHODID_GRPC_GET_REMIND)))
          .addMethod(
            METHOD_GRPC_DELETE_REMIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_DELETE_REMIND)))
          .addMethod(
            METHOD_GRPC_PUSH,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_GRPC_PUSH)))
          .addMethod(
            METHOD_GRPC_GENERATE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma,
                com.blemobi.sep.probuf.ResultProtos.PStringSingle>(
                  this, METHODID_GRPC_GENERATE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class IGrpcRobotStub extends io.grpc.stub.AbstractStub<IGrpcRobotStub> {
    private IGrpcRobotStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcRobotStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcRobotStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcRobotStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 设置B端每天(0-24时)推送消息数
     *&#64;param PInt32Single 每天最大推送消息数
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcSetMsgNumPerDay(com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_SET_MSG_NUM_PER_DAY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取B端每天(0-24时)推送消息数
     *&#64;param PStringSingle 网红UUID
     *&#64;return PInt32Single
     * </pre>
     */
    public void grpcGetMsgNumPerDay(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_MSG_NUM_PER_DAY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:设置生日提醒(CEO祝福)
     *&#64;param   PBRemind 消息数据
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcCreateRemind(com.blemobi.sep.probuf.RobotProtos.PBRemind request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_CREATE_REMIND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:查询未来7天(或历史)的CEO提醒列表
     *&#64;param  PRemindQuery
     *&#64;return PRemindList
     * </pre>
     */
    public void grpcGetRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.RobotProtos.PBRemindList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_REMIND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 监管:删除提醒消息
     *&#64;param  PRemindDeleteParam      提醒消息创建者和id
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcDeleteRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_DELETE_REMIND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note   推送消息
     *&#64;param  PRobotNotifyMsgList   消息
     *&#64;return PEmpty
     * </pre>
     */
    public void grpcPush(com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_PUSH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note   生成支付订单号
     *&#64;param  PPayOrderParma   订单参数
     *&#64;return PStringSingle
     * </pre>
     */
    public void grpcGenerateOrder(com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GRPC_GENERATE_ORDER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IGrpcRobotBlockingStub extends io.grpc.stub.AbstractStub<IGrpcRobotBlockingStub> {
    private IGrpcRobotBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcRobotBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcRobotBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcRobotBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 设置B端每天(0-24时)推送消息数
     *&#64;param PInt32Single 每天最大推送消息数
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcSetMsgNumPerDay(com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_SET_MSG_NUM_PER_DAY, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取B端每天(0-24时)推送消息数
     *&#64;param PStringSingle 网红UUID
     *&#64;return PInt32Single
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32Single grpcGetMsgNumPerDay(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_MSG_NUM_PER_DAY, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 监管:设置生日提醒(CEO祝福)
     *&#64;param   PBRemind 消息数据
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcCreateRemind(com.blemobi.sep.probuf.RobotProtos.PBRemind request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_CREATE_REMIND, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 监管:查询未来7天(或历史)的CEO提醒列表
     *&#64;param  PRemindQuery
     *&#64;return PRemindList
     * </pre>
     */
    public com.blemobi.sep.probuf.RobotProtos.PBRemindList grpcGetRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GET_REMIND, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 监管:删除提醒消息
     *&#64;param  PRemindDeleteParam      提醒消息创建者和id
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcDeleteRemind(com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_DELETE_REMIND, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note   推送消息
     *&#64;param  PRobotNotifyMsgList   消息
     *&#64;return PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty grpcPush(com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_PUSH, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note   生成支付订单号
     *&#64;param  PPayOrderParma   订单参数
     *&#64;return PStringSingle
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringSingle grpcGenerateOrder(com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GRPC_GENERATE_ORDER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IGrpcRobotFutureStub extends io.grpc.stub.AbstractStub<IGrpcRobotFutureStub> {
    private IGrpcRobotFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcRobotFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcRobotFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcRobotFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 设置B端每天(0-24时)推送消息数
     *&#64;param PInt32Single 每天最大推送消息数
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcSetMsgNumPerDay(
        com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_SET_MSG_NUM_PER_DAY, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取B端每天(0-24时)推送消息数
     *&#64;param PStringSingle 网红UUID
     *&#64;return PInt32Single
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32Single> grpcGetMsgNumPerDay(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_MSG_NUM_PER_DAY, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 监管:设置生日提醒(CEO祝福)
     *&#64;param   PBRemind 消息数据
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcCreateRemind(
        com.blemobi.sep.probuf.RobotProtos.PBRemind request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_CREATE_REMIND, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 监管:查询未来7天(或历史)的CEO提醒列表
     *&#64;param  PRemindQuery
     *&#64;return PRemindList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.RobotProtos.PBRemindList> grpcGetRemind(
        com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GET_REMIND, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 监管:删除提醒消息
     *&#64;param  PRemindDeleteParam      提醒消息创建者和id
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcDeleteRemind(
        com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_DELETE_REMIND, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note   推送消息
     *&#64;param  PRobotNotifyMsgList   消息
     *&#64;return PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> grpcPush(
        com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_PUSH, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note   生成支付订单号
     *&#64;param  PPayOrderParma   订单参数
     *&#64;return PStringSingle
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringSingle> grpcGenerateOrder(
        com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GRPC_GENERATE_ORDER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GRPC_SET_MSG_NUM_PER_DAY = 0;
  private static final int METHODID_GRPC_GET_MSG_NUM_PER_DAY = 1;
  private static final int METHODID_GRPC_CREATE_REMIND = 2;
  private static final int METHODID_GRPC_GET_REMIND = 3;
  private static final int METHODID_GRPC_DELETE_REMIND = 4;
  private static final int METHODID_GRPC_PUSH = 5;
  private static final int METHODID_GRPC_GENERATE_ORDER = 6;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IGrpcRobotImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IGrpcRobotImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GRPC_SET_MSG_NUM_PER_DAY:
          serviceImpl.grpcSetMsgNumPerDay((com.blemobi.sep.probuf.RobotApiProtos.PMsgNumLimitParma) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_GET_MSG_NUM_PER_DAY:
          serviceImpl.grpcGetMsgNumPerDay((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32Single>) responseObserver);
          break;
        case METHODID_GRPC_CREATE_REMIND:
          serviceImpl.grpcCreateRemind((com.blemobi.sep.probuf.RobotProtos.PBRemind) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_GET_REMIND:
          serviceImpl.grpcGetRemind((com.blemobi.sep.probuf.RobotApiProtos.PRemindQuery) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.RobotProtos.PBRemindList>) responseObserver);
          break;
        case METHODID_GRPC_DELETE_REMIND:
          serviceImpl.grpcDeleteRemind((com.blemobi.sep.probuf.RobotApiProtos.PRemindDeleteParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_PUSH:
          serviceImpl.grpcPush((com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GRPC_GENERATE_ORDER:
          serviceImpl.grpcGenerateOrder((com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringSingle>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

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
        METHOD_GRPC_SET_MSG_NUM_PER_DAY,
        METHOD_GRPC_GET_MSG_NUM_PER_DAY,
        METHOD_GRPC_CREATE_REMIND,
        METHOD_GRPC_GET_REMIND,
        METHOD_GRPC_DELETE_REMIND,
        METHOD_GRPC_PUSH,
        METHOD_GRPC_GENERATE_ORDER);
  }

}
