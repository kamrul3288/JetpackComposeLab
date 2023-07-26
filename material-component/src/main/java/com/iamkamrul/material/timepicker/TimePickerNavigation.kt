package com.iamkamrul.material.timepicker

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val timePickerScreenRoute = "timePickerScreenRoute"

fun NavController.navigateToTimePickerScreen(){
    this.navigate(timePickerScreenRoute)
}


fun NavGraphBuilder.timePickerScreen(
    onBackClick:()->Unit
){
    composable(route = timePickerScreenRoute){
        TimePickerScreen(
            onBackClick = onBackClick
        )
    }
}