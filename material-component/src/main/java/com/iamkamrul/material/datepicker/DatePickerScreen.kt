@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.datepicker

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDefaults
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SelectableDates
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.theme.Red
import com.iamkamrul.designsystem.theme.White
import com.iamkamrul.designsystem.theme.color
import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Composable
internal fun DatePickerScreen(
    onBackClick: () -> Unit
) {

    var openDatePickerDialog by remember { mutableStateOf(false) }
    var selectedDate by remember { mutableStateOf("") }


    val datePickerState = rememberDatePickerState(
        yearRange = IntRange(LocalDate.now().year, 2050),
        selectableDates = object : SelectableDates {
            override fun isSelectableDate(utcTimeMillis: Long): Boolean {
                val todayUtcTimeMillis =
                    LocalDate.now().atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli()
                val next7DaysUtcTimeMillis =
                    LocalDate.now().plusDays(7).atStartOfDay(ZoneOffset.UTC).toInstant()
                        .toEpochMilli()
                return utcTimeMillis in todayUtcTimeMillis until next7DaysUtcTimeMillis
            }
        }
    )


    ScaffoldTopAppbar(
        title = "Date Picker",
        onNavigationIconClick = onBackClick
    ) { it ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            ElevatedButton(
                onClick = {
                    openDatePickerDialog = true
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Icon(imageVector = JclIcons.CalendarViewDay, contentDescription = null)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Show Date picker Dialog")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(selectedDate)

            if (openDatePickerDialog) {
                DatePickerDialog(
                    onDismissRequest = {
                        openDatePickerDialog = false
                    },
                    confirmButton = {
                        TextButton(onClick = {
                            datePickerState.selectedDateMillis?.let {

                                val formattedDate = LocalDateTime.ofInstant(
                                    Instant.ofEpochMilli(it),
                                    ZoneId.systemDefault()
                                ).format(DateTimeFormatter.ofPattern("EEE dd , MMM yyyy"))

                                selectedDate = formattedDate

                            }
                            openDatePickerDialog = false
                        }) {
                            Text(
                                text = "Confirm",
                                color = Purple40
                            )
                        }
                    },
                    dismissButton = {
                        TextButton(onClick = {
                            openDatePickerDialog = false
                        }) {
                            Text(text = "Dismiss", color = Red)
                        }
                    },
                    colors = DatePickerDefaults.colors(
                        containerColor = MaterialTheme.color.card
                    )
                ) {
                    DatePicker(
                        state = datePickerState,
                        colors = DatePickerDefaults.colors(
                            dayContentColor = MaterialTheme.color.black,
                            selectedDayContentColor = White,
                            selectedDayContainerColor = Purple40,
                            todayContentColor = MaterialTheme.color.black,
                            todayDateBorderColor = Purple40

                        )
                    )
                }
            }

        }
    }
}