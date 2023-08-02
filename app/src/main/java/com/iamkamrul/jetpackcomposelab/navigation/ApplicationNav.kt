package com.iamkamrul.jetpackcomposelab.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.iamkamrul.jetpackcomposelab.mainScreen
import com.iamkamrul.jetpackcomposelab.mainScreenRoute
import com.iamkamrul.layout.box.boxScreen
import com.iamkamrul.layout.box.navigateToBoxScreen
import com.iamkamrul.layout.boxconstraint.boxWithConstraintScreen
import com.iamkamrul.layout.boxconstraint.navigateToBoxWithConstraint
import com.iamkamrul.layout.column.columnScreen
import com.iamkamrul.layout.column.navigateToColumnScreen
import com.iamkamrul.layout.constraintlayout.constraintLayoutScreen
import com.iamkamrul.layout.constraintlayout.navigateToConstraintLayout
import com.iamkamrul.layout.flow.flowLayoutScreen
import com.iamkamrul.layout.flow.navigateToFlowLayout
import com.iamkamrul.layout.hpager.horizontalPagerScreen
import com.iamkamrul.layout.hpager.navigateToHorizontalPagerScreen
import com.iamkamrul.layout.layoutHomeScreen
import com.iamkamrul.layout.navigateToLayoutHomeScreen
import com.iamkamrul.layout.row.navigateToRowScreen
import com.iamkamrul.layout.row.rowScreen
import com.iamkamrul.layout.vpager.navigateToVerticalPager
import com.iamkamrul.layout.vpager.verticalPagerScreen
import com.iamkamrul.material.buttons.buttonScreen
import com.iamkamrul.material.buttons.navigateToButtonScreen
import com.iamkamrul.material.cards.cardScreen
import com.iamkamrul.material.cards.navigateToCardScreen
import com.iamkamrul.material.icons.iconScreen
import com.iamkamrul.material.icons.navigateToIconScreen
import com.iamkamrul.material.image.imageScreen
import com.iamkamrul.material.image.navigateToImageScreen
import com.iamkamrul.material.materialComponentScreen
import com.iamkamrul.material.navigateToMaterialComponentScreen
import com.iamkamrul.material.radio.navigateToRadioButtonScreen
import com.iamkamrul.material.radio.radioButtonScreen
import com.iamkamrul.material.search.navigateToSearchScreen
import com.iamkamrul.material.search.searchScreen
import com.iamkamrul.material.slider.navigateToSliderScreen
import com.iamkamrul.material.slider.sliderScreen
import com.iamkamrul.material.slidesheet.navigateToSlideSheetScreen
import com.iamkamrul.material.slidesheet.slideSheetScreen
import com.iamkamrul.material.snackbar.navigateToSnackBarScreen
import com.iamkamrul.material.snackbar.snackBarScreen
import com.iamkamrul.material.switches.navigateToSwitchScreen
import com.iamkamrul.material.switches.switchScreen
import com.iamkamrul.material.tabs.navigateToTabsScreen
import com.iamkamrul.material.tabs.tabsScreen
import com.iamkamrul.material.textfield.navigateToTextFieldScreen
import com.iamkamrul.material.textfield.textFieldScreen
import com.iamkamrul.material.texts.navigateToTextScreenRoute
import com.iamkamrul.material.texts.textScreen
import com.iamkamrul.material.timepicker.navigateToTimePickerScreen
import com.iamkamrul.material.timepicker.timePickerScreen
import com.iamkamrul.material.tooltip.navigateToTooltipScreen
import com.iamkamrul.material.tooltip.tooltipScreen
import com.iamkamrul.material.topappbar.navigateToTopAppBarScreen
import com.iamkamrul.material.topappbar.topAppBarScreen

@Composable
fun ApplicationNav(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = mainScreenRoute,
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ){
        mainScreen(
            onClickMaterial = navController::navigateToMaterialComponentScreen,
            onClickLayout = navController::navigateToLayoutHomeScreen
        )
        layoutHomeScreen(
            onBackClick = navController::popBackStack,
            onColumnBtnClick = navController::navigateToColumnScreen,
            onRowBtnClick = navController::navigateToRowScreen,
            onBoxBtnClick = navController::navigateToBoxScreen,
            onBoxWithConstraintBtnClick = navController::navigateToBoxWithConstraint,
            onHorizontalPagerBtnClick = navController::navigateToHorizontalPagerScreen,
            onVerticalPagerBtnClick = navController::navigateToVerticalPager,
            onFlowBtnClick = navController::navigateToFlowLayout,
            onConstraintLayoutBtnClick = navController::navigateToConstraintLayout,
        )
        columnScreen(onBackClick = navController::popBackStack)
        rowScreen(onBackClick = navController::popBackStack)
        boxScreen(onBackClick = navController::popBackStack)
        boxWithConstraintScreen(onBackClick = navController::popBackStack)
        horizontalPagerScreen(onBackClick = navController::popBackStack)
        verticalPagerScreen(onBackClick = navController::popBackStack)
        flowLayoutScreen(onBackClick  = navController::popBackStack)
        constraintLayoutScreen(onBackClick  = navController::popBackStack)


        materialComponentScreen(
            onBackClick = navController::popBackStack,
            onTextClick = navController::navigateToTextScreenRoute,
            onButtonClick = navController::navigateToButtonScreen,
            onIconClick = navController::navigateToIconScreen,
            onImageBtnClick = navController::navigateToImageScreen,
            onCardBtnClick = navController::navigateToCardScreen,
            onTextFieldBtnClick = navController::navigateToTextFieldScreen,
            onTopAppBarBtnClick = navController::navigateToTopAppBarScreen,
            onTimePickerBtnClick = navController::navigateToTimePickerScreen,
            onTooltipBtnClick = navController::navigateToTooltipScreen,
            onTabsBtnClick = navController::navigateToTabsScreen,
            onSwitchBtnClick = navController::navigateToSwitchScreen,
            onSnackBarBtnClick = navController::navigateToSnackBarScreen,
            onSlideBtnClick = navController::navigateToSliderScreen,
            onSlideSheetBtnClick = navController::navigateToSlideSheetScreen,
            onSearchBtnClick = navController::navigateToSearchScreen,
            onRadioBtnClick = navController::navigateToRadioButtonScreen,
            onProgressBtnClick = navController::navigateToSearchScreen,
            onNavDrawerBtnClick = navController::navigateToSearchScreen,
        )
        textScreen(onBackClick = navController::popBackStack)
        buttonScreen(onBackClick = navController::popBackStack)
        iconScreen(onBackClick = navController::popBackStack)
        imageScreen(onBackClick = navController::popBackStack)
        cardScreen(onBackClick = navController::popBackStack)
        textFieldScreen(onBackClick = navController::popBackStack)
        topAppBarScreen(onBackClick = navController::popBackStack)
        timePickerScreen(onBackClick = navController::popBackStack)
        tooltipScreen(onBackClick = navController::popBackStack)
        tabsScreen(onBackClick = navController::popBackStack)
        switchScreen(onBackClick = navController::popBackStack)
        snackBarScreen(onBackClick = navController::popBackStack)
        sliderScreen(onBackClick = navController::popBackStack)
        slideSheetScreen(onBackClick = navController::popBackStack)
        searchScreen(onBackClick = navController::popBackStack)
        radioButtonScreen(onBackClick = navController::popBackStack)
    }
}