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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.iamkamrul.ui.component.FeatureCardItem
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.White


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
    onSwitchBtnClick:()->Unit,
    onSnackBarBtnClick:()->Unit,
    onSlideBtnClick:()->Unit,
    onSlideSheetBtnClick:()->Unit,
    onSearchBtnClick:()->Unit,
    onRadioBtnClick:()->Unit,
    onProgressBtnClick:()->Unit,
    onNavDrawerBtnClick:()->Unit,
    onBottomNavigationBtnClick:()->Unit,
    onMenusBtnClick:()->Unit,
    onDividerBtnClick:()->Unit,
    onDialogBtnClick:()->Unit,
    onDatePickerBtnClick:()->Unit,
    onChipsBtnClick:()->Unit,
    onCheckboxBtnClick:()->Unit,
    onBadgeBtnClick:()->Unit,
    onBottomAppbarBtnClick:()->Unit,
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
                        imageVector =JclIcons.ArrowBack,
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
            .verticalScroll(rememberScrollState())
        ) {

            //-------------------------- Row  1 ---------------------------
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Texts",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTextClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Buttons",
                    onClick = onButtonClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Icons",
                    onClick = onIconClick
                )
            }



            //--------------------------- Row  2 ----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Images",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onImageBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "TextField",
                    onClick = onTextFieldBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Cards",
                    onClick = onCardBtnClick
                )


            }


            //---------------------------- Row  3 ----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Top Appbar",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTopAppBarBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Time Picker",
                    onClick = onTimePickerBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "ToolTip",
                    onClick = onTooltipBtnClick
                )
            }



            //------------------------------- Row  4 ----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Tabs",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onTabsBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Snack bars",
                    onClick = onSnackBarBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Switch",
                    onClick = onSwitchBtnClick
                )


            }


            //------------------------------ Row  5 ----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Slider",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onSlideBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Slide Sheets",
                    onClick = onSlideSheetBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Search",
                    onClick = onSearchBtnClick
                )
            }

            //------------------------------ Row  6 ----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Radio Button",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onRadioBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Progress Bar",
                    onClick = onProgressBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Nav Drawer",
                    onClick = onNavDrawerBtnClick
                )
            }


            //----------------------------- Row  7----------------------
            Spacer(modifier = Modifier.height(5.dp))



            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Menus",
                    onClick = onMenusBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))

                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    label = "Bottom Navigation",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onBottomNavigationBtnClick
                )


                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Divider",
                    onClick = onDividerBtnClick
                )
            }



            //----------------------------- Row  8----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Dialogs",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onDialogBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Date Picker",
                    onClick = onDatePickerBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Chips",
                    onClick = onChipsBtnClick
                )
            }

            //----------------------------- Row  9----------------------
            Spacer(modifier = Modifier.height(5.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    label = "Checkbox",
                    icon = painterResource(id = R.drawable.ic_material),
                    onClick = onCheckboxBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Bottom Appbar",
                    onClick = onBottomAppbarBtnClick
                )

                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(70.dp),
                    icon = painterResource(id = R.drawable.ic_material),
                    label = "Badge",
                    onClick = onBadgeBtnClick
                )


            }


        }
    }
}