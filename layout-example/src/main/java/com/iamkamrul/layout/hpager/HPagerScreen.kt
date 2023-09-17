@file:OptIn(ExperimentalFoundationApi::class)

package com.iamkamrul.layout.hpager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.theme.Purple80
import com.iamkamrul.designsystem.theme.PurpleGrey80
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

@Composable
fun HorizontalPagerScreen(
    onBackClick:()->Unit
){
    val pagerState = rememberPagerState(pageCount = {5}, initialPage = 0)
    val pagerState1 = rememberPagerState(pageCount = {5},initialPage = 0)
    val pagerState2 = rememberPagerState(pageCount = {5},initialPage = 0)
    val pagerState3 = rememberPagerState(pageCount = {5},initialPage = 1)
    val coroutineScope = rememberCoroutineScope()

    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Horizontal Pager",
        onBackClick = onBackClick
    ) { it ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {


            //---------------------EXAMPLE 1----------------------------
            Text(text = "Example-1", modifier = Modifier.padding(8.dp))
            HorizontalPager(
                state = pagerState
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(com.iamkamrul.designsystem.theme.Purple80),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "Horizontal Pager Index : $it")
                }
            }


            //---------------------EXAMPLE 2----------------------------
            Text(text = "Example-2", modifier = Modifier.padding(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                HorizontalPager(state = pagerState1) {
                    Text(
                        text = "Page Index $it",
                        modifier = Modifier
                            .fillMaxSize()
                            .background(com.iamkamrul.designsystem.theme.PurpleGrey80)
                            .wrapContentSize(align = Alignment.Center)
                    )
                }

                Row(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    val isPreviousButtonEnabled = remember {
                        derivedStateOf {
                            pagerState1.currentPage > 0
                        }
                    }

                    val isNextButtonEnabled = remember {
                        derivedStateOf {
                            pagerState1.currentPage < 4
                        }
                    }

                    TextButton(
                        enabled = isPreviousButtonEnabled.value,
                        onClick = {
                            coroutineScope.launch {
                                pagerState1.animateScrollToPage((pagerState1.currentPage - 1))
                            }
                        },
                        content = {
                            Text(text = "Previous")
                        }
                    )


                    TextButton(
                        enabled = isNextButtonEnabled.value,
                        onClick = {
                            coroutineScope.launch {
                                pagerState1.animateScrollToPage((pagerState1.currentPage + 1))
                            }
                        },
                        content = {
                            Text(text = "Next")
                        }
                    )
                }
            }


            //---------------------EXAMPLE 3----------------------------
            Text(text = "Example-3", modifier = Modifier.padding(8.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(com.iamkamrul.designsystem.theme.Purple80)
            ) {
                HorizontalPager(state = pagerState2) {
                    Text(
                        text = "Horizontal Pager Index : $it",
                        modifier = Modifier
                            .fillMaxSize()
                            .wrapContentSize(Alignment.Center)
                    )
                }

                HorizontalPagerIndicator(
                    pagerState = pagerState2,
                    pageCount = 5,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 10.dp),
                )
            }

            //---------------------EXAMPLE 3----------------------------
            Text(text = "Example-4", modifier = Modifier.padding(8.dp))
            HorizontalPager(
                state = pagerState3,
                contentPadding = PaddingValues(horizontal = 64.dp),
            ) { page ->
                Card(
                    modifier = Modifier
                        .graphicsLayer {
                            val pageOffset = (
                                    (pagerState3.currentPage - page) + pagerState3
                                        .currentPageOffsetFraction
                                    ).absoluteValue

                            lerp(
                                start = 0.85f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            ).also { scale ->
                                scaleX = scale
                                scaleY = scale
                            }

                            // We animate the alpha, between 50% and 100%
                            alpha = lerp(
                                start = 0.5f,
                                stop = 1f,
                                fraction = 1f - pageOffset.coerceIn(0f, 1f)
                            )
                        }
                        .fillMaxSize(),
                    colors = CardDefaults.cardColors(
                        containerColor = com.iamkamrul.designsystem.theme.Purple40
                    )
                ) {

                }
            }

        }
    }
}