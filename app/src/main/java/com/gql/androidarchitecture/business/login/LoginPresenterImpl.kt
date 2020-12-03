package com.gql.androidarchitecture.business.login

import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.business.login.model.remote.LoginRepository
import javax.inject.Inject

class LoginPresenterImpl @Inject constructor(var loginRepository: LoginRepository) : LoginContract.Presenter {
    var loginView: LoginContract.View? = null


    override fun login(data: LoginData) {

    }

    override fun logout() {

    }

    override fun attachView(view: LoginContract.View) {
        loginView = view
    }

    override fun dropView() {
        this.loginView = null
    }


    fun processLogin(data: LoginData) {
        loginRepository.login(data)
    }

}