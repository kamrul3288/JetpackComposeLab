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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.Pink80
import com.iamkamrul.common.theme.Purple40
import com.iamkamrul.common.theme.Purple80
import com.iamkamrul.common.theme.PurpleGrey40
import com.iamkamrul.common.theme.PurpleGrey80
import com.iamkamrul.common.theme.color
import com.iamkamrul.material.R

@Composable
internal fun ButtonScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(
        title = "Buttons",
        onBackClick = onBackClick)
    {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier
            .fillMaxSize()
            .padding(16.dp)) {

            //--------------------- ElevatedButton Example------------------
            ElevatedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                /*colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = Purple40,
                    contentColor = White
                )*/
            ) {
                Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "add")
                Text(text = "Elevated Button")
            }


            //--------------------- FilledButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Purple40
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
                    containerColor = PurpleGrey80
                )
            ) {
                Text(text = "Filled Tonal Button")
            }

            //--------------------- OutlinedButton Example------------------
            Spacer(modifier = Modifier.height(10.dp))
            OutlinedButton(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(width = 2.dp, color = Purple40),
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
                    containerColor = Purple80
                ) {
                    Text(text = "FAB")
                }

                ExtendedFloatingActionButton(
                    onClick = {},
                    containerColor = Pink80,
                    contentColor = PurpleGrey40,
                ) {
                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
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
                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
                }

                FilledIconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
                }

                OutlinedIconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
                }

                FilledTonalIconButton(onClick = {}) {
                    Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
                }
            }

            //todo: Segmented buttons

        }
    }
}