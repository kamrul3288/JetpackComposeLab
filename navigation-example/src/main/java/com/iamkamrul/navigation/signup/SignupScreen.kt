package com.iamkamrul.navigation.signup

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import com.iamkamrul.designsystem.theme.White
import com.iamkamrul.navigation.home.User

@Composable
internal fun SignUpScreen(
    onBackClick:()->Unit,
    onHomeBtnClick:(User)->Unit,
) {

    BackHandler(enabled = true) {
        onBackClick()
    }
    ScaffoldTopAppbar(
        title = "Sign up",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Account created successfully", style = MaterialTheme.typography.titleMedium)

            Spacer(modifier = Modifier.height(32.dp))
            ElevatedButton(
                onClick = {
                    onHomeBtnClick(User(name = "Kamrul Hasan", phoneNumber = "+8801701999999"))
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                ),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Explore now", style = MaterialTheme.typography.labelLarge)
                Spacer(modifier = Modifier.width(5.dp))
                Icon(imageVector = JclIcons.ArrowCircleRight, contentDescription = null)
            }
        }
    }
}