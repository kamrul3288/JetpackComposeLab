package com.iamkamrul.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamkamrul.common.compose.ComponentButton
import com.iamkamrul.common.compose.ScaffoldWithBackNavigation

@Composable
fun LayoutHomeScreen(
    onBackClick:()->Unit,
    onColumnBtnClick:()->Unit,
    onRowBtnClick:()->Unit,
    onBoxBtnClick:()->Unit,
    onBoxWithConstraintBtnClick:()->Unit,
    onHorizontalPagerBtnClick:()->Unit,
    onVerticalPagerBtnClick:()->Unit,
    onFlowBtnClick:()->Unit,
){
    ScaffoldWithBackNavigation(title = "Layouts", onBackClick = onBackClick) {
        val modifier = Modifier.padding(it)
        Column(modifier = modifier
            .fillMaxSize()
            .padding(4.dp)) {
            Row{
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Column",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onColumnBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Row",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onRowBtnClick
                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            Row{
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Box",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onBoxBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "BoxWithConstraints",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onBoxWithConstraintBtnClick
                )
            }


            Spacer(modifier = Modifier.height(5.dp))
            Row{
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Horizontal Pager",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onHorizontalPagerBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Vertical Pager",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onVerticalPagerBtnClick
                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            Row{
                ComponentButton(
                    modifier = Modifier.weight(0.8f).height(80.dp),
                    buttonLabel = "Flow",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = onFlowBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                ComponentButton(
                    modifier = Modifier.weight(1f).height(80.dp),
                    buttonLabel = "Constraint",
                    icon = painterResource(id = R.drawable.ic_layout),
                    onClick = {}
                )
            }
        }
    }
}