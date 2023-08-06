package com.iamkamrul.material.checkbox

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val checkBoxScreenRoute = "checkBoxScreenRoute"

fun NavController.navigateToCheckBoxScreen(){
    this.navigate(checkBoxScreenRoute)
}

fun NavGraphBuilder.checkBoxScreen(
    onBackClick:()->Unit
){
    composable(route = checkBoxScreenRoute){
        CheckBoxScreen(onBackClick = onBackClick)
    }
}