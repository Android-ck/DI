package com.zerir.di.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class AuthApi {

    suspend fun login() {
        withContext(Dispatchers.IO) {
            //Do login stuff
        }
    }

    suspend fun register() {
        withContext(Dispatchers.IO) {
            //Do register stuff
        }
    }

}