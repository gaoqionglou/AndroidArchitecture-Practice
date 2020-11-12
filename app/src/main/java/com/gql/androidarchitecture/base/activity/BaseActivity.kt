package com.gql.androidarchitecture.base.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import com.gql.androidarchitecture.base.di.module.*
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import kotlinx.android.synthetic.main.layout.*
import javax.inject.Inject
import javax.inject.Named


class BaseActivity : AppCompatActivity() {



    @Inject
    lateinit var demoData: DemoData


    @Inject
    lateinit var demoData1: DemoData

    @Inject
    @Named(DEMODATAV2)
    lateinit var demoDataV2: DemoDataV2


    @Inject
    @Named(DEMODATAV2_1)
    lateinit var demoDataV2_1: DemoDataV2


    @Inject
    @Named(DEMODATAV2_2)
    lateinit var demoDataV2_2: DemoDataV2


    @Inject
    @Named(DEMODATAV2_3)
    lateinit var demoDataV2_3: DemoDataV2


    @Inject
    @Named(DEMODATAV2_4)
    lateinit var demoDataV2_4: DemoDataV2


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)
        tv.text = text()
    }


    val text = {
        var str = ""
        str += demoData.toString()
        str += "\n"

        str += demoData1.toString()
        str += "\n"
        str += demoDataV2_1.toString()
        str += "\n"
        str += demoDataV2_2.toString()
        str += "\n"
        str += demoDataV2_3.toString()
        str += "\n"
        str += demoDataV2_4.toString()
        str += "\n"
        str
    }


}