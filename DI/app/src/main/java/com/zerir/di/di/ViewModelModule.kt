package com.zerir.di.di

import com.zerir.di.presentation.AuthViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val viewModelModule = module {
    viewModel { AuthViewModel(get()) }
}