package com.iamkamrul.navigation.verifyotp

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

const val otpVerifyScreenRoute = "otpVerifyScreenRoute"
internal const val phoneNumberArgs = "phoneNumberArgs"

fun NavController.navigateToOtpVerifyScreen(phoneNumber:String){
    this.navigate("$otpVerifyScreenRoute/$phoneNumber")
}

fun NavGraphBuilder.otpVerifyScreen(
    onBackClick:()->Unit,
    onSignUpBtnClick:()->Unit,
){
    composable(
        route = "$otpVerifyScreenRoute/{$phoneNumberArgs}",
        arguments = listOf(
            navArgument(phoneNumberArgs){type = NavType.StringType}
        )
    ){ backStackEntry ->
        backStackEntry.arguments?.getString(phoneNumberArgs)?.let {phoneNumber->
            OtpVerifyScreen(
                onBackClick = onBackClick,
                onSignUpBtnClick = onSignUpBtnClick,
                phoneNumber = phoneNumber
            )
        }
    }
}
