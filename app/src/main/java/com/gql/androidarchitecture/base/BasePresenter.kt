package com.gql.androidarchitecture.base

import io.reactivex.disposables.CompositeDisposable

interface BasePresenter<T : BaseView> {
    val compositeDisposable: CompositeDisposable
    fun attachView(view: T)
    fun dropView()
}