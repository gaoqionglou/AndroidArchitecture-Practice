package com.gql.androidarchitecture.base.di.module

import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

const val DEMODATAV2 = "DEMODATAV2"
const val DEMODATAV2_1 = "DEMODATAV2-1"
const val DEMODATAV2_2 = "DEMODATAV2-2"
const val DEMODATAV2_3 = "DEMODATAV2-3"
const val DEMODATAV2_4 = "DEMODATAV2-4"

@Module
object DemoModule {


//    @Singleton
    @Provides
    @JvmStatic
    fun provideDemoData(): DemoData {
        return DemoData("DemoData")
    }


    @Provides
    @JvmStatic
    @Named(DEMODATAV2)
    fun provideDemoDataV2(): DemoDataV2 = DemoDataV2(DEMODATAV2)

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_1)
    fun provideDemoDataV21(): DemoDataV2 = DemoDataV2(DEMODATAV2_1)

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_2)
    fun provideDemoDataV22(): DemoDataV2 = DemoDataV2(DEMODATAV2_2)

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_3)
    fun provideDemoDataV23(): DemoDataV2 = DemoDataV2(DEMODATAV2_3)


    @Provides
    @JvmStatic
    @Named(DEMODATAV2_4)
    fun provideDemoDataV24(): DemoDataV2 = DemoDataV2(DEMODATAV2_4)

}


class DemoData @Inject constructor(val arg: String) {
    fun showString(): String {
        return "DemoData(arg='$arg')"
    }
}

class DemoDataV2 @Inject constructor(val arg: String) {
    fun showString(): String {
        return "DemoDataV2(arg='$arg')"
    }

}