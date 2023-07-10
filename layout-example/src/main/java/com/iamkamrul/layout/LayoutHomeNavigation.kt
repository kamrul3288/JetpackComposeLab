package com.iamkamrul.layout

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val layoutHomeRoute = "layoutHomeRoute"

fun NavController.navigateToLayoutHomeScreen(){
    this.navigate(layoutHomeRoute)
}

fun NavGraphBuilder.layoutHomeScreen(
    onBackClick:()->Unit,
    onColumnBtnClick:()->Unit,
    onRowBtnClick:()->Unit,
    onBoxBtnClick:()->Unit,
    onBoxWithConstraintBtnClick:()->Unit,
    onHorizontalPagerBtnClick:()->Unit,
    onVerticalPagerBtnClick:()->Unit,
){
    composable(route = layoutHomeRoute){
        LayoutHomeScreen(
            onBackClick = onBackClick,
            onColumnBtnClick = onColumnBtnClick,
            onRowBtnClick = onRowBtnClick,
            onBoxBtnClick = onBoxBtnClick,
            onBoxWithConstraintBtnClick = onBoxWithConstraintBtnClick,
            onHorizontalPagerBtnClick = onHorizontalPagerBtnClick,
            onVerticalPagerBtnClick = onVerticalPagerBtnClick,
        )
    }
}