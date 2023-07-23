package com.iamkamrul.material.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.color

@Composable
internal fun CardScreen(
    onBackClick:()->Unit
) {
    ScaffoldWithBackNavigation(title = "Card", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(16.dp)) {


            //--------------- ElevatedCard Example------------------
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = CardDefaults.elevatedCardColors(containerColor = MaterialTheme.color.card)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(text = "Elevated Card")
                }

            }



            //--------------- OutlinedCard Example------------------
            Spacer(modifier = Modifier.height(24.dp))
            OutlinedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = CardDefaults.elevatedCardColors(containerColor = MaterialTheme.color.card)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(text = "OutlinedCard Card")
                }
            }


            //-------------Default Card-----------------
            Spacer(modifier = Modifier.height(24.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                colors = CardDefaults.elevatedCardColors(containerColor = MaterialTheme.color.card),
                shape = RoundedCornerShape(40.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Text(text = "Default Card")
                }
            }

        }
    }
}