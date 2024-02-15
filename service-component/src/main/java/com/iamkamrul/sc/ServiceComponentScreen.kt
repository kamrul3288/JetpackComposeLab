package com.iamkamrul.sc

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.color
import com.iamkamrul.ui.component.FeatureCardItem

@Composable
fun ServiceComponentScreen(
    onBackBtnClick:()->Unit,
    onConnectivityBtnClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Service Component",
        onNavigationIconClick = onBackBtnClick,
        containerColor = MaterialTheme.color.secondaryBackground
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .verticalScroll(rememberScrollState())
        ) {

            Row {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Connectivity",
                    icon = rememberVectorPainter(image = JclIcons.Connectivity),
                    onClick = onConnectivityBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    label = "Coming soon",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = {}
                )
            }

        }
    }
}

const val serviceComponentScreenRoute = "ServiceComponentScreenRoute"
fun NavGraphBuilder.serviceComponentScreen(
    onBackBtnClick:()->Unit,
    onConnectivityBtnClick:()->Unit
){
    composable(route = serviceComponentScreenRoute){
        ServiceComponentScreen(
            onBackBtnClick = onBackBtnClick,
            onConnectivityBtnClick = onConnectivityBtnClick
        )
    }
}