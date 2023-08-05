package com.iamkamrul.material.dialog

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.iamkamrul.common.theme.Purple40
import com.iamkamrul.common.theme.Red
import com.iamkamrul.common.theme.color

@Composable
internal fun BasicAlertDialog(
    onDialogDismiss:()->Unit
){
    var openDialog by remember { mutableStateOf(true) }
    if (openDialog){
       AlertDialog(
           onDismissRequest = {
               openDialog = false
               onDialogDismiss.invoke()
           }, 
           confirmButton = {
               TextButton(onClick = {
                   openDialog = false
                   onDialogDismiss.invoke()
               }) {
                   Text(text = "Confirm", color = Purple40)
               }
           },
           dismissButton = {
               TextButton(onClick = {
                   openDialog = false
                   onDialogDismiss.invoke()
               }) {
                   Text(text = "Dismiss", color = Red)
               }
           },
           icon = {
               Icon(imageVector = Icons.Default.Check, contentDescription = "")
           },
           title = {
               Text(text = "Basic Alert Dialog Title")
           },
           text = {
               Text(text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy.")
           },
           containerColor = MaterialTheme.color.card,
           textContentColor = MaterialTheme.color.black,
           titleContentColor = MaterialTheme.color.black
       )
    }

}