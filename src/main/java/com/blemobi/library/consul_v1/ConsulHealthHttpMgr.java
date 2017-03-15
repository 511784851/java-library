/******************************************************************
 *
 *    
 *    Package:     com.microservice.consul
 *
 *    Filename:    HealthMgr.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月10日 上午11:39:01
 *
 *    Revision:
 *
 *    2017年3月10日 上午11:39:01
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName HealthMgr
 * @Description http 健康监控管理类
 * @author HUNTER.POON
 * @Date 2017年3月10日 上午11:39:01
 * @version 1.0.0
 */
@SuppressWarnings("restriction")
@Log4j
class ConsulHealthHttpMgr {

    public static String createHttpChk(int healthPort, String serviceName) {
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(healthPort), 0);
            server.createContext("/", new HealthHandler(serviceName));
            server.setExecutor(null); // creates a default executor
            server.start();
            log.debug("Health Report Server Running Port:" + healthPort);
            return "http://" + ConsulClientMgr.getHost() + ":" + healthPort + "/" + serviceName;
        } catch (Exception e) {
            log.debug("Health Report Server catch an exception, Port[" + healthPort + "] is used!");
            log.debug("System exit!");
            log.debug("Good bye!");
            System.exit(0);
        }
        return null;
    }

    static class HealthHandler implements HttpHandler {
        private String serviceName = "";
        public HealthHandler(String serviceName) {
            this.serviceName = serviceName;
        }
        public void handle(HttpExchange t) throws IOException {
            String resp = readRespData();
            byte[] pMessage = resp.getBytes();
            t.sendResponseHeaders(200, pMessage.length);
            Headers h = t.getResponseHeaders();
            // 根据系统管理员要求，必须返回json格式的内容。因此在http的head里，要声明内容类型。
            h.set("Content-Type", "application/json");
            OutputStream os = t.getResponseBody();
            os.write(pMessage);
            os.close();
        }

        // 根据系统管理员的要求，返回固定的json格式内容。
        private String readRespData() {
            return "{\"serviceName\" : \"" + this.serviceName + "\",\"isHealthy\" : true } ";
        }
    }
}
