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

import lombok.extern.log4j.Log4j;

/**
 * @ClassName DefaultAuthProvider
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月24日 下午8:03:10
 * @version 1.0.0
 */
@Log4j
public class DefaultAuthProvider implements AuthProvider {

	/* (非 Javadoc)
	 * Description:
	 * @see com.microservice.grpc.support.auth.AuthProvider#auth(java.lang.String)
	 */
	@Override
	public Boolean auth(String from) {
		log.debug("默认鉴权通过");
		return true;
	}

}
