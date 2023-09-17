package com.iamkamrul.material.radio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material.icons.filled.RadioButtonUnchecked
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.Pink40
import com.iamkamrul.designsystem.theme.Pink80
import com.iamkamrul.designsystem.theme.White
import com.iamkamrul.designsystem.theme.color

@Composable
internal fun RadioButtonScreen(
    onBackClick:()->Unit
) {
    val genderRadioOptions = listOf("Male", "Female", "Others")
    val (selectedOption, onOptionSelected) = remember { mutableStateOf(genderRadioOptions[0]) }



    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Radio Button",
        onBackClick = onBackClick
    ) { it ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            //------------------Radio Example 1-----------------
            Row(
                modifier = Modifier.selectableGroup(),
            ) {
                genderRadioOptions.forEach {
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = (it == selectedOption),
                                onClick = {
                                    onOptionSelected(it)
                                },
                                role = Role.RadioButton
                            ),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        RadioButton(
                            selected = (it == selectedOption),
                            onClick = {
                                onOptionSelected(it)
                            },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = MaterialTheme.color.sliderThumbColor,
                                unselectedColor = MaterialTheme.color.black
                            )
                        )
                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }
            }


            //------------------Radio Example 2-----------------
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.selectableGroup(),
            ) {
                genderRadioOptions.forEach {
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = (it == selectedOption),
                                onClick = {
                                    onOptionSelected(it)
                                },
                                role = Role.RadioButton
                            )
                            .padding(end = 8.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Icon(
                            imageVector = if (it == selectedOption) Icons.Default.CheckCircleOutline else Icons.Default.RadioButtonUnchecked,
                            contentDescription = "Radio",
                            tint = MaterialTheme.color.sliderThumbColor
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = it,
                            style = MaterialTheme.typography.bodyLarge,
                        )
                    }
                }
            }


            //------------------Radio Example 3-----------------
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier.selectableGroup(),
            ) {
                genderRadioOptions.forEach {
                    Row(
                        modifier = Modifier
                            .selectable(
                                selected = (it == selectedOption),
                                onClick = {},
                                role = Role.RadioButton
                            )
                            .padding(end = 16.dp),
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        ElevatedButton(
                            onClick = {
                                onOptionSelected(it)
                            },
                            colors = ButtonDefaults.elevatedButtonColors(
                                contentColor = com.iamkamrul.designsystem.theme.White,
                                containerColor = if (it == selectedOption) com.iamkamrul.designsystem.theme.Pink40 else com.iamkamrul.designsystem.theme.Pink80
                            )
                        ) {
                            Text(text = it)
                        }
                    }
                }
            }
        }
    }
}