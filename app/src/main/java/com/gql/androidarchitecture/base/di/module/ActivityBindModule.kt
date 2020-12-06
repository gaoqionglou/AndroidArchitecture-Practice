package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.base.activity.TestActivity
import com.gql.androidarchitecture.base.di.ActivityScoped
import com.gql.androidarchitecture.business.login.LoginActivity
import com.gql.androidarchitecture.business.login.di.module.LoginModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBindModule {


    @ActivityScoped
    @ContributesAndroidInjector(modules = [DemoModule::class])
    abstract fun contributeBaseActivityInjector(): TestActivity


    @ActivityScoped
    @ContributesAndroidInjector(modules = [LoginModule::class,DemoModule::class])
    abstract fun contributeLoginActivityInjector(): LoginActivity
}

