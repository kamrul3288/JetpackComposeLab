package com.iamkamrul.jetpackcomposelab.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.iamkamrul.datastore_ui.dataStoreNavigationGraph
import com.iamkamrul.datastore_ui.navigateToDataStoreNavigationGraph
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
import com.iamkamrul.material.badge.badgeScreen
import com.iamkamrul.material.badge.navigateToBadgeScreen
import com.iamkamrul.material.bottomappbar.bottomAppBarScreen
import com.iamkamrul.material.bottomappbar.navigateToBottomAppBarScreen
import com.iamkamrul.material.bottomnavigation.bottomNavigationScreen
import com.iamkamrul.material.bottomnavigation.navigateToBottomNavigationScreen
import com.iamkamrul.material.buttons.buttonScreen
import com.iamkamrul.material.buttons.navigateToButtonScreen
import com.iamkamrul.material.cards.cardScreen
import com.iamkamrul.material.cards.navigateToCardScreen
import com.iamkamrul.material.checkbox.checkBoxScreen
import com.iamkamrul.material.checkbox.navigateToCheckBoxScreen
import com.iamkamrul.material.chips.chipScreen
import com.iamkamrul.material.chips.navigateToChipScreen
import com.iamkamrul.material.datepicker.datePickerScreen
import com.iamkamrul.material.datepicker.navigateToDatePickerScreen
import com.iamkamrul.material.dialog.dialogScreen
import com.iamkamrul.material.dialog.navigateToDialogScreen
import com.iamkamrul.material.divider.dividerScreen
import com.iamkamrul.material.divider.navigateToDividerScreen
import com.iamkamrul.material.icons.iconScreen
import com.iamkamrul.material.icons.navigateToIconScreen
import com.iamkamrul.material.image.imageScreen
import com.iamkamrul.material.image.navigateToImageScreen
import com.iamkamrul.material.materialComponentScreen
import com.iamkamrul.material.menu.menuScreenScreen
import com.iamkamrul.material.menu.navigateToMenuScreenScreen
import com.iamkamrul.material.navigateToMaterialComponentScreen
import com.iamkamrul.material.navigationdrawer.navigateToNavigationDrawerScreen
import com.iamkamrul.material.navigationdrawer.navigationDrawerScreen
import com.iamkamrul.material.progressbar.navigateToProgressBarScreen
import com.iamkamrul.material.progressbar.progressBarScreen
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
import com.iamkamrul.navigation.navigateToNavigationModule
import com.iamkamrul.navigation.navigationModuleGraph
import com.iamkamrul.sc.navigateToServiceComponentGraph
import com.iamkamrul.sc.serviceComponentNavGraph

@Composable
fun ApplicationNav(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = mainScreenRoute,
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                animationSpec = tween(700)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Left,
                animationSpec = tween(700)
            )
        },
        popEnterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                animationSpec = tween(700)
            )
        },
        popExitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Companion.Right,
                animationSpec = tween(700)
            )
        }
    ){
        mainScreen(
            onMaterialBtnClick = navController::navigateToMaterialComponentScreen,
            onLayoutBtnClick = navController::navigateToLayoutHomeScreen,
            onNavigationBtnClick = navController::navigateToNavigationModule,
            onServiceComponentBtnClick = navController::navigateToServiceComponentGraph,
            onDataStoreBtnClick = navController::navigateToDataStoreNavigationGraph
        )


        navigationModuleGraph(navController = navController)
        serviceComponentNavGraph(navController = navController)
        dataStoreNavigationGraph(navController = navController)


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
            onProgressBtnClick = navController:: navigateToProgressBarScreen,
            onNavDrawerBtnClick = navController::navigateToNavigationDrawerScreen,
            onBottomNavigationBtnClick = navController::navigateToBottomNavigationScreen,
            onMenusBtnClick = navController::navigateToMenuScreenScreen,
            onDividerBtnClick = navController::navigateToDividerScreen,
            onDialogBtnClick = navController::navigateToDialogScreen,
            onDatePickerBtnClick = navController::navigateToDatePickerScreen,
            onChipsBtnClick = navController::navigateToChipScreen,
            onCheckboxBtnClick = navController::navigateToCheckBoxScreen,
            onBadgeBtnClick = navController::navigateToBadgeScreen,
            onBottomAppbarBtnClick = navController::navigateToBottomAppBarScreen,
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
        progressBarScreen(onBackClick = navController::popBackStack)
        navigationDrawerScreen()
        bottomNavigationScreen(onBackClick = navController::popBackStack)
        menuScreenScreen(onBackClick = navController::popBackStack)
        dividerScreen(onBackClick = navController::popBackStack)
        dialogScreen(onBackClick = navController::popBackStack)
        datePickerScreen(onBackClick = navController::popBackStack)
        chipScreen(onBackClick = navController::popBackStack)
        checkBoxScreen(onBackClick = navController::popBackStack)
        badgeScreen(onBackClick = navController::popBackStack)
        bottomAppBarScreen(onBackClick = navController::popBackStack)

    }
}