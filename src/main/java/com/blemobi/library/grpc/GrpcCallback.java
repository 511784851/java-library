/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.grpc
 *
 *    Filename:    GrpcCallback.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月7日 上午11:27:07
 *
 *    Revision:
 *
 *    2017年3月7日 上午11:27:07
 *
 *****************************************************************/
package com.blemobi.library.grpc;

/**
 * @ClassName GrpcCallback
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月7日 上午11:27:07
 * @version 1.0.0
 */
public interface GrpcCallback<T> {
    public T doGrpcRequest();
}
