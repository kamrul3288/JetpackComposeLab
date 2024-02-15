package com.iamkamrul.sc.connectivity

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val connectivityScreenRoute = "connectivityScreenRoute"
fun NavController.navigateToConnectivityScreen(){
    this.navigate(connectivityScreenRoute)
}

fun NavGraphBuilder.connectivityScreen(
    onBackBtnClick:()->Unit
){
    composable(route = connectivityScreenRoute){
        ConnectivityScreen(
            onBackBtnClick = onBackBtnClick
        )
    }
}