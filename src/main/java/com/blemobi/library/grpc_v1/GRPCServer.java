/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    GrpcServer.java
 *
 *    Description: TODO
 *
 *    @author: HUNTER.POON
 *
 *    @version: 1.0.0
 *
 *    Create at:   2017年4月17日 下午4:04:03
 *
 *    Revision:
 *
 *    2017年4月17日 下午4:04:03
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1;

import com.blemobi.library.consul_v1.Constants;
import com.blemobi.library.consul_v1.ConsulKVMgr;
import io.grpc.*;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author HUNTER.POON
 * @version 1.0.0
 * @ClassName GRPCServer
 * @Description GRPC 服务启动类
 * @Date 2017年4月17日 下午4:04:03
 */
@Log4j
public final class GRPCServer {
    private static final List<BindableService> bsList = new ArrayList<BindableService>();
    private static Server server;

    public static void start(String serverNm, Set<Class<?>> anno, ServerInterceptor... interceptors) {
        if (anno == null || anno.isEmpty()) {
            log.warn("没有找到GRPC服务");
            return;
        }
    	
        Integer port = Integer.parseInt(ConsulKVMgr.getValue((Constants.GRPC_KV_KEY.getGRPCPortKey(serverNm))));
        if (port == null || port < 1) {
            log.warn("没有配置grpc端口号 grpc.server.port");
            System.exit(0);
        }

        anno.forEach(c -> {
            try {
                log.debug("添加className -> " + c.getName() + " 到grpc service中");
                BindableService instance = (BindableService) c.newInstance();
                bsList.add(instance);
            } catch (InstantiationException e) {
                log.error("InstantiationException,", e);
                System.exit(0);
            } catch (IllegalAccessException e) {
                log.error("IllegalAccessException,", e);
                System.exit(0);
            }
        });

        ServerBuilder sb = ServerBuilder.forPort(port);
        bsList.forEach(bs -> {
            if (interceptors == null || interceptors.length < 1) {
                sb.addService(bs);
            } else {
                sb.addService(ServerInterceptors.intercept(bs, interceptors));
            }
        });
        try {
            server = sb.build().start();
            log.debug("grpc 服务在端口" + port + "启动成功");
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                log.debug("shutting down gRPC server since JVM is shutting down");
                if (server != null) {
                    server.shutdown();
                }
                log.debug("grpc server shut down");
            }));
            server.awaitTermination();
        } catch (IOException e) {
            log.warn("grpc 服务启动失败", e);
            System.exit(0);
        } catch (InterruptedException e) {
            log.warn("grpc awaitTermination 服务启动失败", e);
            System.exit(0);
        }
    }

}
