package com.gql.androidarchitecture.di.module

import android.content.Context
import com.gql.androidarchitecture.TestApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TestAppModule {

    @Provides
    @Singleton
    fun provideContext(application: TestApplication):Context{
        return  application
    }

    @Provides
    @Singleton
    fun provideApplication(application: TestApplication):Context{
        return  application
    }

     
}