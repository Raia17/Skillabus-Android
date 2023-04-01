package com.example.skillabus.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.dp

@Immutable
data class SkillabusShapes(
    val NONE: RoundedCornerShape,
    val XS: RoundedCornerShape,
    val SM: RoundedCornerShape,
    val MD: RoundedCornerShape,
    val LG: RoundedCornerShape,
    val XL: RoundedCornerShape,
    val FULL: RoundedCornerShape,
)

val Shapes = SkillabusShapes(
    NONE = RoundedCornerShape(0.dp),
    XS = RoundedCornerShape(2.dp),
    SM = RoundedCornerShape(4.dp),
    MD = RoundedCornerShape(8.dp),
    LG = RoundedCornerShape(12.dp),
    XL = RoundedCornerShape(16.dp),
    FULL = RoundedCornerShape(100.dp)
)