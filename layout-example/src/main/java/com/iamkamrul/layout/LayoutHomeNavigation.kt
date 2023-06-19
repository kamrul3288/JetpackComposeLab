package com.iamkamrul.layout

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val layoutHomeRoute = "layoutHomeRoute"

fun NavController.navigateToLayoutHomeScreen(){
    this.navigate(layoutHomeRoute)
}

fun NavGraphBuilder.layoutHomeScreen(
    onBackClick:()->Unit
){
    composable(route = layoutHomeRoute){
        LayoutHomeScreen(
            onBackClick = onBackClick
        )
    }
}