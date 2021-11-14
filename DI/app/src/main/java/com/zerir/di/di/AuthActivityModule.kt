package com.zerir.di.di

import com.zerir.di.presentaion.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AuthActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragmentInjector(): AuthActivity

}