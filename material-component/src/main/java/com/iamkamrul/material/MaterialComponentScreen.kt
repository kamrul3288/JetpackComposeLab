package com.iamkamrul.material

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ComponentButton
import com.iamkamrul.common.theme.White


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun  MaterialComponentScreen(
    onBackClick:()->Unit,
    onTextClick:()->Unit,
    onButtonClick:()->Unit,
    onIconClick:()->Unit,
    onImageBtnClick:()->Unit,
    onCardBtnClick:()->Unit,
    onTextFieldBtnClick:()->Unit,
    onTopAppBarBtnClick:()->Unit,
    onTimePickerBtnClick:()->Unit,
    onTooltipBtnClick:()->Unit,
    onTabsBtnClick:()->Unit,
){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "Material Component", color = Color.White)
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                ),
                navigationIcon = {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        modifier = Modifier.clickable {onBackClick()},
                        contentDescription = "back_icon", tint = White
                    )
                }
            )
        }
    ) {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier
            .fillMaxSize()
            .padding(16.dp)) {

            //-----------Row  1----------------------
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    buttonLabel = "Texts",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTextClick
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Buttons",
                    onClick = onButtonClick
                )

                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Icons",
                    onClick = onIconClick
                )
            }


            //-----------Row  2----------------------
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    buttonLabel = "Images",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onImageBtnClick
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Cards",
                    onClick = onCardBtnClick
                )

                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "TextField",
                    onClick = onTextFieldBtnClick
                )
            }


            //-----------Row  3----------------------
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    buttonLabel = "Top Appbar",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTopAppBarBtnClick
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Time Picker",
                    onClick = onTimePickerBtnClick
                )

                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "ToolTip",
                    onClick = onTooltipBtnClick
                )
            }



            //-----------Row  4----------------------
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    buttonLabel = "Tabs",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTabsBtnClick
                )
                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Switch",
                    onClick = {}
                )

                Spacer(modifier = Modifier.width(10.dp))
                ComponentButton(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    buttonLabel = "Snack bars",
                    onClick = {}
                )
            }

        }
    }
}