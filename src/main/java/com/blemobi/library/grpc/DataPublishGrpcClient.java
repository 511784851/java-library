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
import com.blemobi.sep.probuf.DataPublishingProtos;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PFansSaveParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PGroupStringList;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PQueryUserParam;
import com.blemobi.sep.probuf.DatapublishingApiProtos.PScrollResult;
import com.blemobi.sep.probuf.ResultProtos;
import com.blemobi.sep.probuf.ResultProtos.PStringList;
import com.blemobi.sep.probuf.ResultProtos.PStringSingle;

/**
 * @ClassName DataPublishGrpcClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月7日 上午11:32:39
 * @version 1.0.0
 */
public class DataPublishGrpcClient extends BaseGRPCClient {

	private grpcDataPublishingBlockingStub stub;

	public DataPublishGrpcClient() {
		super("datapublishing");
	}

	/**
	 * @Description 保存粉丝
	 * @author HUNTER.POON
	 * @param pKey
	 *            保存时使用的主键
	 * @param gender
	 *            性别
	 * @param region
	 *            地区
	 * @param uuid
	 *            哪个的粉丝
	 * @return
	 */
	public Boolean saveFans(String pKey, Integer gender, List<String> region, String uuid, String tableNm) {
		DataPublishingProtos.PFansFilterParam.Builder filterBuilder = DataPublishingProtos.PFansFilterParam
				.newBuilder();
		filterBuilder.setGender(gender);
		filterBuilder.addAllRegion(region);
		filterBuilder.setUuid(uuid);
		filterBuilder.setSkipVO(true);
		PFansSaveParam.Builder saveParam = PFansSaveParam.newBuilder();
		saveParam.setFilter(filterBuilder.build());
		saveParam.setKey(pKey);
		saveParam.setTable(tableNm);
		PFansSaveParam request = saveParam.build();
		this.execute(request, new GrpcCallback<Boolean>() {
			@Override
			public Boolean doGrpcRequest() {
				stub = grpcDataPublishingGrpc.newBlockingStub(channel);
				stub.saveFans(request);
				return true;
			}
		});
		return true;
	}

	/**
	 * 保存群红包接收用户
	 * 
	 * @param request
	 * @return
	 */
	public Boolean saveFans(PFansSaveParam request) {
		this.execute(request, new GrpcCallback<Boolean>() {
			@Override
			public Boolean doGrpcRequest() {
				stub = grpcDataPublishingGrpc.newBlockingStub(channel);
				stub.saveFans(request);
				return true;
			}
		});
		return true;
	}

	public List<String> getFansByFilters(Integer gender, List<String> region, String uuid, final Integer length){
	    List<String> list = new ArrayList<String>();
        DataPublishingProtos.PFansFilterParam.Builder builder = DataPublishingProtos.PFansFilterParam.newBuilder();
        builder.setGender(gender);
        builder.addAllRegion(region);
        builder.setUuid(uuid);
        builder.setSkipVO(true);
        DataPublishingProtos.PFansFilterParam request = builder.build();
        list = this.execute(request, new GrpcCallback<List<String>>() {
            @Override
            public List<String> doGrpcRequest() {
                stub = grpcDataPublishingGrpc.newBlockingStub(channel);
                List<String> innerList = new ArrayList<String>();
                PScrollResult result = stub.selectFansWithSource(request);
                while (true) {
                    String cursor = result.getCursor();
                    List<String> idList = result.getIdList();
                    if (idList == null || idList.isEmpty()) {
                        break;
                    }
                    /*if(expList != null && !expList.isEmpty()){
                        for(String s : idList){
                            String uid = s.split(",")[0];
                            if(expList.contains(uid)){
                                idList.remove(s);
                            }
                        }
                    }*/
                    ResultProtos.PStringSingle single = ResultProtos.PStringSingle.newBuilder().setVal(cursor).build();
                    result = stub.moreFansWithSource(single);
                    innerList.addAll(idList);
                    if(length <= innerList.size()){
                        return innerList;
                    }
                }
                return innerList;
            }

        });
        return list;
	}
	/**
	 * @Description 获取粉丝
	 * @author HUNTER.POON
	 * @param gender
	 *            性别
	 * @param region
	 *            地区
	 * @param uuid
	 *            谁的粉丝
	 * @return
	 */
	public List<String> getFansByFilters(Integer gender, List<String> region, String uuid) {
		List<String> list = new ArrayList<String>();
		DataPublishingProtos.PFansFilterParam.Builder builder = DataPublishingProtos.PFansFilterParam.newBuilder();
		builder.setGender(gender);
		builder.addAllRegion(region);
		builder.setUuid(uuid);
		builder.setSkipVO(true);
		DataPublishingProtos.PFansFilterParam request = builder.build();

		list = this.execute(request, new GrpcCallback<List<String>>() {

			@Override
			public List<String> doGrpcRequest() {
				stub = grpcDataPublishingGrpc.newBlockingStub(channel);
				List<String> innerList = new ArrayList<String>();
				PScrollResult result = stub.selectFansWithSource(request);
				while (true) {
					String cursor = result.getCursor();
					List<String> idList = result.getIdList();
					if (idList == null || idList.isEmpty()) {
						break;
					}
					ResultProtos.PStringSingle single = ResultProtos.PStringSingle.newBuilder().setVal(cursor).build();
					result = stub.moreFansWithSource(single);
					innerList.addAll(idList);
				}
				return innerList;
			}

		});
		return list;
	}

	/**
	 * 查询用户VO信息
	 * 
	 * @param request
	 * @return
	 */
	public PGroupStringList SelectVUser(PQueryUserParam request) {
		PGroupStringList groupStringList = this.execute(request, new GrpcCallback<PGroupStringList>() {
			@Override
			public PGroupStringList doGrpcRequest() {
				stub = grpcDataPublishingGrpc.newBlockingStub(channel);
				PGroupStringList groupStringList = stub.selectVUser(request);
				return groupStringList;
			}
		});
		return groupStringList;
	}

	public PStringList SearchUser(PQueryUserParam request) {
		PStringList stringList = this.execute(request, new GrpcCallback<PStringList>() {
			@Override
			public PStringList doGrpcRequest() {
				stub = grpcDataPublishingGrpc.newBlockingStub(channel);
				PStringList stringList = stub.searchUser(request);
				return stringList;
			}
		});
		return stringList;
	}
}
