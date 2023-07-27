package com.iamkamrul.material.tooltip

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun TooltipScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Tooltip", onBackClick = onBackClick) {

    }
}