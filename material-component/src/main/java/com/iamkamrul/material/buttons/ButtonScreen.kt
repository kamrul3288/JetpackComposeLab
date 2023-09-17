package com.iamkamrul.material.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.color

@Composable
internal fun ButtonScreen(
    onBackClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Buttons",
        onNavigationIconClick = onBackClick
    )
    {
        val modifier = Modifier.padding(it)
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            //--------------------- ElevatedButton Example------------------
            ElevatedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                /*colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Purple40,
                    contentColor = White
                )*/
            ) {
                Icon(imageVector = JclIcons.Add, contentDescription = "add")
                Text(text = "Elevated Button")
            }


            //--------------------- FilledButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = com.iamkamrul.designsystem.theme.Purple40
                )
            ) {
                Text(text = "Filled Button")
            }

            //--------------------- FilledTonalButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            FilledTonalButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.filledTonalButtonColors(
                    containerColor = com.iamkamrul.designsystem.theme.PurpleGrey80
                )
            ) {
                Text(text = "Filled Tonal Button")
            }

            //--------------------- OutlinedButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(
                    width = 2.dp,
                    color = com.iamkamrul.designsystem.theme.Purple40
                ),
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.color.black
                )
            ) {
                Text(text = "Outlined Button")
            }

            //--------------------- TextButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            TextButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.color.black
                )
            ) {
                Text(text = "Text Button")
            }

            //--------------------- FAB and Extended Fab Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                FloatingActionButton(
                    onClick = {},
                    containerColor = com.iamkamrul.designsystem.theme.Purple80
                ) {
                    Text(text = "FAB")
                }

                ExtendedFloatingActionButton(
                    onClick = {},
                    containerColor = com.iamkamrul.designsystem.theme.Pink80,
                    contentColor = com.iamkamrul.designsystem.theme.PurpleGrey40,
                ) {
                    Icon(imageVector = JclIcons.Add, contentDescription = "")
                    Text(text = "EXTENDED FAB")
                }
            }

            //--------------------- Icon Example------------------
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Icon Button Example:")
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(onClick = {}) {
                    Icon(imageVector = JclIcons.Add, contentDescription = "")
                }

                FilledIconButton(onClick = {}) {
                    Icon(imageVector = JclIcons.Add, contentDescription = "")
                }

                OutlinedIconButton(onClick = {}) {
                    Icon(imageVector = JclIcons.Add, contentDescription = "")
                }

                FilledTonalIconButton(onClick = {}) {
                    Icon(imageVector = JclIcons.Add, contentDescription = "")
                }
            }

            //todo: Segmented buttons

        }
    }
}