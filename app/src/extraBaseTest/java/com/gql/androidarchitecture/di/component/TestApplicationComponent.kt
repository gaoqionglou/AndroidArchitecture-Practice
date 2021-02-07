package com.gql.androidarchitecture.di.component

import com.gql.androidarchitecture.MyApplication
import com.gql.androidarchitecture.base.di.module.ActivityBindModule
import com.gql.androidarchitecture.base.di.module.ConfigurationModule
import com.gql.androidarchitecture.base.di.module.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, ConfigurationModule::class, ActivityBindModule::class, AndroidSupportInjectionModule::class, AndroidInjectionModule::class])
interface TestApplicationComponent {
    @Component.Builder
    interface Builder {
        fun build(): TestApplicationComponent

        @BindsInstance
        fun application(application: MyApplication): Builder


    }

    fun inject(application: MyApplication)
}