package com.gql.androidarchitecture.business.login

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : AppCompatActivity(),LoginContract.View {

    @Inject
    lateinit var loginPresenter: LoginContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    override fun showLoginLoading() {
        Toast.makeText(this,"wait for logon",Toast.LENGTH_SHORT).show()
    }

    override fun hideLoginLoading() {
        Toast.makeText(this,"end logon",Toast.LENGTH_SHORT).show()
    }

    override fun loginSuccess() {
        Toast.makeText(this,"end logon",Toast.LENGTH_SHORT).show()
    }

    override fun loginFail() {
        Toast.makeText(this,"end logon",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        loginPresenter.dropView()
    }

}