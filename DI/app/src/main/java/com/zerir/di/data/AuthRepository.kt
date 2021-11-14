package com.zerir.di.data

import javax.inject.Inject

class AuthRepository @Inject constructor(
    private val authApi: AuthApiReference,
    private val userPreference: UserPreference,
) {

    suspend fun login() = authApi.login()

    suspend fun register() = authApi.register()

    suspend fun saveData() = userPreference.saveData()

    suspend fun test() {
        authApi.test()
        userPreference.test()
    }

}