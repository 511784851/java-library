/******************************************************************
 *
 *    
 *    Package:     com.blemobi.library.consul_v1
 *
 *    Filename:    PropsUtils.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月14日 下午12:09:37
 *
 *    Revision:
 *
 *    2017年3月14日 下午12:09:37
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import org.apache.commons.lang3.StringUtils;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName PropsUtils
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年3月14日 下午12:09:37
 * @version 1.0.0
 */
@Log4j
public final class PropsUtils {

    public static String getString(String key) {
        String val = null;
        if (ConsulClientMgr.getENV_TYPE().equalsIgnoreCase("local")){
            val = LocalProperties.getString(key);
        }
        key = Constants.CONFIG_KV_KEY.getConfigKvKey(key);
        val = ConsulKVMgr.getValue(key);
        log.debug("key:" + key + ", value:" + val);
        return val;
    }
    
    public static Integer getInteger(String key) {
        String strVal = getString(key);
        if(StringUtils.isEmpty(strVal)){
            return null;
        }
        return Integer.parseInt(strVal);
    }
    
    public static Double getDouble(String key) {
        String strVal = getString(key);
        if(StringUtils.isEmpty(strVal)){
            return null;
        }
        return Double.parseDouble(strVal);
    }
    
    public static Float getFloat(String key) {
        String strVal = getString(key);
        if(StringUtils.isEmpty(strVal)){
            return null;
        }
        return Float.parseFloat(strVal);
    }
    public static Boolean getBoolean(String key) {
        String strVal = getString(key);
        if(StringUtils.isEmpty(strVal)){
            return null;
        }
        return Boolean.parseBoolean(strVal);
    }
    public static Long getLong(String key) {
        String strVal = getString(key);
        if(StringUtils.isEmpty(strVal)){
            return null;
        }
        return Long.parseLong(strVal);
    }
}
