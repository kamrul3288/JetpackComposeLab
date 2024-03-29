package com.iamkamrul.designsystem.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color


data class AppColor(
    val white: Color = Color.Unspecified,
    val black: Color = Color.Unspecified,
    val card:Color = Color.Unspecified,
    val clockDialColor:Color = Color.Unspecified,
    val sliderThumbColor:Color = Color.Unspecified,
    val secondaryBackground:Color = Color.Unspecified,
)
internal val LocalAppColor = compositionLocalOf { AppColor() }

@Suppress("UnusedReceiverParameter")
val MaterialTheme.color: AppColor
    @Composable
    @ReadOnlyComposable
    get() = LocalAppColor.current



internal val LocalLightColorScheme = AppColor(
    white = Color(0xFFFFFFFF),
    black = Color(0xFF000000),
    card = White,
    clockDialColor = Color(0xFFE6E0E9),
    sliderThumbColor = Purple40,
    secondaryBackground = LightGray10
)

internal val LocalDarkColorScheme = AppColor(
    white = Color(0xFF000000),
    black = Color(0xFFFFFFFF),
    card = Black80,
    clockDialColor = Black50,
    sliderThumbColor = White,
    secondaryBackground = Black50
)

