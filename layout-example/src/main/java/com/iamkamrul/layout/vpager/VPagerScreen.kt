@file:OptIn(ExperimentalFoundationApi::class)

package com.iamkamrul.layout.vpager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun VerticalPagerScreen(
    onBackClick:()->Unit
){
    val pagerState = rememberPagerState(initialPage = 0)
    ScaffoldWithBackNavigation(title = "Vertical Pager", onBackClick = onBackClick) {
        VerticalPager(pageCount = 10, state = pagerState) {
            Box(modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Swipe Up or Down", style = MaterialTheme.typography.labelSmall)
                    Text(text = "Page Number - $it", style = MaterialTheme.typography.headlineLarge)
                }
            }
        }
    }
}