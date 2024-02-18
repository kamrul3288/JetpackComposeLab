package com.iamkamrul.datastore.proto

import android.util.Log
import androidx.datastore.core.DataStore
import com.iamkamrul.datastore.UserPreferences
import com.iamkamrul.datastore.copy
import com.iamkamrul.model.datastore.UserData
import kotlinx.coroutines.flow.map
import java.io.IOException
import javax.inject.Inject

class ProtoDataSource @Inject constructor(
    private val userPreferences: DataStore<UserPreferences>
){
    val userData = userPreferences.data.map {
        UserData(
            fullName = it.fullName,
            email = it.email,
            age = it.age.toString()
        )
    }

    suspend fun updateUserData(userData: UserData){
        try {
            userPreferences.updateData {
                it.copy {
                    this.fullName = userData.fullName
                    this.age = userData.age.toInt()
                    this.email = userData.email
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