package com.iamkamrul.material.bottomappbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation


@Composable
internal fun BottomAppBarScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(
        title = "Bottom Appbar",
        onBackClick = onBackClick,
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Check, contentDescription = null)
                    }

                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Edit, contentDescription = null)
                    }

                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = {}) {
                        Icon(imageVector = Icons.Filled.Add, contentDescription = null)
                    }
                },
                containerColor = MaterialTheme.colorScheme.primary
            )
        }
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