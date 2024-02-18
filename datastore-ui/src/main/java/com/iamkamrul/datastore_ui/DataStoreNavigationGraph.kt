package com.iamkamrul.datastore_ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.iamkamrul.datastore_ui.preference.navigateToPreferenceDataStoreScreen
import com.iamkamrul.datastore_ui.preference.preferenceDataStoreScreen
import com.iamkamrul.datastore_ui.proto.navigateToProtoDataStoreScreen
import com.iamkamrul.datastore_ui.proto.protoDataStoreScreen

const val dataStoreNavigationGraphRoute = "dataStoreNavigationGraphRoute"

fun NavController.navigateToDataStoreNavigationGraph(){
    this.navigate(dataStoreNavigationGraphRoute)
}

fun NavGraphBuilder.dataStoreNavigationGraph(navController: NavController){
    navigation(startDestination = dataStoreHomeScreenRoute, route = dataStoreNavigationGraphRoute){
        dataStoreHomeScreen (
            onBackBtnClick = navController::popBackStack,
            onPreferenceDataStoreBtnClick = navController::navigateToPreferenceDataStoreScreen,
            onProtoDataStoreBtnClick = navController::navigateToProtoDataStoreScreen,
        )

        preferenceDataStoreScreen(onBackBtnClick = navController::popBackStack)
        protoDataStoreScreen(onBackBtnClick = navController::popBackStack)
    }
}
