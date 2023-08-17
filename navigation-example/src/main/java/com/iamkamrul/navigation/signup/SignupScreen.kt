package com.iamkamrul.navigation.signup

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleRight
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.White
import com.iamkamrul.navigation.home.User

@Composable
internal fun SignUpScreen(
    onBackClick:()->Unit,
    onHomeBtnClick:(User)->Unit,
) {

    BackHandler(enabled = true) {
        onBackClick()
    }
    ScaffoldWithBackNavigation(title = "Sign up", onBackClick = onBackClick) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Sing up completed")

            Spacer(modifier = Modifier.height(32.dp))
            ElevatedButton(
                onClick = {
                    onHomeBtnClick(User(name = "Kamrul Hasan", phoneNumber = "+8801701999999"))
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Text(text = "Navigation To Home", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = Icons.Default.ArrowCircleRight, contentDescription = null)
            }
        }
    }
}