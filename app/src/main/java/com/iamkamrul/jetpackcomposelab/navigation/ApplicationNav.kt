package com.iamkamrul.jetpackcomposelab.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.iamkamrul.jetpackcomposelab.mainScreen
import com.iamkamrul.jetpackcomposelab.mainScreenRoute
import com.iamkamrul.material.buttons.buttonScreen
import com.iamkamrul.material.buttons.navigateToButtonScreen
import com.iamkamrul.material.materialComponentScreen
import com.iamkamrul.material.navigateToMaterialComponentScreen
import com.iamkamrul.material.texts.navigateToTextScreenRoute
import com.iamkamrul.material.texts.textScreen

@Composable
fun ApplicationNav(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = mainScreenRoute,
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ){
        mainScreen(
            onClickMaterial = navController::navigateToMaterialComponentScreen,
            onClickLayout = {}
        )
        materialComponentScreen(
            onBackClick = navController::popBackStack,
            onTextClick = navController::navigateToTextScreenRoute,
            onButtonClick = navController::navigateToButtonScreen,
            onIconClick = {}
        )
        textScreen(onBackClick = navController::popBackStack)
        buttonScreen(onBackClick = navController::popBackStack)
    }
}