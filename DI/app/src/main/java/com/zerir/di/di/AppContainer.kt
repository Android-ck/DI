package com.zerir.di.di

import android.content.Context
import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthRepository
import com.zerir.di.data.UserPreference

class AppContainer(context: Context) {

    private val api = AuthApi()
    private val preferences = UserPreference(context)
    val authRepository = AuthRepository(api, preferences)

}