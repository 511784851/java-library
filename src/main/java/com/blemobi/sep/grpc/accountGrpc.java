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
    comments = "Source: account_inside.proto")
public class accountGrpc {

  private accountGrpc() {}

  public static final String SERVICE_NAME = "bbproto.account";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.AccountProtos.PLevelInfoList> METHOD_GET_ALL_LEVELS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "GetAllLevels"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PLevelInfoList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.AccountApiProtos.PNicknameList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_BATCH_UPDATE_NICKNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "BatchUpdateNickname"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountApiProtos.PNicknameList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.AccountProtos.PUserBaseList> METHOD_GET_USER_BASES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "GetUserBases"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUserBaseList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PBoolList> METHOD_GET_ROBOTS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "GetRobots"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_LANGUAGES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "GetLanguages"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.AccountProtos.PUserBase,
      com.blemobi.sep.probuf.AccountProtos.PUserBase> METHOD_REGISTER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "Register"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUserBase.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUserBase.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.AccountProtos.PUserBase,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_USER_BASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "SetUserBase"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUserBase.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_BATCH_UPDATE_HEAD_IMAGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "BatchUpdateHeadImage"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_CHECK_MSG_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.account", "checkMsgIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static accountStub newStub(io.grpc.Channel channel) {
    return new accountStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static accountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new accountBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static accountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new accountFutureStub(channel);
  }

  /**
   */
  public static abstract class accountImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 获取所有等级权限定义
     *&#64;return PLevelInfoList 所有等级权限列表
     * </pre>
     */
    public void getAllLevels(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PLevelInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_LEVELS, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量更新用户昵称
     *&#64;param PNicknameList 用户昵称列表
     *&#64;return 设置失败的下标
     * </pre>
     */
    public void batchUpdateNickname(com.blemobi.sep.probuf.AccountApiProtos.PNicknameList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_NICKNAME, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户基础信息
     *1. 内部自动分段获取
     *2. 返回顺序和传入uuids顺序一致
     *3. 根据返回用户的UUID是否为""判断用户是否存在
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户ID列表
     *&#64;return *bbproto.PUserBaseList 用户基础信息列表
     * </pre>
     */
    public void getUserBases(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBaseList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_BASES, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取是否水军用户
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []bool 是否水军列表，对应关系是下标
     * </pre>
     */
    public void getRobots(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ROBOTS, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户语言信息
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []string 语言列表，对应关系是下标（如果为空由调用者决定默认语言）
     * </pre>
     */
    public void getLanguages(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LANGUAGES, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 注册用户
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase 注册信息
     *&#64;return PUserBase 注册后信息，如默认头像等
     * </pre>
     */
    public void register(com.blemobi.sep.probuf.AccountProtos.PUserBase request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBase> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置用户信息
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase
     *&#64;return 无返回值
     * </pre>
     */
    public void setUserBase(com.blemobi.sep.probuf.AccountProtos.PUserBase request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_USER_BASE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量更新头像
     *&#64;param PAccountKVList key对应用户UUID，val对应头像ObjectKey
     *&#64;return 如果更新失败则返回错误
     * </pre>
     */
    public void batchUpdateHeadImage(com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_UPDATE_HEAD_IMAGE, responseObserver);
    }

    /**
     * <pre>
     * 检查消息状态（由其它服务提供）
     * 请求中count表示要检查的消息进行次数，返回uuid-msigId对应的消息触发次数
     * </pre>
     */
    public void checkMsgIds(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_MSG_IDS, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ALL_LEVELS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.AccountProtos.PLevelInfoList>(
                  this, METHODID_GET_ALL_LEVELS)))
          .addMethod(
            METHOD_BATCH_UPDATE_NICKNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.AccountApiProtos.PNicknameList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_BATCH_UPDATE_NICKNAME)))
          .addMethod(
            METHOD_GET_USER_BASES,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.AccountProtos.PUserBaseList>(
                  this, METHODID_GET_USER_BASES)))
          .addMethod(
            METHOD_GET_ROBOTS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PBoolList>(
                  this, METHODID_GET_ROBOTS)))
          .addMethod(
            METHOD_GET_LANGUAGES,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_LANGUAGES)))
          .addMethod(
            METHOD_REGISTER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.AccountProtos.PUserBase,
                com.blemobi.sep.probuf.AccountProtos.PUserBase>(
                  this, METHODID_REGISTER)))
          .addMethod(
            METHOD_SET_USER_BASE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.AccountProtos.PUserBase,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_USER_BASE)))
          .addMethod(
            METHOD_BATCH_UPDATE_HEAD_IMAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_BATCH_UPDATE_HEAD_IMAGE)))
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
  public static final class accountStub extends io.grpc.stub.AbstractStub<accountStub> {
    private accountStub(io.grpc.Channel channel) {
      super(channel);
    }

    private accountStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected accountStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new accountStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取所有等级权限定义
     *&#64;return PLevelInfoList 所有等级权限列表
     * </pre>
     */
    public void getAllLevels(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PLevelInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LEVELS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量更新用户昵称
     *&#64;param PNicknameList 用户昵称列表
     *&#64;return 设置失败的下标
     * </pre>
     */
    public void batchUpdateNickname(com.blemobi.sep.probuf.AccountApiProtos.PNicknameList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_NICKNAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户基础信息
     *1. 内部自动分段获取
     *2. 返回顺序和传入uuids顺序一致
     *3. 根据返回用户的UUID是否为""判断用户是否存在
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户ID列表
     *&#64;return *bbproto.PUserBaseList 用户基础信息列表
     * </pre>
     */
    public void getUserBases(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBaseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BASES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取是否水军用户
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []bool 是否水军列表，对应关系是下标
     * </pre>
     */
    public void getRobots(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ROBOTS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户语言信息
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []string 语言列表，对应关系是下标（如果为空由调用者决定默认语言）
     * </pre>
     */
    public void getLanguages(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LANGUAGES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 注册用户
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase 注册信息
     *&#64;return PUserBase 注册后信息，如默认头像等
     * </pre>
     */
    public void register(com.blemobi.sep.probuf.AccountProtos.PUserBase request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBase> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置用户信息
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase
     *&#64;return 无返回值
     * </pre>
     */
    public void setUserBase(com.blemobi.sep.probuf.AccountProtos.PUserBase request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_USER_BASE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量更新头像
     *&#64;param PAccountKVList key对应用户UUID，val对应头像ObjectKey
     *&#64;return 如果更新失败则返回错误
     * </pre>
     */
    public void batchUpdateHeadImage(com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_HEAD_IMAGE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检查消息状态（由其它服务提供）
     * 请求中count表示要检查的消息进行次数，返回uuid-msigId对应的消息触发次数
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
  public static final class accountBlockingStub extends io.grpc.stub.AbstractStub<accountBlockingStub> {
    private accountBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private accountBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected accountBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new accountBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取所有等级权限定义
     *&#64;return PLevelInfoList 所有等级权限列表
     * </pre>
     */
    public com.blemobi.sep.probuf.AccountProtos.PLevelInfoList getAllLevels(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_LEVELS, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量更新用户昵称
     *&#64;param PNicknameList 用户昵称列表
     *&#64;return 设置失败的下标
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List batchUpdateNickname(com.blemobi.sep.probuf.AccountApiProtos.PNicknameList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_NICKNAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户基础信息
     *1. 内部自动分段获取
     *2. 返回顺序和传入uuids顺序一致
     *3. 根据返回用户的UUID是否为""判断用户是否存在
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户ID列表
     *&#64;return *bbproto.PUserBaseList 用户基础信息列表
     * </pre>
     */
    public com.blemobi.sep.probuf.AccountProtos.PUserBaseList getUserBases(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_BASES, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取是否水军用户
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []bool 是否水军列表，对应关系是下标
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolList getRobots(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ROBOTS, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户语言信息
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []string 语言列表，对应关系是下标（如果为空由调用者决定默认语言）
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getLanguages(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LANGUAGES, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 注册用户
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase 注册信息
     *&#64;return PUserBase 注册后信息，如默认头像等
     * </pre>
     */
    public com.blemobi.sep.probuf.AccountProtos.PUserBase register(com.blemobi.sep.probuf.AccountProtos.PUserBase request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置用户信息
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase
     *&#64;return 无返回值
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setUserBase(com.blemobi.sep.probuf.AccountProtos.PUserBase request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_USER_BASE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量更新头像
     *&#64;param PAccountKVList key对应用户UUID，val对应头像ObjectKey
     *&#64;return 如果更新失败则返回错误
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty batchUpdateHeadImage(com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_UPDATE_HEAD_IMAGE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 检查消息状态（由其它服务提供）
     * 请求中count表示要检查的消息进行次数，返回uuid-msigId对应的消息触发次数
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List checkMsgIds(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_MSG_IDS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class accountFutureStub extends io.grpc.stub.AbstractStub<accountFutureStub> {
    private accountFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private accountFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected accountFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new accountFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取所有等级权限定义
     *&#64;return PLevelInfoList 所有等级权限列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.AccountProtos.PLevelInfoList> getAllLevels(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LEVELS, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量更新用户昵称
     *&#64;param PNicknameList 用户昵称列表
     *&#64;return 设置失败的下标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> batchUpdateNickname(
        com.blemobi.sep.probuf.AccountApiProtos.PNicknameList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_NICKNAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户基础信息
     *1. 内部自动分段获取
     *2. 返回顺序和传入uuids顺序一致
     *3. 根据返回用户的UUID是否为""判断用户是否存在
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户ID列表
     *&#64;return *bbproto.PUserBaseList 用户基础信息列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.AccountProtos.PUserBaseList> getUserBases(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_BASES, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取是否水军用户
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []bool 是否水军列表，对应关系是下标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolList> getRobots(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ROBOTS, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户语言信息
     *&#64;param ctx 请求上下文
     *&#64;param uuids 用户UUID列表
     *&#64;return []string 语言列表，对应关系是下标（如果为空由调用者决定默认语言）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getLanguages(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LANGUAGES, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 注册用户
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase 注册信息
     *&#64;return PUserBase 注册后信息，如默认头像等
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.AccountProtos.PUserBase> register(
        com.blemobi.sep.probuf.AccountProtos.PUserBase request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置用户信息
     *&#64;param ctx 请求上下文
     *&#64;param PUserBase
     *&#64;return 无返回值
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setUserBase(
        com.blemobi.sep.probuf.AccountProtos.PUserBase request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_USER_BASE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量更新头像
     *&#64;param PAccountKVList key对应用户UUID，val对应头像ObjectKey
     *&#64;return 如果更新失败则返回错误
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> batchUpdateHeadImage(
        com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_UPDATE_HEAD_IMAGE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 检查消息状态（由其它服务提供）
     * 请求中count表示要检查的消息进行次数，返回uuid-msigId对应的消息触发次数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> checkMsgIds(
        com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_MSG_IDS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_LEVELS = 0;
  private static final int METHODID_BATCH_UPDATE_NICKNAME = 1;
  private static final int METHODID_GET_USER_BASES = 2;
  private static final int METHODID_GET_ROBOTS = 3;
  private static final int METHODID_GET_LANGUAGES = 4;
  private static final int METHODID_REGISTER = 5;
  private static final int METHODID_SET_USER_BASE = 6;
  private static final int METHODID_BATCH_UPDATE_HEAD_IMAGE = 7;
  private static final int METHODID_CHECK_MSG_IDS = 8;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final accountImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(accountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_LEVELS:
          serviceImpl.getAllLevels((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PLevelInfoList>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_NICKNAME:
          serviceImpl.batchUpdateNickname((com.blemobi.sep.probuf.AccountApiProtos.PNicknameList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GET_USER_BASES:
          serviceImpl.getUserBases((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBaseList>) responseObserver);
          break;
        case METHODID_GET_ROBOTS:
          serviceImpl.getRobots((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList>) responseObserver);
          break;
        case METHODID_GET_LANGUAGES:
          serviceImpl.getLanguages((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.blemobi.sep.probuf.AccountProtos.PUserBase) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserBase>) responseObserver);
          break;
        case METHODID_SET_USER_BASE:
          serviceImpl.setUserBase((com.blemobi.sep.probuf.AccountProtos.PUserBase) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE_HEAD_IMAGE:
          serviceImpl.batchUpdateHeadImage((com.blemobi.sep.probuf.AccountApiProtos.PAccountKVList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
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
        METHOD_GET_ALL_LEVELS,
        METHOD_BATCH_UPDATE_NICKNAME,
        METHOD_GET_USER_BASES,
        METHOD_GET_ROBOTS,
        METHOD_GET_LANGUAGES,
        METHOD_REGISTER,
        METHOD_SET_USER_BASE,
        METHOD_BATCH_UPDATE_HEAD_IMAGE,
        METHOD_CHECK_MSG_IDS);
  }

}
