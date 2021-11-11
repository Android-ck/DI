package com.zerir.di.presentaion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.zerir.di.data.AuthApi
import com.zerir.di.data.AuthRepository
import com.zerir.di.data.UserPreference

class RegisterFragment : Fragment() {

    private lateinit var viewModel: AuthViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val api = AuthApi()
        val preferences = UserPreference()
        val authRepository = AuthRepository(api, preferences)
        viewModel = AuthViewModel(authRepository)

        viewModel.register()
        viewModel.saveData()
    }

}