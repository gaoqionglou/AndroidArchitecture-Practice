package com.gql.androidarchitecture.business.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.extension.gone
import com.gql.androidarchitecture.extension.visible
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
        progress_circular.visible()
    }

    override fun hideLoginLoading() {
        progress_circular.gone()
    }

    override fun loginSuccess() {
        hideLoginLoading()
        Toast.makeText(this, "login Success", Toast.LENGTH_SHORT).show()
    }

    override fun loginFail() {
        hideLoginLoading()

    }

    override fun onDestroy() {
        super.onDestroy()
        loginPresenter.dropView()
    }

}