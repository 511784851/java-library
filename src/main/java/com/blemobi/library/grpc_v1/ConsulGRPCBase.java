/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    ConsulGRPCBase.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月17日 下午5:55:57
 *
 *    Revision:
 *
 *    2017年4月17日 下午5:55:57
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1;

import io.grpc.ClientInterceptor;

/**
 * @ClassName ConsulGRPCBase
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午5:55:57
 * @version 1.0.0
 */

public abstract class ConsulGRPCBase extends ClientGRPCBase {
	public ConsulGRPCBase(){}
	public ConsulGRPCBase(String remoteSN, ClientInterceptor... interceptors) {
		super(remoteSN, interceptors);
		initialChannelHostAndPort();
	}
	
	public abstract void initialChannelHostAndPort();
}
