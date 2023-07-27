package com.iamkamrul.material

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val materialComponentsRoute = "material_component_route"

fun NavController.navigateToMaterialComponentScreen(){
    this.navigate(materialComponentsRoute)
}

fun NavGraphBuilder.materialComponentScreen(
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
){
    composable(route = materialComponentsRoute){
        MaterialComponentScreen(
            onBackClick = onBackClick,
            onTextClick = onTextClick,
            onButtonClick = onButtonClick,
            onIconClick = onIconClick,
            onImageBtnClick = onImageBtnClick,
            onCardBtnClick = onCardBtnClick,
            onTextFieldBtnClick = onTextFieldBtnClick,
            onTopAppBarBtnClick = onTopAppBarBtnClick,
            onTimePickerBtnClick = onTimePickerBtnClick,
            onTooltipBtnClick = onTooltipBtnClick,

        )
    }
}