package com.iamkamrul.material.icons

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val iconScreenRoute = "iconScreenRoute"

fun NavController.navigateToIconScreen(){
    this.navigate(iconScreenRoute)
}

fun NavGraphBuilder.iconScreen(
    onBackClick:()->Unit
){
    composable(route = iconScreenRoute){
        IconScreen(onBackClick = onBackClick)
    }
}