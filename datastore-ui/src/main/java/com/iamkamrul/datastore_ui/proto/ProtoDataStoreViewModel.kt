package com.iamkamrul.datastore_ui.proto

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iamkamrul.data.repository.datastore.ProtoDataStoreRepository
import com.iamkamrul.model.datastore.UserData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProtoDataStoreViewModel @Inject constructor(
    private val protoDataStoreRepository: ProtoDataStoreRepository
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
            protoDataStoreRepository.userData.collect{
                fullNameInput = it.fullName
                emailInput = it.email
                ageInput = it.age
            }
        }
    }

    fun updateUserData(){
        viewModelScope.launch {
            protoDataStoreRepository.updateUserData(
                UserData(
                    fullName = fullNameInput,
                    email = emailInput,
                    age = ageInput
                )
            )
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