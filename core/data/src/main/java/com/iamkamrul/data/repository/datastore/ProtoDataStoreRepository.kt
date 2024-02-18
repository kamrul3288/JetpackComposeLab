package com.iamkamrul.data.repository.datastore

import com.iamkamrul.model.datastore.UserData
import kotlinx.coroutines.flow.Flow

interface ProtoDataStoreRepository{
    val userData:Flow<UserData>

    suspend fun updateUserData(userData: UserData)
}