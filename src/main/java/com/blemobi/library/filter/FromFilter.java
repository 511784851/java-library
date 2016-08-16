package com.blemobi.library.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.blemobi.library.consul.BaseService;
import com.blemobi.library.consul.SocketInfo;
import com.blemobi.library.util.ReslutUtil;
import com.blemobi.sep.probuf.ResultProtos.PMessage;
import com.google.common.base.Strings;
import com.pakulov.jersey.protobuf.internal.MediaTypeExt;

/*
 * 校验调起资源的服务合法性
 */

public class FromFilter implements Filter {
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		String from = request.getParameter("from");
		if (!Strings.isNullOrEmpty(from)) {
			String spbill_create_ip = request.getRemoteAddr();

			SocketInfo[] socketInfoArray = BaseService.getRegisterServer(from);
			for (SocketInfo socketInfo : socketInfoArray) {
				String ipAddr = socketInfo.getIpAddr();
				if (ipAddr.equals(spbill_create_ip)) {
					// 服务校验通过
					chain.doFilter(request, response);
				}
			}
		}

		responseResult(response, 1901011, "from service error");
	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	/**
	 * 返回包处理
	 * 
	 * @param response
	 *            response对象
	 * @param errorCode
	 *            返回码
	 * @param errorMsg
	 *            返回码描述
	 * @return void 返回无
	 * @throws IOException
	 */
	private void responseResult(ServletResponse response, int errorCode, String errorMsg) throws IOException {
		PMessage message = ReslutUtil.createErrorMessage(errorCode, errorMsg);
		byte[] data = message.toByteArray();

		response.setContentType(MediaTypeExt.APPLICATION_PROTOBUF);
		response.setContentLength(data.length);
		ServletOutputStream out = response.getOutputStream();
		out.write(data);
		out.flush();
		out.close();
	}
}
