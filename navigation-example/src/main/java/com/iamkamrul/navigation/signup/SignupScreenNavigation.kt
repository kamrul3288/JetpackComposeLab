package com.iamkamrul.navigation.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.iamkamrul.navigation.home.User

const val signUpScreenRoute = "signUpScreenRoute"

fun NavController.navigateToSignUpScreen(){
    this.navigate(signUpScreenRoute)
}

fun NavGraphBuilder.signUpScreen(
    onBackClick:()->Unit,
    onHomeBtnClick:(User)->Unit,
){
    composable(route = signUpScreenRoute){
        SignUpScreen(
            onBackClick = onBackClick,
            onHomeBtnClick = onHomeBtnClick,
        )
    }
}