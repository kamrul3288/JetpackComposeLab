package com.iamkamrul.layout.vpager

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun VerticalPagerScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Vertical Pager", onBackClick = onBackClick) {

    }
}