package com.iamkamrul.material.tooltip

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val tooltipScreenRoute = "tooltipScreenRoute"

fun NavController.navigateToTooltipScreen(){
    this.navigate(tooltipScreenRoute)
}


fun NavGraphBuilder.tooltipScreen(
    onBackClick:()->Unit
){
    composable(route = tooltipScreenRoute){
        TooltipScreen(
            onBackClick = onBackClick
        )
    }
}