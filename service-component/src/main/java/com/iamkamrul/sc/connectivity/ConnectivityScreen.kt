package com.iamkamrul.sc.connectivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar

@Composable
internal fun ConnectivityScreen(
    onBackBtnClick:()->Unit
){
    ScaffoldTopAppbar(
        title = "Connectivity Manager",
        onNavigationIconClick = onBackBtnClick
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            contentAlignment = Alignment.Center
        ){
            Text(text = "Connectivity Status: CONNECTED", style = MaterialTheme.typography.displayLarge)
        }
    }
}