package com.iamkamrul.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.iamkamrul.navigation.home.homeScreenScreen
import com.iamkamrul.navigation.home.navigateToHomeScreenScreen
import com.iamkamrul.navigation.login.loginScreen
import com.iamkamrul.navigation.login.loginScreenRoute
import com.iamkamrul.navigation.signup.navigateToSignUpScreen
import com.iamkamrul.navigation.signup.signUpScreen
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
            onHomeBtnClick = {user->
                navController.navigateToHomeScreenScreen(user = user)
            },
            onOtpVerifyBtnClick = {phoneNumber->
                navController.navigateToOtpVerifyScreen(phoneNumber = phoneNumber)
            },
        )

        otpVerifyScreen(
            onBackClick = navController::popBackStack,
            onSignUpBtnClick = navController::navigateToSignUpScreen
        )

        signUpScreen(
            onBackClick = {
               navController.navigate(navModuleGraphRoute){
                   popUpTo(navModuleGraphRoute){
                       inclusive = true
                   }
               }
            },
            onHomeBtnClick = {user ->
                navController.navigateToHomeScreenScreen(user = user)
            }
        )

        homeScreenScreen(
            onBackClick = navController::popBackStack,
        )

    }
}