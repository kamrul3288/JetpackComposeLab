package com.iamkamrul.material.tabs

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector

data class TabsItem(
    val title:String,
    val icon:ImageVector,
    val screen: @Composable ()-> Unit
)
