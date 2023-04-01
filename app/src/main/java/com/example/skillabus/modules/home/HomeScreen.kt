package com.example.skillabus.modules.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.skillabus.core.ui.layouts.Wrapper
import com.example.skillabus.core.ui.topnavigationbar.TopNavigationBar
import com.example.skillabus.ui.theme.SkillabusTheme
import org.json.JSONObject

@Preview
@Composable
fun HomeScreen() {
    Wrapper {

        TopNavigationBar()
        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Bem-vindo",
                color = SkillabusTheme.colors.ShadeDarkest,
                style = SkillabusTheme.typography.heading3
            )
        }
    }
}


@Composable
fun TodayQuiz(info: JSONObject = JSONObject()) {
    Box() {
        
    }
}