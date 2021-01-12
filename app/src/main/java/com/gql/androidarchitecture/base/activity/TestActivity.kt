package com.gql.androidarchitecture.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import com.gql.androidarchitecture.base.di.module.*
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.layout.*
import javax.inject.Inject
import javax.inject.Named


class TestActivity : AppCompatActivity() {



    @Inject
    lateinit var demoData: DemoData


    @Inject
    lateinit var demoData1: DemoData


    //when using dagger in Kotlin, just need to turn @Named into @field:Named
    @Inject
    @field:Named(DEMODATAV2)
    lateinit var demoDataV2: DemoDataV2


    @Inject
    @field:Named(DEMODATAV2_1)
    lateinit var demoDataV2_1: DemoDataV2


    @Inject
    @field:Named(DEMODATAV2_2)
    lateinit var demoDataV2_2: DemoDataV2


    @Inject
    @field:Named(DEMODATAV2_3)
    lateinit var demoDataV2_3: DemoDataV2


    @Inject
    @field:Named(DEMODATAV2_4)
    lateinit var demoDataV2_4: DemoDataV2


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        tv.text = text()
    }


    val text = {
        var str = ""
//        str += retrofit.toString()
        str += "\n"

        str += demoData1.toString()
        str += "\n"

        str += demoDataV2_1.toString() + "-" + demoDataV2_1.showString()
        str += "\n"
        str += demoDataV2_2.toString() + "-" + demoDataV2_2.showString()
        str += "\n"
        str += demoDataV2_3.toString() + "-" + demoDataV2_3.showString()
        str += "\n"
        str += demoDataV2_4.toString() + "-" + demoDataV2_4.showString()
        str += "\n"
        str
    }


}