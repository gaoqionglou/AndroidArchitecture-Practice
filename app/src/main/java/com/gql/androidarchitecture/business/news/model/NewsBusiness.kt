package com.gql.androidarchitecture.business.news.model

import io.reactivex.Observable

interface NewsBusiness {
    fun getNewsList(token:String): Observable<List<News>>
    fun getNewsDetail(newsId:String): Observable<NewsDetail>
}