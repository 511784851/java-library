package com.blemobi.library.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.blemobi.library.consul_v1.ConsulServiceMgr;
import com.blemobi.library.consul_v1.ServiceInfo;
import com.blemobi.library.util.ReslutUtil;
import com.google.common.base.Strings;

import lombok.extern.log4j.Log4j;

/*
 * 校验调起资源的服务合法性
 */
@Log4j
public class FromFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		boolean bool = false;
		String from = request.getParameter("from");
		if (!Strings.isNullOrEmpty(from)) {
			String spbill_create_ip = request.getRemoteAddr();

			List<ServiceInfo> list = ConsulServiceMgr.getHealthlyServicesByNm(from);
			for (ServiceInfo serviceInfo : list) {
				String ipAddr = serviceInfo.getAddr();
				if (ipAddr.equals(spbill_create_ip)) {
					bool = true;
				}
			}
		}

		if (bool) {
			chain.doFilter(request, response);
		} else {
			ReslutUtil.createResponse(response, 1001005, "服务校验失败");
			log.warn("服务校验失败");
		}
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}
}