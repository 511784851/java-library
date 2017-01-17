package com.blemobi.library.health;

import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;

import lombok.extern.log4j.Log4j;

/**
 * 发布服务健康状态
 * 
 * @author zhaoyong
 *
 */
@SuppressWarnings("restriction")
@Log4j
public class HealthManager {
	/**
	 * 启动对外的健康服务监听。
	 * 
	 * @param healthPort
	 *            服务端口
	 * @param serviceName
	 *            服务名称
	 */
	public static void startService(int healthPort, String serviceName) {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(healthPort), 0);
			server.createContext("/", new HealthHandler(serviceName));
			server.createContext("/status", new StatusHandler(serviceName));
			server.setExecutor(null); // creates a default executor
			server.start();
			log.info("Health Report Server Running Port:" + healthPort);
		} catch (Exception e) {
			log.error("Health Report Server catch an exception, Port[" + healthPort + "] is used!");
			log.error("System exit!");
			log.error("Good bye!");

			System.exit(0);
		}
	}
}
