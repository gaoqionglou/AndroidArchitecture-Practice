package com.gql.androidarchitecture.business.login

import com.gql.androidarchitecture.base.BasePresenter
import com.gql.androidarchitecture.base.BaseView
import com.gql.androidarchitecture.business.login.model.LoginData


interface LoginContract {
    interface View : BaseView {
        fun showLoginLoading()
        fun hideLoginLoading()
        fun loginSuccess()
        fun loginFail()
    }

    interface Presenter : BasePresenter<View> {
        fun login(data: LoginData)
        fun logout()
    }
}

