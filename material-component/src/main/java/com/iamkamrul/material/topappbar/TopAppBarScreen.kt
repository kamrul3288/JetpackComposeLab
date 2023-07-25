package com.iamkamrul.material.topappbar

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun TopAppbarScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Top Appbar Example", onBackClick = onBackClick) {

    }
}