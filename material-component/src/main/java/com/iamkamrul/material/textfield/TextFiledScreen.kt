package com.iamkamrul.material.textfield

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun TextFieldScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "TextField", onBackClick = onBackClick) {

    }
}