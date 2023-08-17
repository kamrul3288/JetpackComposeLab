package com.iamkamrul.navigation._dummy

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

const val _ScreenRoute = "_ScreenRoute"

fun NavController.navigateTo_Screen(){
    this.navigate(_ScreenRoute)
}

fun NavGraphBuilder._Screen(
    onBackClick:()->Unit
){
    composable(route = _ScreenRoute){

    }
}

@Composable
internal fun _Screen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "", onBackClick = onBackClick) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
    }
}