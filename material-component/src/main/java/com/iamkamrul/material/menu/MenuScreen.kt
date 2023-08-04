@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Restore
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.White
import com.iamkamrul.common.theme.color

@Composable
internal fun MenuScreen(
    onBackClick: () -> Unit
) {
    var isDropDownMenuExpanded by remember { mutableStateOf(false) }

    val countries = listOf("Bangladesh", "US", "Russia")
    var isExposeDropDownMenuExpanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf(countries[0]) }


    var isExposeDropDownMenu2Expanded by remember { mutableStateOf(false) }
    var selectedCountry2 by remember { mutableStateOf(countries[1]) }



    ScaffoldWithBackNavigation(title = "Menu", onBackClick = onBackClick) { it ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            //------------------------ DROP Down Menu Example-------------------------------------
            Spacer(modifier = Modifier.height(16.dp))
            Box {
                ElevatedButton(
                    onClick = {
                        isDropDownMenuExpanded = true
                    },
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = White
                    )
                ) {
                    Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
                    Text(text = "DropDown Menu")
                }
                DropdownMenu(
                    modifier = Modifier
                        .width(170.dp)
                        .background(MaterialTheme.color.card),
                    expanded = isDropDownMenuExpanded,
                    onDismissRequest = {
                        isDropDownMenuExpanded = false
                    },
                ) {
                    DropdownMenuItem(
                        text = { Text("Edit") },
                        onClick = {},
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Edit,
                                contentDescription = null
                            )
                        },
                        colors = MenuDefaults.itemColors(
                            textColor = MaterialTheme.color.black,
                            leadingIconColor = MaterialTheme.color.black
                        )
                    )
                    Divider()
                    DropdownMenuItem(
                        text = { Text("Delete") },
                        onClick = {},
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Delete,
                                contentDescription = null
                            )
                        },
                        colors = MenuDefaults.itemColors(
                            textColor = MaterialTheme.color.black,
                            leadingIconColor = MaterialTheme.color.black
                        )
                    )
                    Divider()
                    DropdownMenuItem(
                        text = { Text("Restore") },
                        onClick = {},
                        leadingIcon = {
                            Icon(
                                Icons.Outlined.Restore,
                                contentDescription = null
                            )
                        },
                        colors = MenuDefaults.itemColors(
                            textColor = MaterialTheme.color.black,
                            leadingIconColor = MaterialTheme.color.black
                        )
                    )
                }
            }


            //------------------------ ExposedDropdownMenu Example-------------------------------------
            Spacer(modifier = Modifier.height(24.dp))
            Box {
                ExposedDropdownMenuBox(
                    expanded = isExposeDropDownMenuExpanded,
                    onExpandedChange = {
                        isExposeDropDownMenuExpanded = it
                    }
                ) {

                    TextField(
                        modifier = Modifier.menuAnchor(),
                        readOnly = true,
                        value = selectedCountry,
                        onValueChange = {},
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExposeDropDownMenuExpanded) },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(
                            focusedTextColor = MaterialTheme.color.black,
                            unfocusedTextColor = MaterialTheme.color.black
                        ),
                    )

                    ExposedDropdownMenu(
                        expanded = isExposeDropDownMenuExpanded,
                        onDismissRequest = { isExposeDropDownMenuExpanded = false },
                        modifier= Modifier.background(MaterialTheme.color.card)
                    ){
                        countries.forEach { country ->
                            DropdownMenuItem(
                                text = { Text(country) },
                                onClick = {
                                    selectedCountry = country
                                    isExposeDropDownMenuExpanded = false
                                },
                                contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                                colors = MenuDefaults.itemColors(
                                    textColor = MaterialTheme.color.black,
                                    leadingIconColor = MaterialTheme.color.black
                                )
                            )
                        }
                    }

                }
            }


            //------------------------ ExposedDropdownMenu Example 2-------------------------------------
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Searchable Dropdown", style = MaterialTheme.typography.labelMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Box {
                ExposedDropdownMenuBox(
                    expanded = isExposeDropDownMenu2Expanded,
                    onExpandedChange = {
                        isExposeDropDownMenu2Expanded = it
                    }
                ) {

                    TextField(
                        modifier = Modifier.menuAnchor(),
                        value = selectedCountry2,
                        onValueChange = {
                            selectedCountry2 = it
                        },
                        trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExposeDropDownMenu2Expanded) },
                        colors = ExposedDropdownMenuDefaults.textFieldColors(
                            focusedTextColor = MaterialTheme.color.black,
                            unfocusedTextColor = MaterialTheme.color.black
                        ),
                    )

                    val filteringOptions = countries.filter { it.contains(selectedCountry2, ignoreCase = true) }
                    if (filteringOptions.isNotEmpty()){
                        ExposedDropdownMenu(
                            expanded = isExposeDropDownMenu2Expanded,
                            onDismissRequest = { isExposeDropDownMenu2Expanded = false },
                            modifier= Modifier.background(MaterialTheme.color.card)
                        ){
                            filteringOptions.forEach { country ->
                                DropdownMenuItem(
                                    text = { Text(country) },
                                    onClick = {
                                        selectedCountry2 = country
                                        isExposeDropDownMenu2Expanded = false
                                    },
                                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding,
                                    colors = MenuDefaults.itemColors(
                                        textColor = MaterialTheme.color.black,
                                        leadingIconColor = MaterialTheme.color.black
                                    )
                                )
                            }
                        }
                    }


                }
            }


        }
    }
}