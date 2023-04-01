package com.example.skillabus.core.ui.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.DrawerState
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.skillabus.core.ui.bottomnavigationbar.BottomNavigationBar
import com.example.skillabus.core.ui.topnavigationbar.TopNavigationBar
import com.example.skillabus.modules.router.NavigationGraph
import com.example.skillabus.ui.theme.SkillabusTheme

@Composable
fun MainLayout() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navHostController = navController) },
        backgroundColor = SkillabusTheme.colors.ShadeLightest
    ) {
        NavigationGraph(navController = navController)
    }
}