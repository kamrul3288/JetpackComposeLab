@file:OptIn(ExperimentalFoundationApi::class)

package com.iamkamrul.layout.vpager
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import coil.compose.AsyncImage
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.theme.Black

@Composable
fun VerticalPagerScreen(
    onBackClick:()->Unit
){

    val pagerState = rememberPagerState(pageCount = {5}, initialPage = 0)
    val imageList = listOf(
        "https://wallpaper.dog/small/20508896.jpg",
        "https://wallpaper.dog/small/20609094.jpg",
        "https://wallpaper.dog/small/20557592.jpg",
        "https://wallpaper.dog/small/20611420.jpg",
        "https://wallpaper.dog/small/20609161.jpg"
    )

    ScaffoldTopAppbar(
        title = "Vertical Pager",
        onNavigationIconClick = onBackClick
    ) {
        VerticalPager(state = pagerState) {
            Box{
                AsyncImage(
                    modifier = Modifier.fillMaxSize()
                        .background(Black),
                    model = imageList[it],
                    contentDescription = "image",
                    contentScale = ContentScale.Fit,
                )
            }
        }
    }
}