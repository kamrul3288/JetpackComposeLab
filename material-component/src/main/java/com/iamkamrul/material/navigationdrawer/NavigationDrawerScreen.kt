package com.iamkamrul.material.navigationdrawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.material.R
import kotlinx.coroutines.launch

@Composable
internal fun NavigationDrawerScreen() {

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerContainerColor = MaterialTheme.color.card,
                drawerContentColor = com.iamkamrul.designsystem.theme.White
            ) {

                DrawerHeader()
                Spacer(Modifier.height(12.dp))
                DrawerItem()

            }
        },
    ){
        ScaffoldTopAppbar(
            title = "Navigation Drawer",
            navigationIcon = rememberVectorPainter(image = JclIcons.Menu),
            onNavigationIconClick = {
                scope.launch {
                    drawerState.open()
                }
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
}

@Composable
fun DrawerHeader() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(Purple40.copy(alpha = 0.7f))
            .padding(24.dp)
            .fillMaxWidth()
    ) {

        Image(
            painter = painterResource(id = R.drawable.image_birds),
            contentDescription = "Parrot",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
        )
        Text(
            text = "Kamrul Hasan",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimary,
        )
    }
}

@Composable
private fun DrawerItem(){

    // Best way to implement this consider as a list
    // listOf(Icons.Default.Favorite, Icons.Default.Face, Icons.Default.Email)

    var selectedItem by remember { mutableIntStateOf(0) }
    NavigationDrawerItem(
        icon = { Icon(JclIcons.Inbox, contentDescription = null) },
        label = { Text(text = "Inbox") },
        selected = selectedItem == 0,
        onClick = {
           selectedItem = 0
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Purple40.copy(alpha = 0.3f),
            unselectedContainerColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.small
    )

    NavigationDrawerItem(
        icon = { Icon(JclIcons.Send, contentDescription = null) },
        label = { Text(text = "Outbox") },
        selected = selectedItem == 1,
        onClick = {
            selectedItem = 1
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Purple40.copy(alpha = 0.3f),
            unselectedContainerColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.small
    )

    NavigationDrawerItem(
        icon = { Icon(Icons.Outlined.FavoriteBorder, contentDescription = null) },
        label = { Text(text = "Favourite") },
        selected = selectedItem == 2,
        onClick = {
            selectedItem = 2
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Purple40.copy(alpha = 0.3f),
            unselectedContainerColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.small
    )

    HorizontalDivider()

    NavigationDrawerItem(
        icon = { Icon(Icons.Outlined.Delete, contentDescription = null) },
        label = { Text(text = "Trash") },
        selected = selectedItem == 3,
        onClick = {
            selectedItem = 3
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Purple40.copy(alpha = 0.3f),
            unselectedContainerColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.small
    )

    NavigationDrawerItem(
        icon = { Icon(JclIcons.Logout, contentDescription = null) },
        label = { Text(text = "Logout") },
        selected = selectedItem == 4,
        onClick = {
            selectedItem = 4
        },
        modifier = Modifier.padding(NavigationDrawerItemDefaults.ItemPadding),
        colors = NavigationDrawerItemDefaults.colors(
            selectedContainerColor = Purple40.copy(alpha = 0.3f),
            unselectedContainerColor = Color.Transparent,
        ),
        shape = MaterialTheme.shapes.small
    )

}
