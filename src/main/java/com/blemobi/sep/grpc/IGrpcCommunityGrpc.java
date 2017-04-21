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
    comments = "Source: community_inside.proto")
public class IGrpcCommunityGrpc {

  private IGrpcCommunityGrpc() {}

  public static final String SERVICE_NAME = "bbproto.IGrpcCommunity";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PBoolSingle> METHOD_GET_FORBID_FLAG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetForbidFlag"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PBoolSingle> METHOD_GET_BLACKLIST_FLAG =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetBlacklistFlag"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolSingle.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_COMMUNITY_MEMBER_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetCommunityMemberList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> METHOD_GET_COMMUNITY_BASE_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetCommunityBaseList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetCommunityBaseListWithUuid"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.CommunityProtos.PCommunityBase> METHOD_GET_USER_COMMUNITY_BASE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetUserCommunityBase"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunityBase.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_FOLLOW_COMMUNITY_ID =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetFollowCommunityID"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetFollowCommunityBaseList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
      com.blemobi.sep.probuf.CommunityProtos.PCommunitySort> METHOD_ADD_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "AddCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_DEL_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "DelCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "SetCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> METHOD_GET_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> METHOD_GET_RECOMMEND_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetRecommendCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_RECOMMEND_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "AddRecommendCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_RECOMMEND_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "SetRecommendCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_DEL_RECOMMEND_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "DelRecommendCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> METHOD_GET_USER_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetUserCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_USER_COMMUNITY_SORT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "SetUserCommunitySort"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_TOP_USER_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetTopUserList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_TOP_USER_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "SetTopUserList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PInt32List,
      com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList> METHOD_GET_COMMUNITY_BASE_EX_LIST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.IGrpcCommunity", "GetCommunityBaseExList"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IGrpcCommunityStub newStub(io.grpc.Channel channel) {
    return new IGrpcCommunityStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcCommunityBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IGrpcCommunityBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static IGrpcCommunityFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IGrpcCommunityFutureStub(channel);
  }

  /**
   */
  public static abstract class IGrpcCommunityImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *&#64;note 获取用户在社区的禁用状态，true为禁用，
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public void getForbidFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FORBID_FLAG, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的黑名单状态，true为黑名单
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public void getBlacklistFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BLACKLIST_FLAG, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区成员列表
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityMemberList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_MEMBER_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,不填充Membership字段
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_BASE_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,并且判断用户与社区的关系，填充Membership字段
     *&#64;param 参数数组 [0]用户UUID [1]社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseListWithUuid(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户创建/管理的社区信息,如果用户没有创建社区，则PCommunityBase内社区ID为0
     *&#64;param 参数数组 [0]用户UUID
     *&#64;return 成功返回 PCommunityBase ，失败返回 PResult
     * </pre>
     */
    public void getUserCommunityBase(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBase> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_COMMUNITY_BASE, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区ID列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getFollowCommunityID(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FOLLOW_COMMUNITY_ID, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区信息列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getFollowCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 添加社区分类
     *&#64;param PCommunitySort，其中ID可以不填，Name必填
     *&#64;return 成功返回 PCommunitySort PResult
     * </pre>
     */
    public void addCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 删除社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void delCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 修改社区分类的名称
     *&#64;param PCommunitySort，其中ID，Name必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取所有社区分类的列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public void getCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取推荐社区分类列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public void getRecommendCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RECOMMEND_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 添加推荐社区分类列表
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void addRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_RECOMMEND_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置推荐社区分类列表,覆盖修改，用于排序
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void setRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_RECOMMEND_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 移除推荐社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void delRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_RECOMMEND_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取某个社区的分类
     *&#64;param 社区ID
     *&#64;return 成功返回 PCommunitySortList，失败返回 PResult
     * </pre>
     */
    public void getUserCommunitySort(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置某个社区的分类,全覆盖
     *&#64;param PCommunitySortList，其中社区ID、分类ID必填；UUID、Name 可以不填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setUserCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_USER_COMMUNITY_SORT, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区的top userlist
     *&#64;return 成功返回 PStringList top user的uuid ，失败返回 PResult
     * </pre>
     */
    public void getTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOP_USER_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置社区的top userlist
     *&#64;param 参数数组 [0]社区id [1]uuid列表...
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void setTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_TOP_USER_LIST, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 分页获取社区的 PCommunityBaseExList
     *&#64;param 参数数组 [0]分页偏移值 [1]分页大小
     *&#64;return 成功返回 PCommunityBaseExList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseExList(com.blemobi.sep.probuf.ResultProtos.PInt32List request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_COMMUNITY_BASE_EX_LIST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_FORBID_FLAG,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PBoolSingle>(
                  this, METHODID_GET_FORBID_FLAG)))
          .addMethod(
            METHOD_GET_BLACKLIST_FLAG,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PBoolSingle>(
                  this, METHODID_GET_BLACKLIST_FLAG)))
          .addMethod(
            METHOD_GET_COMMUNITY_MEMBER_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_COMMUNITY_MEMBER_LIST)))
          .addMethod(
            METHOD_GET_COMMUNITY_BASE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>(
                  this, METHODID_GET_COMMUNITY_BASE_LIST)))
          .addMethod(
            METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>(
                  this, METHODID_GET_COMMUNITY_BASE_LIST_WITH_UUID)))
          .addMethod(
            METHOD_GET_USER_COMMUNITY_BASE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.CommunityProtos.PCommunityBase>(
                  this, METHODID_GET_USER_COMMUNITY_BASE)))
          .addMethod(
            METHOD_GET_FOLLOW_COMMUNITY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_FOLLOW_COMMUNITY_ID)))
          .addMethod(
            METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>(
                  this, METHODID_GET_FOLLOW_COMMUNITY_BASE_LIST)))
          .addMethod(
            METHOD_ADD_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort>(
                  this, METHODID_ADD_COMMUNITY_SORT)))
          .addMethod(
            METHOD_DEL_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_DEL_COMMUNITY_SORT)))
          .addMethod(
            METHOD_SET_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_COMMUNITY_SORT)))
          .addMethod(
            METHOD_GET_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>(
                  this, METHODID_GET_COMMUNITY_SORT)))
          .addMethod(
            METHOD_GET_RECOMMEND_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>(
                  this, METHODID_GET_RECOMMEND_COMMUNITY_SORT)))
          .addMethod(
            METHOD_ADD_RECOMMEND_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_RECOMMEND_COMMUNITY_SORT)))
          .addMethod(
            METHOD_SET_RECOMMEND_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_RECOMMEND_COMMUNITY_SORT)))
          .addMethod(
            METHOD_DEL_RECOMMEND_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySort,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_DEL_RECOMMEND_COMMUNITY_SORT)))
          .addMethod(
            METHOD_GET_USER_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>(
                  this, METHODID_GET_USER_COMMUNITY_SORT)))
          .addMethod(
            METHOD_SET_USER_COMMUNITY_SORT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_USER_COMMUNITY_SORT)))
          .addMethod(
            METHOD_GET_TOP_USER_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_TOP_USER_LIST)))
          .addMethod(
            METHOD_SET_TOP_USER_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_TOP_USER_LIST)))
          .addMethod(
            METHOD_GET_COMMUNITY_BASE_EX_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PInt32List,
                com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList>(
                  this, METHODID_GET_COMMUNITY_BASE_EX_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class IGrpcCommunityStub extends io.grpc.stub.AbstractStub<IGrpcCommunityStub> {
    private IGrpcCommunityStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommunityStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommunityStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommunityStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的禁用状态，true为禁用，
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public void getForbidFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FORBID_FLAG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的黑名单状态，true为黑名单
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public void getBlacklistFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BLACKLIST_FLAG, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区成员列表
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityMemberList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_MEMBER_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,不填充Membership字段
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,并且判断用户与社区的关系，填充Membership字段
     *&#64;param 参数数组 [0]用户UUID [1]社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseListWithUuid(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户创建/管理的社区信息,如果用户没有创建社区，则PCommunityBase内社区ID为0
     *&#64;param 参数数组 [0]用户UUID
     *&#64;return 成功返回 PCommunityBase ，失败返回 PResult
     * </pre>
     */
    public void getUserCommunityBase(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBase> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_COMMUNITY_BASE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区ID列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public void getFollowCommunityID(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FOLLOW_COMMUNITY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区信息列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public void getFollowCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 添加社区分类
     *&#64;param PCommunitySort，其中ID可以不填，Name必填
     *&#64;return 成功返回 PCommunitySort PResult
     * </pre>
     */
    public void addCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 删除社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void delCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 修改社区分类的名称
     *&#64;param PCommunitySort，其中ID，Name必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取所有社区分类的列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public void getCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取推荐社区分类列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public void getRecommendCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 添加推荐社区分类列表
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void addRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置推荐社区分类列表,覆盖修改，用于排序
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void setRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 移除推荐社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void delRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取某个社区的分类
     *&#64;param 社区ID
     *&#64;return 成功返回 PCommunitySortList，失败返回 PResult
     * </pre>
     */
    public void getUserCommunitySort(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置某个社区的分类,全覆盖
     *&#64;param PCommunitySortList，其中社区ID、分类ID必填；UUID、Name 可以不填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public void setUserCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_USER_COMMUNITY_SORT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 获取社区的top userlist
     *&#64;return 成功返回 PStringList top user的uuid ，失败返回 PResult
     * </pre>
     */
    public void getTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_USER_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 设置社区的top userlist
     *&#64;param 参数数组 [0]社区id [1]uuid列表...
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public void setTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_TOP_USER_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#64;note 分页获取社区的 PCommunityBaseExList
     *&#64;param 参数数组 [0]分页偏移值 [1]分页大小
     *&#64;return 成功返回 PCommunityBaseExList ，失败返回 PResult
     * </pre>
     */
    public void getCommunityBaseExList(com.blemobi.sep.probuf.ResultProtos.PInt32List request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_EX_LIST, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IGrpcCommunityBlockingStub extends io.grpc.stub.AbstractStub<IGrpcCommunityBlockingStub> {
    private IGrpcCommunityBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommunityBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommunityBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommunityBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的禁用状态，true为禁用，
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolSingle getForbidFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FORBID_FLAG, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的黑名单状态，true为黑名单
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolSingle getBlacklistFlag(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BLACKLIST_FLAG, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区成员列表
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getCommunityMemberList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_MEMBER_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,不填充Membership字段
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList getCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_BASE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,并且判断用户与社区的关系，填充Membership字段
     *&#64;param 参数数组 [0]用户UUID [1]社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList getCommunityBaseListWithUuid(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户创建/管理的社区信息,如果用户没有创建社区，则PCommunityBase内社区ID为0
     *&#64;param 参数数组 [0]用户UUID
     *&#64;return 成功返回 PCommunityBase ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunityBase getUserCommunityBase(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_COMMUNITY_BASE, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区ID列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getFollowCommunityID(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FOLLOW_COMMUNITY_ID, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区信息列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList getFollowCommunityBaseList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 添加社区分类
     *&#64;param PCommunitySort，其中ID可以不填，Name必填
     *&#64;return 成功返回 PCommunitySort PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunitySort addCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 删除社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty delCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 修改社区分类的名称
     *&#64;param PCommunitySort，其中ID，Name必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取所有社区分类的列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList getCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取推荐社区分类列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList getRecommendCommunitySort(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RECOMMEND_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 添加推荐社区分类列表
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_RECOMMEND_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置推荐社区分类列表,覆盖修改，用于排序
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_RECOMMEND_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 移除推荐社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty delRecommendCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_RECOMMEND_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取某个社区的分类
     *&#64;param 社区ID
     *&#64;return 成功返回 PCommunitySortList，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList getUserCommunitySort(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置某个社区的分类,全覆盖
     *&#64;param PCommunitySortList，其中社区ID、分类ID必填；UUID、Name 可以不填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setUserCommunitySort(com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_USER_COMMUNITY_SORT, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区的top userlist
     *&#64;return 成功返回 PStringList top user的uuid ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOP_USER_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 设置社区的top userlist
     *&#64;param 参数数组 [0]社区id [1]uuid列表...
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setTopUserList(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_TOP_USER_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     *&#64;note 分页获取社区的 PCommunityBaseExList
     *&#64;param 参数数组 [0]分页偏移值 [1]分页大小
     *&#64;return 成功返回 PCommunityBaseExList ，失败返回 PResult
     * </pre>
     */
    public com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList getCommunityBaseExList(com.blemobi.sep.probuf.ResultProtos.PInt32List request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_COMMUNITY_BASE_EX_LIST, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IGrpcCommunityFutureStub extends io.grpc.stub.AbstractStub<IGrpcCommunityFutureStub> {
    private IGrpcCommunityFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IGrpcCommunityFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IGrpcCommunityFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IGrpcCommunityFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的禁用状态，true为禁用，
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> getForbidFlag(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FORBID_FLAG, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户在社区的黑名单状态，true为黑名单
     *&#64;param 参数数组 [0]用户UUID [1]社区id 
     *&#64;return 成功返回 PBoolSingle ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolSingle> getBlacklistFlag(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BLACKLIST_FLAG, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区成员列表
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getCommunityMemberList(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_MEMBER_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,不填充Membership字段
     *&#64;param 社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> getCommunityBaseList(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取PCommunityBaseList,并且判断用户与社区的关系，填充Membership字段
     *&#64;param 参数数组 [0]用户UUID [1]社区id的列表 
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> getCommunityBaseListWithUuid(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户创建/管理的社区信息,如果用户没有创建社区，则PCommunityBase内社区ID为0
     *&#64;param 参数数组 [0]用户UUID
     *&#64;return 成功返回 PCommunityBase ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunityBase> getUserCommunityBase(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_COMMUNITY_BASE, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区ID列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PStringList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getFollowCommunityID(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FOLLOW_COMMUNITY_ID, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取用户关注的社区信息列表
     *&#64;param 用户UUID
     *&#64;return 成功返回 PCommunityBaseList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList> getFollowCommunityBaseList(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 添加社区分类
     *&#64;param PCommunitySort，其中ID可以不填，Name必填
     *&#64;return 成功返回 PCommunitySort PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort> addCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 删除社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> delCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 修改社区分类的名称
     *&#64;param PCommunitySort，其中ID，Name必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取所有社区分类的列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> getCommunitySort(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取推荐社区分类列表
     *&#64;return 成功返回 PCommunitySortList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> getRecommendCommunitySort(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 添加推荐社区分类列表
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addRecommendCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置推荐社区分类列表,覆盖修改，用于排序
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setRecommendCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 移除推荐社区分类
     *&#64;param PCommunitySort，其中Name可以不填，ID必填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> delRecommendCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySort request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_RECOMMEND_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取某个社区的分类
     *&#64;param 社区ID
     *&#64;return 成功返回 PCommunitySortList，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList> getUserCommunitySort(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置某个社区的分类,全覆盖
     *&#64;param PCommunitySortList，其中社区ID、分类ID必填；UUID、Name 可以不填
     *&#64;return 成功返回 PEmpty，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setUserCommunitySort(
        com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_USER_COMMUNITY_SORT, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 获取社区的top userlist
     *&#64;return 成功返回 PStringList top user的uuid ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getTopUserList(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOP_USER_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 设置社区的top userlist
     *&#64;param 参数数组 [0]社区id [1]uuid列表...
     *&#64;return 成功返回 PEmpty ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setTopUserList(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_TOP_USER_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     *&#64;note 分页获取社区的 PCommunityBaseExList
     *&#64;param 参数数组 [0]分页偏移值 [1]分页大小
     *&#64;return 成功返回 PCommunityBaseExList ，失败返回 PResult
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList> getCommunityBaseExList(
        com.blemobi.sep.probuf.ResultProtos.PInt32List request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_COMMUNITY_BASE_EX_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FORBID_FLAG = 0;
  private static final int METHODID_GET_BLACKLIST_FLAG = 1;
  private static final int METHODID_GET_COMMUNITY_MEMBER_LIST = 2;
  private static final int METHODID_GET_COMMUNITY_BASE_LIST = 3;
  private static final int METHODID_GET_COMMUNITY_BASE_LIST_WITH_UUID = 4;
  private static final int METHODID_GET_USER_COMMUNITY_BASE = 5;
  private static final int METHODID_GET_FOLLOW_COMMUNITY_ID = 6;
  private static final int METHODID_GET_FOLLOW_COMMUNITY_BASE_LIST = 7;
  private static final int METHODID_ADD_COMMUNITY_SORT = 8;
  private static final int METHODID_DEL_COMMUNITY_SORT = 9;
  private static final int METHODID_SET_COMMUNITY_SORT = 10;
  private static final int METHODID_GET_COMMUNITY_SORT = 11;
  private static final int METHODID_GET_RECOMMEND_COMMUNITY_SORT = 12;
  private static final int METHODID_ADD_RECOMMEND_COMMUNITY_SORT = 13;
  private static final int METHODID_SET_RECOMMEND_COMMUNITY_SORT = 14;
  private static final int METHODID_DEL_RECOMMEND_COMMUNITY_SORT = 15;
  private static final int METHODID_GET_USER_COMMUNITY_SORT = 16;
  private static final int METHODID_SET_USER_COMMUNITY_SORT = 17;
  private static final int METHODID_GET_TOP_USER_LIST = 18;
  private static final int METHODID_SET_TOP_USER_LIST = 19;
  private static final int METHODID_GET_COMMUNITY_BASE_EX_LIST = 20;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IGrpcCommunityImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(IGrpcCommunityImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FORBID_FLAG:
          serviceImpl.getForbidFlag((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_GET_BLACKLIST_FLAG:
          serviceImpl.getBlacklistFlag((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolSingle>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_MEMBER_LIST:
          serviceImpl.getCommunityMemberList((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_BASE_LIST:
          serviceImpl.getCommunityBaseList((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_BASE_LIST_WITH_UUID:
          serviceImpl.getCommunityBaseListWithUuid((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>) responseObserver);
          break;
        case METHODID_GET_USER_COMMUNITY_BASE:
          serviceImpl.getUserCommunityBase((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBase>) responseObserver);
          break;
        case METHODID_GET_FOLLOW_COMMUNITY_ID:
          serviceImpl.getFollowCommunityID((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_GET_FOLLOW_COMMUNITY_BASE_LIST:
          serviceImpl.getFollowCommunityBaseList((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunityBaseList>) responseObserver);
          break;
        case METHODID_ADD_COMMUNITY_SORT:
          serviceImpl.addCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySort) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySort>) responseObserver);
          break;
        case METHODID_DEL_COMMUNITY_SORT:
          serviceImpl.delCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySort) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SET_COMMUNITY_SORT:
          serviceImpl.setCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySort) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_SORT:
          serviceImpl.getCommunitySort((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>) responseObserver);
          break;
        case METHODID_GET_RECOMMEND_COMMUNITY_SORT:
          serviceImpl.getRecommendCommunitySort((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>) responseObserver);
          break;
        case METHODID_ADD_RECOMMEND_COMMUNITY_SORT:
          serviceImpl.addRecommendCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySort) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SET_RECOMMEND_COMMUNITY_SORT:
          serviceImpl.setRecommendCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_DEL_RECOMMEND_COMMUNITY_SORT:
          serviceImpl.delRecommendCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySort) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_USER_COMMUNITY_SORT:
          serviceImpl.getUserCommunitySort((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList>) responseObserver);
          break;
        case METHODID_SET_USER_COMMUNITY_SORT:
          serviceImpl.setUserCommunitySort((com.blemobi.sep.probuf.CommunityProtos.PCommunitySortList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_TOP_USER_LIST:
          serviceImpl.getTopUserList((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_SET_TOP_USER_LIST:
          serviceImpl.setTopUserList((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_COMMUNITY_BASE_EX_LIST:
          serviceImpl.getCommunityBaseExList((com.blemobi.sep.probuf.ResultProtos.PInt32List) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommunityApiProtos.PCommunityBaseExList>) responseObserver);
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
        METHOD_GET_FORBID_FLAG,
        METHOD_GET_BLACKLIST_FLAG,
        METHOD_GET_COMMUNITY_MEMBER_LIST,
        METHOD_GET_COMMUNITY_BASE_LIST,
        METHOD_GET_COMMUNITY_BASE_LIST_WITH_UUID,
        METHOD_GET_USER_COMMUNITY_BASE,
        METHOD_GET_FOLLOW_COMMUNITY_ID,
        METHOD_GET_FOLLOW_COMMUNITY_BASE_LIST,
        METHOD_ADD_COMMUNITY_SORT,
        METHOD_DEL_COMMUNITY_SORT,
        METHOD_SET_COMMUNITY_SORT,
        METHOD_GET_COMMUNITY_SORT,
        METHOD_GET_RECOMMEND_COMMUNITY_SORT,
        METHOD_ADD_RECOMMEND_COMMUNITY_SORT,
        METHOD_SET_RECOMMEND_COMMUNITY_SORT,
        METHOD_DEL_RECOMMEND_COMMUNITY_SORT,
        METHOD_GET_USER_COMMUNITY_SORT,
        METHOD_SET_USER_COMMUNITY_SORT,
        METHOD_GET_TOP_USER_LIST,
        METHOD_SET_TOP_USER_LIST,
        METHOD_GET_COMMUNITY_BASE_EX_LIST);
  }

}
