package com.iamkamrul.layout.box

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun BoxScreen(
    onBackClick:()->Unit,
){
    ScaffoldWithBackNavigation(title = "Box", onBackClick = onBackClick) {

    }
}