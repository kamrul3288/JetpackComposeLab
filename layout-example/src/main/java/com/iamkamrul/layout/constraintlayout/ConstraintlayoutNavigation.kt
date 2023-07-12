package com.iamkamrul.layout.constraintlayout

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val constraintLayoutRoute = "constraintLayout"

fun NavController.navigateToConstraintLayout(){
    this.navigate(constraintLayoutRoute)
}

fun NavGraphBuilder.constraintLayoutScreen(
    onBackClick:()->Unit
){
    composable(route = constraintLayoutRoute){
        ConstraintLayoutScreen(onBackClick = onBackClick)
    }
}