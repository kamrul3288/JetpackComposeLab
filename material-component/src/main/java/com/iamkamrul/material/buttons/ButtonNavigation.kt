package com.iamkamrul.material.buttons

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val buttonScreenRoute = "buttonScreenRoute"
fun NavController.navigateToButtonScreen(){
    this.navigate(buttonScreenRoute)
}

fun NavGraphBuilder.buttonScreen(
    onBackClick:()->Unit
){
    composable(route = buttonScreenRoute){
        ButtonScreen(
            onBackClick = onBackClick
        )
    }
}