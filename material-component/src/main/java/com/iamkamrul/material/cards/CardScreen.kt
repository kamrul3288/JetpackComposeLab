package com.iamkamrul.material.cards

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun CardScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Card", onBackClick = onBackClick) {

    }
}