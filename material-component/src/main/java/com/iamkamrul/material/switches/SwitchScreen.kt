package com.iamkamrul.material.switches

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons

@Composable
internal fun SwitchScreen(
    onBackClick:()->Unit
) {

    var isCheckedSwitch1 by remember { mutableStateOf(true) }
    var isCheckedSwitch2 by remember { mutableStateOf(true) }


    ScaffoldTopAppbar(
        title = "Switch",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Switch(
                checked = isCheckedSwitch1,
                onCheckedChange = { isChecked ->
                    isCheckedSwitch1 = isChecked
                },
                colors = SwitchDefaults.colors(
                    checkedTrackColor = MaterialTheme.colorScheme.primary,
                    uncheckedBorderColor = Color.LightGray.copy(alpha = 0.5f),
                    uncheckedThumbColor = Color.LightGray.copy(alpha = 0.5f),
                )
            )


            Spacer(modifier = Modifier.height(16.dp))
            Switch(
                checked = isCheckedSwitch2,
                onCheckedChange = { isChecked ->
                    isCheckedSwitch2 = isChecked
                },
                colors = SwitchDefaults.colors(
                    checkedTrackColor = MaterialTheme.colorScheme.primary,
                    uncheckedBorderColor = Color.LightGray.copy(alpha = 0.5f),
                    uncheckedThumbColor = Color.LightGray.copy(alpha = 0.5f),
                ),
                thumbContent = {
                    Icon(
                        imageVector = if (isCheckedSwitch2) Icons.Filled.Check else JclIcons.RadioButtonUnchecked,
                        contentDescription = null,
                        modifier = Modifier.size(SwitchDefaults.IconSize),
                    )

                }
            )

        }
    }
}