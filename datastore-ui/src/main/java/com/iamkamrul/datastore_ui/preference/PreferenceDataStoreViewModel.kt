package com.iamkamrul.datastore_ui.preference

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamkamrul.data.repoimpl.datastore.PrefKey
import com.iamkamrul.data.repository.datastore.PreferenceDataStoreRepository
import com.iamkamrul.data.repository.datastore.ProtoDataStoreRepository
import com.iamkamrul.model.datastore.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PreferenceDataStoreViewModel @Inject constructor(
    private val preferenceDataStoreRepository: PreferenceDataStoreRepository
): ViewModel() {
    var fullNameInput by mutableStateOf("")
        private set
    var emailInput by mutableStateOf("")
        private set
    var ageInput by mutableStateOf("")
        private set

    init {
        fetchUserData()
    }

    private fun fetchUserData(){
        viewModelScope.launch {
            fullNameInput = preferenceDataStoreRepository.getValue(PrefKey.fullName).first() ?: ""
            emailInput = preferenceDataStoreRepository.getValue(PrefKey.email).first() ?: ""
            ageInput = preferenceDataStoreRepository.getValue(PrefKey.age).first()?.toString() ?: ""
        }
    }

    fun updateUserData(){
        viewModelScope.launch {
            preferenceDataStoreRepository.putValue(PrefKey.fullName,fullNameInput)
            preferenceDataStoreRepository.putValue(PrefKey.email,emailInput)
            preferenceDataStoreRepository.putValue(PrefKey.age,ageInput.toInt())
        }
    }


    fun onChangeFullNameInput(value:String){
        fullNameInput = value
    }

    fun onChangeEmailInput(value:String){
        emailInput = value
    }

    fun onChangeAgeInput(value:String){
        ageInput = value
    }
}