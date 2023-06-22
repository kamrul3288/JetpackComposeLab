package com.iamkamrul.jetpackcomposelab.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.iamkamrul.jetpackcomposelab.mainScreen
import com.iamkamrul.jetpackcomposelab.mainScreenRoute
import com.iamkamrul.layout.box.boxScreen
import com.iamkamrul.layout.box.navigateToBoxScreen
import com.iamkamrul.layout.column.columnScreen
import com.iamkamrul.layout.column.navigateToColumnScreen
import com.iamkamrul.layout.layoutHomeScreen
import com.iamkamrul.layout.navigateToLayoutHomeScreen
import com.iamkamrul.layout.row.navigateToRowScreen
import com.iamkamrul.layout.row.rowScreen
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
            onClickLayout = navController::navigateToLayoutHomeScreen
        )
        layoutHomeScreen(
            onBackClick = navController::popBackStack,
            onColumnBtnClick = navController::navigateToColumnScreen,
            onRowBtnClick = navController::navigateToRowScreen,
            onBoxBtnClick = navController::navigateToBoxScreen,
            onBoxWithConstraintBtnClick = {}
        )

        columnScreen(onBackClick = navController::popBackStack)
        rowScreen(onBackClick = navController::popBackStack)
        boxScreen(onBackClick = navController::popBackStack)

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