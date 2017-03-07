package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.IGrpcRobotGrpc;
import com.blemobi.sep.grpc.grpcDataPublishingGrpc;
import com.blemobi.sep.grpc.IGrpcRobotGrpc.IGrpcRobotBlockingStub;
import com.blemobi.sep.probuf.CommonApiProtos.PEmpty;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;
import com.blemobi.sep.probuf.RobotApiProtos.PPayOrderParma;
import com.blemobi.sep.probuf.RobotApiProtos.PRobotNotifyMsgList;

/**
 * 只能机器人gRPC clint
 * 
 * @author zhaoyong
 *
 */
public class RobotGrpcClient extends BaseGRPCClient {

	private IGrpcRobotBlockingStub stub;

	public RobotGrpcClient() {
		super("robot");
	}

	/**
	 * 获得业务订单号
	 * 
	 * @param payOrderParma
	 *            订单参数
	 * @return
	 */
	public PStringSingle generateOrder(PPayOrderParma request) {
		PStringSingle stringSingle = this.execute(request, new GrpcCallback<PStringSingle>() {
			@Override
			public PStringSingle doGrpcRequest() {
				stub = IGrpcRobotGrpc.newBlockingStub(channel);
				return stub.grpcGenerateOrder(request);
			}
		});
		return stringSingle;
	}

	/**
	 * 通送消息
	 * 
	 * @param robotNotifyMsgList
	 *            消息内容
	 * @return
	 */
	public PEmpty push(PRobotNotifyMsgList request) {
		PEmpty empty = this.execute(request, new GrpcCallback<PEmpty>() {
			@Override
			public PEmpty doGrpcRequest() {
				stub = IGrpcRobotGrpc.newBlockingStub(channel);
				return stub.grpcPush(request);
			}
		});
		return empty;
	}
}