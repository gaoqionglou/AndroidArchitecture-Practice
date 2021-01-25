package com.gql.androidarchitecture.base.network

import android.util.Log
import com.gql.androidarchitecture.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

class HttpMockInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val responses = mockResponse()
        for (response in responses) {
            if (request.url.encodedPathSegments.last { !it.isEmpty() } == response.key) {
                return response.value.invoke(request) //response.value(request)
            }
        }

        throw Exception("you do not have mock data for ${request.url}")
    }


    companion object {

        fun mockResponse(): Map<String, (Request) -> Response> {
            return mapOf(
                    "login.do" to { request ->
                        MockDataCreator("login.json").getMockResponse(request)
                    },
                    "newsList.do" to { request ->
                        MockDataCreator("newsList.json").getMockResponse(request)
                    },
                    "newsDetail.do" to { request ->
                        MockDataCreator("newsDetail.json").getMockResponse(request)
                    }
            )
        }

    }
}


fun OkHttpClient.Builder.addMockInterceptor(): OkHttpClient.Builder {
    if (NetworkConstant.MOCK == BuildConfig.FLAVOR_environment.toUpperCase()) {
        Log.i("NetWork","MockInterceptor added")
        this.addInterceptor(HttpMockInterceptor())
    }
    return this
}