package com.iamkamrul.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.iamkamrul.navigation.login.loginScreen
import com.iamkamrul.navigation.login.loginScreenRoute
import com.iamkamrul.navigation.verifyotp.navigateToOtpVerifyScreen
import com.iamkamrul.navigation.verifyotp.otpVerifyScreen

const val navModuleGraphRoute = "navModuleGraphRoute"

fun NavController.navigateToNavigationModule(){
    this.navigate(navModuleGraphRoute)
}

fun NavGraphBuilder.navigationModuleGraph(navController: NavController){
    navigation(startDestination = loginScreenRoute, route = navModuleGraphRoute){

        loginScreen(
            onBackClick = navController::popBackStack,
            onHomeBtnClick = {},
            onOtpVerifyBtnClick = navController::navigateToOtpVerifyScreen,
        )

        otpVerifyScreen(
            onBackClick = navController::popBackStack,
            onSignUpBtnClick = {}
        )

    }
}