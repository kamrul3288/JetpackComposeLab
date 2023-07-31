package com.iamkamrul.material.snackbar

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val snackBarScreenRoute = "snackBarScreenRoute"

fun NavController.navigateToSnackBarScreen(){
    this.navigate(snackBarScreenRoute)
}

fun NavGraphBuilder.snackBarScreen(
    onBackClick:()->Unit
){
    composable(route = snackBarScreenRoute){
        SnackBarScreen(onBackClick = onBackClick)
    }
}