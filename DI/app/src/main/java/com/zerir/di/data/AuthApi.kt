package com.zerir.di.data

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthApi : AuthApiReference{

    override suspend fun login() {
        withContext(Dispatchers.IO) {
            //Do login stuff
        }
    }

    override suspend fun register() {
        withContext(Dispatchers.IO) {
            //Do register stuff
        }
    }

    override suspend fun test() {
        Log.d("Test", "Auth Api")
    }

}