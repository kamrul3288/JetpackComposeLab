package com.iamkamrul.material.radio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun RadioButtonScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Radio Button", onBackClick = onBackClick) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

        }
    }
}