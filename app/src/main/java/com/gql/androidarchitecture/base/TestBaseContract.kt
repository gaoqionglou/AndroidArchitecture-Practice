package com.gql.androidarchitecture.base

import io.reactivex.disposables.CompositeDisposable

interface TestContract {
    interface TestView : BaseView<TestPresenter> {
        fun showTestView()
    }

    interface TestPresenter : BasePresenter<TestView> {
        fun doTest(): MutableList<Int>
    }
}


class TestView : TestContract.TestView {
    override fun showTestView() {

    }

}

class TestPresenterImp : TestContract.TestPresenter {
    override fun doTest(): MutableList<Int> = mutableListOf(1, 2, 3)
    override var compositeDisposable: CompositeDisposable?=null


    override fun attachView(view: TestContract.TestView) = Unit

    override fun dropView() = Unit
}