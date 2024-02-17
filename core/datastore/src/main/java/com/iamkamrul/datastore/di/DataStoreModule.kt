
package com.iamkamrul.datastore.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.core.DataStoreFactory
import androidx.datastore.dataStoreFile
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStoreFile
import com.iamkamrul.datastore.UserPreferences
import com.iamkamrul.datastore.proto.StringToListMigration
import com.iamkamrul.datastore.proto.UserPreferencesSerializer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {
    @Provides
    @Singleton
    internal fun providePreferenceDataStore(
        @ApplicationContext context: Context
    ):DataStore<Preferences>{
        return PreferenceDataStoreFactory.create{
            context.preferencesDataStoreFile("user_preferences")
        }
    }

    @Provides
    @Singleton
    internal fun providesUserPreferencesProtoDataStore(
        @ApplicationContext context: Context,
        userPreferencesSerializer: UserPreferencesSerializer,
    ): DataStore<UserPreferences> =
        DataStoreFactory.create(
            serializer = userPreferencesSerializer,
            migrations = listOf(
                StringToListMigration,
            ),
        ) {
            context.dataStoreFile("user_preferences_proto.pb")
        }
}
