package com.iamkamrul.material.image

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val imageScreenRoute = "imageScreenRoute"

fun NavController.navigateToImageScreen(){
    this.navigate(imageScreenRoute)
}

fun NavGraphBuilder.imageScreen(
    onBackClick:()->Unit
){
    composable(route = imageScreenRoute){
        ImageScreen(
            onBackClick = onBackClick
        )
    }
}