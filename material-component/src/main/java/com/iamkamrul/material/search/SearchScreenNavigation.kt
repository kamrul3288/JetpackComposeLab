@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.Pink40
import com.iamkamrul.designsystem.theme.color

@Composable
internal fun SearchScreen(
    onBackClick:()->Unit
) {
    var text by rememberSaveable { mutableStateOf("") }
    var active by rememberSaveable { mutableStateOf(false) }
    val lastSearches = mutableListOf<String>()

    ScaffoldTopAppbar(
        title = "Search",
        onNavigationIconClick = onBackClick
    ) { it ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            SearchBar(
                query = text,
                onQueryChange = {
                    text = it
                },
                onSearch = {
                    lastSearches.add(it)
                    text = ""
                },
                active = active,
                onActiveChange = {
                    active = it
                },
                placeholder = { Text("Search") },
                colors = SearchBarDefaults.colors(
                    containerColor = MaterialTheme.color.secondaryBackground,
                    dividerColor = Pink40,
                    inputFieldColors = TextFieldDefaults.colors(
                        focusedTextColor = MaterialTheme.color.black,
                        unfocusedTextColor = MaterialTheme.color.black,
                    )
                ),
                leadingIcon = { Icon(Icons.Default.Search, contentDescription = null) },
                trailingIcon = {
                    if (active) {
                        Icon(
                            Icons.Default.Clear,
                            contentDescription = null,
                            modifier = Modifier.clickable {
                                text = ""
                                active = false
                            }
                        )
                    }
                },
            ) {
                lastSearches.forEach {
                    Row(
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Icon(imageVector = JclIcons.History, contentDescription = "")
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = it)
                    }
                }
            }
        }
    }
}