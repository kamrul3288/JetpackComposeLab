package com.iamkamrul.material.tabs

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun TabsScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Tabs Example", onBackClick = onBackClick) {

    }
}