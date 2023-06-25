package com.iamkamrul.layout.boxconstraint

import android.util.Log
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun BoxWithConstraintScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Box With Constraint", onBackClick = onBackClick) {
        BoxWithConstraints(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            val scope = this
            Log.e("BoxWithConstraintScreen", "BoxWithConstraintScreen: ${scope.maxWidth}", )
            //Pixel 3
            if (scope.maxWidth>400.dp){
                Text(
                    text = "Rotate the device to see the magic",
                    style = MaterialTheme.typography.displaySmall,
                    modifier = Modifier.align(Alignment.Center)
                )
            }else{
                Text(
                    text = "Rotate the device to see the magic",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}