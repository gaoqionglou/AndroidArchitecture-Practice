package com.gql.androidarchitecture.extension

import com.gql.androidarchitecture.BuildConfig
import com.gql.androidarchitecture.base.network.NetworkConstant
import io.reactivex.Observable
import java.util.concurrent.TimeUnit


fun <T> mockDelayObservable(observable: Observable<T>): Observable<T> {
    return if (NetworkConstant.MOCK == BuildConfig.FLAVOR_environment.toUpperCase()) {
        observable.delay(10, TimeUnit.SECONDS)
    } else {
        observable
    }
}