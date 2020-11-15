package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.base.activity.BaseActivity
import com.gql.androidarchitecture.base.di.ActivityScoped
import com.gql.androidarchitecture.business.login.LoginActivity
import com.gql.androidarchitecture.business.login.di.module.LoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class AppBaseModule {


    @ActivityScoped
    @ContributesAndroidInjector(modules = [DemoModule::class])
    abstract fun contributeBaseActivityInjector(): BaseActivity


    @ActivityScoped
    @ContributesAndroidInjector(modules = [LoginModule::class])
    abstract fun contributeLoginActivityInjector(): LoginActivity
}

