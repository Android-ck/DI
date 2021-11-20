package com.zerir.di.di

import com.zerir.di.presentation.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragmentInjector(): AuthActivity

}