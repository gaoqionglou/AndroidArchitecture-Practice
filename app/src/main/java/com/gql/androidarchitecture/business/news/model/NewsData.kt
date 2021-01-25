package com.gql.androidarchitecture.business.news.model

import java.io.Serializable

data class NewsRequest(val token: String): Serializable

data class News(val newsId: String, val newsTitle: String, val newsDetailId: String): Serializable

data class NewsDetail(val newsId: String, val newsTitle: String, val content: String): Serializable