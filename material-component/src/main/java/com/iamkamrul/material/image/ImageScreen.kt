package com.iamkamrul.material.image

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import coil.compose.SubcomposeAsyncImage
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation
import com.iamkamrul.material.R

@Composable
internal fun ImageScreen(
    onBackClick:()->Unit
) {

    val rainbowColorsBrush = remember {
        Brush.sweepGradient(
            listOf(
                Color(0xFF9575CD),
                Color(0xFFBA68C8),
                Color(0xFFE57373),
                Color(0xFFFFB74D),
                Color(0xFFFFF176),
                Color(0xFFAED581),
                Color(0xFF4DD0E1),
                Color(0xFF9575CD)
            )
        )
    }
    val borderWidth = 4.dp


    ScaffoldWithBackNavigation(title = "Images", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)

        ) {

            Text(
                text = "Image From Drawable Resources:[JPG]",
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(8.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.image_birds),
                contentDescription = "Parrot",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.FillBounds
            )



            Spacer(modifier = Modifier.height(16.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Vector Image  Drawable: ",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(8.dp)
                )
                Image(imageVector = ImageVector.vectorResource(id = R.drawable.ic_android), contentDescription = "Android")
            }



            Text(
                text = "Network Image:",
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(8.dp)
            )
            SubcomposeAsyncImage(
                model = "https://images.unsplash.com/photo-1507477338202-487281e6c27e?ixlib=rb-4.0.3&q=85&fm=jpg&crop=entropy&cs=srgb&dl=mathew-schwartz-5iFZBM7qgWc-unsplash.jpg",
                contentDescription = "Birds",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.FillBounds,
                loading = {
                   Box(
                       modifier = Modifier
                           .fillMaxWidth()
                           .height(150.dp),
                       contentAlignment = Alignment.Center
                   ) {
                       CircularProgressIndicator()
                   }
                }
            )


            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Custom Image Style:",
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(8.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(id = R.drawable.image_birds),
                    contentDescription = "Parrot",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(150.dp)
                        .clip(RoundedCornerShape(16.dp)),
                )

                Image(
                    painter = painterResource(id = R.drawable.image_birds),
                    contentDescription = "Parrot",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(150.dp)
                        .border(
                            BorderStroke(borderWidth, rainbowColorsBrush),
                            CircleShape
                        )
                        .padding(borderWidth)
                        .clip(CircleShape),
                )
            }


        }
    }
}

