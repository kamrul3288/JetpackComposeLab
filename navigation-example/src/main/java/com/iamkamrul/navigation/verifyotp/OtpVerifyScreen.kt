package com.iamkamrul.navigation.verifyotp

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
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.White

@Composable
internal fun OtpVerifyScreen(
    onBackClick:()->Unit,
    onSignUpBtnClick:()->Unit,
    phoneNumber:String
) {
    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Otp Verify",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = phoneNumber, style = MaterialTheme.typography.titleLarge)
            Text(text = "Otp Verified successfully")

            Spacer(modifier = Modifier.height(32.dp))
            ElevatedButton(
                onClick = onSignUpBtnClick,
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = com.iamkamrul.designsystem.theme.White
                )
            ) {
                Text(text = "Navigation To Signup", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = Icons.Default.ArrowCircleRight, contentDescription = null)
            }
        }
    }
}