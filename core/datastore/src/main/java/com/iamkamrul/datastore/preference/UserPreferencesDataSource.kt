package com.iamkamrul.datastore.preference

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserPreferencesDataSource @Inject constructor(
    private val preference: DataStore<Preferences>
){

    suspend fun<T> putValue(key:Preferences.Key<T>,value:T){
        preference.edit {
           it[key] = value
        }
    }

    fun<T> getValue(key:Preferences.Key<T>):Flow<T?>{
        return preference.data.map {
            it[key]
        }
    }


}