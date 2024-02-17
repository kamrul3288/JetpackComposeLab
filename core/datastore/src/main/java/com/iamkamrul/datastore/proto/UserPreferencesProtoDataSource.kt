package com.iamkamrul.datastore.proto

import android.util.Log
import androidx.datastore.core.DataStore
import com.iamkamrul.datastore.UserPreferences
import com.iamkamrul.datastore.copy
import kotlinx.coroutines.flow.Flow
import java.io.IOException
import javax.inject.Inject

class UserPreferencesProtoDataSource @Inject constructor(
    private val userPreferences: DataStore<UserPreferences>
){
    val userData:Flow<UserPreferences> = userPreferences.data

    suspend fun updateUserData(fullName:String, email:String, age:Int){
        try {
            userPreferences.updateData {
                it.copy {
                    this.fullName = fullName
                    this.age = age
                    this.email = email
                }
            }
        }catch (ioException: IOException) {
            Log.e("Jetpack-Compose-Lab", "Failed to update user preferences", ioException)
        }
    }


    suspend fun updateFullName(fullName:String){
        userPreferences.updateData {
            it.copy {
                this.fullName = fullName
            }
        }
    }

    suspend fun updateEmail(email:String){
        userPreferences.updateData {
            it.copy {
                this.email = email
            }
        }
    }

    suspend fun updateAge(age:Int){
        userPreferences.updateData {
            it.copy {
                this.age = age
            }
        }
    }
}