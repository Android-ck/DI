package com.zerir.di.di

import com.zerir.di.presentaion.LoginFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class LoginFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragmentInjector(): LoginFragment

}