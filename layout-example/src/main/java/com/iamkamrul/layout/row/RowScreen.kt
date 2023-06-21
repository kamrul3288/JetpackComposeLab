package com.iamkamrul.layout.row

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.Pink40
import com.iamkamrul.common.theme.Purple40
import com.iamkamrul.common.theme.Purple80
import com.iamkamrul.common.theme.Red

@Composable
fun RowScreen(
    onBackClick:()->Unit,
) {
    ScaffoldWithBackNavigation(title = "Row", onBackClick = onBackClick) {
        //Use Column to place items vertically on the screen.

        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)
            .fillMaxSize()) {

            Row{
                Text(text = "Row-1", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Row-2", style = MaterialTheme.typography.titleMedium)
            }



            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Row Horizontal Center:", style = MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Row-Center-1", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.width(16.dp))
                Text(text = "Row-Center-2", style = MaterialTheme.typography.titleMedium)
            }

            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Row Horizontal SpaceBetween:", style = MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Android", style = MaterialTheme.typography.titleMedium)
                Text(text = "Compose", style = MaterialTheme.typography.titleMedium)
                Text(text = "Kotlin", style = MaterialTheme.typography.titleMedium)
            }


            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Row Vertical Alignment:", style = MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .clip(CircleShape)
                        .background(Red)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(text = "Kamrul Hasan", style = MaterialTheme.typography.bodyMedium)
                    Text(text = "+88xxxxxxxx",style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Light)
                }
            }


            Spacer(modifier = Modifier.height(24.dp))
            Text(text = "Row Weight:", style = MaterialTheme.typography.labelSmall)
            Spacer(modifier = Modifier.height(8.dp))
            Row {
                Text(
                    modifier = Modifier.weight(1f).height(40.dp).background(Purple40).wrapContentHeight(Alignment.CenterVertically),
                    text = "Android",
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier.weight(1f).height(40.dp).background(Purple80).wrapContentHeight(Alignment.CenterVertically),
                    text = "Android",
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center
                )
                Text(
                    modifier = Modifier.weight(1f).height(40.dp).background(Pink40).wrapContentHeight(Alignment.CenterVertically),
                    text = "Android",
                    style = MaterialTheme.typography.titleMedium,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}