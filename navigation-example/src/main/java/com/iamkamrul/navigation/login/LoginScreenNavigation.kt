package com.iamkamrul.navigation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val loginScreenRoute = "loginScreenRoute"

internal fun NavGraphBuilder.loginScreen(
    onBackClick:()->Unit,
    onOtpVerifyBtnClick:(String)->Unit,
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