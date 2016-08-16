package com.blemobi.library.consul;

import java.util.ArrayList;
import java.util.List;

public class ServiceInfo {
	private static SocketInfo[] allSocketInfo = null;
	private static List<String> errorList = new ArrayList<String>();

	public static SocketInfo[] getAllSocketInfo() {
		return allSocketInfo;
	}

	public static void setAllSocketInfo(SocketInfo[] allSocketInfo) {
		ServiceInfo.allSocketInfo = allSocketInfo;
	}

	public static List<String> getErrorList() {
		return errorList;
	}

	public static void reportErrorServer(String addr, int port) {
		errorList.add(addr + "-" + port);
	}

	public static void clearErrorServer() {
		errorList.clear();
	}

}