package com.iamkamrul.navigation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val loginScreenRoute = "loginScreenRoute"

internal fun NavGraphBuilder.loginScreen(
    onBackClick:()->Unit,
    onOtpVerifyBtnClick:()->Unit,
    onHomeBtnClick:()->Unit,
){
    composable(route = loginScreenRoute){
        LoginScreen(
            onBackClick = onBackClick,
            onOtpVerifyBtnClick = onOtpVerifyBtnClick,
            onHomeBtnClick = onHomeBtnClick,
        )
    }
}