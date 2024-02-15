package com.iamkamrul.data.di

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
}