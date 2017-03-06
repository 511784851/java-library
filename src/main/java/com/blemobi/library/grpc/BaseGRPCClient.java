/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.client
 *
 *    Filename:    BaseGRPCClient.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月3日 下午3:26:26
 *
 *    Revision:
 *
 *    2017年3月3日 下午3:26:26
 *
 *****************************************************************/
package com.blemobi.library.grpc;

import com.blemobi.library.consul.BaseService;
import com.blemobi.library.consul.SocketInfo;

import io.grpc.ManagedChannel;
import io.grpc.netty.NegotiationType;
import io.grpc.netty.NettyChannelBuilder;
import lombok.extern.log4j.Log4j;

/**
 * @ClassName BaseGRPCClient
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月3日 下午3:26:26
 * @version 1.0.0
 */
@Log4j
public abstract class BaseGRPCClient {
    private String serverName; //服务名
    protected ManagedChannel channel = null;
    protected BaseGRPCClient(String serverName) {
        this.serverName = serverName;
    }
    
    private void initial(){
        SocketInfo info = getSocketInfo();
        log.info("HOST:[" + info.getIpAddr() + "] PORT:[" + info.getPort() + "]");
        channel = NettyChannelBuilder.forAddress(info.getIpAddr(), info.getPort()).negotiationType(NegotiationType.PLAINTEXT).build();
    }
    
    public <T> T doExec(Object... obj){
        try{
            initial();
            return doProcess(obj);
        }catch(RuntimeException ex){
            log.error("调用GRPC出现异常", ex);
            throw ex;
        }finally {
            destroy();
        }
        
    }
    
    protected abstract <T> T doProcess(Object... obj);
    
    private void destroy(){
        if(channel != null){
            channel.shutdownNow();
        }
    }

    
    protected SocketInfo getSocketInfo(){
        return BaseService.getActiveServer(serverName);
    }
    
}
