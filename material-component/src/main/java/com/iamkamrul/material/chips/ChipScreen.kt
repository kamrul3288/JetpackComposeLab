@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.chips

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.White
import com.iamkamrul.common.theme.color

@Composable
internal fun ChipScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Chip", onBackClick = onBackClick) {

        val filterItemChips  = listOf("Ongoing","Confirmed","Completed")
        var selectedFilterItemIndex by remember { mutableIntStateOf(0) }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {



            //-------------------Assist Chip Example---------------------
            Text(text = "Assist Chip Example:", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                AssistChip(
                    onClick = {},
                    label = { Text(text = "Assist Chip") },
                    leadingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    colors = AssistChipDefaults.assistChipColors(
                        labelColor = MaterialTheme.color.black,
                        leadingIconContentColor = MaterialTheme.color.sliderThumbColor
                    )
                )

                ElevatedAssistChip(
                    onClick = {},
                    label = { Text(text = "Elevated Assist Chip") },
                    leadingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                    colors = AssistChipDefaults.assistChipColors(
                        labelColor = White,
                        leadingIconContentColor = White,
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                )
            }


            //-------------------Filter Chip Example---------------------
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Filter Chip Example:", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                filterItemChips.forEachIndexed { index, label ->
                    FilterChip(
                        selected = selectedFilterItemIndex == index,
                        onClick = {
                            selectedFilterItemIndex = index
                        },
                        label = {
                            Text(text = label)
                        },
                        leadingIcon = if (selectedFilterItemIndex == index) {
                            {
                                Icon(imageVector = Icons.Default.Check, contentDescription = null)
                            }
                        }
                        else null,
                        colors = FilterChipDefaults.filterChipColors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary,
                            selectedLeadingIconColor = White,
                            selectedLabelColor = White
                        )
                    )
                }
            }

        }
    }
}