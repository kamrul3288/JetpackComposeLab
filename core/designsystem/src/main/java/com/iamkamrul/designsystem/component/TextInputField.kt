package com.iamkamrul.designsystem.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.theme.Purple80
import com.iamkamrul.designsystem.theme.color

@Composable
fun JclOutlineTextField(
    value:String,
    onValueChange:(String)->Unit,
    label:String,
    keyboardOptions: KeyboardOptions,
    modifier: Modifier = Modifier
){
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier.fillMaxWidth(),
        label = {
            Text(text = label)
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedTextColor = MaterialTheme.color.black,
            unfocusedTextColor = MaterialTheme.color.black,
            unfocusedContainerColor = Color.Transparent,
            focusedContainerColor = Color.Transparent,
            unfocusedBorderColor = Purple80,
            focusedBorderColor = Purple40
        ),
        keyboardOptions = keyboardOptions
    )
}