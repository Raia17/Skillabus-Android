package com.example.skillabus.core.ui.topnavigationbar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.skillabus.R
import com.example.skillabus.core.ui.icons.IconFrame
import com.example.skillabus.core.ui.icons.IconSkillabus
import com.example.skillabus.ui.theme.Shapes
import com.example.skillabus.ui.theme.SkillabusTheme
import com.example.skillabus.ui.theme.Typography


@Composable
fun TopNavigationBar(
    @DrawableRes iconLeft: Int = R.drawable.user,
    text: String = "Home",
    @DrawableRes iconRight: Int = R.drawable.user,

    ) {
    Row(
        modifier = Modifier
            .background(Color.Transparent)
            .height(IntrinsicSize.Min)
            .fillMaxWidth()
            .zIndex(10f),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.White)
                .padding(end = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconFrame(size = IconFrame.Regular, resourceIdRes = R.drawable.home)
            Text(text = text, style = SkillabusTheme.typography.bodyLargeBold)
        }
        IconFrame(size = IconFrame.Regular, resourceIdRes = R.drawable.user)
    }
}

@Preview()
@Composable
fun PreviewTopBar() {
    TopNavigationBar()
}