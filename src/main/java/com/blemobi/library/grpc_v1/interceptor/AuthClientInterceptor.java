/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    HeaderClientInterceptor.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月17日 下午5:32:13
 *
 *    Revision:
 *
 *    2017年4月17日 下午5:32:13
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1.interceptor;

import java.util.HashMap;
import java.util.Map;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import lombok.extern.log4j.Log4j;

/**
 * @ClassName HeaderClientInterceptor
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午5:32:13
 * @version 1.0.0
 */
@Log4j
public class AuthClientInterceptor implements ClientInterceptor {
	private Map<String, String> header = new HashMap<String, String>();

	public void setHeader(Map<String, String> header) {
		this.header = header;
	}

	public AuthClientInterceptor(Map<String, String> header){
		this.header = header;
	}
	
	public AuthClientInterceptor(){
	}
	
	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
			CallOptions callOptions, Channel next) {
		return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
			@Override
			public void start(Listener<RespT> responseListener, Metadata headers) {
				if (header != null) {
					for (String key : header.keySet()) {
						Metadata.Key<String> customHeadKey = Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER);
						String val = header.get(key);
						log.info("GRPC REQUEST HEAD: " + key + " -> " + val);
							headers.put(customHeadKey, val);
					}
				}
				super.start(new SimpleForwardingClientCallListener<RespT>(responseListener) {}, headers);
			}
		};
	}
}
