package com.iamkamrul.material.dialog

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.White

@Composable
internal fun DialogScreen(
    onBackClick:()->Unit
) {
    var isOpenBasicDialog by remember { mutableStateOf(false) }
    var isOpenBasicViewDialog by remember { mutableStateOf(false) }
    var isOpenFullScreenDialog by remember { mutableStateOf(false) }

    ScaffoldTopAppbar(
        title = "Dialogs",
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

            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    isOpenBasicDialog = true
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Icon(imageVector = JclIcons.CrisisAlert, contentDescription = "")
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Basic Alert Dialog")
            }
            if (isOpenBasicDialog) {
                BasicAlertDialog {
                    isOpenBasicDialog = false
                }
            }



            Spacer(modifier = Modifier.height(32.dp))
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    isOpenBasicViewDialog = true
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Icon(imageVector = JclIcons.CrisisAlert, contentDescription = "")
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "View Alert Dialog")
            }
            if (isOpenBasicViewDialog) {
                BasicViewAlertDialog {
                    isOpenBasicViewDialog = false
                }
            }



            Spacer(modifier = Modifier.height(32.dp))
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    isOpenFullScreenDialog = true
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Icon(imageVector = JclIcons.CrisisAlert, contentDescription = "")
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Full Screen Dialog")
            }
            if (isOpenFullScreenDialog) {
                FullScreenDialog {
                    isOpenFullScreenDialog = false
                }
            }


        }
    }
}


