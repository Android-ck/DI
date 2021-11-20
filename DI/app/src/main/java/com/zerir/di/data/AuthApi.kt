package com.zerir.di.data

import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthApi : AuthApiReference {

    override suspend fun login() {
        withContext(Dispatchers.IO) {
            Log.d("PRINTING", "AuthAPi Login")
        }
    }

    override suspend fun register() {
        withContext(Dispatchers.IO) {
            Log.d("PRINTING", "AuthAPi Register")
        }
    }

    override suspend fun test() {
        Log.d("PRINTING", "Test Auth Api")
    }
}