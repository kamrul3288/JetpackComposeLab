package com.iamkamrul.layout.row

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val rowScreenRoute = "rowScreenRoute"

fun NavController.navigateToRowScreen(){
    this.navigate(rowScreenRoute)
}

fun NavGraphBuilder.rowScreen(
    onBackClick:()->Unit,
){
    composable(route = rowScreenRoute){
        RowScreen(
            onBackClick = onBackClick
        )
    }
}