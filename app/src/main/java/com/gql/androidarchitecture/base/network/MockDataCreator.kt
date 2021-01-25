package com.gql.androidarchitecture.base.network

import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Protocol
import okhttp3.Request
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody


class MockDataCreator(private val fileName: String, private val mediaType: MediaType? = "application/json".toMediaType()) {

    fun getMockResponse(request: Request): Response {
        val fileString = readMockDataFile(fileName)
        return Response.Builder()
                .code(200)
                .addHeader("Content-Type", "application/json")
                .body(fileString.toResponseBody(mediaType))
                .request(request)
                .message("mock message")
                .protocol(Protocol.HTTP_2)
                .build()
    }

    private fun readMockDataFile(resourceName: String): String {
        val fileName = "mockdata/$resourceName"
        val classLoader = Thread.currentThread().contextClassLoader
        classLoader.getResourceAsStream(fileName).use { return it.reader().readText() }
    }
}