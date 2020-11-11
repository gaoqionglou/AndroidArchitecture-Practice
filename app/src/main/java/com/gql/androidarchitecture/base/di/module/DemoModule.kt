package com.gql.androidarchitecture.base.di.module

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

@Module
object DemoModule {


    @Singleton
    @Provides
    @JvmStatic
    fun provideDemoData(): DemoData {
        return DemoData("DemoData")
    }


    @Provides
    @JvmStatic
    fun provideDemoDataV2(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2()

}


class DemoData @Inject constructor(val arg: String) {

}

class DemoDataV2 @Inject constructor() {

}