package com.iamkamrul.jetpackcomposelab

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val mainScreenRoute = "main_activity_route"
fun NavGraphBuilder.mainScreen(
    onClickMaterial:()->Unit,
    onClickLayout:()->Unit
){
    composable(mainScreenRoute){
        MainRoute(
            onClickMaterial = onClickMaterial,
            onClickLayout = onClickLayout,
        )
    }
}