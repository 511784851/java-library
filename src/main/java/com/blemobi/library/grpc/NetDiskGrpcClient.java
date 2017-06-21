package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.NetDiskServiceGrpc;
import com.blemobi.sep.grpc.NetDiskServiceGrpc.NetDiskServiceBlockingStub;
import com.blemobi.sep.probuf.ResultProtos.PInt32List;
import com.blemobi.sep.probuf.TaskApiProtos.PTaskMsgs;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class NetDiskGrpcClient extends BaseGRPCClient {

	public NetDiskGrpcClient() {
		super("netdisk");
	}

	public PInt32List checkMsgIds(PTaskMsgs request) {
		PInt32List list = this.execute(request, new GrpcCallback<PInt32List>() {
			@Override
			public PInt32List doGrpcRequest() {
				NetDiskServiceBlockingStub stub = NetDiskServiceGrpc.newBlockingStub(channel);
				return stub.checkMsgIds(request);
			}
		});
		return list;
	}
}