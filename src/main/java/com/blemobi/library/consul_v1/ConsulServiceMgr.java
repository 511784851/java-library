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
 *    Create at:   2017年3月10日 上午11:07:05
 *
 *    Revision:
 *
 *    2017年3月10日 上午11:07:05
 *
 *****************************************************************/
package com.blemobi.library.consul_v1;

import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.StringUtils;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.QueryParams;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.agent.model.NewService;
import com.ecwid.consul.v1.agent.model.Self.Config;
import com.ecwid.consul.v1.health.model.HealthService;
import com.ecwid.consul.v1.health.model.HealthService.Service;

import lombok.extern.log4j.Log4j;

/**
 * @ClassName ConsulMgr
 * @Description consul client manager
 * @author HUNTER.POON
 * @Date 2017年3月10日 上午11:07:05
 * @version 1.0.0
 */
@Log4j
public final class ConsulServiceMgr {

    private static NewService createService(final Integer port, final String serviceId, final String serviceNm,
            final List<String> tags) {
        log.debug("create service begin");
        String host = getNodeAddr();
        log.info("host:[" + host + "]port:[" + port + "],serviceId[" + serviceId + "],serviceNm:[" + serviceNm + "],tags:["
                + StringUtils.join(tags, ",") + "]");
        NewService newService = new NewService();
        newService.setAddress(host);
        newService.setId(serviceId);
        newService.setName(serviceNm);
        if (tags != null && !tags.isEmpty()) {
            newService.setTags(tags);
        }
        newService.setPort(port);
        return newService;
    }
    private static String getNodeAddr(){
        log.debug("get node address");
        ConsulClient client = ConsulClientMgr.getConsulClient();
        log.debug("client:" + client);
        Config config = client.getAgentSelf().getValue().getConfig();
        log.debug("config:" + config);
        String addr = config.getBindAddress();
        return addr;
    }
    
    
    public static void registerService(final Integer port, final String serviceId, final String serviceNm,
            final List<String> tags) {
        ConsulClient client = ConsulClientMgr.getConsulClient();
        NewService newService = createService(port, serviceId, serviceNm, tags);
        client.agentServiceRegister(newService);
    }

    private static NewService serviceChkWithHttp(NewService service, Integer port, String serviceNm) {
        String healthUrl = ConsulHealthHttpMgr.createHttpChk(port, serviceNm);
        NewService.Check serviceCheck = new NewService.Check();
        serviceCheck.setHttp(healthUrl);
        serviceCheck.setInterval("10s");
        serviceCheck.setTimeout("1s");
        service.setCheck(serviceCheck);
        return service;
    }

    public static void registerServiceWithHealthChk(Integer port, String serviceId, Integer healthPort,
            String serviceNm, List<String> tags) {
        ConsulClient client = ConsulClientMgr.getConsulClient();
        NewService newService = createService(port, serviceId, serviceNm, tags);
        newService = serviceChkWithHttp(newService, healthPort, serviceNm);
        client.agentServiceRegister(newService);
    }

    public static ServiceInfo getHealthlyServiceByNm(String serviceNm) {
        return getHealthlyServiceByNm(serviceNm, null);
    }

    public static ServiceInfo getHealthlyServiceByNm(String serviceNm, String token) {
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<HealthService>> response = null;
        if (StringUtils.isEmpty(token)) {
            response = client.getHealthServices(serviceNm, true, QueryParams.DEFAULT);
        } else {
            response = client.getHealthServices(serviceNm, true, QueryParams.DEFAULT, token);
        }
        List<HealthService> listService = response.getValue();
        if (listService == null || listService.isEmpty()) {
            log.warn("not fond healthly service");
            throw new RuntimeException("not fond healthly service");
        }
        log.debug("ServiceList from consul:" + listService);
        Random r = new Random();
        int idx = r.nextInt(listService.size());
        HealthService hs = listService.get(idx);
        log.debug("getService from consul:" + hs);
        Service service = hs.getService();
        ServiceInfo info = new ServiceInfo(service.getService(), service.getId(), service.getAddress(),
                service.getPort());
        return info;
    }

    public static ServiceInfo getHealthlyServiceByTags(String serviceNm, String tag) {
        return getHealthlyServiceByTags(serviceNm, tag, null);
    }

    public static ServiceInfo getHealthlyServiceByTags(String serviceNm, String tag, String token) {
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<HealthService>> response = null;
        if (StringUtils.isEmpty(token)) {
            response = client.getHealthServices(serviceNm, tag, true, QueryParams.DEFAULT);
        } else {
            response = client.getHealthServices(serviceNm, tag, true, QueryParams.DEFAULT, token);
        }

        List<HealthService> listService = response.getValue();
        if (listService == null || listService.isEmpty()) {
            log.warn("not fond healthly service");
            throw new RuntimeException("not fond healthly service");
        }
        log.debug("ServiceList from consul:" + listService);
        Random r = new Random();
        int idx = r.nextInt(listService.size());
        HealthService hs = listService.get(idx);
        log.debug("getService from consul:" + hs);
        Service service = hs.getService();
        ServiceInfo info = new ServiceInfo(service.getService(), service.getId(), service.getAddress(),
                service.getPort());
        return info;
    }

    public static ServiceInfo getHealthlyGRPCServiceByNm(String serviceNm) {
        return getHealthlyGRPCServiceByNm(serviceNm, null);
    }

    public static ServiceInfo getHealthlyGRPCServiceByNm(String serviceNm, String token) {
        ConsulClient client = ConsulClientMgr.getConsulClient();
        Response<List<HealthService>> response = null;
        if (StringUtils.isEmpty(token)) {
            response = client.getHealthServices(serviceNm, true, QueryParams.DEFAULT);
        } else {
            response = client.getHealthServices(serviceNm, true, QueryParams.DEFAULT, token);
        }
        List<HealthService> listService = response.getValue();
        if (listService == null || listService.isEmpty()) {
            log.warn("not fond healthly service");
            throw new RuntimeException("not fond healthly service");
        }
        log.debug("ServiceList from consul:" + listService);
        Random r = new Random();
        int idx = r.nextInt(listService.size());
        HealthService hs = listService.get(idx);
        log.debug("getService from consul:" + hs);
        Service service = hs.getService();
        Integer port = Integer.parseInt(ConsulKVMgr.getValue(Constants.GRPC_KV_KEY.getGRPCPortKey(serviceNm)));
        ServiceInfo info = new ServiceInfo(service.getService(), service.getId(), service.getAddress(), port);
        return info;
    }

}
