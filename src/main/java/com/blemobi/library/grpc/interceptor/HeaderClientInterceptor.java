/******************************************************************
 *
 *    
 *    Package:     com.microservice.grpc.client
 *
 *    Filename:    HeaderClientInterceptor.java
 *
 *    Description: TODO
 *
 *    @author:     HUNTER.POON
 *
 *    @version:    1.0.0
 *
 *    Create at:   2017年3月7日 上午9:57:57
 *
 *    Revision:
 *
 *    2017年3月7日 上午9:57:57
 *
 *****************************************************************/
package com.blemobi.library.grpc.interceptor;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.blemobi.library.exception.GrpcException;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

/**
 * @ClassName HeaderClientInterceptor
 * @Description grpc header 处理
 * @author HUNTER.POON
 * @Date 2017年3月7日 上午9:57:57
 * @version 1.0.0
 */
public class HeaderClientInterceptor implements ClientInterceptor {
    private Map<String, List<String>> mHeaderMap;
    private static final String RET_HEADER_KEY = "x-request-error";

    public HeaderClientInterceptor(Map<String, List<String>> headerMap) {
        mHeaderMap = headerMap;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next) {
        return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                if (mHeaderMap != null) {
                    for (String key : mHeaderMap.keySet()) {
                        Metadata.Key<String> customHeadKey = Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER);
                        List<String> valList = mHeaderMap.get(key);
                        for(String val : valList){
                            headers.put(customHeadKey, val);
                        }
                    }
                }
                super.start(new SimpleForwardingClientCallListener<RespT>(responseListener) {

                    @Override
                    public void onHeaders(Metadata headers) {
                        super.onHeaders(headers);
                        /**
                         * if you don't need receive header from server, you can use {@link io.grpc.stub.MetadataUtils
                         * attachHeaders} directly to send header
                         */
                        Metadata.Key<String> customHeadKey = Metadata.Key.of(RET_HEADER_KEY, Metadata.ASCII_STRING_MARSHALLER);
                        String val = headers.get(customHeadKey);
                        if (!StringUtils.isEmpty(val) && !"0".equals(val)) {
                            throw new GrpcException(Integer.parseInt(val), "request grpc api failed");
                        }
                    }
                }, headers);
            }
        };
    }
}
