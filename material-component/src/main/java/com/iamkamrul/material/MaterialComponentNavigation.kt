package com.iamkamrul.material

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val materialComponentsRoute = "material_component_route"

fun NavController.navigateToMaterialComponentScreen(){
    this.navigate(materialComponentsRoute)
}

fun NavGraphBuilder.materialComponentScreen(
    onBackClick:()->Unit
){
    composable(route = materialComponentsRoute){
        MaterialComponentRoute(
            onBackClick = onBackClick
        )
    }
}