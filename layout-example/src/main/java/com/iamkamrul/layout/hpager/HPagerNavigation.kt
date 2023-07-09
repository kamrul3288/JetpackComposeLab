package com.iamkamrul.layout.hpager

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable


const val horizontalPagerRoute = "HorizontalPagerRoute"

fun NavController.navigateToHorizontalPagerScreen(){
    this.navigate(horizontalPagerRoute)
}

fun NavGraphBuilder.horizontalPagerScreen(
    onBackClick:()->Unit
){
    composable(horizontalPagerRoute){
        HorizontalPagerScreen(
            onBackClick = onBackClick
        )
    }
}