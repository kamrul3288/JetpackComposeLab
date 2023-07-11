package com.iamkamrul.layout.flow

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun FlowLayoutScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Flow Layout", onBackClick = onBackClick) {

    }
}