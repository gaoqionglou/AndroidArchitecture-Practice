package com.gql.androidarchitecture.base.di.component

import com.gql.androidarchitecture.MyApplication
import com.gql.androidarchitecture.base.di.module.ActivityBindModule
import com.gql.androidarchitecture.base.di.module.NetworkModule
import com.gql.androidarchitecture.configuration.di.ConfigurationModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, ConfigurationModule::class, ActivityBindModule::class, AndroidSupportInjectionModule::class, AndroidInjectionModule::class])
interface ApplicationComponent {
    @Component.Builder
    interface Builder {
        fun build(): ApplicationComponent

        @BindsInstance
        fun application(application: MyApplication): Builder


    }

    fun inject(application: MyApplication)
}

//@Singleton
//@Component(modules = [AppBaseModuleV2::class, AndroidSupportInjectionModule::class])
//interface ApplicationComponentV2 {
//    @Component.Builder
//    interface Builder {
//        fun build(): ApplicationComponentV2
//
////        @BindsInstance 它可以让我们省去写这AppBaseModuleV2类构造函数，通过它能够为类的成员变量赋值
//
//        fun appBaseModuleV2(appModule: AppBaseModuleV2): Builder
//    }
//}
//
