package com.iamkamrul.layout.row

import androidx.compose.runtime.Composable
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun RowScreen(
    onBackClick:()->Unit,
) {
    ScaffoldWithBackNavigation(title = "Row", onBackClick = onBackClick) {
        //Use Column to place items vertically on the screen.

    }
}