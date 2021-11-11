package com.zerir.di.data

class AuthRepository(
    private val authApi: AuthApi,
    private val userPreference: UserPreference,
) {

    suspend fun login() = authApi.login()

    suspend fun register() = authApi.register()

    suspend fun saveData() = userPreference.saveData()

}