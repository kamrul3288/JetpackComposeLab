package com.iamkamrul.sc.connectivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar

@Composable
internal fun ConnectivityScreen(
    onBackBtnClick:()->Unit,
    viewModel: ConnectivityViewModel = hiltViewModel()
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
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Connectivity Status", style = MaterialTheme.typography.titleMedium)
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = viewModel.connectivityStatus, style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Black))
            }
        }
    }
}