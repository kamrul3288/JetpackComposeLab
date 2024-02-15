package com.iamkamrul.sc

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.iamkamrul.sc.connectivity.connectivityScreen
import com.iamkamrul.sc.connectivity.navigateToConnectivityScreen

const val serviceComponentGraphRoute = "serviceComponentGraphRoute"
fun NavController.navigateToServiceComponentGraph(){
    this.navigate(serviceComponentGraphRoute)
}

fun NavGraphBuilder.serviceComponentNavGraph(navController: NavController){
    navigation(startDestination = serviceComponentScreenRoute, route = serviceComponentGraphRoute){
        serviceComponentScreen(
            onBackBtnClick = navController::popBackStack,
            onConnectivityBtnClick = navController::navigateToConnectivityScreen
        )

        connectivityScreen(onBackBtnClick = navController::popBackStack)
    }
}
