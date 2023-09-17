package com.iamkamrul.material.divider

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
internal fun DividerScreen(
    onBackClick:()->Unit
) {
    com.iamkamrul.designsystem.component.ScaffoldTopAppbar(
        title = "",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Divider()

            Spacer(modifier = Modifier.height(24.dp))
            Divider(
                thickness = 10.dp,
                color = MaterialTheme.colorScheme.primary
            )



            Spacer(modifier = Modifier.height(24.dp))
            HorizontalDashedDivider(
                color = MaterialTheme.colorScheme.primary,
                thickness = 2.dp,
            )


            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Vertical Dash Line")
            VerticalDashedDivider(
                modifier = Modifier.height(50.dp),
                thickness = 3.dp,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}