package com.iamkamrul.navigation.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.navigation.home.User

@Composable
internal fun LoginScreen(
    onBackClick:()->Unit,
    onOtpVerifyBtnClick:(String)->Unit,
    onHomeBtnClick:(User)->Unit,
) {
    ScaffoldTopAppbar(
        title = "Login",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(
                text = "Welcome Back, Developer!",
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.padding(bottom = 24.dp)
            )


            //------------passing custom object/intent-----------------------
            ElevatedButton(
                onClick = {
                    onHomeBtnClick(User(name = "Kamrul Hasan", phoneNumber = "+880xxxxxxxx"))
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = com.iamkamrul.designsystem.theme.White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Login", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = JclIcons.ArrowCircleRight, contentDescription = null)
            }


            //------------passing  primitive intent-----------------------
            ElevatedButton(
                onClick = {
                    onOtpVerifyBtnClick("+880xxxxxxx")
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = com.iamkamrul.designsystem.theme.White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Create Account", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = JclIcons.ArrowCircleRight, contentDescription = null)
            }
        }
    }
}