package com.iamkamrul.common.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color


data class AppColor(
    val white: Color = Color.Unspecified,
    val black: Color = Color.Unspecified,
    val card:Color = Color.Unspecified
)
internal val LocalAppColor = compositionLocalOf { AppColor() }

val MaterialTheme.color:AppColor
    @Composable
    @ReadOnlyComposable
    get() = LocalAppColor.current



internal val LocalLightColorScheme = AppColor(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF000000),
    card = White
)

internal val LocalDarkColorScheme = AppColor(
    white = Color(0xFF000000),
    black = Color(0xFFFFFFFF),
    card = Black80
)

