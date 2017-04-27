/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    GrpcServer.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.reflections.Reflections;

import com.blemobi.library.consul_v1.Constants;
import com.blemobi.library.consul_v1.ConsulKVMgr;
import com.blemobi.library.consul_v1.PropsUtils;
import com.blemobi.library.grpc_v1.annotation.GRPCService;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import lombok.extern.log4j.Log4j;

/**
 * @ClassName GRPCServer
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午4:04:03
 * @version 1.0.0
 */
@Log4j
public final class GRPCServer {
	private static final String GRPC_PORT = "netdisk_grpc_port";
	private static final String GRPC_BASE_PKG = "grpc.annotation.basepkg";
	private static final List<BindableService> bsList = new ArrayList<BindableService>();
	private static Server server;
	private static Set<Class<?>> annotated = new HashSet<Class<?>>();

	public static void start(ServerInterceptor... interceptors) {
		String basePackage = PropsUtils.getString(GRPC_BASE_PKG);
		if (!StringUtils.isEmpty(basePackage)) {
			Reflections reflections = new Reflections(basePackage);
			annotated = reflections.getTypesAnnotatedWith(GRPCService.class);
		} else {
			log.warn("没有配置grpc服务基包 grpc.base.pkg");
		}
		if (!annotated.isEmpty()) {
			instance();
		}
		Integer port = Integer.parseInt(ConsulKVMgr.getValue((Constants.GRPC_KV_KEY.getGRPCPortKey(GRPC_PORT))));
		if (port == null || port < 1) {
			log.warn("没有配置grpc端口号 grpc.server.port");
			System.exit(0);
		}
		ServerBuilder sb = ServerBuilder.forPort(port);
		if (bsList != null && !bsList.isEmpty()) {
			for (BindableService bs : bsList) {
				if(interceptors == null || interceptors.length < 1){
					sb.addService(bs);
				}else{
					sb.addService(ServerInterceptors.intercept(bs, interceptors));	
				}
			}
		}
		try {
			server = sb.build().start();
			log.debug("grpc 服务在端口" + port + "启动成功");
			Runtime.getRuntime().addShutdownHook(new Thread() {
				@Override
				public void run() {
					log.debug("shutting down gRPC server since JVM is shutting down");
					if (server != null) {
						server.shutdown();
					}
					log.debug("grpc server shut down");
				}
			});
			server.awaitTermination();
		} catch (IOException e) {
			log.warn("grpc 服务启动失败", e);
			System.exit(0);
		} catch (InterruptedException e) {
			log.warn("grpc awaitTermination 服务启动失败", e);
			System.exit(0);
		}

	}

	private static void instance() {
		for (Class c : annotated) {
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
		}
	}
}
