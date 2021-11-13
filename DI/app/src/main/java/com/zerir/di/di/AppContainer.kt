package com.zerir.di.di

import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthRepository
import com.zerir.di.data.UserPreference

class AppContainer {

    private val api = AuthApi()
    private val preferences = UserPreference()
    private val authRepository = AuthRepository(api, preferences)

    private var _authContainer: AuthContainer? = null
    val authContainer get() = _authContainer
    fun setUpAuthContainer() {
        _authContainer = AuthContainer(authRepository)
    }
    fun clearAuthContainer() {
        _authContainer = null
    }

}