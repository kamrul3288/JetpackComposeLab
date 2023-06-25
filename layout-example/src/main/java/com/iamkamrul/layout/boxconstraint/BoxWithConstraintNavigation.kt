package com.iamkamrul.layout.boxconstraint

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val boxWithConstraintRoute = "boxWithConstraintRoute"
fun NavController.navigateToBoxWithConstraint(){
    this.navigate(boxWithConstraintRoute)
}

fun NavGraphBuilder.boxWithConstraintScreen(
    onBackClick:()->Unit
){
    composable(route = boxWithConstraintRoute){
        BoxWithConstraintScreen(
            onBackClick = onBackClick
        )
    }
}