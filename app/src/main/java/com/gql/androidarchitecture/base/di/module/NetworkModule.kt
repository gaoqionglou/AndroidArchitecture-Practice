package com.gql.androidarchitecture.base.di.module

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .readTimeout(50, TimeUnit.SECONDS)
            .writeTimeout(50, TimeUnit.SECONDS)
            .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.example.com") //设置网络请求的Url地址
            .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //支持RxJava2平台
            .client(okHttpClient) //OKhttp3添加到Retrofit
            .build()
    }
}

