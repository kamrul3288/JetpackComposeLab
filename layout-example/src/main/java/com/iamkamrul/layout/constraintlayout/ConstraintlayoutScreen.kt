package com.iamkamrul.layout.constraintlayout

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun ConstraintLayoutScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "ConstraintLayout", onBackClick = onBackClick) {

    }
}