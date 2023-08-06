package com.iamkamrul.material.checkbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun CheckBoxScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "", onBackClick = onBackClick) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
    }
}