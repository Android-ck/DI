package com.zerir.di.di

import com.zerir.di.data.AuthRepository
import org.koin.dsl.module.module

val repoModule = module {
    single {
        AuthRepository(get(), get())
    }
}