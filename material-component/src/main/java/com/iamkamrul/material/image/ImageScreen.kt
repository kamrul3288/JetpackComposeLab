package com.iamkamrul.material.image

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun ImageScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Images", onBackClick = onBackClick) {

    }
}