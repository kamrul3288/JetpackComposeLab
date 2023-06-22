package com.iamkamrul.layout.box

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val boxScreenRoute = "boxScreenRoute"

fun NavController.navigateToBoxScreen(){
    this.navigate(boxScreenRoute)
}

fun NavGraphBuilder.boxScreen(
    onBackClick:()->Unit,
){
    composable(route = boxScreenRoute){
        BoxScreen(
            onBackClick = onBackClick
        )
    }
}