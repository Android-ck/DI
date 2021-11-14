package com.zerir.di.di

import com.zerir.di.presentaion.RegisterFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class RegisterFragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeLoginFragmentInjector(): RegisterFragment

}