package com.iamkamrul.layout

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun LayoutHomeScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Layouts", onBackClick = onBackClick) {

    }
}