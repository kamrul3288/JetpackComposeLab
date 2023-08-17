package com.iamkamrul.navigation.verifyotp

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val otpVerifyScreenRoute = "otpVerifyScreenRoute"

fun NavController.navigateToOtpVerifyScreen(){
    this.navigate(otpVerifyScreenRoute)
}

fun NavGraphBuilder.otpVerifyScreen(
    onBackClick:()->Unit,
    onSignUpBtnClick:()->Unit,
){
    composable(route = otpVerifyScreenRoute){
        OtpVerifyScreen(
            onBackClick = onBackClick,
            onSignUpBtnClick = onSignUpBtnClick,
        )
    }
}
