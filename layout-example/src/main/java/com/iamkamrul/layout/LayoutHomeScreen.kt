package com.iamkamrul.layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.unit.dp
import com.iamkamrul.ui.component.FeatureCardItem
import com.iamkamrul.designsystem.component.ScaffoldTopAppbar
import com.iamkamrul.designsystem.icon.JclIcons
import com.iamkamrul.designsystem.theme.color

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
    onConstraintLayoutBtnClick:()->Unit,
){
    ScaffoldTopAppbar(
        title = "Layouts",
        containerColor = MaterialTheme.color.secondaryBackground,
        onNavigationIconClick = onBackClick
    ) {
        val modifier = Modifier.padding(it)
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Row {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Column",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onColumnBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    label = "Row",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onRowBtnClick
                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            Row {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    label = "Box",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onBoxBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "BoxWithConstraints",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onBoxWithConstraintBtnClick
                )
            }


            Spacer(modifier = Modifier.height(5.dp))
            Row {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "Horizontal Pager",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onHorizontalPagerBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    label = "Vertical Pager",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onVerticalPagerBtnClick
                )
            }

            Spacer(modifier = Modifier.height(5.dp))
            Row {
                FeatureCardItem(
                    modifier = Modifier
                        .weight(0.8f)
                        .height(80.dp),
                    label = "Flow",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onFlowBtnClick
                )
                Spacer(modifier = Modifier.width(5.dp))
                FeatureCardItem(
                    modifier = Modifier
                        .weight(1f)
                        .height(80.dp),
                    label = "ConstraintLayout",
                    icon = rememberVectorPainter(image = JclIcons.TableView),
                    onClick = onConstraintLayoutBtnClick
                )
            }
        }
    }
}