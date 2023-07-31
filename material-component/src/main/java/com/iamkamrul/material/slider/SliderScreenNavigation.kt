package com.iamkamrul.material.slider

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val SliderScreenRoute = "SliderScreenRoute"

fun NavController.navigateToSliderScreen(){
    this.navigate(SliderScreenRoute)
}

fun NavGraphBuilder.sliderScreen(
    onBackClick:()->Unit
){
    composable(route = SliderScreenRoute){
        SliderScreen(onBackClick = onBackClick)
    }
}
