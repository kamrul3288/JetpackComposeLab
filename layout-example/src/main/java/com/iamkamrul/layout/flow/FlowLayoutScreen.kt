@file:OptIn(ExperimentalLayoutApi::class)

package com.iamkamrul.layout.flow
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.color

@Composable
fun FlowLayoutScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Flow Layout", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .padding(it)
            .padding(16.dp)
            .fillMaxSize()) {


            Text(text = "Flow Row", style = MaterialTheme.typography.labelLarge)
            FlowRow(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ChipItem("Price: High to Low")
                ChipItem("Avg rating: 4+")
                ChipItem("Free breakfast")
                ChipItem("Free cancellation")
                ChipItem("£50 pn")
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Flow Column", style = MaterialTheme.typography.labelLarge)
            FlowColumn{
                ChipItem("Price: High to Low")
                ChipItem("Avg rating: 4+")
                ChipItem("Free breakfast")
                ChipItem("Free cancellation")
                ChipItem("£50 pn")
                ChipItem("Price: High to Low")
                ChipItem("Avg rating: 4+")
                ChipItem("Free breakfast")
                ChipItem("Free cancellation")
                ChipItem("£50 pn")
                ChipItem("Price: High to Low")
                ChipItem("Avg rating: 4+")
                ChipItem("Free breakfast")
                ChipItem("Free cancellation")
                ChipItem("£50 pn")
                ChipItem("Price: High to Low")
                ChipItem("Avg rating: 4+")
                ChipItem("Free breakfast")
                ChipItem("Free cancellation")
                ChipItem("£50 pn")
            }
        }
    }
}

@Composable
private fun ChipItem(text:String){
    Text(
        text = text,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .border(
                width = 1.dp,
                color = MaterialTheme.color.black,
                shape = RoundedCornerShape(20.dp)
            )
            .padding(8.dp),
        style = MaterialTheme.typography.labelSmall
    )
}