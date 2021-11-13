package com.zerir.di.presentaion

interface Factory<T> {

    fun createViewModel() : T

}