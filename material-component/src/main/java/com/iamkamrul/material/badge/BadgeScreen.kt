@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.badge

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.material.bottomnavigation.bottomNavItems

@Composable
internal fun BadgeScreen(
    onBackClick:()->Unit
) {

    var selectedItem by remember { mutableIntStateOf(0) }


    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Badge",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            BadgedBox(
                badge = {
                    Badge(
                        containerColor = MaterialTheme.colorScheme.primary
                    ) {
                        Text(text = "10")
                    }
                }
            ) {
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
            }


            Spacer(modifier = Modifier.height(32.dp))
            NavigationBar(
                containerColor = MaterialTheme.color.card,
                contentColor = MaterialTheme.color.black
            ) {
                bottomNavItems.forEachIndexed { index, item ->
                    NavigationBarItem(
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    Badge {
                                        Text(text = "8")
                                    }
                                }
                            ) {
                                Icon(imageVector = item.labelIcon, contentDescription = "")
                            }
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
    }
}