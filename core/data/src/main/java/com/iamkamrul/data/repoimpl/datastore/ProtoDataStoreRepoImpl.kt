package com.iamkamrul.data.repoimpl.datastore

import com.iamkamrul.data.repository.datastore.ProtoDataStoreRepository
import com.iamkamrul.datastore.proto.ProtoDataSource
import com.iamkamrul.model.datastore.UserData
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ProtoDataStoreRepoImpl @Inject constructor(
    private val protoDataSource: ProtoDataSource
):ProtoDataStoreRepository{
    override val userData: Flow<UserData> = protoDataSource.userData

    override suspend fun updateUserData(userData: UserData) {
        protoDataSource.updateUserData(userData)
    }
}