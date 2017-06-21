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
    comments = "Source: login_inside.proto")
public class IGrpcLoginGrpc {

  private IGrpcLoginGrpc() {}

  public static final String SERVICE_NAME = "bbproto.IGrpcLogin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_USER_LOGOUT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "UserLogout"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_TOKEN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetToken"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PBoolList> METHOD_TOKEN_EXIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "TokenExist"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_UUIDBY_PHONE_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetUUIDByPhoneCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_UUIDBY_USERNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetUUIDByUsername"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_PHONE_CODE_BY_UUID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetPhoneCodeByUUID"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_USERNAME_BY_UUID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetUsernameByUUID"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_BIND_USERNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "BindUsername"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.LoginProtos.PLogin> METHOD_REGISTER_BY_USERNAME =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "RegisterByUsername"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.LoginProtos.PLogin.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_RESET_PASSWORD =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "ResetPassword"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_RESET_FORCE_BIND_PHONE_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "ResetForceBindPhoneCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_FORCE_BIND_PHONE_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "SetForceBindPhoneCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PBoolList> METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetForceBindPhoneCodeFlag"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList> METHOD_GET_BIND_INFO_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "GetBindInfoList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_BIND_PHONE_CODE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "BindPhoneCode"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_UN_BIND_PHONE_CODE_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "UnBindPhoneCodeList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_UN_BIND_ACCOUNT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "UnBindAccount"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_CHECK_MSG_IDS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcLogin", "checkMsgIds"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IGrpcLoginStub newStub(io.grpc.Channel channel) {
    return new IGrpcLoginStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcLoginBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IGrpcLoginBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcLoginFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IGrpcLoginFutureStub(channel);
  }

  /**
   */
  public static abstract class IGrpcLoginImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 用户登出接口
     *&#64;param 要登出用户的uuid列表 
     *&#64;return 成功返回 PInt32List ，失败返回 PResult
     * </pre>
     */
    public void userLogout(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_USER_LOGOUT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户token列表;只限edge服务调用
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getToken(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOKEN, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 判断用户的token是否存在
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PBoolList ，失败返回 PResult;
     * </pre>
     */
    public void tokenExist(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TOKEN_EXIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过手机号码获取用户uuid
     *&#64;param 要获取uuid的手机号码列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUUIDByPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UUIDBY_PHONE_CODE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户名获取用户uuid
     *&#64;param 要获取uuid的用户名列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUUIDByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_UUIDBY_USERNAME, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取手机号码
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getPhoneCodeByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PHONE_CODE_BY_UUID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取用户名
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUsernameByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USERNAME_BY_UUID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 绑定用户名
     *&#64;param 参数数组 [0]uuid  [1]用户名 [2]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public void bindUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BIND_USERNAME, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 用户名注册
     *&#64;param 参数数组 [0]用户名 [1]密码,SHA256(原始密码+3721) [2]昵称
     *&#64;return 注册成功返回 PLogin ，失败返回 PResult
     * </pre>
     */
    public void registerByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginProtos.PLogin> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGISTER_BY_USERNAME, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 重置用户密码
     *&#64;param 参数数组 [0]uuid [1]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public void resetPassword(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_PASSWORD, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置用户可以不绑定手机号码即可登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public void resetForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESET_FORCE_BIND_PHONE_CODE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note设置用户必须绑定手机号码才能登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public void setForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_FORCE_BIND_PHONE_CODE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note获取用户是否需要绑定手机号码的标志位
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PBoolList
     * </pre>
     */
    public void getForceBindPhoneCodeFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户登录方式绑定的情况
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PLoignBindInfoList
     * </pre>
     */
    public void getBindInfoList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BIND_INFO_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 绑定用户的手机号码绑定
     *&#64;param 参数数组 [0]uuid  [1]手机号码（必须带区号，例：+8613512345678）
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public void bindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BIND_PHONE_CODE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量解除指定uuid的手机号码绑定
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PInt32List,每一个操作返回的错误代码
     * </pre>
     */
    public void unBindPhoneCodeList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UN_BIND_PHONE_CODE_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 解除指定uuid的第三方绑定状态
     *&#64;param 参数数组 [0]uuid [1]解绑类型(1 微信；2 微博；3 脸书；4 谷歌； 6 QQ)
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public void unBindAccount(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UN_BIND_ACCOUNT, responseObserver);
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
            METHOD_USER_LOGOUT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_USER_LOGOUT)))
          .addMethod(
            METHOD_GET_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_TOKEN)))
          .addMethod(
            METHOD_TOKEN_EXIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PBoolList>(
                  this, METHODID_TOKEN_EXIST)))
          .addMethod(
            METHOD_GET_UUIDBY_PHONE_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_UUIDBY_PHONE_CODE)))
          .addMethod(
            METHOD_GET_UUIDBY_USERNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_UUIDBY_USERNAME)))
          .addMethod(
            METHOD_GET_PHONE_CODE_BY_UUID,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_PHONE_CODE_BY_UUID)))
          .addMethod(
            METHOD_GET_USERNAME_BY_UUID,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_USERNAME_BY_UUID)))
          .addMethod(
            METHOD_BIND_USERNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_BIND_USERNAME)))
          .addMethod(
            METHOD_REGISTER_BY_USERNAME,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.LoginProtos.PLogin>(
                  this, METHODID_REGISTER_BY_USERNAME)))
          .addMethod(
            METHOD_RESET_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_RESET_PASSWORD)))
          .addMethod(
            METHOD_RESET_FORCE_BIND_PHONE_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_RESET_FORCE_BIND_PHONE_CODE)))
          .addMethod(
            METHOD_SET_FORCE_BIND_PHONE_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_FORCE_BIND_PHONE_CODE)))
          .addMethod(
            METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PBoolList>(
                  this, METHODID_GET_FORCE_BIND_PHONE_CODE_FLAG)))
          .addMethod(
            METHOD_GET_BIND_INFO_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList>(
                  this, METHODID_GET_BIND_INFO_LIST)))
          .addMethod(
            METHOD_BIND_PHONE_CODE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_BIND_PHONE_CODE)))
          .addMethod(
            METHOD_UN_BIND_PHONE_CODE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_UN_BIND_PHONE_CODE_LIST)))
          .addMethod(
            METHOD_UN_BIND_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_UN_BIND_ACCOUNT)))
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
  public static final class IGrpcLoginStub extends io.grpc.stub.AbstractStub<IGrpcLoginStub> {
    private IGrpcLoginStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcLoginStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcLoginStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcLoginStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 用户登出接口
     *&#64;param 要登出用户的uuid列表 
     *&#64;return 成功返回 PInt32List ，失败返回 PResult
     * </pre>
     */
    public void userLogout(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_USER_LOGOUT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户token列表;只限edge服务调用
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getToken(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 判断用户的token是否存在
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PBoolList ，失败返回 PResult;
     * </pre>
     */
    public void tokenExist(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TOKEN_EXIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过手机号码获取用户uuid
     *&#64;param 要获取uuid的手机号码列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUUIDByPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_UUIDBY_PHONE_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户名获取用户uuid
     *&#64;param 要获取uuid的用户名列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUUIDByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_UUIDBY_USERNAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取手机号码
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getPhoneCodeByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CODE_BY_UUID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取用户名
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public void getUsernameByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USERNAME_BY_UUID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 绑定用户名
     *&#64;param 参数数组 [0]uuid  [1]用户名 [2]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public void bindUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BIND_USERNAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 用户名注册
     *&#64;param 参数数组 [0]用户名 [1]密码,SHA256(原始密码+3721) [2]昵称
     *&#64;return 注册成功返回 PLogin ，失败返回 PResult
     * </pre>
     */
    public void registerByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginProtos.PLogin> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGISTER_BY_USERNAME, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 重置用户密码
     *&#64;param 参数数组 [0]uuid [1]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public void resetPassword(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置用户可以不绑定手机号码即可登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public void resetForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESET_FORCE_BIND_PHONE_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note设置用户必须绑定手机号码才能登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public void setForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_FORCE_BIND_PHONE_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note获取用户是否需要绑定手机号码的标志位
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PBoolList
     * </pre>
     */
    public void getForceBindPhoneCodeFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户登录方式绑定的情况
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PLoignBindInfoList
     * </pre>
     */
    public void getBindInfoList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BIND_INFO_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 绑定用户的手机号码绑定
     *&#64;param 参数数组 [0]uuid  [1]手机号码（必须带区号，例：+8613512345678）
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public void bindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BIND_PHONE_CODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 批量解除指定uuid的手机号码绑定
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PInt32List,每一个操作返回的错误代码
     * </pre>
     */
    public void unBindPhoneCodeList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UN_BIND_PHONE_CODE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 解除指定uuid的第三方绑定状态
     *&#64;param 参数数组 [0]uuid [1]解绑类型(1 微信；2 微博；3 脸书；4 谷歌； 6 QQ)
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public void unBindAccount(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UN_BIND_ACCOUNT, getCallOptions()), request, responseObserver);
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
  public static final class IGrpcLoginBlockingStub extends io.grpc.stub.AbstractStub<IGrpcLoginBlockingStub> {
    private IGrpcLoginBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcLoginBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcLoginBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcLoginBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 用户登出接口
     *&#64;param 要登出用户的uuid列表 
     *&#64;return 成功返回 PInt32List ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List userLogout(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_USER_LOGOUT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户token列表;只限edge服务调用
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getToken(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 判断用户的token是否存在
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PBoolList ，失败返回 PResult;
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolList tokenExist(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TOKEN_EXIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过手机号码获取用户uuid
     *&#64;param 要获取uuid的手机号码列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getUUIDByPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_UUIDBY_PHONE_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户名获取用户uuid
     *&#64;param 要获取uuid的用户名列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getUUIDByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_UUIDBY_USERNAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取手机号码
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getPhoneCodeByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PHONE_CODE_BY_UUID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取用户名
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getUsernameByUUID(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USERNAME_BY_UUID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 绑定用户名
     *&#64;param 参数数组 [0]uuid  [1]用户名 [2]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty bindUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BIND_USERNAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 用户名注册
     *&#64;param 参数数组 [0]用户名 [1]密码,SHA256(原始密码+3721) [2]昵称
     *&#64;return 注册成功返回 PLogin ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.LoginProtos.PLogin registerByUsername(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGISTER_BY_USERNAME, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 重置用户密码
     *&#64;param 参数数组 [0]uuid [1]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty resetPassword(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_PASSWORD, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置用户可以不绑定手机号码即可登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty resetForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESET_FORCE_BIND_PHONE_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note设置用户必须绑定手机号码才能登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setForceBindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_FORCE_BIND_PHONE_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note获取用户是否需要绑定手机号码的标志位
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PBoolList
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolList getForceBindPhoneCodeFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户登录方式绑定的情况
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PLoignBindInfoList
     * </pre>
     */
    public com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList getBindInfoList(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BIND_INFO_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 绑定用户的手机号码绑定
     *&#64;param 参数数组 [0]uuid  [1]手机号码（必须带区号，例：+8613512345678）
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty bindPhoneCode(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BIND_PHONE_CODE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 批量解除指定uuid的手机号码绑定
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PInt32List,每一个操作返回的错误代码
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List unBindPhoneCodeList(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UN_BIND_PHONE_CODE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 解除指定uuid的第三方绑定状态
     *&#64;param 参数数组 [0]uuid [1]解绑类型(1 微信；2 微博；3 脸书；4 谷歌； 6 QQ)
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty unBindAccount(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UN_BIND_ACCOUNT, getCallOptions(), request);
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
  public static final class IGrpcLoginFutureStub extends io.grpc.stub.AbstractStub<IGrpcLoginFutureStub> {
    private IGrpcLoginFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcLoginFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcLoginFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcLoginFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 用户登出接口
     *&#64;param 要登出用户的uuid列表 
     *&#64;return 成功返回 PInt32List ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> userLogout(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_USER_LOGOUT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户token列表;只限edge服务调用
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getToken(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 判断用户的token是否存在
     *&#64;param 参数数组 [0]m表示移动端，w表示网页端 [1]...uuid列表
     *&#64;return 成功返回 PBoolList ，失败返回 PResult;
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolList> tokenExist(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TOKEN_EXIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过手机号码获取用户uuid
     *&#64;param 要获取uuid的手机号码列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getUUIDByPhoneCode(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_UUIDBY_PHONE_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户名获取用户uuid
     *&#64;param 要获取uuid的用户名列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的uuid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getUUIDByUsername(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_UUIDBY_USERNAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取手机号码
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getPhoneCodeByUUID(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CODE_BY_UUID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 通过用户uuid获取用户名
     *&#64;param 用户uuid 列表
     *&#64;return 成功返回 PStringList ，失败返回 PResult;
     *&#64;       返回的pid顺序与fields顺序一致，如果fields对应的用户没有查询到，PStringList对应项为空串
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getUsernameByUUID(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USERNAME_BY_UUID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 绑定用户名
     *&#64;param 参数数组 [0]uuid  [1]用户名 [2]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> bindUsername(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BIND_USERNAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 用户名注册
     *&#64;param 参数数组 [0]用户名 [1]密码,SHA256(原始密码+3721) [2]昵称
     *&#64;return 注册成功返回 PLogin ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.LoginProtos.PLogin> registerByUsername(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGISTER_BY_USERNAME, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 重置用户密码
     *&#64;param 参数数组 [0]uuid [1]密码,SHA256(原始密码+3721) 
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> resetPassword(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_PASSWORD, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置用户可以不绑定手机号码即可登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> resetForceBindPhoneCode(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESET_FORCE_BIND_PHONE_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note设置用户必须绑定手机号码才能登录
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setForceBindPhoneCode(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_FORCE_BIND_PHONE_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note获取用户是否需要绑定手机号码的标志位
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PBoolList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolList> getForceBindPhoneCodeFlag(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量获取用户登录方式绑定的情况
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PLoignBindInfoList
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList> getBindInfoList(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BIND_INFO_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 绑定用户的手机号码绑定
     *&#64;param 参数数组 [0]uuid  [1]手机号码（必须带区号，例：+8613512345678）
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> bindPhoneCode(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BIND_PHONE_CODE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 批量解除指定uuid的手机号码绑定
     *&#64;param 用户uuid 列表
     *&#64;return 返回 PInt32List,每一个操作返回的错误代码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> unBindPhoneCodeList(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UN_BIND_PHONE_CODE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 解除指定uuid的第三方绑定状态
     *&#64;param 参数数组 [0]uuid [1]解绑类型(1 微信；2 微博；3 脸书；4 谷歌； 6 QQ)
     *&#64;return 返回 PEmpty
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> unBindAccount(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UN_BIND_ACCOUNT, getCallOptions()), request);
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

  private static final int METHODID_USER_LOGOUT = 0;
  private static final int METHODID_GET_TOKEN = 1;
  private static final int METHODID_TOKEN_EXIST = 2;
  private static final int METHODID_GET_UUIDBY_PHONE_CODE = 3;
  private static final int METHODID_GET_UUIDBY_USERNAME = 4;
  private static final int METHODID_GET_PHONE_CODE_BY_UUID = 5;
  private static final int METHODID_GET_USERNAME_BY_UUID = 6;
  private static final int METHODID_BIND_USERNAME = 7;
  private static final int METHODID_REGISTER_BY_USERNAME = 8;
  private static final int METHODID_RESET_PASSWORD = 9;
  private static final int METHODID_RESET_FORCE_BIND_PHONE_CODE = 10;
  private static final int METHODID_SET_FORCE_BIND_PHONE_CODE = 11;
  private static final int METHODID_GET_FORCE_BIND_PHONE_CODE_FLAG = 12;
  private static final int METHODID_GET_BIND_INFO_LIST = 13;
  private static final int METHODID_BIND_PHONE_CODE = 14;
  private static final int METHODID_UN_BIND_PHONE_CODE_LIST = 15;
  private static final int METHODID_UN_BIND_ACCOUNT = 16;
  private static final int METHODID_CHECK_MSG_IDS = 17;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IGrpcLoginImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IGrpcLoginImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER_LOGOUT:
          serviceImpl.userLogout((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GET_TOKEN:
          serviceImpl.getToken((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_TOKEN_EXIST:
          serviceImpl.tokenExist((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList>) responseObserver);
          break;
        case METHODID_GET_UUIDBY_PHONE_CODE:
          serviceImpl.getUUIDByPhoneCode((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_GET_UUIDBY_USERNAME:
          serviceImpl.getUUIDByUsername((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_GET_PHONE_CODE_BY_UUID:
          serviceImpl.getPhoneCodeByUUID((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_GET_USERNAME_BY_UUID:
          serviceImpl.getUsernameByUUID((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_BIND_USERNAME:
          serviceImpl.bindUsername((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_REGISTER_BY_USERNAME:
          serviceImpl.registerByUsername((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginProtos.PLogin>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_RESET_FORCE_BIND_PHONE_CODE:
          serviceImpl.resetForceBindPhoneCode((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SET_FORCE_BIND_PHONE_CODE:
          serviceImpl.setForceBindPhoneCode((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_FORCE_BIND_PHONE_CODE_FLAG:
          serviceImpl.getForceBindPhoneCodeFlag((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList>) responseObserver);
          break;
        case METHODID_GET_BIND_INFO_LIST:
          serviceImpl.getBindInfoList((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.LoginApiProtos.PLoignBindInfoList>) responseObserver);
          break;
        case METHODID_BIND_PHONE_CODE:
          serviceImpl.bindPhoneCode((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_UN_BIND_PHONE_CODE_LIST:
          serviceImpl.unBindPhoneCodeList((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_UN_BIND_ACCOUNT:
          serviceImpl.unBindAccount((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
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
        METHOD_USER_LOGOUT,
        METHOD_GET_TOKEN,
        METHOD_TOKEN_EXIST,
        METHOD_GET_UUIDBY_PHONE_CODE,
        METHOD_GET_UUIDBY_USERNAME,
        METHOD_GET_PHONE_CODE_BY_UUID,
        METHOD_GET_USERNAME_BY_UUID,
        METHOD_BIND_USERNAME,
        METHOD_REGISTER_BY_USERNAME,
        METHOD_RESET_PASSWORD,
        METHOD_RESET_FORCE_BIND_PHONE_CODE,
        METHOD_SET_FORCE_BIND_PHONE_CODE,
        METHOD_GET_FORCE_BIND_PHONE_CODE_FLAG,
        METHOD_GET_BIND_INFO_LIST,
        METHOD_BIND_PHONE_CODE,
        METHOD_UN_BIND_PHONE_CODE_LIST,
        METHOD_UN_BIND_ACCOUNT,
        METHOD_CHECK_MSG_IDS);
  }

}
