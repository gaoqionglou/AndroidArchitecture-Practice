package com.gql.androidarchitecture.base

interface BasePresenter<T> {
    fun attachView(view: T)
    fun dropView()
}