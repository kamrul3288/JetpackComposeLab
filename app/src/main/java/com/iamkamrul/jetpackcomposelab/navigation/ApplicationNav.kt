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
import com.iamkamrul.layout.boxconstraint.boxWithConstraintScreen
import com.iamkamrul.layout.boxconstraint.navigateToBoxWithConstraint
import com.iamkamrul.layout.column.columnScreen
import com.iamkamrul.layout.column.navigateToColumnScreen
import com.iamkamrul.layout.constraintlayout.constraintLayoutScreen
import com.iamkamrul.layout.constraintlayout.navigateToConstraintLayout
import com.iamkamrul.layout.flow.flowLayoutScreen
import com.iamkamrul.layout.flow.navigateToFlowLayout
import com.iamkamrul.layout.hpager.horizontalPagerScreen
import com.iamkamrul.layout.hpager.navigateToHorizontalPagerScreen
import com.iamkamrul.layout.layoutHomeScreen
import com.iamkamrul.layout.navigateToLayoutHomeScreen
import com.iamkamrul.layout.row.navigateToRowScreen
import com.iamkamrul.layout.row.rowScreen
import com.iamkamrul.layout.vpager.navigateToVerticalPager
import com.iamkamrul.layout.vpager.verticalPagerScreen
import com.iamkamrul.material.buttons.buttonScreen
import com.iamkamrul.material.buttons.navigateToButtonScreen
import com.iamkamrul.material.icons.iconScreen
import com.iamkamrul.material.icons.navigateToIconScreen
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
            onBoxWithConstraintBtnClick = navController::navigateToBoxWithConstraint,
            onHorizontalPagerBtnClick = navController::navigateToHorizontalPagerScreen,
            onVerticalPagerBtnClick = navController::navigateToVerticalPager,
            onFlowBtnClick = navController::navigateToFlowLayout,
            onConstraintLayoutBtnClick = navController::navigateToConstraintLayout,
        )
        columnScreen(onBackClick = navController::popBackStack)
        rowScreen(onBackClick = navController::popBackStack)
        boxScreen(onBackClick = navController::popBackStack)
        boxWithConstraintScreen(onBackClick = navController::popBackStack)
        horizontalPagerScreen(onBackClick = navController::popBackStack)
        verticalPagerScreen(onBackClick = navController::popBackStack)
        flowLayoutScreen(onBackClick  = navController::popBackStack)
        constraintLayoutScreen(onBackClick  = navController::popBackStack)


        materialComponentScreen(
            onBackClick = navController::popBackStack,
            onTextClick = navController::navigateToTextScreenRoute,
            onButtonClick = navController::navigateToButtonScreen,
            onIconClick = navController::navigateToIconScreen
        )
        textScreen(onBackClick = navController::popBackStack)
        buttonScreen(onBackClick = navController::popBackStack)
        iconScreen(onBackClick = navController::popBackStack)
    }
}