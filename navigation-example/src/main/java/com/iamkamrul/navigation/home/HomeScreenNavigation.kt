package com.iamkamrul.navigation.home

import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.iamkamrul.common.extension.convertJsonObject
import com.iamkamrul.common.extension.convertJsonString

const val homeScreenScreenRoute = "homeScreenRoute"
internal const val userDataArgs = "userDataArgs"

fun NavController.navigateToHomeScreenScreen(user: User){
    navigate("$homeScreenScreenRoute/${user.convertJsonString()}"){
        popUpTo(this@navigateToHomeScreenScreen.graph.findStartDestination().id)
    }
}

fun NavGraphBuilder.homeScreenScreen(
    onBackClick:()->Unit,
){
    composable(
        route = "$homeScreenScreenRoute/{$userDataArgs}",
        arguments = listOf(
            navArgument(userDataArgs){
                type = NavType.StringType
            }
        )
    ){backStackEntry ->
        backStackEntry.arguments?.getString(userDataArgs)?.convertJsonObject(User::class.java)?.let {user->
            HomeScreen(
                onBackClick = onBackClick,
                user = user
            )
        }

    }
}
