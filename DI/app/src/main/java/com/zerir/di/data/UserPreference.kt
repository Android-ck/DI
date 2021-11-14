package com.zerir.di.data

import android.content.Context
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserPreference(context: Context) {

    suspend fun saveData(){
        withContext(Dispatchers.IO) {
            //Do saving stuff
        }
    }

    fun test() {
        Log.d("Test", "User Preference")
    }

}