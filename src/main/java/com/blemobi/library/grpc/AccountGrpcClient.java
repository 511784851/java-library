package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.accountGrpc;
import com.blemobi.sep.grpc.accountGrpc.accountBlockingStub;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class AccountGrpcClient extends BaseGRPCClient {

	public AccountGrpcClient() {
		super("account");
	}

	public PInt32List checkMsgIds(PTaskMsgs request) {
		PInt32List list = this.execute(request, new GrpcCallback<PInt32List>() {
			@Override
			public PInt32List doGrpcRequest() {
				accountBlockingStub stub = accountGrpc.newBlockingStub(channel);
				return stub.checkMsgIds(request);
			}
		});
		return list;
	}
}