package com.zerir.di.presentaion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zerir.di.data.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
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