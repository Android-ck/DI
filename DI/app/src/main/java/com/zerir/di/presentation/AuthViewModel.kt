package com.zerir.di.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zerir.di.data.AuthRepository
import kotlinx.coroutines.launch

class AuthViewModel(
    private val repository: AuthRepository,
) : ViewModel() {

    fun login() = viewModelScope.launch {
        repository.login()
    }

    fun register() = viewModelScope.launch {
        repository.register()
    }

    fun saveData() = viewModelScope.launch {
        repository.saveData()
    }

    fun test() = viewModelScope.launch {
        repository.test()
    }

}