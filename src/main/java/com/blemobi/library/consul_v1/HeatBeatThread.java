/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.consul_v1
 *
 *    Filename:    HeatBeatThread.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月14日 下午7:45:53
 *
 *    Revision:
 *
 *    2017年3月14日 下午7:45:53
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName HeatBeatThread
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月14日 下午7:45:53
 * @version 1.0.0
 */
@Log4j
public class HeatBeatThread implements Runnable {

    private static long millis = 1 * 1000;
    private static List<ConsulKvChangeListener> listener = new ArrayList<ConsulKvChangeListener>();
    private static Map<String, String> values = new HashMap<String, String>();

    public static void addListener(ConsulKvChangeListener ccl) {
        listener.add(ccl);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(millis);
                for (Constants.CONSUL_KV_DYNC dync : Constants.CONSUL_KV_DYNC.values()) {
                    String val = ConsulKVMgr.getValue(Constants.CONFIG_KV_KEY.getConfigKvKey(dync.val()));
                    if (values.containsKey(dync.val())) {
                        if (!values.get(dync.val()).equals(val)) {
                            log.debug("KEY:[" + dync.val() + "] orgVal:[" + values.get(dync.val()) + "] newVal:[" + val
                                    + "]");
                        } else {
                            continue;
                        }

                    }
                    notify(dync, val);
                    values.put(dync.val(), val);
                }
            }
        } catch (InterruptedException e) {
            log.error("thread sleep failed", e);
        }
    }

    public void notify(Constants.CONSUL_KV_DYNC dyncType, String val) {
        for (ConsulKvChangeListener ccl : listener) {
            ccl.onKvChange(dyncType, val);
        }
    }

    private static ConsulKvChangeListener LOGLISTENER = new ConsulKvChangeListener() {

        @Override
        public void onKvChange(Constants.CONSUL_KV_DYNC dyncType, String value) {
            if (dyncType.equals(Constants.CONSUL_KV_DYNC.LOG_LEVEL)) {
                if ("ERROR".equalsIgnoreCase(value)) {
                    LogManager.getRootLogger().setLevel(Level.ERROR);
                } else if ("WARN".equalsIgnoreCase(value)) {
                    LogManager.getRootLogger().setLevel(Level.WARN);
                } else if ("INFO".equalsIgnoreCase(value)) {
                    LogManager.getRootLogger().setLevel(Level.INFO);
                } else {
                    LogManager.getRootLogger().setLevel(Level.DEBUG);
                }
            }
        }
    };
    static {
        addListener(LOGLISTENER);
    }

}
