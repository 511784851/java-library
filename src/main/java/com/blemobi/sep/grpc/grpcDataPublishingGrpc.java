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
import com.blemobi.sep.probuf.DatapublishingApiProtos;
import com.blemobi.sep.probuf.NewsProtos;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.AccountProtos.PUser;
import com.blemobi.sep.probuf.AccountProtos.PUserList;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.DataPublishingProtos.PFansFilterParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity;
import com.blemobi.sep.probuf.NewsProtos.PPostStore;
import com.blemobi.sep.probuf.ResultProtos.PBoolList;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
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
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_EXPIRE_CACHE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "ExpireCache"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.AccountProtos.PUser,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "AddUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.AccountProtos.PUser.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_UPDATE_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "UpdateUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_RECORD_LOGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "RecordLogin"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "AddCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_UPDATE_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "UpdateCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_JOIN_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "JoinCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SEARCH_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PPostStore,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "AddPost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostStore.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.NewsProtos.PPostStore,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_UPDATE_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "UpdatePost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.NewsProtos.PPostStore.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_UPDATE_POST_TAGS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "UpdatePostTags"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ACT2POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "Act2Post"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SEARCH_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchPost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_FOLLOW_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "FollowUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_MAKE_FRIEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "MakeFriend"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_COMMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "AddComment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_DEL_COMMENT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "DelComment"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_CONFIRM_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "ConfirmPost"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_CONFIRM_TOPIC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "ConfirmTopic"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SEARCH_USER =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchUser"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SEARCH_USER_V2 =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchUserV2"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SEARCH_POST_V2 =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchPostV2"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SEARCH_COMMUNITY_V2 =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchCommunityV2"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> METHOD_SEARCH_TOPIC_V2 =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SearchTopicV2"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult.getDefaultInstance()));
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
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_SELECT_POST_BY_CATEGORY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SelectPostByCategory"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_ADD_MANUAL_RECOMMEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "AddManualRecommend"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_DEL_MANUAL_RECOMMEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "DelManualRecommend"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_BATCH_MANUAL_RECOMMEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "BatchManualRecommend"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend> METHOD_GET_MANUAL_RECOMMEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetManualRecommend"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList> METHOD_GET_TOPIC_DETAIL =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetTopicDetail"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_HOT_REMOVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "HotRemove"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove,
      com.blemobi.sep.probuf.ResultProtos.PBoolList> METHOD_IS_IN_HOT_REMOVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "IsInHotRemove"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PBoolList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.ResultProtos.PInt32List> METHOD_GET_USER_SOURCE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetUserSource"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PInt32List.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_RECOMMEND_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetRecommendCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_VISIT_COMMUNITY =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "VisitCommunity"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_VISIT_HOME_PAGE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "VisitHomePage"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_SET_DISCOVER_PARAMS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "SetDiscoverParams"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams> METHOD_GET_DISCOVER_PARAMS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetDiscoverParams"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas> METHOD_GET_PERSONAS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetPersonas"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringSingle.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringList,
      com.blemobi.sep.probuf.CommonApiProtos.PEmpty> METHOD_HEARTBEAT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "Heartbeat"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.ResultProtos.PStringList.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.blemobi.sep.probuf.CommonApiProtos.PEmpty.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.blemobi.sep.probuf.ResultProtos.PStringSingle,
      com.blemobi.sep.probuf.ResultProtos.PStringList> METHOD_GET_TOPIC_OF_POST =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "bbproto.grpcDataPublishing", "GetTopicOfPost"),
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
     * 使缓存失效
     * </pre>
     */
    public void expireCache(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EXPIRE_CACHE, responseObserver);
    }

    /**
     * <pre>
     * 用户注册
     * </pre>
     */
    public void addUser(com.blemobi.sep.probuf.AccountProtos.PUser request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_USER, responseObserver);
    }

    /**
     * <pre>
     * 更新用户
     * </pre>
     */
    public void updateUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_USER, responseObserver);
    }

    /**
     * <pre>
     * 记录登录日志
     * </pre>
     */
    public void recordLogin(com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RECORD_LOGIN, responseObserver);
    }

    /**
     * <pre>
     * 增加社区
     * </pre>
     */
    public void addCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 更新社区
     * </pre>
     */
    public void updateCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 加入(离开)社区
     * </pre>
     */
    public void joinCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_JOIN_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 搜索社区
     * </pre>
     */
    public void searchCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 新增帖子
     * </pre>
     */
    public void addPost(com.blemobi.sep.probuf.NewsProtos.PPostStore request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_POST, responseObserver);
    }

    /**
     * <pre>
     * 更新帖子内容
     * </pre>
     */
    public void updatePost(com.blemobi.sep.probuf.NewsProtos.PPostStore request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_POST, responseObserver);
    }

    /**
     * <pre>
     * 更新帖子标签
     * </pre>
     */
    public void updatePostTags(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_POST_TAGS, responseObserver);
    }

    /**
     * <pre>
     * 帖子交互
     * </pre>
     */
    public void act2Post(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACT2POST, responseObserver);
    }

    /**
     * <pre>
     * 搜索帖子
     * </pre>
     */
    public void searchPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_POST, responseObserver);
    }

    /**
     * <pre>
     * 关注用户
     * </pre>
     */
    public void followUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FOLLOW_USER, responseObserver);
    }

    /**
     * <pre>
     * 好友操作
     * </pre>
     */
    public void makeFriend(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_MAKE_FRIEND, responseObserver);
    }

    /**
     * <pre>
     * 新增帖子评论
     * </pre>
     */
    public void addComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_COMMENT, responseObserver);
    }

    /**
     * <pre>
     * 删除评论
     * </pre>
     */
    public void delComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_COMMENT, responseObserver);
    }

    /**
     * <pre>
     * 审核帖子
     * </pre>
     */
    public void confirmPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONFIRM_POST, responseObserver);
    }

    /**
     * <pre>
     * 审核话题
     * </pre>
     */
    public void confirmTopic(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONFIRM_TOPIC, responseObserver);
    }

    /**
     * <pre>
     * 搜索用户
     * </pre>
     */
    public void searchUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_USER, responseObserver);
    }

    /**
     * <pre>
     * 用户超级查找，参数为json字符串，字段包括：
     * keyword 搜索关键词
     * source 来源 0手机号码 1微信 2微博 3脸书 4谷歌 5用户名
     * coid 社区ID,string类型,如"550"
     * level 用户等级
     * state 用户状态 0正常 1被封 2冻结
     * no_water true过滤水军
     * begin,end 用户注册时间起止范围,unix时间戳,秒
     * sort_nickname 以昵称拼音排序 asc升序 desc降序
     * sort_regtime 以用户注册时间排序 asc升序 desc降序（默认）
     * sort_hot 以用户热门度排序，仅支持desc降序
     * sample: `{"keyword":"xxx", "level":1, "sort_regtime":"desc"}`
     * </pre>
     */
    public void searchUserV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_USER_V2, responseObserver);
    }

    /**
     * <pre>
     * 帖子查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_title 关键词为帖子标题，分词搜索
     * keyword_community 关键词为社区名称，全词匹配
     * coid 指定社区ID搜索
     * type EPostType的int值，另外增加1个定义：-1动态帖
     * state 审核状态 0待审 1通过审核 2未通过审核 4已删除的帖子
     * cotag 所属的社区的分类，string
     * tag 帖子标签，string
     * begin, end 发布时间起止范围,unix时间戳,秒
     * sort_time 以帖子发布时间排序 asc升序 desc降序（默认）
     * sort_hot 以帖子热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchPostV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_POST_V2, responseObserver);
    }

    /**
     * <pre>
     * 社区查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_community 关键词为社区名称，部分匹配
     * cotag 社区分类，如："游戏"
     * begin, end 社区创建时间起止范围,unix时间戳,秒
     * sort_time 以社区创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以社区热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchCommunityV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_COMMUNITY_V2, responseObserver);
    }

    /**
     * <pre>
     * 话题查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword 关键词
     * state 审核状态 0待审 1通过审核 2未通过审核
     * sort_time 以话题创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以话题热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchTopicV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_TOPIC_V2, responseObserver);
    }

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
     * 精选版块
     * </pre>
     */
    public void selectPostByCategory(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SELECT_POST_BY_CATEGORY, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-添加单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public void addManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADD_MANUAL_RECOMMEND, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-移除单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public void delManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DEL_MANUAL_RECOMMEND, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-批量覆盖推荐
     * </pre>
     */
    public void batchManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH_MANUAL_RECOMMEND, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-获取已推荐列表
     * </pre>
     */
    public void getManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MANUAL_RECOMMEND, responseObserver);
    }

    /**
     * <pre>
     * 获取话题详情列表
     * </pre>
     */
    public void getTopicDetail(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOPIC_DETAIL, responseObserver);
    }

    /**
     * <pre>
     * 从热门移除
     * </pre>
     */
    public void hotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HOT_REMOVE, responseObserver);
    }

    /**
     * <pre>
     * 判断是否在热门移除里面
     * </pre>
     */
    public void isInHotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IS_IN_HOT_REMOVE, responseObserver);
    }

    /**
     * <pre>
     * 获取用户来源
     * </pre>
     */
    public void getUserSource(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_SOURCE, responseObserver);
    }

    /**
     * <pre>
     * 获取推荐的社区
     * </pre>
     */
    public void getRecommendCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RECOMMEND_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 用户访问了社区
     * </pre>
     */
    public void visitCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VISIT_COMMUNITY, responseObserver);
    }

    /**
     * <pre>
     * 用户访问了个人主页
     * </pre>
     */
    public void visitHomePage(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VISIT_HOME_PAGE, responseObserver);
    }

    /**
     * <pre>
     * 设置发现页面的参数
     * </pre>
     */
    public void setDiscoverParams(com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SET_DISCOVER_PARAMS, responseObserver);
    }

    /**
     * <pre>
     * 获取发现页面的参数
     * </pre>
     */
    public void getDiscoverParams(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DISCOVER_PARAMS, responseObserver);
    }

    /**
     * <pre>
     * 获取用户画像
     * 参数为json字符串
     * 字段包括：
     * begin, end 时间起止范围，unix时间戳，秒
     * tp 1活跃 2注册
     * </pre>
     */
    public void getPersonas(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PERSONAS, responseObserver);
    }

    /**
     * <pre>
     * 心跳
     * </pre>
     */
    public void heartbeat(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEARTBEAT, responseObserver);
    }

    /**
     * <pre>
     * 获取帖子参与的话题（供java调用,注：返回的话题是不带#号的）
     * </pre>
     */
    public void getTopicOfPost(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TOPIC_OF_POST, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_EXPIRE_CACHE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_EXPIRE_CACHE)))
          .addMethod(
            METHOD_ADD_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.AccountProtos.PUser,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            METHOD_UPDATE_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            METHOD_RECORD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_RECORD_LOGIN)))
          .addMethod(
            METHOD_ADD_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_COMMUNITY)))
          .addMethod(
            METHOD_UPDATE_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_UPDATE_COMMUNITY)))
          .addMethod(
            METHOD_JOIN_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_JOIN_COMMUNITY)))
          .addMethod(
            METHOD_SEARCH_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SEARCH_COMMUNITY)))
          .addMethod(
            METHOD_ADD_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PPostStore,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_POST)))
          .addMethod(
            METHOD_UPDATE_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.NewsProtos.PPostStore,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_UPDATE_POST)))
          .addMethod(
            METHOD_UPDATE_POST_TAGS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_UPDATE_POST_TAGS)))
          .addMethod(
            METHOD_ACT2POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ACT2POST)))
          .addMethod(
            METHOD_SEARCH_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SEARCH_POST)))
          .addMethod(
            METHOD_FOLLOW_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_FOLLOW_USER)))
          .addMethod(
            METHOD_MAKE_FRIEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_MAKE_FRIEND)))
          .addMethod(
            METHOD_ADD_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_COMMENT)))
          .addMethod(
            METHOD_DEL_COMMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_DEL_COMMENT)))
          .addMethod(
            METHOD_CONFIRM_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_CONFIRM_POST)))
          .addMethod(
            METHOD_CONFIRM_TOPIC,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_CONFIRM_TOPIC)))
          .addMethod(
            METHOD_SEARCH_USER,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SEARCH_USER)))
          .addMethod(
            METHOD_SEARCH_USER_V2,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SEARCH_USER_V2)))
          .addMethod(
            METHOD_SEARCH_POST_V2,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SEARCH_POST_V2)))
          .addMethod(
            METHOD_SEARCH_COMMUNITY_V2,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SEARCH_COMMUNITY_V2)))
          .addMethod(
            METHOD_SEARCH_TOPIC_V2,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>(
                  this, METHODID_SEARCH_TOPIC_V2)))
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
            METHOD_SELECT_POST_BY_CATEGORY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_SELECT_POST_BY_CATEGORY)))
          .addMethod(
            METHOD_ADD_MANUAL_RECOMMEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_ADD_MANUAL_RECOMMEND)))
          .addMethod(
            METHOD_DEL_MANUAL_RECOMMEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_DEL_MANUAL_RECOMMEND)))
          .addMethod(
            METHOD_BATCH_MANUAL_RECOMMEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_BATCH_MANUAL_RECOMMEND)))
          .addMethod(
            METHOD_GET_MANUAL_RECOMMEND,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend>(
                  this, METHODID_GET_MANUAL_RECOMMEND)))
          .addMethod(
            METHOD_GET_TOPIC_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList>(
                  this, METHODID_GET_TOPIC_DETAIL)))
          .addMethod(
            METHOD_HOT_REMOVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_HOT_REMOVE)))
          .addMethod(
            METHOD_IS_IN_HOT_REMOVE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove,
                com.blemobi.sep.probuf.ResultProtos.PBoolList>(
                  this, METHODID_IS_IN_HOT_REMOVE)))
          .addMethod(
            METHOD_GET_USER_SOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.ResultProtos.PInt32List>(
                  this, METHODID_GET_USER_SOURCE)))
          .addMethod(
            METHOD_GET_RECOMMEND_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_RECOMMEND_COMMUNITY)))
          .addMethod(
            METHOD_VISIT_COMMUNITY,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_VISIT_COMMUNITY)))
          .addMethod(
            METHOD_VISIT_HOME_PAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_VISIT_HOME_PAGE)))
          .addMethod(
            METHOD_SET_DISCOVER_PARAMS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_SET_DISCOVER_PARAMS)))
          .addMethod(
            METHOD_GET_DISCOVER_PARAMS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams>(
                  this, METHODID_GET_DISCOVER_PARAMS)))
          .addMethod(
            METHOD_GET_PERSONAS,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas>(
                  this, METHODID_GET_PERSONAS)))
          .addMethod(
            METHOD_HEARTBEAT,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringList,
                com.blemobi.sep.probuf.CommonApiProtos.PEmpty>(
                  this, METHODID_HEARTBEAT)))
          .addMethod(
            METHOD_GET_TOPIC_OF_POST,
            asyncUnaryCall(
              new MethodHandlers<
                com.blemobi.sep.probuf.ResultProtos.PStringSingle,
                com.blemobi.sep.probuf.ResultProtos.PStringList>(
                  this, METHODID_GET_TOPIC_OF_POST)))
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
     * 使缓存失效
     * </pre>
     */
    public void expireCache(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXPIRE_CACHE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户注册
     * </pre>
     */
    public void addUser(com.blemobi.sep.probuf.AccountProtos.PUser request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_USER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新用户
     * </pre>
     */
    public void updateUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 记录登录日志
     * </pre>
     */
    public void recordLogin(com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RECORD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 增加社区
     * </pre>
     */
    public void addCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新社区
     * </pre>
     */
    public void updateCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 加入(离开)社区
     * </pre>
     */
    public void joinCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOIN_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索社区
     * </pre>
     */
    public void searchCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 新增帖子
     * </pre>
     */
    public void addPost(com.blemobi.sep.probuf.NewsProtos.PPostStore request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新帖子内容
     * </pre>
     */
    public void updatePost(com.blemobi.sep.probuf.NewsProtos.PPostStore request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新帖子标签
     * </pre>
     */
    public void updatePostTags(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST_TAGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 帖子交互
     * </pre>
     */
    public void act2Post(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACT2POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索帖子
     * </pre>
     */
    public void searchPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 关注用户
     * </pre>
     */
    public void followUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FOLLOW_USER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 好友操作
     * </pre>
     */
    public void makeFriend(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_MAKE_FRIEND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 新增帖子评论
     * </pre>
     */
    public void addComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 删除评论
     * </pre>
     */
    public void delComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_COMMENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 审核帖子
     * </pre>
     */
    public void confirmPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONFIRM_POST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 审核话题
     * </pre>
     */
    public void confirmTopic(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONFIRM_TOPIC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 搜索用户
     * </pre>
     */
    public void searchUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户超级查找，参数为json字符串，字段包括：
     * keyword 搜索关键词
     * source 来源 0手机号码 1微信 2微博 3脸书 4谷歌 5用户名
     * coid 社区ID,string类型,如"550"
     * level 用户等级
     * state 用户状态 0正常 1被封 2冻结
     * no_water true过滤水军
     * begin,end 用户注册时间起止范围,unix时间戳,秒
     * sort_nickname 以昵称拼音排序 asc升序 desc降序
     * sort_regtime 以用户注册时间排序 asc升序 desc降序（默认）
     * sort_hot 以用户热门度排序，仅支持desc降序
     * sample: `{"keyword":"xxx", "level":1, "sort_regtime":"desc"}`
     * </pre>
     */
    public void searchUserV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER_V2, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 帖子查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_title 关键词为帖子标题，分词搜索
     * keyword_community 关键词为社区名称，全词匹配
     * coid 指定社区ID搜索
     * type EPostType的int值，另外增加1个定义：-1动态帖
     * state 审核状态 0待审 1通过审核 2未通过审核 4已删除的帖子
     * cotag 所属的社区的分类，string
     * tag 帖子标签，string
     * begin, end 发布时间起止范围,unix时间戳,秒
     * sort_time 以帖子发布时间排序 asc升序 desc降序（默认）
     * sort_hot 以帖子热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchPostV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_POST_V2, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 社区查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_community 关键词为社区名称，部分匹配
     * cotag 社区分类，如："游戏"
     * begin, end 社区创建时间起止范围,unix时间戳,秒
     * sort_time 以社区创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以社区热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchCommunityV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_COMMUNITY_V2, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 话题查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword 关键词
     * state 审核状态 0待审 1通过审核 2未通过审核
     * sort_time 以话题创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以话题热门度排序，仅支持desc降序
     * </pre>
     */
    public void searchTopicV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TOPIC_V2, getCallOptions()), request, responseObserver);
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
     * 精选版块
     * </pre>
     */
    public void selectPostByCategory(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SELECT_POST_BY_CATEGORY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-添加单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public void addManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADD_MANUAL_RECOMMEND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-移除单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public void delManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DEL_MANUAL_RECOMMEND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-批量覆盖推荐
     * </pre>
     */
    public void batchManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH_MANUAL_RECOMMEND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 人工推荐-获取已推荐列表
     * </pre>
     */
    public void getManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MANUAL_RECOMMEND, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取话题详情列表
     * </pre>
     */
    public void getTopicDetail(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 从热门移除
     * </pre>
     */
    public void hotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HOT_REMOVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 判断是否在热门移除里面
     * </pre>
     */
    public void isInHotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IS_IN_HOT_REMOVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户来源
     * </pre>
     */
    public void getUserSource(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_SOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取推荐的社区
     * </pre>
     */
    public void getRecommendCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户访问了社区
     * </pre>
     */
    public void visitCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VISIT_COMMUNITY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 用户访问了个人主页
     * </pre>
     */
    public void visitHomePage(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VISIT_HOME_PAGE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 设置发现页面的参数
     * </pre>
     */
    public void setDiscoverParams(com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SET_DISCOVER_PARAMS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取发现页面的参数
     * </pre>
     */
    public void getDiscoverParams(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DISCOVER_PARAMS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户画像
     * 参数为json字符串
     * 字段包括：
     * begin, end 时间起止范围，unix时间戳，秒
     * tp 1活跃 2注册
     * </pre>
     */
    public void getPersonas(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PERSONAS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 心跳
     * </pre>
     */
    public void heartbeat(com.blemobi.sep.probuf.ResultProtos.PStringList request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEARTBEAT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取帖子参与的话题（供java调用,注：返回的话题是不带#号的）
     * </pre>
     */
    public void getTopicOfPost(com.blemobi.sep.probuf.ResultProtos.PStringSingle request,
        io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC_OF_POST, getCallOptions()), request, responseObserver);
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
     * 使缓存失效
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty expireCache(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EXPIRE_CACHE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户注册
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addUser(com.blemobi.sep.probuf.AccountProtos.PUser request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_USER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新用户
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty updateUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_USER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 记录登录日志
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty recordLogin(com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RECORD_LOGIN, getCallOptions(), request);
    }

    /**
     * <pre>
     * 增加社区
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新社区
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty updateCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 加入(离开)社区
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty joinCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_JOIN_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索社区
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList searchCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 新增帖子
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addPost(com.blemobi.sep.probuf.NewsProtos.PPostStore request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新帖子内容
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty updatePost(com.blemobi.sep.probuf.NewsProtos.PPostStore request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新帖子标签
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty updatePostTags(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_POST_TAGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 帖子交互
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty act2Post(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACT2POST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索帖子
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList searchPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 关注用户
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty followUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FOLLOW_USER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 好友操作
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty makeFriend(com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_MAKE_FRIEND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 新增帖子评论
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_COMMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 删除评论
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty delComment(com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_COMMENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 审核帖子
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty confirmPost(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONFIRM_POST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 审核话题
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty confirmTopic(com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONFIRM_TOPIC, getCallOptions(), request);
    }

    /**
     * <pre>
     * 搜索用户
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList searchUser(com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_USER, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户超级查找，参数为json字符串，字段包括：
     * keyword 搜索关键词
     * source 来源 0手机号码 1微信 2微博 3脸书 4谷歌 5用户名
     * coid 社区ID,string类型,如"550"
     * level 用户等级
     * state 用户状态 0正常 1被封 2冻结
     * no_water true过滤水军
     * begin,end 用户注册时间起止范围,unix时间戳,秒
     * sort_nickname 以昵称拼音排序 asc升序 desc降序
     * sort_regtime 以用户注册时间排序 asc升序 desc降序（默认）
     * sort_hot 以用户热门度排序，仅支持desc降序
     * sample: `{"keyword":"xxx", "level":1, "sort_regtime":"desc"}`
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult searchUserV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_USER_V2, getCallOptions(), request);
    }

    /**
     * <pre>
     * 帖子查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_title 关键词为帖子标题，分词搜索
     * keyword_community 关键词为社区名称，全词匹配
     * coid 指定社区ID搜索
     * type EPostType的int值，另外增加1个定义：-1动态帖
     * state 审核状态 0待审 1通过审核 2未通过审核 4已删除的帖子
     * cotag 所属的社区的分类，string
     * tag 帖子标签，string
     * begin, end 发布时间起止范围,unix时间戳,秒
     * sort_time 以帖子发布时间排序 asc升序 desc降序（默认）
     * sort_hot 以帖子热门度排序，仅支持desc降序
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult searchPostV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_POST_V2, getCallOptions(), request);
    }

    /**
     * <pre>
     * 社区查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_community 关键词为社区名称，部分匹配
     * cotag 社区分类，如："游戏"
     * begin, end 社区创建时间起止范围,unix时间戳,秒
     * sort_time 以社区创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以社区热门度排序，仅支持desc降序
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult searchCommunityV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_COMMUNITY_V2, getCallOptions(), request);
    }

    /**
     * <pre>
     * 话题查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword 关键词
     * state 审核状态 0待审 1通过审核 2未通过审核
     * sort_time 以话题创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以话题热门度排序，仅支持desc降序
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult searchTopicV2(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_TOPIC_V2, getCallOptions(), request);
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
     * 精选版块
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList selectPostByCategory(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SELECT_POST_BY_CATEGORY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工推荐-添加单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty addManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADD_MANUAL_RECOMMEND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工推荐-移除单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty delManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DEL_MANUAL_RECOMMEND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工推荐-批量覆盖推荐
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty batchManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH_MANUAL_RECOMMEND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 人工推荐-获取已推荐列表
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend getManualRecommend(com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MANUAL_RECOMMEND, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取话题详情列表
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList getTopicDetail(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOPIC_DETAIL, getCallOptions(), request);
    }

    /**
     * <pre>
     * 从热门移除
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty hotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HOT_REMOVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 判断是否在热门移除里面
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PBoolList isInHotRemove(com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IS_IN_HOT_REMOVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户来源
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PInt32List getUserSource(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_SOURCE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取推荐的社区
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getRecommendCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_RECOMMEND_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户访问了社区
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty visitCommunity(com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VISIT_COMMUNITY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 用户访问了个人主页
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty visitHomePage(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VISIT_HOME_PAGE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 设置发现页面的参数
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty setDiscoverParams(com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SET_DISCOVER_PARAMS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取发现页面的参数
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams getDiscoverParams(com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DISCOVER_PARAMS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户画像
     * 参数为json字符串
     * 字段包括：
     * begin, end 时间起止范围，unix时间戳，秒
     * tp 1活跃 2注册
     * </pre>
     */
    public com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas getPersonas(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PERSONAS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 心跳
     * </pre>
     */
    public com.blemobi.sep.probuf.CommonApiProtos.PEmpty heartbeat(com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEARTBEAT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取帖子参与的话题（供java调用,注：返回的话题是不带#号的）
     * </pre>
     */
    public com.blemobi.sep.probuf.ResultProtos.PStringList getTopicOfPost(com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TOPIC_OF_POST, getCallOptions(), request);
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
     * 使缓存失效
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> expireCache(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXPIRE_CACHE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addUser(
        com.blemobi.sep.probuf.AccountProtos.PUser request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_USER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> updateUser(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 记录登录日志
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> recordLogin(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RECORD_LOGIN, getCallOptions()), request);
    }

    /**
     * <pre>
     * 增加社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> updateCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 加入(离开)社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> joinCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOIN_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> searchCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 新增帖子
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addPost(
        com.blemobi.sep.probuf.NewsProtos.PPostStore request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新帖子内容
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> updatePost(
        com.blemobi.sep.probuf.NewsProtos.PPostStore request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新帖子标签
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> updatePostTags(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_POST_TAGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 帖子交互
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> act2Post(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACT2POST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索帖子
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> searchPost(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 关注用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> followUser(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FOLLOW_USER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 好友操作
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> makeFriend(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_MAKE_FRIEND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 新增帖子评论
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addComment(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_COMMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 删除评论
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> delComment(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_COMMENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 审核帖子
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> confirmPost(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONFIRM_POST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 审核话题
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> confirmTopic(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONFIRM_TOPIC, getCallOptions()), request);
    }

    /**
     * <pre>
     * 搜索用户
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> searchUser(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户超级查找，参数为json字符串，字段包括：
     * keyword 搜索关键词
     * source 来源 0手机号码 1微信 2微博 3脸书 4谷歌 5用户名
     * coid 社区ID,string类型,如"550"
     * level 用户等级
     * state 用户状态 0正常 1被封 2冻结
     * no_water true过滤水军
     * begin,end 用户注册时间起止范围,unix时间戳,秒
     * sort_nickname 以昵称拼音排序 asc升序 desc降序
     * sort_regtime 以用户注册时间排序 asc升序 desc降序（默认）
     * sort_hot 以用户热门度排序，仅支持desc降序
     * sample: `{"keyword":"xxx", "level":1, "sort_regtime":"desc"}`
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> searchUserV2(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_USER_V2, getCallOptions()), request);
    }

    /**
     * <pre>
     * 帖子查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_title 关键词为帖子标题，分词搜索
     * keyword_community 关键词为社区名称，全词匹配
     * coid 指定社区ID搜索
     * type EPostType的int值，另外增加1个定义：-1动态帖
     * state 审核状态 0待审 1通过审核 2未通过审核 4已删除的帖子
     * cotag 所属的社区的分类，string
     * tag 帖子标签，string
     * begin, end 发布时间起止范围,unix时间戳,秒
     * sort_time 以帖子发布时间排序 asc升序 desc降序（默认）
     * sort_hot 以帖子热门度排序，仅支持desc降序
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> searchPostV2(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_POST_V2, getCallOptions()), request);
    }

    /**
     * <pre>
     * 社区查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword_nickname 关键词为昵称，全词匹配
     * keyword_community 关键词为社区名称，部分匹配
     * cotag 社区分类，如："游戏"
     * begin, end 社区创建时间起止范围,unix时间戳,秒
     * sort_time 以社区创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以社区热门度排序，仅支持desc降序
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> searchCommunityV2(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_COMMUNITY_V2, getCallOptions()), request);
    }

    /**
     * <pre>
     * 话题查找，结果以时间倒序排序，参数为json字符串，字段包括：
     * keyword 关键词
     * state 审核状态 0待审 1通过审核 2未通过审核
     * sort_time 以话题创建时间排序 asc升序 desc降序（默认）
     * sort_hot 以话题热门度排序，仅支持desc降序
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult> searchTopicV2(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_TOPIC_V2, getCallOptions()), request);
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
     * 精选版块
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> selectPostByCategory(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SELECT_POST_BY_CATEGORY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 人工推荐-添加单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> addManualRecommend(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADD_MANUAL_RECOMMEND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 人工推荐-移除单个用户/社区/话题/资讯/动态/精选
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> delManualRecommend(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DEL_MANUAL_RECOMMEND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 人工推荐-批量覆盖推荐
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> batchManualRecommend(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH_MANUAL_RECOMMEND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 人工推荐-获取已推荐列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend> getManualRecommend(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MANUAL_RECOMMEND, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取话题详情列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList> getTopicDetail(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC_DETAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     * 从热门移除
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> hotRemove(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HOT_REMOVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 判断是否在热门移除里面
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PBoolList> isInHotRemove(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IS_IN_HOT_REMOVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户来源
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PInt32List> getUserSource(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_SOURCE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取推荐的社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getRecommendCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_RECOMMEND_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户访问了社区
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> visitCommunity(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VISIT_COMMUNITY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 用户访问了个人主页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> visitHomePage(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VISIT_HOME_PAGE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 设置发现页面的参数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> setDiscoverParams(
        com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SET_DISCOVER_PARAMS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取发现页面的参数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams> getDiscoverParams(
        com.blemobi.sep.probuf.CommonApiProtos.PEmpty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DISCOVER_PARAMS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户画像
     * 参数为json字符串
     * 字段包括：
     * begin, end 时间起止范围，unix时间戳，秒
     * tp 1活跃 2注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas> getPersonas(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PERSONAS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 心跳
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.CommonApiProtos.PEmpty> heartbeat(
        com.blemobi.sep.probuf.ResultProtos.PStringList request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEARTBEAT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取帖子参与的话题（供java调用,注：返回的话题是不带#号的）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.blemobi.sep.probuf.ResultProtos.PStringList> getTopicOfPost(
        com.blemobi.sep.probuf.ResultProtos.PStringSingle request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TOPIC_OF_POST, getCallOptions()), request);
    }
  }

  private static final int METHODID_EXPIRE_CACHE = 0;
  private static final int METHODID_ADD_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_RECORD_LOGIN = 3;
  private static final int METHODID_ADD_COMMUNITY = 4;
  private static final int METHODID_UPDATE_COMMUNITY = 5;
  private static final int METHODID_JOIN_COMMUNITY = 6;
  private static final int METHODID_SEARCH_COMMUNITY = 7;
  private static final int METHODID_ADD_POST = 8;
  private static final int METHODID_UPDATE_POST = 9;
  private static final int METHODID_UPDATE_POST_TAGS = 10;
  private static final int METHODID_ACT2POST = 11;
  private static final int METHODID_SEARCH_POST = 12;
  private static final int METHODID_FOLLOW_USER = 13;
  private static final int METHODID_MAKE_FRIEND = 14;
  private static final int METHODID_ADD_COMMENT = 15;
  private static final int METHODID_DEL_COMMENT = 16;
  private static final int METHODID_CONFIRM_POST = 17;
  private static final int METHODID_CONFIRM_TOPIC = 18;
  private static final int METHODID_SEARCH_USER = 19;
  private static final int METHODID_SEARCH_USER_V2 = 20;
  private static final int METHODID_SEARCH_POST_V2 = 21;
  private static final int METHODID_SEARCH_COMMUNITY_V2 = 22;
  private static final int METHODID_SEARCH_TOPIC_V2 = 23;
  private static final int METHODID_SELECT_FANS = 24;
  private static final int METHODID_SELECT_FANS_WITH_SOURCE = 25;
  private static final int METHODID_MORE_FANS_WITH_SOURCE = 26;
  private static final int METHODID_SAVE_FANS = 27;
  private static final int METHODID_SCROLL_MORE = 28;
  private static final int METHODID_SELECT_VUSER = 29;
  private static final int METHODID_SELECT_TODAY_BIRTHDAY_FANS = 30;
  private static final int METHODID_SELECT7DAY_BIRTHDAY_FANS = 31;
  private static final int METHODID_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS = 32;
  private static final int METHODID_SELECT_POST_BY_CATEGORY = 33;
  private static final int METHODID_ADD_MANUAL_RECOMMEND = 34;
  private static final int METHODID_DEL_MANUAL_RECOMMEND = 35;
  private static final int METHODID_BATCH_MANUAL_RECOMMEND = 36;
  private static final int METHODID_GET_MANUAL_RECOMMEND = 37;
  private static final int METHODID_GET_TOPIC_DETAIL = 38;
  private static final int METHODID_HOT_REMOVE = 39;
  private static final int METHODID_IS_IN_HOT_REMOVE = 40;
  private static final int METHODID_GET_USER_SOURCE = 41;
  private static final int METHODID_GET_RECOMMEND_COMMUNITY = 42;
  private static final int METHODID_VISIT_COMMUNITY = 43;
  private static final int METHODID_VISIT_HOME_PAGE = 44;
  private static final int METHODID_SET_DISCOVER_PARAMS = 45;
  private static final int METHODID_GET_DISCOVER_PARAMS = 46;
  private static final int METHODID_GET_PERSONAS = 47;
  private static final int METHODID_HEARTBEAT = 48;
  private static final int METHODID_GET_TOPIC_OF_POST = 49;

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
        case METHODID_EXPIRE_CACHE:
          serviceImpl.expireCache((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.blemobi.sep.probuf.AccountProtos.PUser) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_RECORD_LOGIN:
          serviceImpl.recordLogin((com.blemobi.sep.probuf.DatapublishingApiProtos.PLoginRecord) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_ADD_COMMUNITY:
          serviceImpl.addCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_UPDATE_COMMUNITY:
          serviceImpl.updateCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PJsonParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_JOIN_COMMUNITY:
          serviceImpl.joinCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SEARCH_COMMUNITY:
          serviceImpl.searchCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_ADD_POST:
          serviceImpl.addPost((com.blemobi.sep.probuf.NewsProtos.PPostStore) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_UPDATE_POST:
          serviceImpl.updatePost((com.blemobi.sep.probuf.NewsProtos.PPostStore) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_UPDATE_POST_TAGS:
          serviceImpl.updatePostTags((com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_ACT2POST:
          serviceImpl.act2Post((com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SEARCH_POST:
          serviceImpl.searchPost((com.blemobi.sep.probuf.DatapublishingApiProtos.PSearchPostParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_FOLLOW_USER:
          serviceImpl.followUser((com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_MAKE_FRIEND:
          serviceImpl.makeFriend((com.blemobi.sep.probuf.DatapublishingApiProtos.PEsActionMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_ADD_COMMENT:
          serviceImpl.addComment((com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_DEL_COMMENT:
          serviceImpl.delComment((com.blemobi.sep.probuf.DatapublishingApiProtos.PCommentMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_CONFIRM_POST:
          serviceImpl.confirmPost((com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_CONFIRM_TOPIC:
          serviceImpl.confirmTopic((com.blemobi.sep.probuf.DatapublishingApiProtos.PConfirmMsg) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SEARCH_USER:
          serviceImpl.searchUser((com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_SEARCH_USER_V2:
          serviceImpl.searchUserV2((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SEARCH_POST_V2:
          serviceImpl.searchPostV2((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SEARCH_COMMUNITY_V2:
          serviceImpl.searchCommunityV2((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
        case METHODID_SEARCH_TOPIC_V2:
          serviceImpl.searchTopicV2((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult>) responseObserver);
          break;
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
        case METHODID_SELECT_POST_BY_CATEGORY:
          serviceImpl.selectPostByCategory((com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_ADD_MANUAL_RECOMMEND:
          serviceImpl.addManualRecommend((com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_DEL_MANUAL_RECOMMEND:
          serviceImpl.delManualRecommend((com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_BATCH_MANUAL_RECOMMEND:
          serviceImpl.batchManualRecommend((com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_MANUAL_RECOMMEND:
          serviceImpl.getManualRecommend((com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PManualRecommend>) responseObserver);
          break;
        case METHODID_GET_TOPIC_DETAIL:
          serviceImpl.getTopicDetail((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PTopicDetailList>) responseObserver);
          break;
        case METHODID_HOT_REMOVE:
          serviceImpl.hotRemove((com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_IS_IN_HOT_REMOVE:
          serviceImpl.isInHotRemove((com.blemobi.sep.probuf.DatapublishingApiProtos.PHotRemove) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PBoolList>) responseObserver);
          break;
        case METHODID_GET_USER_SOURCE:
          serviceImpl.getUserSource((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PInt32List>) responseObserver);
          break;
        case METHODID_GET_RECOMMEND_COMMUNITY:
          serviceImpl.getRecommendCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PCustomPageParam) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.ResultProtos.PStringList>) responseObserver);
          break;
        case METHODID_VISIT_COMMUNITY:
          serviceImpl.visitCommunity((com.blemobi.sep.probuf.DatapublishingApiProtos.PVisitCommunity) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_VISIT_HOME_PAGE:
          serviceImpl.visitHomePage((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_SET_DISCOVER_PARAMS:
          serviceImpl.setDiscoverParams((com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_DISCOVER_PARAMS:
          serviceImpl.getDiscoverParams((com.blemobi.sep.probuf.CommonApiProtos.PEmpty) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PDiscoverParams>) responseObserver);
          break;
        case METHODID_GET_PERSONAS:
          serviceImpl.getPersonas((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.DatapublishingApiProtos.PPersonas>) responseObserver);
          break;
        case METHODID_HEARTBEAT:
          serviceImpl.heartbeat((com.blemobi.sep.probuf.ResultProtos.PStringList) request,
              (io.grpc.stub.StreamObserver<com.blemobi.sep.probuf.CommonApiProtos.PEmpty>) responseObserver);
          break;
        case METHODID_GET_TOPIC_OF_POST:
          serviceImpl.getTopicOfPost((com.blemobi.sep.probuf.ResultProtos.PStringSingle) request,
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
        METHOD_EXPIRE_CACHE,
        METHOD_ADD_USER,
        METHOD_UPDATE_USER,
        METHOD_RECORD_LOGIN,
        METHOD_ADD_COMMUNITY,
        METHOD_UPDATE_COMMUNITY,
        METHOD_JOIN_COMMUNITY,
        METHOD_SEARCH_COMMUNITY,
        METHOD_ADD_POST,
        METHOD_UPDATE_POST,
        METHOD_UPDATE_POST_TAGS,
        METHOD_ACT2POST,
        METHOD_SEARCH_POST,
        METHOD_FOLLOW_USER,
        METHOD_MAKE_FRIEND,
        METHOD_ADD_COMMENT,
        METHOD_DEL_COMMENT,
        METHOD_CONFIRM_POST,
        METHOD_CONFIRM_TOPIC,
        METHOD_SEARCH_USER,
        METHOD_SEARCH_USER_V2,
        METHOD_SEARCH_POST_V2,
        METHOD_SEARCH_COMMUNITY_V2,
        METHOD_SEARCH_TOPIC_V2,
        METHOD_SELECT_FANS,
        METHOD_SELECT_FANS_WITH_SOURCE,
        METHOD_MORE_FANS_WITH_SOURCE,
        METHOD_SAVE_FANS,
        METHOD_SCROLL_MORE,
        METHOD_SELECT_VUSER,
        METHOD_SELECT_TODAY_BIRTHDAY_FANS,
        METHOD_SELECT7DAY_BIRTHDAY_FANS,
        METHOD_SELECT_VUSER_HAVE_TODAY_BIRTHDAY_FANS,
        METHOD_SELECT_POST_BY_CATEGORY,
        METHOD_ADD_MANUAL_RECOMMEND,
        METHOD_DEL_MANUAL_RECOMMEND,
        METHOD_BATCH_MANUAL_RECOMMEND,
        METHOD_GET_MANUAL_RECOMMEND,
        METHOD_GET_TOPIC_DETAIL,
        METHOD_HOT_REMOVE,
        METHOD_IS_IN_HOT_REMOVE,
        METHOD_GET_USER_SOURCE,
        METHOD_GET_RECOMMEND_COMMUNITY,
        METHOD_VISIT_COMMUNITY,
        METHOD_VISIT_HOME_PAGE,
        METHOD_SET_DISCOVER_PARAMS,
        METHOD_GET_DISCOVER_PARAMS,
        METHOD_GET_PERSONAS,
        METHOD_HEARTBEAT,
        METHOD_GET_TOPIC_OF_POST);
  }

}
