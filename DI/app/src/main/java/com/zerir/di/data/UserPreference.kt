package com.zerir.di.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserPreference {

    suspend fun saveData(){
        withContext(Dispatchers.IO) {
            //Do saving stuff
        }
    }

}