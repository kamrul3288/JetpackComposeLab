package com.iamkamrul.material.dialog

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val dialogScreenRoute = "dialogScreenRoute"

fun NavController.navigateToDialogScreen(){
    this.navigate(dialogScreenRoute)
}

fun NavGraphBuilder.dialogScreen(
    onBackClick:()->Unit
){
    composable(route = dialogScreenRoute){
        DialogScreen(onBackClick = onBackClick)
    }
}
