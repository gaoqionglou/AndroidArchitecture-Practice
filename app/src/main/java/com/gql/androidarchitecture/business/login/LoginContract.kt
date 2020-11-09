package com.gql.androidarchitecture.business.login

import com.gql.androidarchitecture.base.BasePresenter
import com.gql.androidarchitecture.base.BaseView


interface LoginContract {
    interface View : BaseView<Presenter> {

    }

    interface Presenter : BasePresenter<View> {
        fun login()
        fun logout()
    }
}

