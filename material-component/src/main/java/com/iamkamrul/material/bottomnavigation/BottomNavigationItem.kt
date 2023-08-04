package com.iamkamrul.material.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val label:String,
    val labelIcon:ImageVector,
    val route:String
)


internal val bottomNavItems = listOf(
    BottomNavigationItem(label = "Home", labelIcon = Icons.Default.Home, route = bottomNavigationHomeScreenRoute),
    BottomNavigationItem(label = "Bookmarks", labelIcon = Icons.Default.Favorite, route = bottomNavigationBookmarksScreenRoute),
    BottomNavigationItem(label = "Profile", labelIcon = Icons.Default.AccountCircle, route = bottomNavigationProfileScreenRoute),
)