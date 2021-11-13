package com.zerir.di.presentaion

import com.zerir.di.data.AuthRepository

class AuthViewModelFactory(
    private val authRepository: AuthRepository
) : Factory<AuthViewModel> {

    override fun createViewModel(): AuthViewModel {
        return AuthViewModel(authRepository)
    }

}