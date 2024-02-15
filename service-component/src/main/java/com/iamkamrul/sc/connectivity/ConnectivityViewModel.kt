package com.iamkamrul.sc.connectivity

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamkamrul.data.utils.NetworkMonitor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ConnectivityViewModel @Inject constructor(
    private val networkMonitor: NetworkMonitor
):ViewModel() {
    var connectivityStatus by mutableStateOf("CONNECTED")
        private set

    init {
        listenNetworkMonitor()
    }

    private fun listenNetworkMonitor(){
        viewModelScope.launch {
            networkMonitor.isConnected.collect{
                connectivityStatus = if (it) "CONNECTED" else "DISCONNECTED"
            }
        }
    }
}