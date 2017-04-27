/******************************************************************
 *
 *    Package:     com.blemobi.library.grpc_v1
 *
 *    Filename:    GRPCExpTools.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月27日 上午11:38:18
 *
 *    Revision:
 *
 *    2017年4月27日 上午11:38:18
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1;

import com.blemobi.library.exception.BaseException;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;

/**
 * @ClassName GRPCExpTools
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月27日 上午11:38:18
 * @version 1.0.0
 */
public final class GRPCExpTools {
	public static void doException(StreamObserver<?> ob, Throwable t){
		if (t instanceof BaseException) {
			BaseException ex = (BaseException) t;
			ob.onError(Status.INTERNAL.withCause(ex).asRuntimeException());
		} else {
			ob.onError(Status.INTERNAL.asRuntimeException());
		}
	}
}
