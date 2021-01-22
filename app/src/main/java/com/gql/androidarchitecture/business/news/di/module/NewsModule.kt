package com.gql.androidarchitecture.business.news.di.module

import com.gql.androidarchitecture.base.di.annotation.QualifierDefaultApi
import com.gql.androidarchitecture.business.news.NewsPresenterImpl
import com.gql.androidarchitecture.business.news.model.NewsBusiness
import com.gql.androidarchitecture.business.news.model.NewsRepository
import com.gql.androidarchitecture.business.news.model.remote.apiservice.NewsRetrofitApiService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
object NewsModule {
    @Provides
    @JvmStatic
    fun provideNewsRetrofitApiService(@QualifierDefaultApi retrofit: Retrofit): NewsRetrofitApiService {
        return retrofit.create(NewsRetrofitApiService::class.java)
    }

    @Provides
    @JvmStatic
    fun provideNewsRepository(newsRetrofitApiService: NewsRetrofitApiService): NewsRepository {
        return NewsRepository(newsRetrofitApiService)
    }

    @Provides
    @JvmStatic
    fun provideNewsPresenter(newsBusiness: NewsBusiness): NewsPresenterImpl {
        return NewsPresenterImpl(newsBusiness)
    }

}