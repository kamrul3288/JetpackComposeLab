@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.dialog

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AlertDialogDefaults
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.theme.color


@Composable
internal fun BasicViewAlertDialog(
    onDialogDismiss:()->Unit
){
    var openDialog by remember { mutableStateOf(true) }
    var emailFiledValue by remember { mutableStateOf("") }
    var nameFiledValue by remember { mutableStateOf("") }

    if (openDialog){
        BasicAlertDialog(
            onDismissRequest = {}
        ) {
            Surface(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight(),
                shape = MaterialTheme.shapes.large,
                tonalElevation = AlertDialogDefaults.TonalElevation,
                color = MaterialTheme.color.card,
                contentColor = MaterialTheme.color.black
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {


                    Spacer(modifier = Modifier.height(16.dp))
                    Icon(imageVector = Icons.Default.Check, contentDescription = null)


                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Basic Alert Dialog Title",
                        style = MaterialTheme.typography.titleLarge
                    )


                    //------------Input Field-------------
                    Spacer(modifier = Modifier.height(16.dp))
                    OutlinedTextField(
                        value = emailFiledValue,
                        onValueChange = { value ->
                            emailFiledValue = value
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Input Your Email")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = MaterialTheme.color.black,
                            unfocusedTextColor = MaterialTheme.color.black,
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedBorderColor = com.iamkamrul.designsystem.theme.Purple80,
                            focusedBorderColor = com.iamkamrul.designsystem.theme.Purple40
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )

                    OutlinedTextField(
                        value = nameFiledValue,
                        onValueChange = { value ->
                            nameFiledValue = value
                        },
                        modifier = Modifier.fillMaxWidth(),
                        label = {
                            Text(text = "Input Your Name")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedTextColor = MaterialTheme.color.black,
                            unfocusedTextColor = MaterialTheme.color.black,
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedBorderColor = com.iamkamrul.designsystem.theme.Purple80,
                            focusedBorderColor = com.iamkamrul.designsystem.theme.Purple40
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )

                    //------------Action Button---------------------
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    ) {

                        TextButton(onClick = {
                            openDialog = false
                            onDialogDismiss.invoke()
                        }) {
                            Text(text = "Dismiss", color = com.iamkamrul.designsystem.theme.Red)
                        }

                        TextButton(onClick = {
                            openDialog = false
                            onDialogDismiss.invoke()
                        }) {
                            Text(
                                text = "Confirm",
                                color = com.iamkamrul.designsystem.theme.Purple40
                            )
                        }
                    }
                }
            }
        }
    }
}
