package com.example.skillabus.modules.router

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.skillabus.R

sealed class Navigation(
    val route: String,
    val title: String,
    @DrawableRes val icon: Int
) {
    object Home : Navigation(
        route = "home",
        title = "Home",
        icon = R.drawable.home
    )
    object Quiz : Navigation(
        route = "quiz",
        title = "Quiz",
        icon = R.drawable.award
    )
    object Tutor : Navigation(
        route = "tutor",
        title = "Tutor",
        icon = R.drawable.bookmark
    )
    object Agenda : Navigation(
        route = "agenda",
        title = "Agenda",
        icon = R.drawable.calendar
    )
}
