package com.iamkamrul.layout.column

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.PurpleGrey40
import com.iamkamrul.common.theme.PurpleGrey80
import com.iamkamrul.common.theme.color

@Composable
internal fun ColumnScreen(
    onBackClick:()->Unit,
){
    ScaffoldWithBackNavigation(title = "Column", onBackClick = onBackClick) {
        //Use Column to place items vertically on the screen.

        Column(modifier = Modifier
            .padding(it)
            .fillMaxSize()) {
            Text(text = "Kamrul Hasan", style = MaterialTheme.typography.titleMedium)
            Text(text = "Mobile App Developer", style = MaterialTheme.typography.bodySmall)


            //Column Example 2
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Column Example: Alignment CenterHorizontally", style = MaterialTheme.typography.labelSmall)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Kamrul Hasan", style = MaterialTheme.typography.titleMedium)
                Text(text = "Mobile App Developer", style = MaterialTheme.typography.bodySmall)
            }

            //Column Example 3
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Column Example: Alignment END", style = MaterialTheme.typography.labelSmall)
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.End
            ) {
                Text(text = "Kamrul Hasan", style = MaterialTheme.typography.titleMedium)
                Text(text = "Mobile App Developer", style = MaterialTheme.typography.bodySmall)
            }

            //Column Example 4
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Column Example: Horizontal and Vertical alignment", style = MaterialTheme.typography.labelSmall)
            Column(
                modifier = Modifier.fillMaxWidth().height(60.dp).background(MaterialTheme.color.card),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Kamrul Hasan", style = MaterialTheme.typography.titleMedium)
                Text(text = "Mobile App Developer", style = MaterialTheme.typography.bodySmall)
            }

            //Column Example 4
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Column Example: SpaceBetween", style = MaterialTheme.typography.labelSmall)
            Column(
                modifier = Modifier.fillMaxWidth().height(60.dp).background(MaterialTheme.color.card),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Kamrul Hasan", style = MaterialTheme.typography.titleMedium)
                Text(text = "Mobile App Developer", style = MaterialTheme.typography.bodySmall)
            }


            //Column Example 5
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "Column Example: Weight Distribution", style = MaterialTheme.typography.labelSmall)
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth().weight(0.4f).background(PurpleGrey40).wrapContentHeight(align = Alignment.CenterVertically),
                    text = "Weight Distribute: 40%",
                    style = MaterialTheme.typography.labelMedium,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Weight Distribute: 60%",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.fillMaxWidth().weight(0.6f).background(PurpleGrey80).wrapContentHeight(align = Alignment.CenterVertically),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}