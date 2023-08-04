package com.iamkamrul.material.bottomnavigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable


//------------------------ Bottom navigation Main Screen Route--------------------------------
const val bottomNavigationScreenRoute = "bottomNavigationScreenRoute"

fun NavController.navigateToBottomNavigationScreen(){
    this.navigate(bottomNavigationScreenRoute)
}

fun NavGraphBuilder.bottomNavigationScreen(
    onBackClick:()->Unit,
){
    composable(route = bottomNavigationScreenRoute){
        BottomNavigationScreen(
            onBackClick = onBackClick,
        )
    }
}


//------------------------ Bottom navigation Child Screen Route--------------------------------
internal const val bottomNavigationHomeScreenRoute = "bottomNavigationHomeScreenRoute"
internal const val bottomNavigationProfileScreenRoute = "bottomNavigationProfileScreenRoute"
internal const val bottomNavigationBookmarksScreenRoute = "bottomNavigationBookmarksScreenRoute"


