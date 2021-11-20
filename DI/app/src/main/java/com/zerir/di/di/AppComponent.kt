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
        ViewModelModule::class,
        AuthActivityModule::class
    ]
)
interface AppComponent {

    fun inject(application: MyApp)

}