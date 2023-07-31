package com.iamkamrul.material.switches

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun SwitchScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Switch", onBackClick = onBackClick) {

    }
}