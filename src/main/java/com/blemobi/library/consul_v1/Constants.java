/******************************************************************
 *
 *    
 *    Package:     com.microservice.consul
 *
 *    Filename:    Constants.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月11日 下午1:03:46
 *
 *    Revision:
 *
 *    2017年3月11日 下午1:03:46
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

/**
 * @ClassName Constants
 * @Description 常量类
 * @author HUNTER.POON
 * @Date 2017年3月11日 下午1:03:46
 * @version 1.0.0
 */
public final class Constants {
	public static String SERVER_NM = "";
    static enum CONSUL_KV_DYNC{
        LOG_LEVEL("log_level");
        private String value;

        private CONSUL_KV_DYNC(String value) {
            this.value = value;
        }
        public String val(){
            return value;
        }
    }
    /**
     * @ClassName CONSUL_CONFIG
     * @Description consul 配置参数
     * @author HUNTER.POON
     * @Date 2017年3月13日 上午11:52:29
     * @version 1.0.0
     */
    public static final class CONSUL_CONFIG {

        public static final String HTTP_CHECK_INTERVAL = "CONSTANTS/CONSUL/HEALTH/HTTP/INTERVAL";
        public static final String HTTP_CHECK_TIMEOUT = "CONSTANTS/CONSUL/HEALTH/HTTP/TIMEOUT";
    }

    /**
     * @ClassName GRPC_KV_KEY
     * @Description grpc consul中 配置的key
     * @author HUNTER.POON
     * @Date 2017年3月13日 上午11:52:01
     * @version 1.0.0
     */
    public static final class GRPC_KV_KEY {

        public static String getGRPCPortKey(String... param) {
            String key = "blemobi/sep/global/" + ConsulClientMgr.getENV_TYPE() + "/{0}_grpc_port";
            int idx = 0;
            for (String s : param) {
                key = key.replace("{" + idx + "}", s);
                idx++;
            }
            return key;
        }
    }

    public static final class CONFIG_KV_KEY {

        public static final String JETTY_PORT = "jetty_port";
        public static final String HEALTH_CHECK_PORT = "health_check_port";
        public static final String LOG_LEVEL = "log_level";
        public static final String REDIS_MAX_CONNECT_NUM = "redis_max_connect_num";
        public static final String REDIS_USER_ADDR = "redis_user_addr";
        public static final String REDIS_USER_AUTH = "redis_user_auth";
        public static final String MYSQL_PASSWORD = "db.password";
        public static final String MYSQL_URL = "db.url";
        public static final String MYSQL_USERNAME = "db.username";
        public static final String REDIS_ADDR = "redis_user_addr";
        public static final String REDIS_AUTH = "redis_user_auth";
        public static final String REDIS_CONNECT_NUM = "redis_max_connect_num";
        public static String getConfigKvKey(String... param) {
            String key = "blemobi/sep/" + SERVER_NM + "/" + ConsulClientMgr.getENV_TYPE() + "/{0}";
            int idx = 0;
            for (String s : param) {
                key = key.replace("{" + idx + "}", s);
                idx++;
            }
            return key;
        }
    }
}
