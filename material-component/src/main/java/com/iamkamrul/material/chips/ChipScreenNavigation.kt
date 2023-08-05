package com.iamkamrul.material.chips

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val chipScreenRoute = "chipScreenRoute"

fun NavController.navigateToChipScreen(){
    this.navigate(chipScreenRoute)
}

fun NavGraphBuilder.chipScreen(
    onBackClick:()->Unit
){
    composable(route = chipScreenRoute){
        ChipScreen(onBackClick = onBackClick)
    }
}