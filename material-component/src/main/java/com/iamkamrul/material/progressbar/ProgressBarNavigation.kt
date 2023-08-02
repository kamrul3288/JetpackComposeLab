package com.iamkamrul.material.progressbar

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val progressBarScreenRoute = "progressBarScreenRoute"

fun NavController.navigateToProgressBarScreen(){
    this.navigate(progressBarScreenRoute)
}

fun NavGraphBuilder.progressBarScreen(
    onBackClick:()->Unit
){
    composable(route = progressBarScreenRoute){
        ProgressBarScreen(onBackClick = onBackClick)
    }
}
