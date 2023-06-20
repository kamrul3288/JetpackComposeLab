package com.iamkamrul.layout.column

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val columnScreenRoute = "columnScreenRoute"

fun NavController.navigateToColumnScreen(){
    this.navigate(columnScreenRoute)
}

fun NavGraphBuilder.columnScreen(
    onBackClick:()->Unit,
){
    composable(route = columnScreenRoute){
        ColumnScreen(
            onBackClick = onBackClick
        )
    }
}