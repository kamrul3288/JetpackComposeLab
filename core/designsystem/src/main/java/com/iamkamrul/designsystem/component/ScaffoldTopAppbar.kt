package com.iamkamrul.designsystem.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.BottomSheetScaffoldState
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.White
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.designsystem.utils.debounceClick


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTopAppbar(
    title:String,
    onNavigationIconClick:()->Unit,
    navigationIcon:Painter = rememberVectorPainter(image = JclIcons.ArrowBack),
    snackbarHost: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    containerColor:Color = MaterialTheme.colorScheme.background,
    content: @Composable (PaddingValues) -> Unit,
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
                    IconButton(onClick = debounceClick { onNavigationIconClick() }) {
                        Icon(
                            painter = navigationIcon,
                            contentDescription = "navigationIcon", tint = White
                        )
                    }
                },
            )
        },
        containerColor = containerColor,
        bottomBar = bottomBar,
        content = content
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTopAppbar(
    title:String,
    snackbarHost: @Composable () -> Unit = {},
    bottomBar: @Composable () -> Unit = {},
    containerColor:Color = MaterialTheme.colorScheme.background,
    content: @Composable (PaddingValues) -> Unit,
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
            )
        },
        containerColor = containerColor,
        bottomBar = bottomBar,
        content = content
    )
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldBottomAppbar(
    title:String,
    onNavigationIconClick:()->Unit,
    navigationIcon:Painter = rememberVectorPainter(image = JclIcons.ArrowBack),
    bottomBar: @Composable () -> Unit = {},
    floatingActionButton:@Composable () -> Unit = {},
    floatingActionButtonPosition:FabPosition = FabPosition.End,
    content: @Composable (PaddingValues) -> Unit,
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = title, color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    IconButton(onClick = onNavigationIconClick) {
                        Icon(
                            painter = navigationIcon,
                            contentDescription = "navigationIcon", tint = White
                        )
                    }
                },
            )
        },
        bottomBar = bottomBar,
        content = content,
        floatingActionButtonPosition = floatingActionButtonPosition,
        floatingActionButton = floatingActionButton
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldBottomSheet(
    title:String,
    navigationIcon:Painter = rememberVectorPainter(image = JclIcons.ArrowBack),
    onNavigationIconClick:()->Unit,
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
        contentColor = MaterialTheme.color.black,
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
                    IconButton(onClick = onNavigationIconClick) {
                        Icon(
                            painter = navigationIcon,
                            contentDescription = "navigationIcon", tint = White
                        )
                    }
                }
            )
        }
    )
}