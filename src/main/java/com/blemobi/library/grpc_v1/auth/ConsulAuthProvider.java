/******************************************************************
 *
 *    Package:     com.microservice.grpc.support.auth
 *
 *    Filename:    DefaultAuthProvider.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月24日 下午8:03:10
 *
 *    Revision:
 *
 *    2017年4月24日 下午8:03:10
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1.auth;

import java.util.List;

import com.blemobi.library.consul_v1.ConsulServiceMgr;
import com.blemobi.library.consul_v1.ServiceInfo;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName DefaultAuthProvider
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月24日 下午8:03:10
 * @version 1.0.0
 */
@Log4j
public class ConsulAuthProvider implements AuthProvider {

	@Override
	public Boolean auth(String from) {
		String[] froms = from.split(",");
		if(froms.length != 2){
			return false;
		}
		List<ServiceInfo> sList = ConsulServiceMgr.getHealthlyServicesByNm(froms[0]);
		for(ServiceInfo info : sList){
			if(info.getAddr().equals(froms[1])){
				return true;
			}
		}
		log.debug("在consul中没有找到FROM->" + from + "的服务");
		return false;
	}

}
