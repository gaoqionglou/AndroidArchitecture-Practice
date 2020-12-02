package com.gql.androidarchitecture.business.login

import com.gql.androidarchitecture.business.login.model.remote.LoginRepository
import javax.inject.Inject

class LoginPresenterImpl @Inject constructor(var taskRepository: LoginRepository) : LoginContract.Presenter {

    @Inject
    lateinit var loginRepository: LoginRepository

    override fun login() {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }

    override fun attachView(view: LoginContract.View) {
        TODO("Not yet implemented")
    }

    override fun dropView() {
        TODO("Not yet implemented")
    }


}