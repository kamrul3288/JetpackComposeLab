package com.iamkamrul.datastore_ui.preference

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.iamkamrul.designsystem.component.JclButton
import com.iamkamrul.designsystem.component.JclOutlineTextField
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar

@Composable
internal fun PreferenceDataStoreScreen(
    onBackBtnClick:()->Unit,
    viewModel: PreferenceDataStoreViewModel = hiltViewModel()
){
    ScaffoldTopAppbar(
        title = "Preference DataStore",
        onNavigationIconClick = onBackBtnClick,
    ) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(16.dp)
            .verticalScroll(rememberScrollState())) {

            JclOutlineTextField(
                value = viewModel.fullNameInput,
                onValueChange = viewModel::onChangeFullNameInput,
                label = "Enter full name",
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(8.dp))
            JclOutlineTextField(
                value = viewModel.emailInput,
                onValueChange = viewModel::onChangeEmailInput,
                label = "Enter email",
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(8.dp))
            JclOutlineTextField(
                value = viewModel.ageInput,
                onValueChange = viewModel::onChangeAgeInput,
                label = "Enter age",
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            Spacer(modifier = Modifier.height(24.dp))
            JclButton(text = "Save") {
                viewModel.updateUserData()
            }
        }
    }
}