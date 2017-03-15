/******************************************************************
 *
 *    
 *    Package:     com.microservice.consul
 *
 *    Filename:    ServiceInfo.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月10日 下午12:52:21
 *
 *    Revision:
 *
 *    2017年3月10日 下午12:52:21
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @ClassName ServiceInfo
 * @Description 服务信息
 * @author HUNTER.POON
 * @Date 2017年3月10日 下午12:52:21
 * @version 1.0.0
 */
@Getter
@AllArgsConstructor
@ToString
public class ServiceInfo {
    private String nm;
    private String id;
    private String addr;
    private Integer port;
}
