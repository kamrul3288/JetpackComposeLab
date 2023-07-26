package com.iamkamrul.material.timepicker

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
internal fun TimePickerScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Time Picker", onBackClick = onBackClick) {
        Column(modifier = Modifier.fillMaxSize()) {

        }
    }
}