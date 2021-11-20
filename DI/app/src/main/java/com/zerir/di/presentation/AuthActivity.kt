package com.zerir.di.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zerir.di.R
import org.koin.android.viewmodel.ext.android.viewModel

class AuthActivity : AppCompatActivity() {

    private val viewModel: AuthViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        viewModel.test()
    }

}