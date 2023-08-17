package com.iamkamrul.jetpackcomposelab

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val mainScreenRoute = "main_activity_route"
fun NavGraphBuilder.mainScreen(
    onMaterialBtnClick:()->Unit,
    onLayoutBtnClick:()->Unit
){
    composable(mainScreenRoute){
        MainScreen(
            onMaterialBtnClick = onMaterialBtnClick,
            onLayoutBtnClick = onLayoutBtnClick,
        )
    }
}