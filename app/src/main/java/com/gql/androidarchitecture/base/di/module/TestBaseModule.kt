package com.gql.androidarchitecture.base.di.module

import com.gql.androidarchitecture.base.TestContract
import com.gql.androidarchitecture.base.TestPresenterImp
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

const val TestPresenterV1 = "TestPresenterV1"
const val TestPresenterV2 = "TestPresenterV2"

@Module
class TestBaseModule {
    @Provides
    @Named(TestPresenterV1)
    fun providesTestPresenter(): TestContract.TestPresenter = TestPresenterImp()
}

//第二种写法，由于TestPresenterImp有无参构造函数，所以可以用@Binds
@Module
abstract class TestBaseModuleV2 {
    @Binds
    @Named(TestPresenterV2)
    abstract fun bindTestPresenter(testPresenterImpl: TestPresenterImp): TestContract.TestPresenter
}