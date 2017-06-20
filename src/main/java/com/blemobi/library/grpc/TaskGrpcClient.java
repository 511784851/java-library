package com.blemobi.library.grpc;

import com.blemobi.sep.grpc.TaskServiceGrpc;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.TaskApiProtos;

/**
 * Description:
 * User: HUNTER.POON
 * Date: 2017/6/19 15:32
 */
public class TaskGrpcClient extends BaseGRPCClient {
    private TaskServiceGrpc.TaskServiceBlockingStub stub;
    public TaskGrpcClient(){
        super("task");
    }

    public void exchangeGoods(int gold, String ordId, String uuid){
        TaskApiProtos.PGoldExchg param = TaskApiProtos.PGoldExchg.newBuilder().setGold(gold).setOrderNo(ordId).setUuid(uuid)
                .build();
        this.execute(param, new GrpcCallback<ResultProtos.PResult>() {
            @Override
            public ResultProtos.PResult doGrpcRequest() {
                stub = TaskServiceGrpc.newBlockingStub(channel);
                return stub.exchg(param);
            }
        });
    }

    public Integer getGold(String uuid){
        ResultProtos.PStringList param = ResultProtos.PStringList.newBuilder().addList(uuid).build();
        ResultProtos.PInt32List list = this.execute(param, new GrpcCallback<ResultProtos.PInt32List>() {
            @Override
            public ResultProtos.PInt32List doGrpcRequest() {
                stub = TaskServiceGrpc.newBlockingStub(channel);
                return stub.getUserGold(param);
            }
        });
        if(list != null && list.getListList() != null && !list.getListList().isEmpty()){
            return list.getList(0);
        }
        return 0;
    }
}

