package com.iamkamrul.material.tabs

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable


const val tabsScreenRoute  = "tabsScreenRoute"

fun NavController.navigateToTabsScreen(){
    this.navigate(tabsScreenRoute)
}


fun NavGraphBuilder.tabsScreen(
    onBackClick:()->Unit
){
    composable(route = tabsScreenRoute){
        TabsScreen(onBackClick = onBackClick)
    }
}