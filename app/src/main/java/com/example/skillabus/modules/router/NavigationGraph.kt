package com.example.skillabus.modules.router

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.skillabus.modules.agenda.AgendaScreen
import com.example.skillabus.modules.home.HomeScreen
import com.example.skillabus.modules.quiz.QuizScreen
import com.example.skillabus.modules.tutor.TutorScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable(route = Navigation.Home.route) {
            HomeScreen()
        }
        composable(route = Navigation.Quiz.route) {
            QuizScreen()
        }
        composable(route = Navigation.Tutor.route) {
            TutorScreen()
        }
        composable(route = Navigation.Agenda.route) {
            AgendaScreen()
        }
    }
}