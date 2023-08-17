package com.iamkamrul.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.iamkamrul.navigation.login.loginScreen
import com.iamkamrul.navigation.login.loginScreenRoute

const val navModuleGraphRoute = "navModuleGraphRoute"

fun NavController.navigateToNavigationModule(){
    this.navigate(navModuleGraphRoute)
}

fun NavGraphBuilder.navigationModuleGraph(navController: NavController){
    navigation(startDestination = loginScreenRoute, route = navModuleGraphRoute){

        loginScreen(onBackClick = navController::popBackStack)

    }
}