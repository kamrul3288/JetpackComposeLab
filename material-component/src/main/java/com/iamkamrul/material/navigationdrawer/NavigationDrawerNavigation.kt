package com.iamkamrul.material.navigationdrawer

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val navigationDrawerScreenRoute = "navigationDrawerScreenRoute"

fun NavController.navigateToNavigationDrawerScreen(){
    this.navigate(navigationDrawerScreenRoute)
}

fun NavGraphBuilder.navigationDrawerScreen(
    onBackClick:()->Unit
) {
    composable(route = navigationDrawerScreenRoute) {
        NavigationDrawerScreen(onBackClick = onBackClick)
    }
}

   