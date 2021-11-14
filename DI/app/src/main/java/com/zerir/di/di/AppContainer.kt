package com.zerir.di.di

import android.content.Context
import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthRepository
import com.zerir.di.data.UserPreference

class AppContainer(context: Context) {

    private val api = AuthApi()
    private val preferences = UserPreference(context)
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