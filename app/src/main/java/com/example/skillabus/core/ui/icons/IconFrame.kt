package com.example.skillabus.core.ui.icons

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.skillabus.ui.theme.SkillabusTheme

object IconFrame {
    val Small: Dp = 24.dp
    val Regular: Dp = 36.dp
    val Large: Dp = 48.dp
}

@Composable
fun IconFrame(size: Dp, @DrawableRes resourceIdRes: Int) {
    Box() {
        Box() {
            IconButton(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(SkillabusTheme.colors.Secondary)
                    .padding(size / 4)
                    .height(size)
                    .aspectRatio(1f), onClick = { /*TODO*/ }) {
                IconSkillabus(resourceIdRes = resourceIdRes)
            }
        }
    }
}