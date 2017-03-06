/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.grpc
 *
 *    Filename:    SaveFansGRPCClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月4日 下午4:13:12
 *
 *    Revision:
 *
 *    2017年3月4日 下午4:13:12
 *
 *****************************************************************/
package com.blemobi.library.grpc;

import java.util.List;

import com.blemobi.sep.grpc.grpcDataPublishingGrpc;
import com.blemobi.sep.grpc.grpcDataPublishingGrpc.grpcDataPublishingBlockingStub;
import com.blemobi.sep.probuf.DataPublishingApiProtos;
import com.blemobi.sep.probuf.DataPublishingProtos;


/**
 * @ClassName SaveFansGRPCClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月4日 下午4:13:12
 * @version 1.0.0
 */
public class SaveFansGRPCClient extends BaseGRPCClient {
    public SaveFansGRPCClient() {
        super("datapublishing");
    }

    @Override
    protected Boolean doProcess(Object... obj) {
        grpcDataPublishingBlockingStub stub = grpcDataPublishingGrpc.newBlockingStub(channel);
        DataPublishingProtos.PFansFilterParam.Builder filterBuilder = DataPublishingProtos.PFansFilterParam.newBuilder();
        filterBuilder.setGender((Integer) obj[1]);
        // builder.setNegate(value);
        filterBuilder.addAllRegion((List<String>) obj[2]);
        // builder.addSkipUuid(value);
        filterBuilder.setUuid((String) obj[3]);
        DataPublishingApiProtos.PFansSaveParam.Builder saveParam = DataPublishingApiProtos.PFansSaveParam.newBuilder();
        saveParam.setFilter(filterBuilder.build());
        saveParam.setKey(obj[0].toString());
        DataPublishingApiProtos.PFansSaveParam request = saveParam.build();
        stub.saveFans(request);
        return true;
    }
}
