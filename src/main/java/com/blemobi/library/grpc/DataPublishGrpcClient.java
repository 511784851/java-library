/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.grpc
 *
 *    Filename:    DataPublishGrpcClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月7日 上午11:32:39
 *
 *    Revision:
 *
 *    2017年3月7日 上午11:32:39
 *
 *****************************************************************/
package com.blemobi.library.grpc;

import java.util.ArrayList;
import java.util.List;

import com.blemobi.sep.grpc.grpcDataPublishingGrpc;
import com.blemobi.sep.grpc.grpcDataPublishingGrpc.grpcDataPublishingBlockingStub;
import com.blemobi.sep.probuf.DataPublishingApiProtos;
import com.blemobi.sep.probuf.DataPublishingProtos;
import com.blemobi.sep.probuf.ResultProtos;

/**
 * @ClassName DataPublishGrpcClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月7日 上午11:32:39
 * @version 1.0.0
 */
public class DataPublishGrpcClient extends BaseGRPCClient {

    public DataPublishGrpcClient() {
        super("datapublishing", "payment");
    }

    /**
     * @Description 保存粉丝
     * @author HUNTER.POON
     * @param pKey 保存时使用的主键
     * @param gender 性别
     * @param region 地区
     * @param uuid 哪个的粉丝
     * @return 
     */
    public Boolean saveFans(String pKey, Integer gender, List<String> region, String uuid) {
        DataPublishingProtos.PFansFilterParam.Builder filterBuilder = DataPublishingProtos.PFansFilterParam
                .newBuilder();
        filterBuilder.setGender(gender);
        filterBuilder.addAllRegion(region);
        filterBuilder.setUuid(uuid);
        DataPublishingApiProtos.PFansSaveParam.Builder saveParam = DataPublishingApiProtos.PFansSaveParam.newBuilder();
        saveParam.setFilter(filterBuilder.build());
        saveParam.setKey(pKey);
        DataPublishingApiProtos.PFansSaveParam request = saveParam.build();
        this.execute(request, new GrpcCallback<Boolean>() {
            @Override
            public Boolean doGrpcRequest() {
                grpcDataPublishingBlockingStub stub = grpcDataPublishingGrpc.newBlockingStub(channel);
                stub.saveFans(request);
                return true;
            }
        });
        return true;
    }

    /**
     * @Description 获取粉丝 
     * @author HUNTER.POON
     * @param gender 性别
     * @param region 地区
     * @param uuid 谁的粉丝
     * @return
     */
    public List<String> getFansByFilters(Integer gender, List<String> region, String uuid) {
        List<String> list = new ArrayList<String>();
        DataPublishingProtos.PFansFilterParam.Builder builder = DataPublishingProtos.PFansFilterParam.newBuilder();
        builder.setGender(gender);
        builder.addAllRegion(region);
        builder.setUuid(uuid);
        DataPublishingProtos.PFansFilterParam request = builder.build();

        list = this.execute(request, new GrpcCallback<List<String>>() {

            @Override
            public List<String> doGrpcRequest() {
                List<String> innerList = new ArrayList<String>();
                grpcDataPublishingBlockingStub stub = grpcDataPublishingGrpc.newBlockingStub(channel);
                DataPublishingApiProtos.PScrollResult result = stub.selectFans(request);
                while (true) {
                    String cursor = result.getCursor();
                    List<String> idList = result.getIdList();
                    if (idList == null || idList.isEmpty()) {
                        break;
                    }
                    ResultProtos.PStringSingle single = ResultProtos.PStringSingle.newBuilder().setVal(cursor).build();
                    result = stub.scrollMore(single);
                    innerList.addAll(idList);
                }
                return innerList;
            }

        });
        return list;
    }
}
