package com.iamkamrul.material.progressbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun ProgressBarScreen(
    onBackClick:()->Unit
) {
    com.iamkamrul.designsystem.component.ScaffoldTopAppbar(
        title = "Progressbar",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            Row {
                CircularProgressIndicator()

                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    strokeWidth = 6.dp
                )

                Spacer(modifier = Modifier.width(16.dp))
                CircularProgressIndicator(
                    strokeWidth = 4.dp,
                    trackColor = com.iamkamrul.designsystem.theme.White,
                    color = com.iamkamrul.designsystem.theme.Red
                )
            }

            Spacer(modifier = Modifier.height(32.dp))
            LinearProgressIndicator()

            Spacer(modifier = Modifier.height(32.dp))
            LinearProgressIndicator(
                modifier = Modifier.height(10.dp),
                progress = 0.5f,
            )


        }
    }
}