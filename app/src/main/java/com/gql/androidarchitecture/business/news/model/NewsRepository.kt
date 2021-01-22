package com.gql.androidarchitecture.business.news.model

import com.gql.androidarchitecture.business.news.model.remote.apiservice.NewsRetrofitApiService
import io.reactivex.Observable
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsRetrofitApiService: NewsRetrofitApiService) : NewsBusiness {
    override fun getNewsList(token: String): Observable<List<News>> {
        TODO("Not yet implemented")
    }

    override fun getNewsDetail(newsId: String): Observable<NewsDetail> {
        TODO("Not yet implemented")
    }


}