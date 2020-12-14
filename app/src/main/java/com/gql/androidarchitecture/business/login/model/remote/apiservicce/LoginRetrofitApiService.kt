package com.gql.androidarchitecture.business.login.model.remote.apiservicce

import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.business.login.model.LoginResponse
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface LoginRetrofitApiService {

    @POST("{proxy}/user/login.do")
    fun getLogin(@Path("proxy", encoded = true) proxy: String,
                 @Body loginData: LoginData): Observable<LoginResponse>

}