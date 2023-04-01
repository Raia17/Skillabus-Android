package com.example.skillabus.ui.theme

import android.provider.CalendarContract.Colors
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class SkillabusColors(
    // Primary
    val PrimaryLightest: Color,
    val PrimaryLighter: Color,
    val PrimaryLight: Color,
    val Primary: Color,
    val PrimaryDark: Color,
    val PrimaryDarker: Color,

    // Secondary
    val SecondaryLightest: Color,
    val SecondaryLighter: Color,
    val SecondaryLight: Color,
    val Secondary: Color,
    val SecondaryDark: Color,
    val SecondaryDarker: Color,

    // Shades
    val ShadeLightest: Color,
    val ShadeLighter: Color,
    val ShadeLight: Color,
    val Shade: Color,
    val ShadeDark: Color,
    val ShadeDarker: Color,
    val ShadeDarkest: Color,

    // Functional
    //  Error
    val ErrorLight: Color,
    val Error: Color,
    val ErrorDark: Color,

    //  Warning
    val WarningLight: Color,
    val Warning: Color,
    val WarningDark: Color,

    //  Success
    val SuccessLight: Color,
    val Success: Color,
    val SuccessDark: Color,

    //  Info
    val InfoLight: Color,
    val Info: Color,
    val InfoDark: Color,
)


val Colors = SkillabusColors(
    PrimaryLightest = Color(0XFFFFE4DB),
    PrimaryLighter = Color(0XFFFFCDBE),
    PrimaryLight = Color(0XFFF69475),
    Primary = Color(0XFFF9541F),
    PrimaryDark = Color(0XFFBB360C),
    PrimaryDarker = Color(0XFF6C1A01),

    SecondaryLightest = Color(0XFFEBD6FB),
    SecondaryLighter = Color(0XFFC996F3),
    SecondaryLight = Color(0XFF9C55D9),
    Secondary = Color(0XFF5A189A),
    SecondaryDark = Color(0XFF3B076B),
    SecondaryDarker = Color(0XFF21003F),

    ShadeLightest = Color(0XFFFFFFFF),
    ShadeLighter = Color(0XFFE6E3E8),
    ShadeLight = Color(0XFFC8C1CD),
    Shade = Color(0XFF948C97),
    ShadeDark = Color(0XFF4F4653),
    ShadeDarker = Color(0XFF342E38),
    ShadeDarkest = Color(0XFF1B141F),

    ErrorLight = Color(0XFFF2746C),
    Error = Color(0XFFEC2E22),
    ErrorDark = Color(0XFF8E140C),

    WarningLight = Color(0XFFFEE385),
    Warning = Color(0XFFFDC80C),
    WarningDark = Color(0XFFC59A02),

    SuccessLight = Color(0XFFA1E382),
    Success = Color(0XFF69D337),
    SuccessDark = Color(0XFF40881E),

    InfoLight = Color(0XFF7FC5ED),
    Info = Color(0XFF54B2E7),
    InfoDark = Color(0XFF135F8A),
)