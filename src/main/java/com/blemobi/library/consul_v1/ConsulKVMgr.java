/******************************************************************
 *
 *    
 *    Package:     com.microservice.consul
 *
 *    Filename:    Test.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月9日 下午3:30:27
 *
 *    Revision:
 *
 *    2017年3月9日 下午3:30:27
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import java.util.List;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.kv.model.GetValue;

/**
 * @ClassName Test
 * @Description Consul kv 管理
 * @author HUNTER.POON
 * @Date 2017年3月9日 下午3:30:27
 * @version 1.0.0
 */
public class ConsulKVMgr {
    
    public static List<String> getKeys(String keyPrefix){
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<String>> response = client.getKVKeysOnly(keyPrefix);
        if(response == null){
            return null;
        }
        return response.getValue();
    }
    public static List<String> getKeys(String keyPrefix, QueryParams queryParams){
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<String>> response = client.getKVKeysOnly(keyPrefix, queryParams);
        if(response == null){
            return null;
        }
        return response.getValue();
    }
    public static List<String> getKeys(String keyPrefix, String separator, String token){
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<String>> response = client.getKVKeysOnly(keyPrefix, separator, token);
        if(response == null){
            return null;
        }
        return response.getValue();
    }
    
    public static List<String> getKeys(String keyPrefix, String separator, String token, QueryParams queryParams){
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<String>> response = client.getKVKeysOnly(keyPrefix, separator, token, queryParams);
        if(response == null){
            return null;
        }
        return response.getValue();
    }
    
    public static String getValue(String key){
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<GetValue> response = client.getKVValue(key);
        GetValue gv = response.getValue();
        if(response == null || gv == null){
            return null;
        }
        return gv.getDecodedValue();
    }
}
