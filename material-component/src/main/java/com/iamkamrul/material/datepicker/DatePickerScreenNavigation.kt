package com.iamkamrul.material.datepicker

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val datePickerScreenRoute = "datePickerScreenRoute"

fun NavController.navigateToDatePickerScreen(){
    this.navigate(datePickerScreenRoute)
}

fun NavGraphBuilder.datePickerScreen(
    onBackClick:()->Unit
){
    composable(route = datePickerScreenRoute){
        DatePickerScreen(onBackClick = onBackClick)
    }
}