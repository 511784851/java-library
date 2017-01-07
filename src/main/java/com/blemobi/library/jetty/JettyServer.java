package com.blemobi.library.jetty;

import java.util.EnumSet;
import java.util.List;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.servlet.ServletContainer;

import com.blemobi.library.filter.GzipCompressFilter;
import com.blemobi.library.filter.ListParamFilter;

/**
 * Jetty服务管理类
 * 
 * @author zhaoyong
 *
 */
public class JettyServer {

	private static Server server;
	private static String contextPath;
	private String packages;
	private int port;
	private List<ServerFilter> serverFilterList;

	/**
	 * 构造方法
	 * 
	 * @param contextPath
	 * @param packages
	 * @param port
	 * @param serverFilterList
	 */
	public JettyServer(String contextPath, String packages, int port, List<ServerFilter> serverFilterList) {
		JettyServer.contextPath = contextPath;
		this.packages = packages;
		this.port = port;
		this.serverFilterList = serverFilterList;
	}

	/**
	 * 启动Jetty Http服务
	 * 
	 * @throws Exception
	 */
	public void start() throws Exception {
		if (server == null) {
			ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
			context.setContextPath("/");
			EnumSet<DispatcherType> enumSet = EnumSet.allOf(DispatcherType.class);
			enumSet.add(DispatcherType.REQUEST);

			// 添加需要过滤的PATH
			context.addFilter(ListParamFilter.class, "/*", enumSet);
			context.addFilter(GzipCompressFilter.class, "/*", enumSet);
			for (ServerFilter serverFilter : serverFilterList) {
				for (String path : serverFilter.getPathList()) {
					context.addFilter(serverFilter.getFilter().getClass(), path, enumSet);
				}
			}

			server = new Server(port);
			server.setHandler(context);

			ServletHolder jerseyServlet = context.addServlet(ServletContainer.class, "/*");
			jerseyServlet.setInitOrder(0);
			jerseyServlet.setInitParameter(ServerProperties.PROVIDER_PACKAGES, packages);

			server.start();
		}
	}

	public static String getServerName() {
		return contextPath;
	}
}
