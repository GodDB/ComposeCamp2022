package com.codelab.theming.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Red200 = Color(0xfff297a2)
val Red300 = Color(0xffea6d7e)
val RED700 = Color(0xFFDD0D3C)
val RED800 = Color(0xFFD00036)
val RED900 = Color(0xFFC20029)

@Composable
fun JetNewsColors(): Colors {
    return if (isSystemInDarkTheme()) DarkColors
    else LightColors
}

private val LightColors = lightColors(
    primary = RED700,
    primaryVariant = RED900,
    onPrimary = Color.White,
    secondary = RED700,
    secondaryVariant = RED900,
    onSecondary = Color.White,
    error = RED800
)

private val DarkColors = darkColors(
    primary = Red300,
    primaryVariant = RED700,
    onPrimary = Color.Black,
    secondary = Red300,
    onSecondary = Color.Black,
    error = Red200
)
