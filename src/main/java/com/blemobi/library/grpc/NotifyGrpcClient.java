package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.NotifyGrpc;
import com.blemobi.sep.grpc.NotifyGrpc.NotifyBlockingStub;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.NotificationApiProtos.PNotifyInternalMessageList;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class NotifyGrpcClient extends BaseGRPCClient {

	private NotifyBlockingStub stub;

	public NotifyGrpcClient() {
		super("notification");
	}

	/**
	 * 通送消息
	 * 
	 * @param PNotifyInternalMessageList
	 *            消息内容
	 * @return
	 */
	public PEmpty send(PNotifyInternalMessageList request) {
		PEmpty empty = this.execute(request, new GrpcCallback<PEmpty>() {
			@Override
			public PEmpty doGrpcRequest() {
				stub = NotifyGrpc.newBlockingStub(channel);
				return stub.send(request);
			}
		});
		return empty;
	}
}