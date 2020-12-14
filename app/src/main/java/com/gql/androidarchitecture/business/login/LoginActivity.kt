package com.gql.androidarchitecture.business.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.gql.androidarchitecture.R
import com.gql.androidarchitecture.base.activity.TestActivity
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Retrofit
import javax.inject.Inject

class LoginActivity : AppCompatActivity(), LoginContract.View {
    @Inject
    lateinit var retrofit: Retrofit

    @Inject
    lateinit var loginPresenter: LoginPresenterImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login.text = retrofit.toString()
        login.setOnClickListener {
            startActivity(Intent(this, TestActivity::class.java))
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