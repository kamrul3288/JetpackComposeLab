package com.iamkamrul.layout.flow

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val flowLayoutRoute = "flowLayoutRoute"

fun NavController.navigateToFlowLayout(){
    this.navigate(flowLayoutRoute)
}

fun NavGraphBuilder.flowLayoutScreen(
    onBackClick:()->Unit
){
    composable(route = flowLayoutRoute){
        FlowLayoutScreen(onBackClick = onBackClick)
    }
}