package com.iamkamrul.material.divider

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val dividerScreenRoute = "dividerScreenRoute"

fun NavController.navigateToDividerScreen(){
    this.navigate(dividerScreenRoute)
}

fun NavGraphBuilder.dividerScreen(
    onBackClick:()->Unit
) {
    composable(route = dividerScreenRoute) {
        DividerScreen(
            onBackClick = onBackClick
        )
    }
}