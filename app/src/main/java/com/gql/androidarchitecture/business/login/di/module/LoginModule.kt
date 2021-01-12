package com.gql.androidarchitecture.business.login.di.module

import com.gql.androidarchitecture.base.di.QualifierLoginApi
import com.gql.androidarchitecture.business.login.LoginContract
import com.gql.androidarchitecture.business.login.LoginPresenterImpl
import com.gql.androidarchitecture.business.login.model.remote.LoginBusiness
import com.gql.androidarchitecture.business.login.model.remote.LoginRepository
import com.gql.androidarchitecture.business.login.model.remote.apiservicce.LoginRetrofitApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object LoginModule {
    @Provides
    @JvmStatic
    fun provideLoginBusinessRepository(loginRetrofitApiService: LoginRetrofitApiService): LoginBusiness {
        return LoginRepository(loginRetrofitApiService)
    }


    @Provides
    @JvmStatic
    fun provideLoginPresenter(taskRepository: LoginRepository): LoginContract.Presenter {
        return LoginPresenterImpl(taskRepository)
    }

    @Provides
    @JvmStatic
    fun provideLoginRetrofitApiService(@QualifierLoginApi retrofit: Retrofit): LoginRetrofitApiService {
        return retrofit.create(LoginRetrofitApiService::class.java)
    }

}