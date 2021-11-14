package com.zerir.di.data

interface AuthApiReference {

    suspend fun login()

    suspend fun register()

    suspend fun test()

}