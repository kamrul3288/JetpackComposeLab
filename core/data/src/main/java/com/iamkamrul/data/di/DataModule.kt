package com.iamkamrul.data.di

import com.iamkamrul.data.repoimpl.datastore.PreferenceDataStoreRepoImpl
import com.iamkamrul.data.repoimpl.datastore.ProtoDataStoreRepoImpl
import com.iamkamrul.data.repository.datastore.PreferenceDataStoreRepository
import com.iamkamrul.data.repository.datastore.ProtoDataStoreRepository
import com.iamkamrul.data.utils.NetworkMonitor
import com.iamkamrul.data.utils.NetworkMonitorManager
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    internal abstract fun bindsNetworkMonitor(
        networkMonitor: NetworkMonitorManager,
    ): NetworkMonitor

    @Binds
    internal abstract fun bindsProtoDataStoreRepository(
        protoDataStoreRepoImpl: ProtoDataStoreRepoImpl,
    ): ProtoDataStoreRepository

    @Binds
    internal abstract fun bindsPreferenceDataStoreRepository(
        preferenceDataStoreRepoImpl: PreferenceDataStoreRepoImpl,
    ): PreferenceDataStoreRepository
}