package com.gql.androidarchitecture.base.network

import okhttp3.Interceptor
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
                    "/user/login.do" to { request ->
                        MockDataCreator("login.json").getMockResponse(request)
                    },
                    "/news/newsList.do" to { request ->
                        MockDataCreator("newsList.json").getMockResponse(request)
                    },
                    "/news/newsDetail.do" to { request ->
                        MockDataCreator("newsDetail.json").getMockResponse(request)
                    }
            )
        }

    }
}