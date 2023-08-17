package com.iamkamrul.navigation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
internal fun LoginScreen(
    onBackClick:()->Unit,
    onOtpVerifyBtnClick:(String)->Unit,
    onHomeBtnClick:(User)->Unit,
) {
    ScaffoldWithBackNavigation(title = "Login", onBackClick = onBackClick) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
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

            ElevatedButton(
                onClick = {
                    onOtpVerifyBtnClick("+8801701999999")
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Text(text = "Navigation To Opt Verify", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = Icons.Default.ArrowCircleRight, contentDescription = null)
            }
        }
    }
}