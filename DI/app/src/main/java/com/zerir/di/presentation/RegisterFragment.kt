package com.zerir.di.presentation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class RegisterFragment : Fragment() {

    private var viewModel: AuthViewModel? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (requireActivity() as AuthActivity)
            .appContainer.authContainer?.authViewModelFactory?.createViewModel()

        viewModel?.register()
        viewModel?.saveData()
    }

}