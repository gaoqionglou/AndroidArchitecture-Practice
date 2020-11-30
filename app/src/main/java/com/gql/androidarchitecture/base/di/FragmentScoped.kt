package com.gql.androidarchitecture.base.di

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@MustBeDocumented
@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScoped
