package com.zerir.di.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.zerir.di.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login) {

    private val viewModel: AuthViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.login_bt).setOnClickListener {
            viewModel.login()
            viewModel.saveData()
        }

        view.findViewById<Button>(R.id.registerScreen_bt).setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }
    }

}