@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.slider

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.theme.color

@Composable
internal fun SliderScreen(
    onBackClick:()->Unit
) {

    var sliderPosition1 by remember { mutableFloatStateOf(0f) }
    var sliderPosition2 by remember { mutableFloatStateOf(0f) }
    var sliderPosition3 by remember { mutableFloatStateOf(0f) }


    com.iamkamrul.designsystem.component.ScaffoldTopAppbar(
        title = "Slider",
        onNavigationIconClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = sliderPosition1.toString())
            Slider(
                modifier = Modifier.semantics { contentDescription = "Localized Description" },
                value = sliderPosition1,
                onValueChange = { value ->
                    sliderPosition1 = value
                },
                valueRange = 0f..100f,
                colors = SliderDefaults.colors(
                    thumbColor = MaterialTheme.color.sliderThumbColor
                )
            )


            Spacer(modifier = Modifier.height(24.dp))
            Text(text = sliderPosition2.toString())
            Slider(
                modifier = Modifier.semantics { contentDescription = "Localized Description" },
                value = sliderPosition2,
                onValueChange = { value ->
                    sliderPosition2 = value
                },
                valueRange = 0f..100f,
                steps = 4,
                onValueChangeFinished = {

                },
                colors = SliderDefaults.colors(
                    thumbColor = MaterialTheme.color.sliderThumbColor
                )
            )



            Spacer(modifier = Modifier.height(24.dp))
            SliderWithLabel(
                value = sliderPosition3,
                valueRange = 0f..100f,
                finiteEnd = true,
                onRadiusChange = {
                    sliderPosition3 = it
                }
            )

        }
    }
}

@Composable
fun SliderWithLabel(
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    finiteEnd: Boolean,
    labelMinWidth: Dp = 24.dp,
    onRadiusChange: (Float) -> Unit
) {

    Column{

        BoxWithConstraints(
            modifier = Modifier
                .fillMaxWidth()
        ) {



            val offset = getSliderOffset(
                value = value,
                valueRange = valueRange,
                boxWidth = maxWidth,
                labelWidth = labelMinWidth + 8.dp // Since we use a padding of 4.dp on either sides of the SliderLabel, we need to account for this in our calculation
            )

            val endValueText =
                if (!finiteEnd && value >= valueRange.endInclusive) "${
                    value.toInt()
                }+" else value.toInt().toString()


            SliderLabel(label = valueRange.start.toInt().toString(), minWidth = labelMinWidth)

            if (value > valueRange.start) {
                SliderLabel(
                    label = endValueText, minWidth = labelMinWidth, modifier = Modifier
                        .padding(start = offset)
                )
            }
        }

        Slider(
            value = value,
            onValueChange = {
                onRadiusChange(it)
            },
            valueRange = valueRange,
            modifier = Modifier.fillMaxWidth()
        )

    }
}


@Composable
fun SliderLabel(label: String, minWidth: Dp, modifier: Modifier = Modifier) {
    Text(
        label,
        textAlign = TextAlign.Center,
        color = Color.White,
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(4.dp)
            )
            .padding(4.dp)
            .defaultMinSize(minWidth = minWidth)
    )
}


private fun getSliderOffset(
    value: Float,
    valueRange: ClosedFloatingPointRange<Float>,
    boxWidth: Dp,
    labelWidth: Dp
): Dp {

    val coerced = value.coerceIn(valueRange.start, valueRange.endInclusive)
    val positionFraction = calcFraction(valueRange.start, valueRange.endInclusive, coerced)

    return (boxWidth - labelWidth) * positionFraction
}


// Calculate the 0..1 fraction that `pos` value represents between `a` and `b`
private fun calcFraction(a: Float, b: Float, pos: Float) =
    (if (b - a == 0f) 0f else (pos - a) / (b - a)).coerceIn(0f, 1f)