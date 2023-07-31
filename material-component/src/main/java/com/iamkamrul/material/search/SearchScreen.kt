package com.iamkamrul.material.search

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val searchScreenRoute = "searchScreenRoute"

fun NavController.navigateToSearchScreen(){
    this.navigate(searchScreenRoute)
}

fun NavGraphBuilder.searchScreen(
    onBackClick:()->Unit
){
    composable(route = searchScreenRoute){
        SearchScreen(onBackClick = onBackClick)
    }
}