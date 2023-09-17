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
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.JetpackComposeLabTheme
import com.iamkamrul.ui.component.FeatureCardItem
import com.iamkamrul.ui.utils.DevicePreviews


@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun MainScreen(
    onMaterialBtnClick:()->Unit = {},
    onLayoutBtnClick:()->Unit = {},
    onNavigationBtnClick:()->Unit = {}
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Jetpack ComposeLab")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier
            .fillMaxSize()
            .padding(4.dp)) {
            

            //-----------Row  1----------------------
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Layouts",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onLayoutBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Material Component",
                    onClick = onMaterialBtnClick
                )
            }

            //-----------Row  2----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {

                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Navigation",
                    icon = painterResource(id = R.drawable.ic_navigation),
                    onClick = onNavigationBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Modifiers",
                   icon = painterResource(id = R.drawable.ic_modifier),
                    onClick = {

                    }
                )

            }

            //-----------Row  3----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "List",
                    icon = rememberVectorPainter(image = JclIcons.Menu),
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Multiview List",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
            }

            //-----------Row  4----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Resources",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Animation",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
            }

            //-----------Row  5----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "MVVM",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Clean Architecture",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
            }

            //-----------Row  6----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Sample Project",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
                Spacer(modifier = Modifier.width(8.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Google Map",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = {

                    }
                )
            }
        }
    }
}


@Composable
@DevicePreviews
fun PreviewMainScreen(){
    JetpackComposeLabTheme {
        MainScreen()
    }
}