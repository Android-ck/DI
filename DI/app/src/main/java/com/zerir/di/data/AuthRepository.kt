package com.zerir.di.data

class AuthRepository(
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