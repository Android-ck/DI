package com.zerir.di.di

import android.content.Context
import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthApiReference
import com.zerir.di.data.UserPreference
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule(
    private val context: Context
) {

    @Singleton
    @Provides
    fun provideAuthApi(): AuthApiReference {
        return AuthApi()
    }

    @Singleton
    @Provides
    fun provideUserPreference(): UserPreference {
        return UserPreference(context)
    }
}