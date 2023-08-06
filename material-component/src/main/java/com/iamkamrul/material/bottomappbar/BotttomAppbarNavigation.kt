package com.iamkamrul.material.bottomappbar

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val bottomAppBarScreenRoute = "bottomAppBarScreenRoute"

fun NavController.navigateToBottomAppBarScreen(){
    this.navigate(bottomAppBarScreenRoute)
}

fun NavGraphBuilder.bottomAppBarScreen(
    onBackClick:()->Unit
){
    composable(route = bottomAppBarScreenRoute){
        BottomAppBarScreen(onBackClick = onBackClick)
    }
}
