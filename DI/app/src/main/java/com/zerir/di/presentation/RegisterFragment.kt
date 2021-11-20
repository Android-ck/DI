package com.zerir.di.presentation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.zerir.di.R

class RegisterFragment : Fragment(R.layout.fragment_register) {

    private val viewModel: AuthViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.register_bt).setOnClickListener {
            viewModel.register()
            viewModel.saveData()
        }

        view.findViewById<Button>(R.id.loginScreen_bt).setOnClickListener {
            findNavController().popBackStack()
        }
    }

}