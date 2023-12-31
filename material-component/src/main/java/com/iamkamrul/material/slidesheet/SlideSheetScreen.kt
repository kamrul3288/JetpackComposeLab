@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.slidesheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldBottomSheet
import com.iamkamrul.designsystem.theme.White

@Composable
internal fun SlideSheetScreen(
    onBackClick:()->Unit
) {

    var showingModalSheet by remember { mutableStateOf(false) }


    ScaffoldBottomSheet(
        title = "Slide Sheet",
        onNavigationIconClick = onBackClick,
        bottomSheetContent = {
            PersistenceBottomSheetScreen()
        }
    ) {

        //------------Show modal bottom sheet here-------------------
        if (showingModalSheet) {
            ModalBottomSheetScreen {
                showingModalSheet = false
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ElevatedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    showingModalSheet = true
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Text(text = "Show Modal Sheet")
            }

        }
    }
}
