package com.iamkamrul.navigation.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation

@Composable
internal fun HomeScreen(
    onBackClick:()->Unit,
    user: User
) {
    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Home",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = user.name, style = MaterialTheme.typography.displayMedium)
            Text(text = user.phoneNumber, style = MaterialTheme.typography.titleMedium)
        }
    }
}