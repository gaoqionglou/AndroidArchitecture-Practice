package com.gql.androidarchitecture.configuration

import com.gql.androidarchitecture.Production
import com.gql.androidarchitecture.base.NetworkConfiguration
import com.gql.androidarchitecture.business.login.configuration.LoginBusinessConfiguration

/** AppConfigurationFactory in prod version */
object AppConfigurationFactory {
    fun provideNetworkConfiguration(): NetworkConfiguration = NetworkConfiguration(Production,"https://prod.com","443")

    fun provideLoginBusinessConfiguration(): LoginBusinessConfiguration = LoginBusinessConfiguration()
}