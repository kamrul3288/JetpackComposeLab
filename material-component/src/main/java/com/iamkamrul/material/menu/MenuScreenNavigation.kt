package com.iamkamrul.material.menu

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val menuScreenScreenRoute = "menuScreenScreenRoute"

fun NavController.navigateToMenuScreenScreen(){
    this.navigate(menuScreenScreenRoute)
}

fun NavGraphBuilder.menuScreenScreen(
    onBackClick:()->Unit
){
    composable(route = menuScreenScreenRoute){
        MenuScreen(onBackClick = onBackClick)
    }
}