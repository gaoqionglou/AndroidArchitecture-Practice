package com.gql.androidarchitecture.configuration.di

import com.gql.androidarchitecture.configuration.AppConfigurationFactory
import com.gql.androidarchitecture.base.NetworkConfiguration
import com.gql.androidarchitecture.business.login.configuration.LoginBusinessConfiguration
import dagger.Module
import dagger.Provides

@Module
object ConfigurationModule {
    @Provides
    @JvmStatic
    fun provideNetworkConfiguration(): NetworkConfiguration {
        return AppConfigurationFactory.provideNetworkConfiguration()
    }

    @Provides
    @JvmStatic
    fun provideLoginBusinessConfiguration(): LoginBusinessConfiguration {
        return AppConfigurationFactory.provideLoginBusinessConfiguration()
    }


}