package com.example.skillabus.ui.theme

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalCustomColors = staticCompositionLocalOf { Colors }
val LocalCustomTypography = staticCompositionLocalOf { Typography }
val LocalCustomShapes = staticCompositionLocalOf { Shapes }


@Composable
fun SkillabusTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalCustomColors provides Colors,
        LocalCustomTypography provides Typography,
        LocalCustomShapes provides Shapes,
        content = content
    )
}

object SkillabusTheme {
    val colors: SkillabusColors
        @Composable
        get() = LocalCustomColors.current
    val typography: SkillabusTypography
        @Composable
        get() = LocalCustomTypography.current
    val shapes: SkillabusShapes
        @Composable
        get() = LocalCustomShapes.current
}
/*
private val DarkColorPalette = darkColors(
    primary = Colors.Primary,
    primaryVariant = Purple700,
    secondary = Teal200
)

private val LightColorPalette = lightColors(
    primary = Purple500,
    primaryVariant = Purple700,
    secondary = Teal200

    */
/* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    *//*

)

@Composable
fun SkillabusTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}*/
