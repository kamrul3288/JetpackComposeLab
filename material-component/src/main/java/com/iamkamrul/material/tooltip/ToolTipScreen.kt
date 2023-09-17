@file:OptIn(ExperimentalMaterial3Api::class)

package com.iamkamrul.material.tooltip
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.PlainTooltip
import androidx.compose.material3.RichTooltip
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TooltipBox
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.designsystem.theme.White
import com.iamkamrul.designsystem.theme.color
import kotlinx.coroutines.launch

@Composable
internal fun TooltipScreen(
    onBackClick:()->Unit
) {
    val lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    val scope = rememberCoroutineScope()
    val tooltipState = rememberTooltipState()
    val tooltipPersistState = rememberTooltipState(isPersistent = true)



    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Tooltip",
        onBackClick = onBackClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            //-------------- Long press tooltip box example--------------------
            TooltipBox(
                positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
                tooltip = {
                    PlainTooltip {
                        Text(text = lorem)
                    }
                },
                state = rememberTooltipState()
            ) {
                ElevatedButton(
                    onClick = {},
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = com.iamkamrul.designsystem.theme.Purple40,
                        contentColor = com.iamkamrul.designsystem.theme.White
                    )
                ) {
                    Text(text = "Long Press To Display Tooltip")
                }
            }

            //-------------- Event base tooltip box example--------------------
            Spacer(modifier = Modifier.height(50.dp))
            TooltipBox(
                positionProvider = TooltipDefaults.rememberPlainTooltipPositionProvider(),
                tooltip = {
                    PlainTooltip(
                        containerColor = MaterialTheme.color.card,
                        contentColor = MaterialTheme.color.black
                    ) {
                        Text(text = lorem)
                    }
                },
                state = tooltipState
            ) {
                ElevatedButton(
                    onClick = {
                        scope.launch {
                            tooltipState.show()
                        }
                    },
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = com.iamkamrul.designsystem.theme.Purple40,
                        contentColor = com.iamkamrul.designsystem.theme.White
                    )
                ) {
                    Text(text = "Click To Display Tooltip")
                }
            }


            //-------------- Event base Rich box example--------------------
            Spacer(modifier = Modifier.height(50.dp))
            TooltipBox(
                positionProvider = TooltipDefaults.rememberRichTooltipPositionProvider(),
                tooltip = {
                    RichTooltip(
                        title = {
                            Text(text = "RichTooltip Alert")
                        },
                        action = {
                            TextButton(onClick = {
                                scope.launch {
                                    tooltipPersistState.dismiss()
                                }
                            }) {
                                Text(text = "Okay", color = MaterialTheme.color.black)
                            }
                        },
                        colors = TooltipDefaults.richTooltipColors(
                            containerColor = MaterialTheme.color.card
                        )
                    ) {
                        Text(text = lorem)
                    }
                },
                state = tooltipPersistState,
            ) {
                ElevatedButton(
                    onClick = {
                        scope.launch {
                            tooltipPersistState.show()
                        }
                    },
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = com.iamkamrul.designsystem.theme.Purple40,
                        contentColor = com.iamkamrul.designsystem.theme.White
                    )
                ) {
                    Text(text = "Click To Display Rich Tooltip")
                }
            }
        }
    }
}