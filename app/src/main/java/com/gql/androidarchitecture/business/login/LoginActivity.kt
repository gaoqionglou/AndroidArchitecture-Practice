package com.gql.androidarchitecture.business.login

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var logiPresenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        Log.i("login", logiPresenter.toString())
    }
}