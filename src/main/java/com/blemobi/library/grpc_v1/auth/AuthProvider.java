/******************************************************************
 *
 *    Package:     com.microservice.grpc.support.auth
 *
 *    Filename:    AuthProvider.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月24日 下午8:00:10
 *
 *    Revision:
 *
 *    2017年4月24日 下午8:00:10
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1.auth;

/**
 * @ClassName AuthProvider
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月24日 下午8:00:10
 * @version 1.0.0
 */
public interface AuthProvider {
	public Boolean auth(String from);
}
