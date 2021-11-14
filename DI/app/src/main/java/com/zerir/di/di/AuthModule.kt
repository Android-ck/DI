package com.zerir.di.di

import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthApiReference
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class AuthModule {

    @Binds
    abstract fun bindAuthApi(authApi: AuthApi): AuthApiReference

}