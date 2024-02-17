
package com.iamkamrul.datastore.proto

import androidx.datastore.core.DataMigration
import com.iamkamrul.datastore.UserPreferences
import com.iamkamrul.datastore.copy


internal object StringToListMigration : DataMigration<UserPreferences> {
    override suspend fun cleanUp() = Unit

    override suspend fun migrate(currentData: UserPreferences): UserPreferences =
        currentData.copy {
            fullNameChangesLists.add(fullName)
            hasDoneStringToListMigration = true
        }

    override suspend fun shouldMigrate(currentData: UserPreferences): Boolean =
        !currentData.hasDoneStringToListMigration
}
