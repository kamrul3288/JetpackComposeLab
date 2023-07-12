package com.iamkamrul.layout.constraintlayout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun ConstraintLayoutScreen(
    onBackClick:()->Unit
){
    ScaffoldWithBackNavigation(title = "ConstraintLayout", onBackClick = onBackClick) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(it)) {

            //---------------------EXAMPLE 1----------------------------
            Text(text = "Simple Constraint Layout:", style = MaterialTheme.typography.labelSmall)
            ConstraintLayout {
                val(nameTv,desTv) = createRefs()
                Text(
                    text = "Kamrul Hasan",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.constrainAs(nameTv){
                        start.linkTo(parent.start, margin = 16.dp)
                        top.linkTo(parent.top, margin = 16.dp)
                    }
                )
                Text(
                    text = "Mobile Application Developer",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.constrainAs(desTv){
                        start.linkTo(nameTv.start)
                        top.linkTo(nameTv.bottom)
                    }
                )

            }

            //---------------------EXAMPLE 2----------------------------
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Constraint Layout Horizontal Chain:", style = MaterialTheme.typography.labelSmall)
            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val(nameTv,desTv) = createRefs()
                createHorizontalChain(nameTv,desTv, chainStyle = ChainStyle.SpreadInside)
                Text(
                    text = "Kamrul Hasan",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.constrainAs(nameTv){
                        start.linkTo(parent.start)
                        top.linkTo(parent.top, margin = 16.dp)
                    }
                )
                Text(
                    text = "Mobile Application Developer",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.constrainAs(desTv){
                        start.linkTo(nameTv.end)
                        top.linkTo(nameTv.top)
                        end.linkTo(parent.end)
                    }
                )
            }

            //---------------------EXAMPLE 3----------------------------
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Constraint Layout Vertical Chain:", style = MaterialTheme.typography.labelSmall)
            ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                val(nameTv,desTv) = createRefs()
                createVerticalChain(nameTv,desTv)
                Text(
                    text = "Kamrul Hasan",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.constrainAs(nameTv){
                        start.linkTo(parent.start)
                        top.linkTo(parent.top)
                        end.linkTo(parent.end)
                    }
                )
                Text(
                    text = "Mobile Application Developer",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.constrainAs(desTv){
                        start.linkTo(nameTv.start)
                        top.linkTo(nameTv.bottom)
                    }
                )
            }

            //---------------------EXAMPLE 4----------------------------
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Constraint Layout Complex Example:", style = MaterialTheme.typography.labelSmall)
            ConstraintLayout {
                val(profileIv,nameTv,desTv) = createRefs()
                Box(
                    modifier = Modifier
                        .width(60.dp)
                        .height(60.dp)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                        .constrainAs(profileIv){
                            top.linkTo(parent.top, margin = 16.dp)
                            start.linkTo(parent.start, margin = 16.dp)
                        }
                )

                Text(
                    text = "Kamrul Hasan",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.constrainAs(nameTv){
                        start.linkTo(profileIv.end, margin = 16.dp)
                        top.linkTo(profileIv.top, margin = 8.dp)
                    }
                )

                Text(
                    text = "Mobile Application Developer",
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.constrainAs(desTv){
                        start.linkTo(nameTv.start)
                        top.linkTo(nameTv.bottom)
                    }
                )

            }

        }
    }
}