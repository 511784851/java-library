package com.blemobi.library.consul_v1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.log4j.Log4j;

@Log4j
public class LocalProperties {

    private static Properties props;

    static void setLocalEnv(String filePath) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + filePath;
        log.debug("config file path " + filePath);
        InputStream in = new FileInputStream(path);
        props = new Properties();
        props.load(in);
        log.debug("list properties file kv");
        Enumeration<String> names = (Enumeration<String>) props.propertyNames();
        while (names.hasMoreElements()) {
            String nm = names.nextElement();
            log.debug("key:" + nm + "\t value:" + props.get(nm));
        }
    }

    public static String getString(String key) {
        String val = props.getProperty(key);
        log.debug("key:" + key + "\t value:" + val);
        return props.getProperty(key);
    }
}
