package com.iamkamrul.material.divider

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DividerDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalDashedDivider(
    modifier:Modifier = Modifier,
    color: Color =DividerDefaults.color,
    thickness: Dp = DividerDefaults.Thickness,
    intervals: FloatArray = floatArrayOf(10f, 10f),
) {
    Canvas(
        modifier = modifier.fillMaxWidth()
    ) {
        val pathEffect = PathEffect.dashPathEffect(intervals, 0f)
        drawLine(
            color = color,
            strokeWidth = thickness.toPx(),
            start = Offset(0f, 0f),
            end = Offset(size.width, size.height),
            pathEffect = pathEffect,

        )
    }
}

@Composable
fun VerticalDashedDivider(
    modifier:Modifier = Modifier,
    color: Color =DividerDefaults.color,
    thickness: Dp = DividerDefaults.Thickness,
    intervals: FloatArray = floatArrayOf(10f, 10f),
) {
    Canvas(
        modifier = modifier.fillMaxHeight()
            .width(1.dp)
    ) {
        val pathEffect = PathEffect.dashPathEffect(intervals, 0f)
        drawLine(
            color = color,
            strokeWidth = thickness.toPx(),
            start = Offset(0f, 0f),
            end = Offset(size.width, size.height),
            pathEffect = pathEffect,
        )

    }
}

