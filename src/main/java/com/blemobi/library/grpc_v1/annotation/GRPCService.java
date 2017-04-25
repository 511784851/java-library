/******************************************************************
 *
 *    Package:     com.microservice.grpc.support.annotation
 *
 *    Filename:    GrpcService.java
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月17日 下午4:00:22
 *
 *    Revision:
 *
 *    2017年4月17日 下午4:00:22
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @ClassName GrpcService
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午4:00:22
 * @version 1.0.0
 */
@Retention(RUNTIME)
@Target(TYPE)
public @interface GRPCService {

}
