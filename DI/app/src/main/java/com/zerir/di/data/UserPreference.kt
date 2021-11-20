package com.zerir.di.data

import android.content.Context
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserPreference(context: Context) {

    private val context = context.applicationContext

    suspend fun saveData(){
        withContext(Dispatchers.IO) {
            Log.d("PRINTING", "Saving Data: ${context.packageName}")
        }
    }

    fun test() {
        Log.d("PRINTING", "Test User Preference")
    }

}