package com.iamkamrul.data.repoimpl.datastore

import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.iamkamrul.data.repository.datastore.PreferenceDataStoreRepository
import com.iamkamrul.datastore.preference.PreferencesDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PreferenceDataStoreRepoImpl @Inject constructor(
    private val preferencesDataSource: PreferencesDataSource
) : PreferenceDataStoreRepository{
    override fun <T> getValue(key: Preferences.Key<T>): Flow<T?> {
        return preferencesDataSource.getValue(key)
    }

    override suspend fun <T> putValue(key: Preferences.Key<T>, value: T) {
       preferencesDataSource.putValue(key,value)
    }
}

object PrefKey{
    val fullName = stringPreferencesKey("fullName")
    val email = stringPreferencesKey("email")
    val age = intPreferencesKey("age")
}