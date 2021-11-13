package com.zerir.di

import android.app.Application
import com.zerir.di.di.AppContainer

class MyApp : Application() {

    private lateinit var _appContainer: AppContainer
    val appContainer get() = _appContainer

    override fun onCreate() {
        super.onCreate()

        _appContainer = AppContainer()

    }

}