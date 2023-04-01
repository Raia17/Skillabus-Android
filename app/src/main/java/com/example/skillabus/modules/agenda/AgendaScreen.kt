package com.example.skillabus.modules.agenda

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun AgendaScreen() {
    Box(modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.primaryVariant)) {
        Text(
            text = "AGENDA",
            color = MaterialTheme.colors.onPrimary,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}