package com.iamkamrul.material.texts

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val textScreenRoute = "text_screen"
fun NavController.navigateToTextScreenRoute(){
    this.navigate(textScreenRoute)
}

fun NavGraphBuilder.textScreen(
    onBackClick:()->Unit
){
    composable(route = textScreenRoute){
        TextScreen(
            onBackClick = onBackClick
        )
    }
}