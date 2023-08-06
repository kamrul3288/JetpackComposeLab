package com.iamkamrul.material.badge

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val badgeScreenRoute = "badgeScreenRoute"

fun NavController.navigateToBadgeScreen(){
    this.navigate(badgeScreenRoute)
}

fun NavGraphBuilder.badgeScreen(
    onBackClick:()->Unit
){
    composable(route = badgeScreenRoute){
        BadgeScreen(onBackClick = onBackClick)
    }
}
