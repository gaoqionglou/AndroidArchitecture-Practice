package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.base.NetworkConfiguration
import com.gql.androidarchitecture.base.di.QualifierDefualtApi
import com.gql.androidarchitecture.base.di.QualifierLoginApi
import com.gql.androidarchitecture.business.login.configuration.LoginBusinessConfiguration
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

const val DEFAULT_API = "default_api"
const val LOGIN_API = "login_api"

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
    @QualifierDefualtApi
    fun provideRetrofit(okHttpClient: OkHttpClient,networkConfiguration: NetworkConfiguration): Retrofit {
        return Retrofit.Builder()
            .baseUrl( /*"https://www.example.com"*/ "${networkConfiguration.domain}:${networkConfiguration.port}") //设置网络请求的Url地址
            .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //支持RxJava2平台
            .client(okHttpClient) //OKhttp3添加到Retrofit
            .build()
    }
    @Singleton
    @Provides
    @QualifierLoginApi
    fun provideLoginRetrofit(okHttpClient: OkHttpClient,loginBusinessConfiguration: LoginBusinessConfiguration): Retrofit {
        return Retrofit.Builder()
                .baseUrl(/*"https://www.login.com"*/"${loginBusinessConfiguration.domain}:${loginBusinessConfiguration.port}") //设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) //支持RxJava2平台
                .client(okHttpClient) //OKhttp3添加到Retrofit
                .build()
    }
}

