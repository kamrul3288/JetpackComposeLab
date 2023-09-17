package com.iamkamrul.material.texts

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.Purple40
import com.iamkamrul.material.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextScreen(
    onBackClick:()->Unit
){
    var isShowMoreText by remember {mutableStateOf(false)}
    var maxLine by remember {mutableStateOf(3)}

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Tex Bootcamp", color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    Icon(
                        imageVector = JclIcons.ArrowBack,
                        modifier = Modifier.clickable {onBackClick()},
                        contentDescription = "back_icon", tint = com.iamkamrul.designsystem.theme.White
                    )
                }
            )
        }
    ) {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier
            .fillMaxSize()
            .padding(16.dp)) {
            Text(text = "Hello Compose")
            
            Text(text = "Hello Compose", style = MaterialTheme.typography.titleMedium)
            
            Text(text = "Hello Compose", fontSize = 16.sp, fontWeight = FontWeight.Bold, letterSpacing = 2.sp)

            Text(text = stringResource(id = R.string.app_name))

            Text(text = "Hello Compose", style = MaterialTheme.typography.titleMedium, color = Purple40)


            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Purple40)){
                        append("Hello")
                    }
                    withStyle(style = SpanStyle(color = com.iamkamrul.designsystem.theme.Pink40, fontWeight = FontWeight.Black)){
                        append("Compose")
                    }
                },
                style = MaterialTheme.typography.displayLarge
            )

            Text(
                modifier = Modifier
                    .background(color = Purple40, shape = RoundedCornerShape(5.dp))
                    .padding(10.dp),
                text = "Hello Compose",
                style = MaterialTheme.typography.titleMedium,
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = stringResource(id = com.iamkamrul.designsystem.R.string.lorem),
                maxLines =  maxLine,
                overflow = TextOverflow.Ellipsis,
                onTextLayout = {result->
                    if (result.hasVisualOverflow){
                        isShowMoreText = true
                    }
                }
            )

            if (isShowMoreText){
                Button(
                    modifier = Modifier.align(Alignment.End),
                    onClick = {
                        maxLine = Int.MAX_VALUE
                        isShowMoreText = false
                    },
                    content = {
                        Text(text = "More", style = MaterialTheme.typography.labelLarge)
                    }
                )
            }



        }
    }
}