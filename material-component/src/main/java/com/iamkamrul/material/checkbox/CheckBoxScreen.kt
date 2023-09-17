package com.iamkamrul.material.checkbox

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
internal fun CheckBoxScreen(
    onBackClick:()->Unit
) {
    var isAppleCheckBoxChecked by remember { mutableStateOf(false) }
    var isMangoCheckBoxChecked by remember { mutableStateOf(false) }
    var isOrangeCheckBoxChecked by remember { mutableStateOf(false) }


    com.iamkamrul.designsystem.component.ScaffoldTopAppbar(
        title = "CheckBox",
        onNavigationIconClick = onBackClick
    ) { it ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isAppleCheckBoxChecked,
                    onCheckedChange = {
                        isAppleCheckBoxChecked = it
                    }
                )
                Text(text = "Apple")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isMangoCheckBoxChecked,
                    onCheckedChange = {
                        isMangoCheckBoxChecked = it
                    }
                )
                Text(text = "Mango")
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isOrangeCheckBoxChecked,
                    onCheckedChange = {
                        isOrangeCheckBoxChecked = it
                    }
                )
                Text(text = "Orange")
            }
        }
    }
}