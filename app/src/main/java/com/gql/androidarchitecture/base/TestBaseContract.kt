package com.gql.androidarchitecture.base

interface TestContract {
    interface TestView : BaseView {
        fun showTestView()
    }

    interface TestPresenter : BasePresenter<TestView> {
        fun doTest()
    }
}


class TestView : TestContract.TestView {
    override fun showTestView() {

    }

}

class TestPresenterImp : BasePresenterImpl<TestContract.TestView>(), TestContract.TestPresenter {
    override fun doTest() {
//        compositeDisposable.add()
    }

}