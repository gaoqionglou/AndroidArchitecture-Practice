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


    @Singleton
    @Provides
    @JvmStatic
    fun provideDemoData(): DemoData {
        return DemoData("DemoData")
    }


    @Provides
    @JvmStatic
    @Named(DEMODATAV2)
    fun provideDemoDataV2(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2()

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_1)
    fun provideDemoDataV21(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2("V2-1")

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_2)
    fun provideDemoDataV22(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2("V2-2")

    @Provides
    @JvmStatic
    @Named(DEMODATAV2_3)
    fun provideDemoDataV23(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2("V2-3")


    @Provides
    @JvmStatic
    @Named(DEMODATAV2_4)
    fun provideDemoDataV24(demoDataV2: DemoDataV2): DemoDataV2 = DemoDataV2("V2-4")

}


class DemoData @Inject constructor(val arg: String) {

}

class DemoDataV2 @Inject constructor() {
    var arg = ""

    @Inject
    constructor(arg: String) : this() {

        this.arg = arg
    }

}