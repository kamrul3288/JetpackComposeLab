package com.iamkamrul.designsystem.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.utils.debounceClick

@Composable
fun JclButton(
    modifier: Modifier = Modifier,
    containerColor:Color = Purple40,
    text:String,
    onClick:()->Unit
){
    Button(
        onClick = debounceClick{onClick()},
        modifier = modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor
        )
    ) {
        Text(text = text)
    }
}