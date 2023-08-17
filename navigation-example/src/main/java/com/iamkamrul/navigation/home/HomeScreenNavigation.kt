package com.iamkamrul.navigation.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.iamkamrul.common.extension.getSerializableCompat

const val homeScreenScreenRoute = "homeScreenRoute"
internal const val userDataArgs = "userDataArgs"

internal fun NavController.navigateToHomeScreenScreen(user: User){
    this.navigate("$homeScreenScreenRoute/$user")
}

fun NavGraphBuilder.homeScreenScreen(
    onBackClick:()->Unit
){
    composable(
        route = "$homeScreenScreenRoute/{$userDataArgs}",
        arguments = listOf(
            navArgument(userDataArgs){type = NavType.SerializableType(User::class.java)}
        )
    ){backStackEntry->
        (backStackEntry.arguments?.getSerializableCompat(userDataArgs, User::class.java))?.let {user->
            HomeScreen(
                onBackClick = onBackClick,
                user = user
            )
        }
    }
}
