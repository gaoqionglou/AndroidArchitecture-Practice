package com.gql.androidarchitecture.business.login.model.remote

import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.business.login.model.LoginResponse
import com.gql.androidarchitecture.business.login.model.remote.apiservicce.LoginRetrofitApiService
import io.reactivex.Observable
import javax.inject.Inject

class LoginRepository @Inject constructor(private val loginRetrofitApiService: LoginRetrofitApiService) : LoginBusiness {


    override fun login(loginData: LoginData): Observable<LoginResponse> {
        return loginRetrofitApiService.getLogin("TODO", loginData)
    }

    override fun logout(loginData: LoginData) {

    }

}