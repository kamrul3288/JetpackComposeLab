package com.iamkamrul.datastore_ui

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation

const val dataStoreNavigationGraphRoute = "dataStoreNavigationGraphRoute"

fun NavController.navigateToDataStoreNavigationGraph(){
    this.navigate(dataStoreNavigationGraphRoute)
}

fun NavGraphBuilder.dataStoreNavigationGraph(navController: NavController){
    navigation(startDestination = dataStoreHomeScreenRoute, route = dataStoreNavigationGraphRoute){
        dataStoreHomeScreen (
            onBackBtnClick = navController::popBackStack,
        )
    }
}
