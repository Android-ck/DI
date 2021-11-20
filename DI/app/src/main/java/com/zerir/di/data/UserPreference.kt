package com.zerir.di.data

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserPreference @Inject constructor(@ApplicationContext context: Context) {

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