package com.gql.androidarchitecture.business.login.model

/**
 *
 */
data class LoginData(val username: String, val password: String) :java.io.Serializable

data class LoginResponse(val loginId: String, val username: String):java.io.Serializable