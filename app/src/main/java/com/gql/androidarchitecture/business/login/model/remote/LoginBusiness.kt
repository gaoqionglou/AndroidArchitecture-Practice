package com.gql.androidarchitecture.business.login.model.remote

import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.business.login.model.LoginResponse
import io.reactivex.Observable

interface LoginBusiness {
    fun login(loginData: LoginData): Observable<LoginResponse>
    fun logout(loginData: LoginData)
}