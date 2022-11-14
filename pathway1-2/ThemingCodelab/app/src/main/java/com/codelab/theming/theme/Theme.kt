package com.codelab.theming.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun JetnewsTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = JetNewsColors(),
        typography = JetnewsTypography,
        shapes = JetnewsShapes,
        content = content
    )
}
