package com.zerir.di.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthRepository
import com.zerir.di.data.UserPreference

class AuthActivity : AppCompatActivity() {

    private lateinit var viewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val api = AuthApi()
        val preferences = UserPreference(this)
        val authRepository = AuthRepository(api, preferences)
        viewModel = AuthViewModel(authRepository)

        viewModel.test()
    }

}