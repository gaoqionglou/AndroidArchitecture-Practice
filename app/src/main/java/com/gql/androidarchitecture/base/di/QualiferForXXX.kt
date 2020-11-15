package com.gql.androidarchitecture.base.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class QualiferForXXX


@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class QualiferForA
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class QualiferForB
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class QualiferForC
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
annotation class QualiferForD