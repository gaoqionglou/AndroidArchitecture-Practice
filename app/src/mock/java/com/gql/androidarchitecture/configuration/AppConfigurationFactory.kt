package com.gql.androidarchitecture.configuration

import com.gql.androidarchitecture.Mock
import com.gql.androidarchitecture.base.NetworkConfiguration
import com.gql.androidarchitecture.business.login.configuration.LoginBusinessConfiguration

/** AppConfigurationFactory in mock version */
object AppConfigurationFactory {
    fun provideNetworkConfiguration(): NetworkConfiguration = NetworkConfiguration(Mock,"mock","mock")

    fun provideLoginBusinessConfiguration(): LoginBusinessConfiguration = LoginBusinessConfiguration("mock","mock")
}