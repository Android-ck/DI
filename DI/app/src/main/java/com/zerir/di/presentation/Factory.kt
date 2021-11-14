package com.zerir.di.presentation

interface Factory<T> {

    fun createViewModel() : T

}