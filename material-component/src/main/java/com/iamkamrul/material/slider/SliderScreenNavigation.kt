package com.iamkamrul.material.slider

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val sliderScreenRoute = "sliderScreenRoute"

fun NavController.navigateToSliderScreen(){
    this.navigate(sliderScreenRoute)
}

fun NavGraphBuilder.sliderScreen(
    onBackClick:()->Unit
){
    composable(route = sliderScreenRoute){
        SliderScreen(onBackClick = onBackClick)
    }
}
