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

import java.util.Iterator;

import org.apache.commons.lang.StringUtils;

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
		String remoteAddr = call.getAttributes().get(call.REMOTE_ADDR_KEY).toString().split(":")[0].substring(1);
		log.debug("remoteAddr->" + remoteAddr);
		if (headers != null) {
			Metadata.Key<String> key = Metadata.Key.of(GRPCConstants.HEAD_REQUEST_KEY,
					Metadata.ASCII_STRING_MARSHALLER);
			if (headers.containsKey(key)) {
				Iterator<String> it = headers.getAll(key).iterator();
				String val = StringUtils.join(it, ",");
				log.info("GRPC REQUEST HEAD:" + GRPCConstants.HEAD_REQUEST_KEY + "->" + val);
				val = val.split(",")[0] + "," + remoteAddr;
				if (!authProvider.auth(val)) {
					log.warn("鉴权没通过");
					call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
				}
			} else {
				log.warn("请求头没有包含from信息，鉴权没通过");
				call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
			}
		} else {
			log.warn("没有设置请求头，鉴权没通过");
			call.close(Status.UNAUTHENTICATED.withDescription(UNAUTH_DESCRIPTION), headers);
		}
		return next.startCall(new SimpleForwardingServerCall<ReqT, RespT>(call) {
			@Override
			public void close(Status status, Metadata metadata) {
				if (status.getCause() != null) {
					Throwable t = status.getCause();
					if (t instanceof BaseException) {
						BaseException biz = (BaseException) t;
						log.error("GRPC出现异常", biz);
						super.close(Status.CANCELLED.withDescription(
								String.format("code:%d,msg:%s", biz.getErrorCode(), biz.getErrorMsg())), metadata);
						return;
					} else {
						log.error("GRPC出现运行时异常", t);
						super.close(Status.INTERNAL.withDescription(UNKOWN_DESCRIPTION), metadata);
						return;
					}
				}
				super.close(status, metadata);
			}
		}, headers);
	}
}
