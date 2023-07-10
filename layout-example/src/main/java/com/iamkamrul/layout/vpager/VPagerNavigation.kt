package com.iamkamrul.layout.vpager

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val verticalPagerRoute = "verticalPagerRoute"

fun NavController.navigateToVerticalPager(){
    this.navigate(verticalPagerRoute)
}

fun NavGraphBuilder.verticalPagerScreen(
    onBackClick:()->Unit
){
    composable(route = verticalPagerRoute){
        VerticalPagerScreen(
            onBackClick = onBackClick
        )
    }
}