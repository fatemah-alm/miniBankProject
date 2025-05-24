package com.example.minibankproject.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun MiniBankProjectTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else lightColorScheme

    MaterialTheme(
        colorScheme = lightColorScheme,
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}