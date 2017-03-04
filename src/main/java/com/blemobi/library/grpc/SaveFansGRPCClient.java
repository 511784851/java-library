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

import com.blemobi.sep.probuf.DataPublishingProtos;

import bbproto.DatapublishingInside;
import bbproto.grpcDataPublishingGrpc;
import bbproto.grpcDataPublishingGrpc.grpcDataPublishingBlockingStub;

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
        filterBuilder.setGender((Integer) obj[0]);
        // builder.setNegate(value);
        filterBuilder.addAllRegion((List<String>) obj[1]);
        // builder.addSkipUuid(value);
        filterBuilder.setUuid((String) obj[2]);
        DatapublishingInside.PFansSaveParam.Builder saveParam = DatapublishingInside.PFansSaveParam.newBuilder();
        saveParam.setFilter(filterBuilder.build());
        DatapublishingInside.PFansSaveParam request = saveParam.build();
        stub.saveFans(request);
        return true;
    }
}
