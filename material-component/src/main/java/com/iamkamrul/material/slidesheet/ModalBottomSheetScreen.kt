@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.slidesheet

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.theme.color

@Composable
internal fun ModalBottomSheetScreen(
    onDismissRequest:()->Unit
) {
    val modalBottomSheetState = rememberModalBottomSheetState(
        /*
        * skipPartiallyExpanded - Whether the partially expanded state, if the sheet is tall enough, should be skipped.
        * If true, the sheet will always expand to the Expanded state and move to the Hidden state when hiding the sheet, either programmatically or by user interaction.
        **/
        skipPartiallyExpanded = false,

        //confirmValueChange - Optional callback invoked to confirm or veto a pending state change
        confirmValueChange = {
            true
        }
    )
    val countries = listOf(
        Pair("United States", "\uD83C\uDDFA\uD83C\uDDF8"),
        Pair("Canada", "\uD83C\uDDE8\uD83C\uDDE6"),
        Pair("India", "\uD83C\uDDEE\uD83C\uDDF3"),
        Pair("Germany", "\uD83C\uDDE9\uD83C\uDDEA"),
        Pair("France", "\uD83C\uDDEB\uD83C\uDDF7"),
        Pair("Japan", "\uD83C\uDDEF\uD83C\uDDF5"),
        Pair("China", "\uD83C\uDDE8\uD83C\uDDF3"),
        Pair("Brazil", "\uD83C\uDDE7\uD83C\uDDF7"),
        Pair("Australia", "\uD83C\uDDE6\uD83C\uDDFA"),
        Pair("Russia", "\uD83C\uDDF7\uD83C\uDDFA"),
        Pair("United Kingdom", "\uD83C\uDDEC\uD83C\uDDE7"),
        Pair("United States", "\uD83C\uDDFA\uD83C\uDDF8"),
        Pair("Canada", "\uD83C\uDDE8\uD83C\uDDE6"),
        Pair("India", "\uD83C\uDDEE\uD83C\uDDF3"),
        Pair("Germany", "\uD83C\uDDE9\uD83C\uDDEA"),
        Pair("France", "\uD83C\uDDEB\uD83C\uDDF7"),
        Pair("Japan", "\uD83C\uDDEF\uD83C\uDDF5"),
        Pair("China", "\uD83C\uDDE8\uD83C\uDDF3"),
        Pair("Brazil", "\uD83C\uDDE7\uD83C\uDDF7"),
        Pair("Australia", "\uD83C\uDDE6\uD83C\uDDFA"),
        Pair("Russia", "\uD83C\uDDF7\uD83C\uDDFA"),
        Pair("United Kingdom", "\uD83C\uDDEC\uD83C\uDDE7"),
    )
    ModalBottomSheet(
        onDismissRequest = onDismissRequest,
        sheetState = modalBottomSheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() },
        containerColor = MaterialTheme.color.card,
    ) {
        LazyColumn {
            items(countries){(country, flag) ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 10.dp, horizontal = 20.dp)
                ) {
                    Text(
                        text = flag,
                        modifier = Modifier.padding(end = 20.dp)
                    )
                    Text(text = country)
                }
            }
        }
    }
}