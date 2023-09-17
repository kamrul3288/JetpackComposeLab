@file:OptIn(ExperimentalFoundationApi::class)

package com.iamkamrul.material.tabs

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.Purple80
import com.iamkamrul.designsystem.theme.White
import kotlinx.coroutines.launch

@Composable
internal fun TabsScreen(
    onBackClick:()->Unit
) {

    val tabs = listOf(
        TabsItem(title = "Home", icon = Icons.Default.Home, screen = {TabScreen(content = "Home")}),
        TabsItem(title = "Recent", icon = Icons.Default.AccessTime, screen = {TabScreen(content = "Recent")}),
        TabsItem(title = "Favourite", icon = Icons.Default.Favorite, screen = {TabScreen(content = "Favourite")}),
        TabsItem(title = "Account", icon = Icons.Default.AccountCircle, screen = {TabScreen(content = "Account")}),
    )

    val pagerState = rememberPagerState(initialPage = 0, pageCount = {tabs.size})
    val coroutineScope = rememberCoroutineScope()


    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Tabs Example",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            TabRow(
                selectedTabIndex = pagerState.currentPage,
                containerColor = MaterialTheme.colorScheme.primary,
                indicator = { tabPositions ->
                    TabRowDefaults.PrimaryIndicator(
                        modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                        height = 4.dp,
                        color = com.iamkamrul.designsystem.theme.Purple80,
                        width = 30.dp
                    )
                }
            ) {
                tabs.forEachIndexed { index, tabsItem ->
                    Tab(
                        selected = index == pagerState.currentPage,
                        text = {
                            Text(text = tabsItem.title)
                        },
                        icon = {
                            Icon(imageVector = tabsItem.icon, contentDescription = "tabs_icon")
                        },
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(index)
                            }
                        },
                        selectedContentColor = com.iamkamrul.designsystem.theme.White,
                        unselectedContentColor = com.iamkamrul.designsystem.theme.White.copy(alpha = 0.5f),
                    )
                }
            }

            HorizontalPager(
                state = pagerState
            ) {
                tabs[pagerState.currentPage].screen()
            }
        }
    }
}

@Composable
private fun TabScreen(
    content:String
){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = content)
    }
}