package com.iamkamrul.material.bottomnavigation

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.material.bottomnavigation.navscreen.BottomNavBookmarkScreen
import com.iamkamrul.material.bottomnavigation.navscreen.BottomNavHomeScreen
import com.iamkamrul.material.bottomnavigation.navscreen.BottomNavProfileScreen


@Composable
internal fun BottomNavigationScreen(
    onBackClick:()->Unit,
    navController: NavHostController = rememberNavController()
) {

    var selectedItem by remember { mutableIntStateOf(0) }
    navController.addOnDestinationChangedListener{_,destination,_->
        selectedItem = when(destination.route){
            bottomNavigationBookmarksScreenRoute-> 1
            bottomNavigationProfileScreenRoute-> 2
            else -> 0
        }
    }

    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Bottom Navigation",
        onBackClick = onBackClick,
        bottomBar = {
            NavigationBar(
                containerColor = MaterialTheme.color.card,
                contentColor = MaterialTheme.color.black
            ) {
                bottomNavItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                            navController.navigate(item.route) {
                                popUpTo(navController.graph.findStartDestination().id)
                                launchSingleTop = true
                            }
                        },
                        icon = {
                            Icon(imageVector = item.labelIcon, contentDescription = "")
                        },
                        label = {
                            Text(text = item.label)
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = MaterialTheme.color.black,
                            unselectedIconColor = MaterialTheme.color.black.copy(alpha = 0.5f),
                            selectedTextColor = MaterialTheme.color.black,
                            unselectedTextColor = MaterialTheme.color.black.copy(alpha = 0.5f)
                        )
                    )
                }
            }
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = bottomNavigationHomeScreenRoute
        ) {

            composable(route = bottomNavigationHomeScreenRoute) {
                BottomNavHomeScreen()
            }

            composable(route = bottomNavigationProfileScreenRoute) {
                BottomNavProfileScreen()
            }

            composable(route = bottomNavigationBookmarksScreenRoute) {
                BottomNavBookmarkScreen()
            }
        }
    }
}