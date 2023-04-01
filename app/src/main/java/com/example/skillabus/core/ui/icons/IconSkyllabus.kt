package com.example.skillabus.core.ui.icons

import androidx.annotation.DrawableRes
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.skillabus.ui.theme.SkillabusTheme

@Composable
fun IconSkillabus(
    @DrawableRes resourceIdRes: Int,
    contentDescription: String = "",
    modifier: Modifier = Modifier,
    tint: Color = SkillabusTheme.colors.ShadeLightest
) {
    Icon(
        painter = painterResource(id = resourceIdRes),
        contentDescription = contentDescription,
        tint = tint,
        modifier = modifier
    )
}