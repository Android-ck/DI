package com.zerir.di

import android.app.Application
import com.zerir.di.di.*
import org.koin.android.ext.android.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin(
            androidContext = this@MyApp,
            modules = listOf(appModule, repoModule, viewModelModule),
        )
    }

}
