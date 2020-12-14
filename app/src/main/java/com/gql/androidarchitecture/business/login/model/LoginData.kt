package com.gql.androidarchitecture.business.login.model

/**
 *
 */
data class LoginData(val username: String, val password: String)

data class LoginResponse(val loginId: String, val username: String)