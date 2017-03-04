/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.client
 *
 *    Filename:    DataPublishGRPCClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月3日 上午11:15:19
 *
 *    Revision:
 *
 *    2017年3月3日 上午11:15:19
 *
 *****************************************************************/
package com.blemobi.library.client;

import java.util.ArrayList;
import java.util.List;

import com.blemobi.sep.probuf.DataPublishingProtos;
import com.blemobi.sep.probuf.ResultProtos;

import bbproto.DatapublishingInside;
import bbproto.grpcDataPublishingGrpc;
import bbproto.grpcDataPublishingGrpc.grpcDataPublishingBlockingStub;

/**
 * @ClassName DataPublishGRPCClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月3日 上午11:15:19
 * @version 1.0.0
 */
public class SelectFansGRPCClient extends BaseGRPCClient {

    protected SelectFansGRPCClient() {
        super("datapublishing");
    }

    @Override
    protected List<String> doProcess(Object... obj) {
        List<String> list = new ArrayList<String>();
        grpcDataPublishingBlockingStub stub = grpcDataPublishingGrpc.newBlockingStub(channel);
        DataPublishingProtos.PFansFilterParam.Builder builder = DataPublishingProtos.PFansFilterParam.newBuilder();
        builder.setGender((Integer) obj[0]);
        // builder.setNegate(value);
        builder.addAllRegion((List<String>) obj[1]);
        // builder.addSkipUuid(value);
        builder.setUuid((String) obj[2]);
        DataPublishingProtos.PFansFilterParam request = builder.build();
        DatapublishingInside.PScrollResult result = stub.selectFans(request);
        while (true) {
            String cursor = result.getCursor();
            List<String> idList = result.getIdList();
            if(idList == null || idList.isEmpty()){
                break;
            }
            ResultProtos.PStringSingle single = ResultProtos.PStringSingle.newBuilder().setVal(cursor).build();
            result = stub.scrollMore(single);
            list.addAll(idList);
        }
        return list;
    }

}
