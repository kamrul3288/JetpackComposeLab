package com.iamkamrul.material.cards

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val cardScreenRoute = "cardScreenRoute"

fun NavController.navigateToCardScreen(){
    this.navigate(cardScreenRoute)
}

fun NavGraphBuilder.cardScreen(
    onBackClick:()->Unit
){
    composable(route = cardScreenRoute){
        CardScreen(onBackClick = onBackClick)
    }
}