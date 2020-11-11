package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.MyApplication
import com.gql.androidarchitecture.base.activity.BaseActivity
import com.gql.androidarchitecture.base.di.ActivityScoped
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class AppBaseModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = [DemoModule::class])
    abstract fun contributeYourAndroidInjector(): BaseActivity
}


@Module
  class AppBaseModuleV2 constructor(application: MyApplication){


}