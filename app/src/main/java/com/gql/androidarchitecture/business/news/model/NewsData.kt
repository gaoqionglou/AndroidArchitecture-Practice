package com.gql.androidarchitecture.business.news.model

data class NewsRequest(val token: String)

data class News(val newsId: String, val newsTitle: String, val newsDetailId: String)

data class NewsDetail(val newsId: String, val newsTitle: String, val content: String)