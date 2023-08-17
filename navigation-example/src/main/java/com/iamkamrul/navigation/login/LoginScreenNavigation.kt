package com.iamkamrul.navigation.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.iamkamrul.navigation.home.User

const val loginScreenRoute = "loginScreenRoute"

internal fun NavGraphBuilder.loginScreen(
    onBackClick:()->Unit,
    onOtpVerifyBtnClick:(String)->Unit,
    onHomeBtnClick:(User)->Unit,
){
    composable(route = loginScreenRoute){
        LoginScreen(
            onBackClick = onBackClick,
            onOtpVerifyBtnClick = onOtpVerifyBtnClick,
            onHomeBtnClick = onHomeBtnClick,
        )
    }
}