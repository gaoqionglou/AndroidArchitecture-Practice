package com.gql.androidarchitecture.base

import io.reactivex.disposables.CompositeDisposable

interface BasePresenter<T> {
    var compositeDisposable: CompositeDisposable?
    fun attachView(view: T)
    fun dropView()
}