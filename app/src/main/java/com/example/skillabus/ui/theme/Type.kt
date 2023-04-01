package com.example.skillabus.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.skillabus.R

val SatoshiFont = FontFamily(
    Font(R.font.satoshi_black, FontWeight.Black),
    Font(R.font.satoshi_blackitalic, FontWeight.Black, FontStyle.Italic),
    Font(R.font.satoshi_bold, FontWeight.Bold),
    Font(R.font.satoshi_bolditalic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.satoshi_medium, FontWeight.Medium),
    Font(R.font.satoshi_mediumitalic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.satoshi_regular, FontWeight.Normal),
    Font(R.font.satoshi_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.satoshi_light, FontWeight.Light),
    Font(R.font.satoshi_lightitalic, FontWeight.Light, FontStyle.Italic),
)

@Immutable
data class SkillabusTypography(
    val heading1: TextStyle,
    val heading2: TextStyle,
    val heading3: TextStyle,
    val heading4: TextStyle,
    val heading5: TextStyle,
    val heading6: TextStyle,
    val bodyLarge: TextStyle,
    val bodyLargeBold: TextStyle,
    val bodySmall: TextStyle,
    val bodySmallBold: TextStyle,
    val infoLarge: TextStyle,
    val infoLargeBold: TextStyle,
    val infoSmall: TextStyle,
    val infoSmallBold: TextStyle,
)

// Set of Material typography styles to start with
val Typography = SkillabusTypography(
    heading1 = TextStyle(fontSize = 50.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    heading2 = TextStyle(fontSize = 40.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    heading3 = TextStyle(fontSize = 35.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    heading4 = TextStyle(fontSize = 30.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    heading5 = TextStyle(fontSize = 25.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    heading6 = TextStyle(fontSize = 20.sp, fontFamily = SatoshiFont, fontWeight = FontWeight.Black),
    bodyLarge = TextStyle(
        fontSize = 18.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Normal
    ),
    bodyLargeBold = TextStyle(
        fontSize = 18.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Bold
    ),
    bodySmall = TextStyle(
        fontSize = 14.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Normal
    ),
    bodySmallBold = TextStyle(
        fontSize = 14.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Bold
    ),
    infoLarge = TextStyle(
        fontSize = 12.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Normal
    ),
    infoLargeBold = TextStyle(
        fontSize = 12.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Bold
    ),
    infoSmall = TextStyle(
        fontSize = 10.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Normal
    ),
    infoSmallBold = TextStyle(
        fontSize = 10.sp,
        fontFamily = SatoshiFont,
        fontWeight = FontWeight.Bold
    ),
)