package com.gql.androidarchitecture.business.login.model.remote

import com.gql.androidarchitecture.business.login.model.LoginData

interface LoginBusiness {
    fun login(loginData: LoginData)
    fun logout(loginData: LoginData)
}