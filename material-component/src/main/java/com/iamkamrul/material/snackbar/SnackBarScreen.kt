package com.iamkamrul.material.snackbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.White
import kotlinx.coroutines.launch


@Composable
internal fun SnackBarScreen(
    onBackClick:()->Unit
) {

    val snackBarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    ScaffoldWithBackNavigation(
        title = "SnackBar",
        onBackClick = onBackClick,
        snackbarHost = {
            SnackbarHost(snackBarHostState)
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {


            ElevatedButton(
                onClick = {
                   scope.launch{
                       val result = snackBarHostState.showSnackbar(
                           message = "Hello From Snackbar",
                           actionLabel = "Undo",
                           duration = SnackbarDuration.Long
                        )
                       when(result){
                           SnackbarResult.Dismissed -> {}
                           SnackbarResult.ActionPerformed -> {}
                       }
                   }
                },
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = White
                )
            ) {
                Text(text = "Show Simple Snackbar")
            }



        }
    }
}