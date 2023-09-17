package com.iamkamrul.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.JetpackComposeLabTheme
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.ui.utils.ComponentPreviews
import com.iamkamrul.ui.utils.DevicePreviews

@Composable
fun FeatureCardItem(
    modifier: Modifier,
    label:String,
    icon:Painter,
    onClick:()->Unit = {}
){
    Card(
        modifier = modifier.clickable { onClick() },
        shape = RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.color.card,
            contentColor = MaterialTheme.color.black
        )
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                painter = icon,
                contentDescription = "android",
                modifier = Modifier.size(18.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = label,
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}


@ComponentPreviews
@Composable
fun PreviewFeatureCardItem(){
    JetpackComposeLabTheme {
        FeatureCardItem(
            modifier = Modifier.height(80.dp),
            label = "Material Component",
            icon = rememberVectorPainter(image = JclIcons.Android),
        )
    }
}
