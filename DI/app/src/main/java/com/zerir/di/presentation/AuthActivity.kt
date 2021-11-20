package com.zerir.di.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.zerir.di.MyApp
import com.zerir.di.R
import com.zerir.di.di.AppContainer

class AuthActivity : AppCompatActivity() {

    private val _appContainer: AppContainer by lazy {
        (application as MyApp).appContainer
    }
    val appContainer get() = _appContainer

    private val viewModel: AuthViewModel by viewModels {
        val repo = appContainer.authRepository
        AuthViewModel.Factory(repo)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        viewModel.test()
    }

}