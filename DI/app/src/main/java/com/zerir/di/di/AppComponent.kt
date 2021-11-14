package com.zerir.di.di

import com.zerir.di.MyApp
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        AuthActivityModule::class,
        LoginFragmentModule::class,
        RegisterFragmentModule::class,
    ]
)
interface AppComponent {

    fun inject(application: MyApp)

}