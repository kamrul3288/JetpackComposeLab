package com.iamkamrul.material.slidesheet

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val slideSheetScreenRoute = "slideSheetScreenRoute"

fun NavController.navigateToSlideSheetScreen(){
    this.navigate(slideSheetScreenRoute)
}

fun NavGraphBuilder.slideSheetScreen(
    onBackClick:()->Unit
){
    composable(route = slideSheetScreenRoute){
        SlideSheetScreen(onBackClick = onBackClick)
    }
}