/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.consul_v1
 *
 *    Filename:    ConsulKvChangeListener.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月14日 下午7:45:05
 *
 *    Revision:
 *
 *    2017年3月14日 下午7:45:05
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;


/**
 * @ClassName ConsulKvChangeListener
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月14日 下午7:45:05
 * @version 1.0.0
 */
public interface ConsulKvChangeListener {
    public void onKvChange(Constants.CONSUL_KV_DYNC dyncType, String value);
}
