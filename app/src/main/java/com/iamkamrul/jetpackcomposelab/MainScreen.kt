package com.iamkamrul.jetpackcomposelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ComponentButton

@Composable
internal fun MainRoute(
    onClickMaterial:()->Unit,
    onClickLayout:()->Unit
){
    MainScreen(
      onClickLayout = onClickLayout,
      onClickMaterial = onClickMaterial
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MainScreen(
    onClickMaterial:()->Unit,
    onClickLayout:()->Unit
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Jetpack ComposeLab", color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier.fillMaxSize().padding(16.dp)) {

            //-----------Row  1----------------------
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Layouts",
                    onClick = onClickLayout
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Material Component",
                    onClick = onClickMaterial
                )
            }

            //-----------Row  2----------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    buttonLabel = "Modifiers",
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Navigation",
                    onClick = {

                    }
                )
            }

            //-----------Row  3----------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    buttonLabel = "List",
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    buttonLabel = "Multiview List",
                    onClick = {

                    }
                )
            }

            //-----------Row  4----------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Resources",
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Animation",
                    onClick = {

                    }
                )
            }

            //-----------Row  5----------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "MVVM",
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    buttonLabel = "Clean Architecture",
                    onClick = {

                    }
                )
            }

            //-----------Row  6----------------------
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Sample Project",
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Google Map",
                    onClick = {

                    }
                )
            }
        }
    }
}
