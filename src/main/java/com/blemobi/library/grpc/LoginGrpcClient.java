package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.IGrpcLoginGrpc;
import com.blemobi.sep.grpc.IGrpcLoginGrpc.IGrpcLoginBlockingStub;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class LoginGrpcClient extends BaseGRPCClient {

	public LoginGrpcClient() {
		super("login");
	}

	public PInt32List checkMsgIds(PTaskMsgs request) {
		PInt32List list = this.execute(request, new GrpcCallback<PInt32List>() {
			@Override
			public PInt32List doGrpcRequest() {
				IGrpcLoginBlockingStub stub = IGrpcLoginGrpc.newBlockingStub(channel);
				return stub.checkMsgIds(request);
			}
		});
		return list;
	}
}