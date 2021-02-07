package com.gql.androidarchitecture.di.module

import com.gql.androidarchitecture.base.NetworkConfiguration
import com.gql.androidarchitecture.base.di.annotation.QualifierDefaultApi
import com.gql.androidarchitecture.base.di.annotation.QualifierLoginApi
import com.gql.androidarchitecture.base.network.OkHttpClientProvider
import com.gql.androidarchitecture.business.login.configuration.LoginBusinessConfiguration
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class TestNetworkModule {
    @Singleton
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClientProvider.get()
    }

    @Singleton
    @Provides
    @QualifierDefaultApi
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        networkConfiguration: NetworkConfiguration
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("${networkConfiguration.schema}${networkConfiguration.domain}:${networkConfiguration.port}") //设置网络请求的Url地址
            .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //支持RxJava2平台
            .client(okHttpClient) //OKhttp3添加到Retrofit
            .build()
    }

    @Singleton
    @Provides
    @QualifierLoginApi
    fun provideLoginRetrofit(
        okHttpClient: OkHttpClient,
        loginBusinessConfiguration: LoginBusinessConfiguration
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl("${loginBusinessConfiguration.schema}${loginBusinessConfiguration.domain}:${loginBusinessConfiguration.port}") //设置网络请求的Url地址
            .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //支持RxJava2平台
            .client(okHttpClient) //OKhttp3添加到Retrofit
            .build()
    }
}