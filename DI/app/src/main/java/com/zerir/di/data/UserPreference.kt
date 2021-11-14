package com.zerir.di.data

import android.content.Context
import android.util.Log
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class UserPreference @Inject constructor(@ApplicationContext context: Context) {

    suspend fun saveData(){
        withContext(Dispatchers.IO) {
            //Do saving stuff
        }
    }

    fun test() {
        Log.d("Test", "User Preference")
    }

}