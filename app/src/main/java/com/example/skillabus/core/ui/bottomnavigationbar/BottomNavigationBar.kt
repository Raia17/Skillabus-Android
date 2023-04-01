package com.example.skillabus.core.ui.bottomnavigationbar

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.DialogNavigator
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.skillabus.R
import com.example.skillabus.core.ui.icons.IconSkillabus
import com.example.skillabus.modules.router.Navigation
import com.example.skillabus.ui.theme.SkillabusTheme

@Composable
fun BottomNavigationBar(navHostController: NavHostController) {
    val screens = listOf(Navigation.Home, Navigation.Quiz, Navigation.Tutor, Navigation.Agenda)
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    BottomNavigation(elevation = 16.dp) {
        screens.forEach { screen ->
            NavItem(screen = screen, currentDestination = currentDestination, navHostController = navHostController)
        }
    }
}

@Composable
fun RowScope.NavItem(
    screen: Navigation, currentDestination: NavDestination?, navHostController: NavHostController
) {
    BottomNavigationItem(
        label = { Text(text = screen.title, style = SkillabusTheme.typography.infoSmallBold) },
        icon = { IconSkillabus(resourceIdRes = screen.icon) },
        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
        onClick = { navHostController.navigate(screen.route) {
            popUpTo(navHostController.graph.findStartDestination().id)
            launchSingleTop = true
        } },
        unselectedContentColor = LocalContentColor.current.copy(alpha = 0.6f),
        alwaysShowLabel = false

    )
}