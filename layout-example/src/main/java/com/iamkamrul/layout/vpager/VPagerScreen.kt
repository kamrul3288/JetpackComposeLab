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
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation

@Composable
fun VerticalPagerScreen(
    onBackClick:()->Unit
){
    val pagerState = rememberPagerState(pageCount = {10}, initialPage = 0)

    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Vertical Pager",
        onBackClick = onBackClick
    ) {
        VerticalPager(state = pagerState) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
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