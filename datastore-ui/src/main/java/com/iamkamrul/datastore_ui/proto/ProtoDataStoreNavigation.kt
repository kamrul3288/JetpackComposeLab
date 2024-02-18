package com.iamkamrul.datastore_ui.proto

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

internal const val protoDataStoreScreenRoute = "protoDataStoreScreenRoute"

internal fun NavController.navigateToProtoDataStoreScreen(){
    this.navigate(protoDataStoreScreenRoute)
}

internal fun NavGraphBuilder.protoDataStoreScreen(
    onBackBtnClick:()->Unit
){
    composable(route = protoDataStoreScreenRoute){
        ProtoDataStoreScreen(
            onBackBtnClick = onBackBtnClick
        )
    }
}