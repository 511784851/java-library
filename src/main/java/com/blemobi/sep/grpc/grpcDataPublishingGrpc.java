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

import com.blemobi.sep.probuf.AccountProtos;
import com.blemobi.sep.probuf.CommonApiProtos;
import com.blemobi.sep.probuf.DataPublishingProtos;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.AccountProtos.PUserList;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;

import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.0)",
    comments = "Source: datapublishing_inside.proto")
public class grpcDataPublishingGrpc {

  private grpcDataPublishingGrpc() {}

  public static final String SERVICE_NAME = "bbproto.grpcDataPublishing";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SELECT_FANS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectFans"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SELECT_FANS_WITH_SOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectFansWithSource"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_MORE_FANS_WITH_SOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "MoreFansWithSource"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SAVE_FANS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SaveFans"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SCROLL_MORE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "ScrollMore"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList> METHOD_SELECT_VUSER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectVUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SELECT_TODAY_BIRTHDAY_FANS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectTodayBirthdayFans"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
      com.blemobi.sep.probuf.AccountProtos.PUserList> METHOD_SELECT7DAY_BIRTHDAY_FANS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "Select7DayBirthdayFans"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUserList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectVUserHaveTodayBirthdayFans"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SEARCH_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static grpcDataPublishingStub newStub(io.grpc.Channel channel) {
    return new grpcDataPublishingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static grpcDataPublishingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new grpcDataPublishingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static grpcDataPublishingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new grpcDataPublishingFutureStub(channel);
  }

  /**
   */
  public static abstract class grpcDataPublishingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 查询粉丝
     * </pre>
     */
    public void selectFans(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_FANS, responseObserver);
    }

    /**
     * <pre>
     * 查询粉丝，uuid中用下划线拼接了地区信息，如：uuid_CN;4403
     * </pre>
     */
    public void selectFansWithSource(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_FANS_WITH_SOURCE, responseObserver);
    }

    /**
     */
    public void moreFansWithSource(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MORE_FANS_WITH_SOURCE, responseObserver);
    }

    /**
     */
    public void saveFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SAVE_FANS, responseObserver);
    }

    /**
     * <pre>
     * 用PScrollResult.scrollId查询下一页粉丝，直到PScrollResult.id为空
     * </pre>
     */
    public void scrollMore(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SCROLL_MORE, responseObserver);
    }

    /**
     * <pre>
     * 用户关注的网红列表，含搜索
     * </pre>
     */
    public void selectVUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_VUSER, responseObserver);
    }

    /**
     * <pre>
     * 网红当天过生日的粉丝uuid
     * </pre>
     */
    public void selectTodayBirthdayFans(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_TODAY_BIRTHDAY_FANS, responseObserver);
    }

    /**
     * <pre>
     * 网红7天内过生日的粉丝uuid
     * </pre>
     */
    public void select7DayBirthdayFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT7DAY_BIRTHDAY_FANS, responseObserver);
    }

    /**
     * <pre>
     * 当天有粉丝过生日的网红uuid
     * </pre>
     */
    public void selectVUserHaveTodayBirthdayFans(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS, responseObserver);
    }

    /**
     * <pre>
     * 根据昵称查询用户
     * </pre>
     */
    public void searchUser(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_USER, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SELECT_FANS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SELECT_FANS)))
          .addMethod(
            METHOD_SELECT_FANS_WITH_SOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SELECT_FANS_WITH_SOURCE)))
          .addMethod(
            METHOD_MORE_FANS_WITH_SOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_MORE_FANS_WITH_SOURCE)))
          .addMethod(
            METHOD_SAVE_FANS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SAVE_FANS)))
          .addMethod(
            METHOD_SCROLL_MORE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SCROLL_MORE)))
          .addMethod(
            METHOD_SELECT_VUSER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList>(
                  this, METHODID_SELECT_VUSER)))
          .addMethod(
            METHOD_SELECT_TODAY_BIRTHDAY_FANS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SELECT_TODAY_BIRTHDAY_FANS)))
          .addMethod(
            METHOD_SELECT7DAY_BIRTHDAY_FANS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
                com.blemobi.sep.probuf.AccountProtos.PUserList>(
                  this, METHODID_SELECT7DAY_BIRTHDAY_FANS)))
          .addMethod(
            METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS)))
          .addMethod(
            METHOD_SEARCH_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SEARCH_USER)))
          .build();
    }
  }

  /**
   */
  public static final class grpcDataPublishingStub extends io.grpc.stub.AbstractStub<grpcDataPublishingStub> {
    private grpcDataPublishingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcDataPublishingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcDataPublishingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcDataPublishingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询粉丝
     * </pre>
     */
    public void selectFans(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_FANS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询粉丝，uuid中用下划线拼接了地区信息，如：uuid_CN;4403
     * </pre>
     */
    public void selectFansWithSource(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_FANS_WITH_SOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void moreFansWithSource(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MORE_FANS_WITH_SOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SAVE_FANS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用PScrollResult.scrollId查询下一页粉丝，直到PScrollResult.id为空
     * </pre>
     */
    public void scrollMore(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SCROLL_MORE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户关注的网红列表，含搜索
     * </pre>
     */
    public void selectVUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_VUSER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 网红当天过生日的粉丝uuid
     * </pre>
     */
    public void selectTodayBirthdayFans(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_TODAY_BIRTHDAY_FANS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 网红7天内过生日的粉丝uuid
     * </pre>
     */
    public void select7DayBirthdayFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT7DAY_BIRTHDAY_FANS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 当天有粉丝过生日的网红uuid
     * </pre>
     */
    public void selectVUserHaveTodayBirthdayFans(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据昵称查询用户
     * </pre>
     */
    public void searchUser(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class grpcDataPublishingBlockingStub extends io.grpc.stub.AbstractStub<grpcDataPublishingBlockingStub> {
    private grpcDataPublishingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcDataPublishingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcDataPublishingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcDataPublishingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询粉丝
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult selectFans(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_FANS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询粉丝，uuid中用下划线拼接了地区信息，如：uuid_CN;4403
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult selectFansWithSource(com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_FANS_WITH_SOURCE, getCallOptions(), request);
    }

    /**
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult moreFansWithSource(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MORE_FANS_WITH_SOURCE, getCallOptions(), request);
    }

    /**
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty saveFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SAVE_FANS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用PScrollResult.scrollId查询下一页粉丝，直到PScrollResult.id为空
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult scrollMore(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SCROLL_MORE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户关注的网红列表，含搜索
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList selectVUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_VUSER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 网红当天过生日的粉丝uuid
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult selectTodayBirthdayFans(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_TODAY_BIRTHDAY_FANS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 网红7天内过生日的粉丝uuid
     * </pre>
     */
    public com.blemobi.sep.probuf.AccountProtos.PUserList select7DayBirthdayFans(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT7DAY_BIRTHDAY_FANS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 当天有粉丝过生日的网红uuid
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList selectVUserHaveTodayBirthdayFans(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据昵称查询用户
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList searchUser(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_USER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class grpcDataPublishingFutureStub extends io.grpc.stub.AbstractStub<grpcDataPublishingFutureStub> {
    private grpcDataPublishingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private grpcDataPublishingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected grpcDataPublishingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new grpcDataPublishingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询粉丝
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> selectFans(
        com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_FANS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询粉丝，uuid中用下划线拼接了地区信息，如：uuid_CN;4403
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> selectFansWithSource(
        com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_FANS_WITH_SOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> moreFansWithSource(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MORE_FANS_WITH_SOURCE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> saveFans(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SAVE_FANS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用PScrollResult.scrollId查询下一页粉丝，直到PScrollResult.id为空
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> scrollMore(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SCROLL_MORE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户关注的网红列表，含搜索
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList> selectVUser(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_VUSER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 网红当天过生日的粉丝uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> selectTodayBirthdayFans(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_TODAY_BIRTHDAY_FANS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 网红7天内过生日的粉丝uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.AccountProtos.PUserList> select7DayBirthdayFans(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT7DAY_BIRTHDAY_FANS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 当天有粉丝过生日的网红uuid
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> selectVUserHaveTodayBirthdayFans(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据昵称查询用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> searchUser(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER, getCallOptions()), request);
    }
  }

  private static final int METHODID_SELECT_FANS = 0;
  private static final int METHODID_SELECT_FANS_WITH_SOURCE = 1;
  private static final int METHODID_MORE_FANS_WITH_SOURCE = 2;
  private static final int METHODID_SAVE_FANS = 3;
  private static final int METHODID_SCROLL_MORE = 4;
  private static final int METHODID_SELECT_VUSER = 5;
  private static final int METHODID_SELECT_TODAY_BIRTHDAY_FANS = 6;
  private static final int METHODID_SELECT7DAY_BIRTHDAY_FANS = 7;
  private static final int METHODID_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS = 8;
  private static final int METHODID_SEARCH_USER = 9;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final grpcDataPublishingImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(grpcDataPublishingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SELECT_FANS:
          serviceImpl.selectFans((com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SELECT_FANS_WITH_SOURCE:
          serviceImpl.selectFansWithSource((com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_MORE_FANS_WITH_SOURCE:
          serviceImpl.moreFansWithSource((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SAVE_FANS:
          serviceImpl.saveFans((com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SCROLL_MORE:
          serviceImpl.scrollMore((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SELECT_VUSER:
          serviceImpl.selectVUser((com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList>) responseObserver);
          break;
        case METHODID_SELECT_TODAY_BIRTHDAY_FANS:
          serviceImpl.selectTodayBirthdayFans((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SELECT7DAY_BIRTHDAY_FANS:
          serviceImpl.select7DayBirthdayFans((com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.AccountProtos.PUserList>) responseObserver);
          break;
        case METHODID_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS:
          serviceImpl.selectVUserHaveTodayBirthdayFans((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
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
        METHOD_SELECT_FANS,
        METHOD_SELECT_FANS_WITH_SOURCE,
        METHOD_MORE_FANS_WITH_SOURCE,
        METHOD_SAVE_FANS,
        METHOD_SCROLL_MORE,
        METHOD_SELECT_VUSER,
        METHOD_SELECT_TODAY_BIRTHDAY_FANS,
        METHOD_SELECT7DAY_BIRTHDAY_FANS,
        METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS,
        METHOD_SEARCH_USER);
  }

}
