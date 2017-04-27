/******************************************************************
 *
 *    Package:     com.blemobi.library.grpc_v1
 *
 *    Filename:    ConsulGRPC.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月27日 下午12:16:43
 *
 *    Revision:
 *
 *    2017年4月27日 下午12:16:43
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1;

import java.util.HashMap;
import java.util.Map;

import com.blemobi.library.consul_v1.ConsulServiceMgr;
import com.blemobi.library.consul_v1.ServiceInfo;
import com.blemobi.library.grpc_v1.interceptor.AuthClientInterceptor;
import com.blemobi.library.jetty.JettyServer;

import io.grpc.ClientInterceptor;

/**
 * @ClassName ConsulGRPC
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月27日 下午12:16:43
 * @version 1.0.0
 */
public class ConsulGRPC extends ConsulGRPCBase {
	public ConsulGRPC(){}
	public ConsulGRPC(String remoteSN) {
		super(remoteSN,  new AuthClientInterceptor());
	}
	@Override
	public void initialChannelHostAndPort() {
		ServiceInfo info = ConsulServiceMgr.getHealthlyGRPCServiceByNm(remoteSN);
		this.host = info.getAddr();
		this.port = info.getPort();
		info = ConsulServiceMgr.getHealthlyServiceByNm(JettyServer.getServerName());
		this.from = info.getNm() + "," + info.getAddr();
	}

	/* (非 Javadoc)
	 * Description:
	 * @see com.blemobi.library.grpc_v1.ClientGRPCBase#initialInterceptors()
	 */
	@Override
	protected void initialInterceptors() {
		if(interceptors != null){
			for(ClientInterceptor interceptor : interceptors){
				if(interceptor instanceof AuthClientInterceptor){
					AuthClientInterceptor auth = (AuthClientInterceptor)interceptor;
					Map<String, String> authMap = new HashMap<String, String>();
					authMap.put(GRPCConstants.HEAD_REQUEST_KEY, this.getFrom());
					auth.setHeader(authMap);
				}
			}
		}
	}

}
