package com.gql.androidarchitecture.base.di.component

import com.gql.androidarchitecture.MyApplication
import com.gql.androidarchitecture.base.di.module.AppBaseModule
import com.gql.androidarchitecture.base.di.module.AppBaseModuleV2
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(modules = [AppBaseModule::class, AndroidSupportInjectionModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponent

        @BindsInstance
        fun application(application: MyApplication): Builder
    }
}

@Singleton
@Component(modules = [AppBaseModuleV2::class, AndroidSupportInjectionModule::class])
interface ApplicationComponentV2 {
    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponentV2

//        @BindsInstance 它可以让我们省去写这AppBaseModuleV2类构造函数，通过它能够为类的成员变量赋值

        fun appBaseModuleV2(appModule: AppBaseModuleV2): Builder
    }
}

