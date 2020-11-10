package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.base.activity.BaseActivity
import com.gql.androidarchitecture.base.di.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class AppBaseModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [])
    abstract fun contributeYourAndroidInjector(): BaseActivity
}