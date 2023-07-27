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
import androidx.compose.material3.PlainTooltipBox
import androidx.compose.material3.RichTooltipBox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TooltipDefaults
import androidx.compose.material3.rememberPlainTooltipState
import androidx.compose.material3.rememberRichTooltipState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.Purple40
import com.iamkamrul.common.theme.White
import com.iamkamrul.common.theme.color
import kotlinx.coroutines.launch

@Composable
internal fun TooltipScreen(
    onBackClick:()->Unit
) {
    val lorem = "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    val plainTooltipState = rememberPlainTooltipState()
    val richTooltipState = rememberRichTooltipState(isPersistent = true)
    val scope = rememberCoroutineScope()
    
    

    ScaffoldWithBackNavigation(title = "Tooltip", onBackClick = onBackClick) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            //-------------- Long press tooltip box example--------------------
            PlainTooltipBox(
                tooltip = {
                    Text(text = lorem)
                },
            ){
                ElevatedButton(
                    onClick = {},
                    modifier = Modifier.tooltipTrigger(),
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = Purple40,
                        contentColor = White
                    )
                ) {
                    Text(text = "Long Press To Display Tooltip")
                }
            }

            //-------------- Event base tooltip box example--------------------
            Spacer(modifier = Modifier.height(50.dp))
            PlainTooltipBox(
                tooltip = {
                    Text(text = lorem)
                },
                tooltipState = plainTooltipState
            ){
                ElevatedButton(
                    onClick = {
                       scope.launch {
                           plainTooltipState.show()
                       }
                    },
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = Purple40,
                        contentColor = White
                    )
                ) {
                    Text(text = "Click To Display Tooltip")
                }
            }


            //-------------- Event base Rich box example--------------------
            Spacer(modifier = Modifier.height(50.dp))
            RichTooltipBox(
                title = {
                    Text(text = "RichTooltip Alert")
                },
                action = {
                    TextButton(onClick = { 
                        scope.launch {
                            richTooltipState.dismiss()
                        }
                    }) {
                        Text(text = "Okay", color = MaterialTheme.color.black)
                    }
                },
                text = {
                    Text(text = lorem)
                },
                tooltipState = richTooltipState,
                colors = TooltipDefaults.richTooltipColors(
                    containerColor = MaterialTheme.color.card
                )
            ){
                ElevatedButton(
                    onClick = {
                        scope.launch {
                            richTooltipState.show()
                        }
                    },
                    colors = ButtonDefaults.elevatedButtonColors(
                        containerColor = Purple40,
                        contentColor = White
                    )
                ) {
                    Text(text = "Click To Display Rich Tooltip")
                }
            }
        }
    }
}