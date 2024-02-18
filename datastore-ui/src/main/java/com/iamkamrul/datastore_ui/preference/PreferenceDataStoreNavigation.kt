package com.iamkamrul.datastore_ui.preference

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

internal const val preferenceDataStoreScreenRoute = "preferenceDataStoreScreenRoute"

internal fun NavController.navigateToPreferenceDataStoreScreen(){
    this.navigate(preferenceDataStoreScreenRoute)
}

internal fun NavGraphBuilder.preferenceDataStoreScreen(
    onBackBtnClick:()->Unit
){
    composable(route = preferenceDataStoreScreenRoute){
        PreferenceDataStoreScreen(
            onBackBtnClick = onBackBtnClick
        )
    }
}