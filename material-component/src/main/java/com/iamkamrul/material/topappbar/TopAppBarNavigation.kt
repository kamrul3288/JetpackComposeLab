package com.iamkamrul.material.topappbar

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val topAppbarScreenRoute = "topAppbarScreenRoute"

fun NavController.navigateToTopAppBarScreen(){
    this.navigate(topAppbarScreenRoute)
}

fun NavGraphBuilder.topAppBarScreen(
    onBackClick:()->Unit
){
    composable(route = topAppbarScreenRoute){
        TopAppbarScreen(
            onBackClick = onBackClick
        )
    }
}
