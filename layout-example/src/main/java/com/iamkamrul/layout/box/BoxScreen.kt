package com.iamkamrul.layout.box

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.layout.R

@Composable
fun BoxScreen(
    onBackClick:()->Unit,
){
    com.iamkamrul.designsystem.component.ScaffoldWithBackNavigation(
        title = "Box",
        onBackClick = onBackClick
    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .fillMaxSize()
        ) {

            Text(text = "No pending task available...", modifier = Modifier.align(Alignment.Center))

            ExtendedFloatingActionButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp),
                onClick = {},
                containerColor = MaterialTheme.color.card
            ) {
                Text(text = "Add Task")
                Icon(painter = painterResource(id = R.drawable.ic_add), contentDescription = "")
            }

        }
    }
}