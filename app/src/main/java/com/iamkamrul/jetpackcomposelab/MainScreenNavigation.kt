package com.iamkamrul.jetpackcomposelab

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val mainScreenRoute = "main_activity_route"
fun NavHostController.navigateToMain(){
    this.navigate(mainScreenRoute)
}

fun NavGraphBuilder.mainScreen(){
    composable(mainScreenRoute){
        MainRoute()
    }
}