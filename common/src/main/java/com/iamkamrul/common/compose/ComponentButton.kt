package com.iamkamrul.common.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamkamrul.common.R
import com.iamkamrul.common.theme.Black

@Composable
fun ComponentButton(
    modifier: Modifier,
    buttonLabel:String,
    onClick:()->Unit
){
    Card(
        modifier = modifier.clickable { onClick() },
        shape = RoundedCornerShape(5.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_android),
                contentDescription = "android"
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = buttonLabel,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Black
            )
        }
    }
}