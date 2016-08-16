package com.blemobi.library.consul;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

import lombok.extern.log4j.Log4j;
@Log4j
public class LocalProp {
	private static HashMap<String,String> propInfo = new HashMap<String,String>();
	private static HashMap<String,SocketInfo> services = new HashMap<String,SocketInfo>();
	
	public static void invokeEnv(ConsulChangeListener adapter) {
		for(Entry<String, SocketInfo> serv:services.entrySet()){
			adapter.onServiceChange(serv.getKey(), new SocketInfo[]{serv.getValue()});
		}
		adapter.onEnvChange(propInfo);
	}

	public static void setLocalEnv(String filePath) throws IOException {

		String path = System.getProperty("user.dir")+File.separator+filePath;
		InputStream in =new FileInputStream(path);

		Properties fileProp = new Properties();
		fileProp.load(in);
		
		log.info("--- Start listing properties ---");

		String prefix = "service_";
		String postfix_addr = "_addr";
		String postfix_port = "_port";

		for(Entry<Object, Object> p:fileProp.entrySet()){
			String key = (String)(p.getKey());
			String value = (String)p.getValue();
			
			log.info(key+" = ["+value+"]");

			if(key.startsWith(prefix) && (key.endsWith(postfix_addr)) && (value.length() > (prefix.length()+postfix_addr.length()))){
				//如果是服务IP地址的信息
				String serviceName = key.substring(0,(key.length()-postfix_addr.length())).substring(prefix.length());
				SocketInfo si = getService(services,serviceName);
				si.setIpAddr(value);
			}else if(key.startsWith(prefix) && (key.endsWith(postfix_port)) && (value.length() > (prefix.length()+postfix_port.length()))){
				//如果是服务端口的信息
				String serviceName = key.substring(0,(key.length()-postfix_port.length())).substring(prefix.length());
				SocketInfo si = getService(services,serviceName);
				si.setPort(Integer.parseInt(value));
			}else{
				propInfo.put(key, value);
			}
		}
	}

	private static SocketInfo getService(HashMap<String, SocketInfo> servs, String serviceName) {
		SocketInfo rtn = servs.get(serviceName);
		if(rtn==null){
			rtn = new SocketInfo("nullAddr",-1);
			servs.put(serviceName, rtn);
		}
		return rtn;
	}
}
