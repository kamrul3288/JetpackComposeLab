package com.iamkamrul.material.textfield

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val textFieldScreenRoute = "textFieldRoute"


fun NavController.navigateToTextFieldScreen(){
    this.navigate(textFieldScreenRoute)
}

fun NavGraphBuilder.textFieldScreen(
    onBackClick:()->Unit
){
    composable(route = textFieldScreenRoute){
        TextFieldScreen(
            onBackClick =onBackClick
        )
    }
}