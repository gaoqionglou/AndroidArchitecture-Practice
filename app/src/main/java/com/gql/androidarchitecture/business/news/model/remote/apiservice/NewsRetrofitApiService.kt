package com.gql.androidarchitecture.business.news.model.remote.apiservice

import com.gql.androidarchitecture.business.news.model.News
import com.gql.androidarchitecture.business.news.model.NewsDetail
import com.gql.androidarchitecture.business.news.model.NewsRequest
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface NewsRetrofitApiService {
    @POST("{proxy}/news/newsList.do")
    fun getNewsList(@Path("proxy", encoded = true) proxy: String,
                    @Body body: NewsRequest): Observable<List<News>>

    @POST("{proxy}/news/newsDetail.do")
    fun getNewsList(@Path("proxy", encoded = true) proxy: String,
                    @Body body: News): Observable<NewsDetail>
}