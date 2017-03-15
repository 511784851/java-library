package com.blemobi.library.consul_v1;

/******************************************************************
 *
 *    
 *    Package:     com.microservice.consul
 *
 *    Filename:    ConsulMgr.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月11日 上午10:35:27
 *
 *    Revision:
 *
 *    2017年3月11日 上午10:35:27
 *
 *****************************************************************/

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import com.ecwid.consul.v1.ConsulClient;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName ConsulMgr
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月11日 上午10:35:27
 * @version 1.0.0
 */
@Log4j
public final class ConsulClientMgr {
    public static String ENV_TYPE = "test";
    private static String HOST = "";
    private static Boolean IS_INITIAL = false;
    private static ConsulClient CLIENT = null;
    public static String getHost() {
        return HOST;
    }

    /**
     * 定义系统启动的模式，分别有local，test，prod模式。 data[i][0]为模式名称，data[i][1]为描述. 系统启动时，分别从对应的Consul中获取对应的配置信息启动。
     */
    private static final String[][] DATA = {{"local", "开发模式" }, {"test", "测试模式" }, {"prod", "正式生产模式" },
            {"help", "测试帮助信息" } };

    private ConsulClientMgr() {
    }

    public static ConsulClient getConsulClient() {
        if (CLIENT == null) {
            log.error("consul client not initialed, plz check it.");
            System.exit(0);
        }
        return CLIENT;
    }

    public static void initial() {
        HOST = "127.0.0.1";
        initial(HOST);
    }

    public static void initial(String host) {
        initial(host, null);
    }

    public static synchronized void initial(String host, Integer port) {
        if (IS_INITIAL) {
            log.warn("consul client is initial.");
            return;
        }
        HOST = host;
        if (port == null || port.intValue() <= 0) {
            log.warn("consul port ignore.");
            CLIENT = new ConsulClient(host);
            port = 8500;
        } else {
            CLIENT = new ConsulClient(host, port);
        }
        log.info("consul client host:" + host + ", port:" + port + " initialed");
        IS_INITIAL = true;
        new Thread(new HeatBeatThread()).start();
    }

    public static void initial(String[] args, String serviceNm) {
        check(args, serviceNm);
    }

    private static void check(String[] args, String serviceNm) {
        String env = checkStartMode(args);
        ENV_TYPE = env;
        if (env != null) {
            if (env.equals("local")) {
                String selfNm = StringUtils.capitalize(serviceNm);
                log.info("System starting with local mode. ");
                log.info("Now, System reading local config file. ");
                try {
                    LocalProperties.setLocalEnv(selfNm + "Manager.ini");
                    log.info("Read local Config File Finish!");
                } catch (IOException e) {
                    log.info("Read local Config File Exception.");
                    log.info("Config file [" + selfNm + "Manager.ini] not exist or content is error！");
                    log.info("System exit!");
                    log.info("Good bye!");
                    System.exit(0);
                }
            } else if (env.equals("help")) {
                printHelp();
                System.exit(0);
            } else {
                initial();
                log.info("System starting with \"" + env + "\" mode.");
            }
        } else {
            printHelp();
            System.exit(0);
        }
    }

    private static String checkStartMode(String[] args) {
        String rtn = null;
        if (args.length > 1 && args[0].equalsIgnoreCase("-ENV")) {
            String mode = args[1].toLowerCase();
            for (String[] line : DATA) {
                String key = line[0].toLowerCase();
                if (mode.equalsIgnoreCase(key)) {
                    rtn = mode;
                    break;
                }
            }
            if (rtn != null && rtn.equals("help")) {
                rtn = null;
            }
        }
        return rtn;
    }

    /**
     * 系统启动的打印的帮助信息提示内容。
     */
    private static void printHelp() {
        StringBuffer sb = new StringBuffer();
        sb.append("usage: Manager -env ");
        sb.append("<");
        for (int i = 0; i < DATA.length; i++) {
            if (i > 0)
                sb.append("|");
            sb.append(DATA[i][0]);
        }
        sb.append(">\r\n");
        for (int i = 0; i < DATA.length; i++) {
            sb.append("\t-" + DATA[i][0] + "    " + DATA[i][1] + "\r\n");
        }
        log.info(sb.toString());
    }
}
