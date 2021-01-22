package com.gql.androidarchitecture.business.news

import com.gql.androidarchitecture.base.BasePresenterImpl
import com.gql.androidarchitecture.business.news.model.NewsBusiness
import javax.inject.Inject

class NewsPresenterImpl @Inject constructor(private val newsBusiness: NewsBusiness) :
        BasePresenterImpl<NewsContract.View>(),
        NewsContract.Presenter {

    override fun getNewsList() {
        TODO("Not yet implemented")
    }

    override fun getNewsDetail() {
        TODO("Not yet implemented")
    }

}