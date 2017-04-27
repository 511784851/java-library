/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    ClientGrpcBase.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月17日 下午5:38:36
 *
 *    Revision:
 *
 *    2017年4月17日 下午5:38:36
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1;

import java.util.Arrays;
import java.util.List;

import com.google.protobuf.AbstractMessage;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

/**
 * @ClassName ClientGrpcBase
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午5:38:36
 * @version 1.0.0
 */
@ToString
@Log4j
public abstract class ClientGRPCBase {
	protected Channel channel;
	protected String remoteSN;
	protected String host;
	protected Integer port;
	protected List<ClientInterceptor> interceptors;
	protected String from;
	public ClientGRPCBase(){}
	public ClientGRPCBase(String remoteSN, ClientInterceptor... interceptors) {
		this.remoteSN = remoteSN;
		this.interceptors = Arrays.asList(interceptors);
	}

	public ClientGRPCBase(String host, Integer port, String from, ClientInterceptor... interceptors) {
		this.host = host;
		this.port = port;
		this.from = from;
		this.interceptors = Arrays.asList(interceptors);
	}
	
	protected String getFrom(){
		return from;
	}

	protected <T> T execute(final AbstractMessage o, GRPCCallback<T> callback) {
		initialChannel();
		log.debug("开始执行GRPC请求");
		T t = callback.doGRPC();
		log.debug("完成执行GRPC请求 返回数据:[" + t + "]");
		destroy();
		return t;
	}

	protected abstract void initialInterceptors();
	protected void initialChannel() {
		log.debug("获取GRPC通信通道 host -> " + host + ", port -> " + port);
		ManagedChannel originChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true).build();
		initialInterceptors();
		if (interceptors != null && interceptors.size() > 0) {
			channel = ClientInterceptors.intercept(originChannel, interceptors);
		} else {
			channel = originChannel;
		}
	}

	private void destroy() {
		if (channel != null) {
			log.debug("关闭GRPC请求通道");
			channel = null;
		}
	}
}
