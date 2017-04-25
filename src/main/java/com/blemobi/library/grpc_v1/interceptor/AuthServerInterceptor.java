/******************************************************************
 *
 *    Package:     com.microservice.grpc.support
 *
 *    Filename:    HeaderServerInterceptor.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年4月17日 下午5:19:38
 *
 *    Revision:
 *
 *    2017年4月17日 下午5:19:38
 *        - first revision
 *
 *****************************************************************/
package com.blemobi.library.grpc_v1.interceptor;

import com.blemobi.library.exception.BaseException;
import com.blemobi.library.grpc_v1.GRPCConstants;
import com.blemobi.library.grpc_v1.auth.AuthProvider;

import io.grpc.ForwardingServerCall.SimpleForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;
import lombok.extern.log4j.Log4j;

/**
 * @ClassName HeaderServerInterceptor
 * @Description TODO
 * @author HUNTER.POON
 * @Date 2017年4月17日 下午5:19:38
 * @version 1.0.0
 */
@Log4j
public class AuthServerInterceptor implements ServerInterceptor {
	private final String UNAUTH_DESCRIPTION = String.format("code:%d,msg:%s", 1501030,
			"您没有权限访问该接口");
	private final String UNKOWN_DESCRIPTION = String.format("code:%d,msg:%s", 1001000, "出现未知异常");
	private AuthProvider authProvider;

	public AuthServerInterceptor(AuthProvider authProvider) {
		this.authProvider = authProvider;
	}

	@Override
	public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
			ServerCallHandler<ReqT, RespT> next) {
		if (headers != null) {
			Metadata.Key<String> key = Metadata.Key.of(GRPCConstants.HEAD_REQUEST_KEY,
					Metadata.ASCII_STRING_MARSHALLER);
			if (headers.containsKey(key)) {
				String val = headers.get(key);
				log.info("GRPC REQUEST HEAD:" + GRPCConstants.HEAD_REQUEST_KEY + "->" + val);
				if (!authProvider.auth(val)) {
					log.warn("鉴权没通过");
					call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
				}
			} else {
				call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
			}
		} else {
			call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
		}
		return next.startCall(new SimpleForwardingServerCall<ReqT, RespT>(call) {
			@Override
			public void close(Status status, Metadata metadata) {
				if (status.getCause() != null) {
					Throwable t = status.getCause();
					if (t instanceof BaseException) {
						BaseException biz = (BaseException) t;
						super.close(Status.CANCELLED.withDescription(
								String.format("code:%d,msg:%s", biz.getErrorCode(), biz.getErrorMsg())), metadata);
						return;
					} else {
						super.close(Status.INTERNAL.withDescription(UNKOWN_DESCRIPTION), metadata);
						return;
					}
				}
				super.close(status, metadata);
			}
		}, headers);
	}
}
