package com.gql.androidarchitecture.business.login

import com.gql.androidarchitecture.base.BasePresenterImpl
import com.gql.androidarchitecture.business.login.model.LoginData
import com.gql.androidarchitecture.business.login.model.remote.LoginRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class LoginPresenterImpl @Inject constructor(var loginRepository: LoginRepository) :
        BasePresenterImpl<LoginContract.View>(),
        LoginContract.Presenter {

    override fun login(data: LoginData) {
        processLogin(data)
    }

    override fun logout() {

    }


    private fun processLogin(data: LoginData) {
        val observable = loginRepository.login(data).map { it.loginId }
        val disposable = observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally {
                    view?.hideLoginLoading()
                }.doOnSubscribe {
                    view?.showLoginLoading()
                }.subscribe({
                    view?.loginSuccess()
                }, {
                    view?.loginFail()
                })
        compositeDisposable.add(disposable)

    }

}