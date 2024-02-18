package com.iamkamrul.data.repository.datastore

import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.flow.Flow

interface PreferenceDataStoreRepository {
    fun<T> getValue(key:Preferences.Key<T>):Flow<T?>
    suspend fun<T> putValue(key:Preferences.Key<T>,value:T)
}