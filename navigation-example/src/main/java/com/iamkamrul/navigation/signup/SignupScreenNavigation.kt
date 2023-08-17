package com.iamkamrul.navigation.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.iamkamrul.navigation.navModuleGraphRoute

const val signUpScreenRoute = "signUpScreenRoute"

fun NavController.navigateToSignUpScreen(){
    this.navigate(signUpScreenRoute){
        popUpTo(route = navModuleGraphRoute){
            inclusive = false
        }
    }
}

fun NavGraphBuilder.signUpScreen(
    onBackClick:()->Unit,
    onHomeBtnClick:()->Unit,
){
    composable(route = signUpScreenRoute){
        SignUpScreen(
            onBackClick = onBackClick,
            onHomeBtnClick = onHomeBtnClick,
        )
    }
}