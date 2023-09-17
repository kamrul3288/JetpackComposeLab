@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.topappbar
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.White

@Composable
internal fun TopAppbarScreen(
    onBackClick:()->Unit
) {
    ScaffoldTopAppbar(
        title = "Top Appbar Example",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp)
        ) {


            //------------------------- Default App Bar Example -------------------------------
            Text(text = "Default App Bar Example", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            TopAppBar(
                title = {
                    Text(text = "Product")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = JclIcons.Attachment,
                            contentDescription = "Attachment",
                            tint = White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Outlined.AccountCircle,
                            contentDescription = "Account",
                            tint = White
                        )
                    }
                }
            )


            //------------------------- Center Aligned TopAppBar Example -------------------------------

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Center Aligned TopAppBar Example",
                style = MaterialTheme.typography.labelMedium
            )
            Spacer(modifier = Modifier.height(8.dp))
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Product")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = JclIcons.Attachment,
                            contentDescription = "Attachment",
                            tint = White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Outlined.AccountCircle,
                            contentDescription = "Account",
                            tint = White
                        )
                    }
                }
            )


            //------------------------- Medium TopAppBar Example -------------------------------

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Medium TopAppBar Example", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            MediumTopAppBar(
                title = {
                    Text(text = "Product")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = JclIcons.Attachment,
                            contentDescription = "Attachment",
                            tint = White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = Icons.Outlined.AccountCircle,
                            contentDescription = "Account",
                            tint = White
                        )
                    }
                }
            )


            //------------------------- Large TopAppBar Example -------------------------------

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Large TopAppBar Example", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            LargeTopAppBar(
                title = {
                    Text(text = "Product")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Outlined.Menu, contentDescription = "Menu")
                    }
                },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = JclIcons.Attachment,
                            contentDescription = "Attachment",
                            tint = White
                        )
                    }
                    IconButton(onClick = { }) {
                        Icon(
                            imageVector = JclIcons.AccountCircle,
                            contentDescription = "Account",
                            tint = White
                        )
                    }
                }
            )

        }
    }
}