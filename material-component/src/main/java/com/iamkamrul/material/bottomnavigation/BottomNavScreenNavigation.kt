package com.iamkamrul.material.bottomnavigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val bottomNavigationScreenRoute = "bottomNavigationScreenRoute"

fun NavController.navigateToBottomNavigationScreen(){
    this.navigate(bottomNavigationScreenRoute)
}

fun NavGraphBuilder.bottomNavigationScreen(
    onBackClick:()->Unit
){
    composable(route = bottomNavigationScreenRoute){
        BottomNavigationScreen(onBackClick = onBackClick)
    }
}
