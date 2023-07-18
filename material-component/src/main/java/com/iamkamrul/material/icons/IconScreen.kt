package com.iamkamrul.material.icons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.common.theme.Red
import com.iamkamrul.material.R

@Composable
internal fun IconScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "Icons", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)
            .padding(16.dp)) {


            Text(text = "Icons From Drawable Resources:", style = MaterialTheme.typography.titleSmall)
            Icon(painter = painterResource(id = R.drawable.ic_material), contentDescription = "Material Icon")

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Icons From Material:", style = MaterialTheme.typography.titleSmall)
            Icon(imageVector = Icons.Default.Favorite, contentDescription = "Hearts")


            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Resize Icons From Drawable Resources:", style = MaterialTheme.typography.titleSmall)
            Icon(
                painter = painterResource(id = R.drawable.ic_material),
                contentDescription = "Material Icon",
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Resize Icons From Material:", style = MaterialTheme.typography.titleSmall)
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "Hearts",
                tint = Red,
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Icon Button:", style = MaterialTheme.typography.titleSmall)
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Hearts",
                    tint = Red,
                    modifier = Modifier.size(ButtonDefaults.IconSize)

                )
            }
        }
    }
}