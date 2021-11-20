package com.zerir.di.di

import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthApiReference
import com.zerir.di.data.UserPreference
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module.module

val appModule = module {
    single<AuthApiReference> { return@single AuthApi() }
    single { UserPreference(androidContext()) }
}