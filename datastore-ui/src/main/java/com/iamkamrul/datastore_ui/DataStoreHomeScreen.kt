package com.iamkamrul.datastore_ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

@Composable
internal fun DataStoreHoneScreen(
    onBackBtnClick:()->Unit,
){

}

const val dataStoreHomeScreenRoute = "dataStoreHomeScreenRoute"
internal fun NavGraphBuilder.dataStoreHomeScreen(
    onBackBtnClick:()->Unit,
){
    composable(route = dataStoreHomeScreenRoute){
        DataStoreHoneScreen(
            onBackBtnClick = onBackBtnClick,
        )
    }
}