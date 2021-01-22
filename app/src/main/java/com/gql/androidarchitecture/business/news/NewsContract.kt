package com.gql.androidarchitecture.business.news

import com.gql.androidarchitecture.base.BaseView

interface NewsContract {
    interface View: BaseView {
        fun startLoading()
        fun hideLoading()
    }
    interface Presenter{
        fun getNewsList()
        fun getNewsDetail()
    }
}