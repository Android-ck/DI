package com.zerir.di.di

import com.zerir.di.data.AuthRepository
import com.zerir.di.presentaion.AuthViewModelFactory

class AuthContainer(authRepository: AuthRepository) {

    val authViewModelFactory = AuthViewModelFactory(authRepository)

}