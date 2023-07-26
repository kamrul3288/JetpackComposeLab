package com.iamkamrul.material.textfield

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Error
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.Pink40
import com.iamkamrul.common.theme.Pink80
import com.iamkamrul.common.theme.Purple40
import com.iamkamrul.common.theme.Purple80
import com.iamkamrul.common.theme.Red
import com.iamkamrul.common.theme.color

@Composable
internal fun TextFieldScreen(
    onBackClick:()->Unit
) {

    var textFiledValue by remember { mutableStateOf("") }
    var phoneValue by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var isPhoneNumberInValid by remember { mutableStateOf(false) }

    ScaffoldWithBackNavigation(title = "TextField", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(16.dp)) {


            TextField(
                value = textFiledValue,
                onValueChange = {value->
                    textFiledValue = value
                },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedTextColor = MaterialTheme.color.black,
                    unfocusedTextColor = MaterialTheme.color.black,
                ),
                label = {
                    Text(text = "Input Your Email")
                }
            )


            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = textFiledValue,
                onValueChange = {value->
                    textFiledValue = value
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
                    unfocusedBorderColor = Purple80,
                    focusedBorderColor = Purple40
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )


            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = textFiledValue,
                onValueChange = {value->
                    textFiledValue = value
                },
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Input Your Password")
                },
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = MaterialTheme.color.black,
                    unfocusedTextColor = MaterialTheme.color.black,
                    unfocusedContainerColor = Color.Transparent,
                    focusedContainerColor = Color.Transparent,
                    unfocusedBorderColor = Pink80,
                    focusedBorderColor = Pink40
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = if (showPassword) VisualTransformation.None else PasswordVisualTransformation(),
                trailingIcon = {
                    IconButton(onClick = { showPassword = !showPassword }) {
                        Icon(
                            imageVector = if (showPassword) Icons.Outlined.VisibilityOff else Icons.Outlined.Visibility,
                            contentDescription = if (showPassword) "Show Password" else "Hide Password"
                        )
                    }
                },
                leadingIcon = {
                    Icon(imageVector = Icons.Outlined.Lock, contentDescription = "Password Icon")
                }
            )



            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = textFiledValue,
                onValueChange = {value->
                    textFiledValue = value
                },
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = MaterialTheme.color.black,
                    unfocusedTextColor = MaterialTheme.color.black,
                    unfocusedContainerColor = Color.LightGray.copy(alpha = 0.4f),
                    focusedContainerColor = Color.LightGray.copy(alpha = 0.4f),
                    unfocusedBorderColor = Color.Transparent,
                    focusedBorderColor = MaterialTheme.color.black
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                placeholder = {
                    Text(text = "Enter Your Name", color = Color.Gray)
                }
            )


            Spacer(modifier = Modifier.height(16.dp))
            OutlinedTextField(
                value = phoneValue,
                isError = isPhoneNumberInValid,
                onValueChange = {value->
                    phoneValue = value
                    isPhoneNumberInValid = value.length<10
                },
                modifier = Modifier.fillMaxWidth(),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedTextColor = MaterialTheme.color.black,
                    unfocusedTextColor = MaterialTheme.color.black,
                    errorTextColor = MaterialTheme.color.black,
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
                placeholder = {
                    Text(text = "Enter Phone Number", color = Color.Gray)
                }
            )

            if (isPhoneNumberInValid){
                Spacer(modifier = Modifier.height(4.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                   Icon(imageVector = Icons.Outlined.Error, contentDescription = "Error", tint = Red)
                    Spacer(modifier = Modifier.width(4.dp))
                   Text(text = "Invalid Phone Number", style = MaterialTheme.typography.labelSmall, color = Red)
                }
            }


        }
    }
}