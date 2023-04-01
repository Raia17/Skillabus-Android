package com.example.skillabus.core.ui.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.skillabus.ui.theme.SkillabusIcons
import com.example.skillabus.ui.theme.SkillabusTheme

@Composable
fun Wrapper(content: @Composable () -> Unit) {

    val OUTER_PADDING: Dp = 16.dp
    val MAX_GAP = 32.dp
    val MIN_GAP = 8.dp

    Column(
        modifier = Modifier
            .background(SkillabusTheme.colors.ShadeLightest)
            .padding(OUTER_PADDING)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(MAX_GAP, Alignment.CenterVertically)
    ) {
        content()
    }
}