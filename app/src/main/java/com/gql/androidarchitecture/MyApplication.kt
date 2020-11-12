package com.gql.androidarchitecture

import android.app.Activity
import android.app.Application
import android.app.Fragment
import com.gql.androidarchitecture.base.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.HasFragmentInjector
import dagger.android.support.HasSupportFragmentInjector
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector, HasFragmentInjector,
    HasSupportFragmentInjector {
    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    @Inject
    lateinit var dispatchingFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var dispatchingSupportFragmentInjector: DispatchingAndroidInjector<androidx.fragment.app.Fragment>
    override fun activityInjector(): AndroidInjector<Activity> = dispatchingActivityInjector

    override fun fragmentInjector(): AndroidInjector<Fragment> = dispatchingFragmentInjector

    override fun supportFragmentInjector(): AndroidInjector<androidx.fragment.app.Fragment> =
        dispatchingSupportFragmentInjector


    override fun onCreate() {

        super.onCreate()
        DaggerApplicationComponent.builder().application(this).build()
    }

}