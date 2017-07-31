package com.fengpeihao.outlook.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by fengpeihao on 2017/7/31.
 */

public class RequestParamInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        //请求定制：添加请求头
        Request.Builder requestBuilder = original.newBuilder();
        Request request = requestBuilder.build();
        return chain.proceed(request);
    }
}
