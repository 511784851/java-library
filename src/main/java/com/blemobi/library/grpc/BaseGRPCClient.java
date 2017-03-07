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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.blemobi.library.consul.BaseService;
import com.blemobi.library.consul.SocketInfo;
import com.blemobi.library.grpc.interceptor.HeaderClientInterceptor;
import com.blemobi.library.jetty.JettyServer;
import com.google.protobuf.GeneratedMessage;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
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
    private ManagedChannel managedChannel;
    protected Channel channel;
    private Map<String, List<String>> headerMap = new HashMap<>();
    private String remoteServerName; //远程服务名
    protected static final String AUTH_KEY = "x-request-from";
    protected BaseGRPCClient(){
        
    }
    protected BaseGRPCClient(String remoteServerName) {
        this.remoteServerName = remoteServerName;
        List<String> hostInfo = new ArrayList<String>();
        SocketInfo info = this.getSocketInfo(JettyServer.getServerName());
        hostInfo.add(JettyServer.getServerName());
        hostInfo.add(info.getIpAddr());
        headerMap.put(AUTH_KEY, hostInfo);
    }
    protected BaseGRPCClient(String remoteServerName, Map<String, List<String>> headMap) {
        this.remoteServerName = remoteServerName;
        this.headerMap = headMap;
    }
    
    public <T> T execute(final GeneratedMessage o, GrpcCallback<T> callback) {
        initial();
        T t = callback.doGrpcRequest();
        destroy();
        return t;
    }
    
    private void initial(){
        SocketInfo info = getSocketInfo(remoteServerName);
        int port = info.getPort() + 1000; 
        log.info("HOST:[" + info.getIpAddr() + "] PORT:[" + port + "]");
        ClientInterceptor interceptor = new HeaderClientInterceptor(headerMap);
        managedChannel = NettyChannelBuilder.forAddress(info.getIpAddr(), port).negotiationType(NegotiationType.PLAINTEXT).build();
        channel = ClientInterceptors.intercept(managedChannel, interceptor);
    }
    
    
    private void destroy(){
        if(managedChannel != null){
            managedChannel.shutdownNow();
        }
    }

    
    protected SocketInfo getSocketInfo(String nm){
        return BaseService.getActiveServer(nm);
    }
    
}
