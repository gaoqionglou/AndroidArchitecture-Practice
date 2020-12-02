package com.gql.androidarchitecture.business.login.di.module

import com.gql.androidarchitecture.business.login.LoginContract
import com.gql.androidarchitecture.business.login.LoginPresenterImpl
import com.gql.androidarchitecture.business.login.model.remote.LoginBusiness
import com.gql.androidarchitecture.business.login.model.remote.LoginRepository
import dagger.Module
import dagger.Provides

@Module
object LoginModule {
    @Provides
    @JvmStatic
    fun provideLoginBusinessRepository(): LoginBusiness {
        return LoginRepository()
    }


    @Provides
    @JvmStatic
    fun provideLoginPresenter(taskRepository: LoginRepository): LoginContract.Presenter {
        return LoginPresenterImpl(taskRepository)
    }


}