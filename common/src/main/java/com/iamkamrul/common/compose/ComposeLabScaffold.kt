package com.iamkamrul.common.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.theme.White
import com.iamkamrul.common.theme.color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldWithBackNavigation(
    title:String,
    onBackClick:()->Unit,
    snackbarHost: @Composable () -> Unit = {},
    content: @Composable (PaddingValues) -> Unit
){
    Scaffold(
        snackbarHost = snackbarHost,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title, color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        modifier = Modifier.clickable {onBackClick()},
                        contentDescription = "back_icon", tint = White
                    )
                }
            )
        },
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldWithBottomSheet(
    title:String,
    onBackClick:()->Unit,
    bottomSheetContent: @Composable ColumnScope.() -> Unit,
    scaffoldState: BottomSheetScaffoldState = rememberBottomSheetScaffoldState(),
    sheetPeekHeight: Dp = BottomSheetDefaults.SheetPeekHeight,
    content: @Composable (PaddingValues) -> Unit
){
    BottomSheetScaffold(
        sheetContent = bottomSheetContent,
        scaffoldState = scaffoldState,
        sheetContainerColor = MaterialTheme.color.card,
        containerColor = MaterialTheme.color.card,
        sheetPeekHeight = sheetPeekHeight,
        content = content,
        sheetShadowElevation = 10.dp,
        sheetTonalElevation = 10.dp,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title, color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        modifier = Modifier.clickable {onBackClick()},
                        contentDescription = "back_icon", tint = White
                    )
                }
            )
        }
    )
}