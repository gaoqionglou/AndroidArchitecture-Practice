package com.gql.androidarchitecture.base

import io.reactivex.disposables.CompositeDisposable

open class BasePresenterImpl<T : BaseView> : BasePresenter<T> {

    var view: T? = null

    override val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    override fun attachView(view: T) {
        this.view = view
    }

    override fun dropView() {
        this.view = null
        compositeDisposable.clear()
        compositeDisposable.dispose()
    }
}