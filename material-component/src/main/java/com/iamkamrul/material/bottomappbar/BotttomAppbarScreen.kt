package com.iamkamrul.material.bottomappbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldBottomAppbar
import com.iamkamrul.designsystem.icon.JclIcons


@Composable
internal fun BottomAppBarScreen(
    onBackClick:()->Unit
) {
    ScaffoldBottomAppbar(
        title = "Bottom Appbar",
        onNavigationIconClick = onBackClick,
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = JclIcons.Home, contentDescription = null)
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = JclIcons.Favorite, contentDescription = null)
                    }
                    IconButton(onClick = {}) {
                        Icon(imageVector = JclIcons.History, contentDescription = null)
                    }
                    Spacer(modifier = Modifier.weight(1f))

                    IconButton(onClick = {}) {
                        Icon(imageVector = JclIcons.AccountCircle, contentDescription = null)
                    }
                },
                containerColor = MaterialTheme.colorScheme.primary,
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                shape = CircleShape,
                modifier = Modifier.offset(y = 40.dp)
            ) {
                Icon(imageVector = Icons.Filled.Add, contentDescription = null)
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
    }
}