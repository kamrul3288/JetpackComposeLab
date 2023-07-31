package com.iamkamrul.material.switches

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val switchScreenRoute = "switchScreenRoute"

fun NavController.navigateToSwitchScreen(){
    this.navigate(switchScreenRoute)
}

fun NavGraphBuilder.switchScreen(
    onBackClick:()->Unit
){
    composable(route = switchScreenRoute){
        SwitchScreen(onBackClick = onBackClick)
    }
}