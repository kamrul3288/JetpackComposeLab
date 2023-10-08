@file:OptIn(ExperimentalFoundationApi::class)

package com.iamkamrul.layout.hpager

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.lerp
import coil.compose.AsyncImage
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.theme.White
import kotlinx.coroutines.launch
import kotlin.math.absoluteValue

@Composable
fun HorizontalPagerScreen(
    onBackClick:()->Unit
){
    val pagerState = rememberPagerState(pageCount = {5}, initialPage = 0)
    val pagerState1 = rememberPagerState(pageCount = {5},initialPage = 1)
    val pagerState2 = rememberPagerState(pageCount = {5},initialPage = 2)
    val pagerState3 = rememberPagerState(pageCount = {5},initialPage = 3)
    val coroutineScope = rememberCoroutineScope()
    val imageList = listOf(
        "https://wallpaper.dog/small/20508896.jpg",
        "https://wallpaper.dog/small/20609094.jpg",
        "https://wallpaper.dog/small/20557592.jpg",
        "https://wallpaper.dog/small/20611420.jpg",
        "https://wallpaper.dog/small/20609161.jpg"
    )

    ScaffoldTopAppbar(
        title = "Horizontal Pager",
        onNavigationIconClick = onBackClick
    ) { it ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp)
        ) {


            //---------------------EXAMPLE 1----------------------------
            HorizontalPager(
                state = pagerState
            ) {
                Box{
                  AsyncImage(
                      modifier = Modifier
                          .fillMaxWidth()
                          .height(120.dp)
                          .clip(RoundedCornerShape(10.dp)),
                      model = imageList[it],
                      contentDescription = "image",
                      contentScale = ContentScale.FillWidth,
                  )
                }
            }


            //---------------------EXAMPLE 2----------------------------
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = MaterialTheme.colorScheme.primary
            )
            Box{
                HorizontalPager(state = pagerState1) {
                    AsyncImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        model = imageList[it],
                        contentDescription = "image",
                        contentScale = ContentScale.FillWidth,
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
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = MaterialTheme.colorScheme.primary
            )
            Box{
                HorizontalPager(state = pagerState2) {
                    AsyncImage(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(120.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        model = imageList[it],
                        contentDescription = "image",
                        contentScale = ContentScale.FillWidth,
                    )
                }

                HorizontalPagerIndicator(
                    pagerState = pagerState2,
                    pageCount = 5,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 10.dp),
                    activeColor = White,
                    inactiveColor = White.copy(alpha = 0.3f)
                )
            }

            //---------------------EXAMPLE 3----------------------------
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 16.dp),
                color = MaterialTheme.colorScheme.primary
            )
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
                ) {
                    AsyncImage(
                        modifier = Modifier.fillMaxSize(),
                        model = imageList[page],
                        contentDescription = "image",
                        contentScale = ContentScale.FillHeight,
                    )
                }
            }

        }
    }
}