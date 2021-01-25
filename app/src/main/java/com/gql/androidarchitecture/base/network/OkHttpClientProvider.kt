package com.gql.androidarchitecture.base.network

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object OkHttpClientProvider {
    @JvmStatic
    fun get(): OkHttpClient = OkHttpClient().newBuilder()
            .readTimeout(50, TimeUnit.SECONDS)
            .writeTimeout(50, TimeUnit.SECONDS)
            .addLoggingInterceptor()
            .addMockInterceptor()
            .build()
}