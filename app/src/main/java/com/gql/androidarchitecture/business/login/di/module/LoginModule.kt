package com.gql.androidarchitecture.business.login.di.module

import com.gql.androidarchitecture.business.login.LoginContract
import com.gql.androidarchitecture.business.login.LoginPresenterImpl
import dagger.Module
import dagger.Provides

@Module
class LoginModule {

    @Provides
    fun provideLoginPresenter(): LoginContract.Presenter {
        return LoginPresenterImpl()
    }
}