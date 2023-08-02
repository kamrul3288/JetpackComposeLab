package com.iamkamrul.material.radio

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val radioButtonScreenRoute = "radioButtonScreenRoute"

fun NavController.navigateToRadioButtonScreen(){
    this.navigate(radioButtonScreenRoute)
}

fun NavGraphBuilder.radioButtonScreen(
    onBackClick:()->Unit
){
    composable(route = radioButtonScreenRoute){
        RadioButtonScreen(
            onBackClick = onBackClick
        )
    }
}