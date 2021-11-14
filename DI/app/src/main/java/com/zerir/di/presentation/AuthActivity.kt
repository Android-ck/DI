package com.zerir.di.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zerir.di.MyApp
import com.zerir.di.di.AppContainer

class AuthActivity : AppCompatActivity() {

    private lateinit var _appContainer: AppContainer
    val appContainer get() = _appContainer

    private var viewModel: AuthViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _appContainer = (application as MyApp).appContainer
        appContainer.setUpAuthContainer()

        viewModel = _appContainer.authContainer?.authViewModelFactory?.createViewModel()

        viewModel?.test()
    }

    override fun onDestroy() {
        super.onDestroy()
        _appContainer.clearAuthContainer()
    }

}