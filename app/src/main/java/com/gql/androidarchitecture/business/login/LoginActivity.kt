package com.gql.androidarchitecture.business.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import com.gql.androidarchitecture.business.login.model.LoginData
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_login.*
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginContract.View {
//    @Inject
//    @QualifierLoginApi
//    lateinit var retrofit: Retrofit

    @Inject
    lateinit var loginPresenter: LoginPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        loginPresenter.attachView(this)
        btnLogin.setOnClickListener {
            loginPresenter.login(LoginData("1","1"))
        }
    }

    override fun showLoginLoading() {
        Toast.makeText(this, "wait for logon", Toast.LENGTH_SHORT).show()
    }

    override fun hideLoginLoading() {
        Toast.makeText(this, "end logon", Toast.LENGTH_SHORT).show()
    }

    override fun loginSuccess() {
        Toast.makeText(this, "end logon", Toast.LENGTH_SHORT).show()
    }

    override fun loginFail() {
        Toast.makeText(this, "end logon", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        loginPresenter.dropView()
    }

}