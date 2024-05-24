package com.ozman.composetutorial1.presentation.splash


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    var startMainScreen by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        delay(3000) // 3 second delay
        startMainScreen = true
        onTimeout()
    }

    if (!startMainScreen) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Splash Screen",
                style = MaterialTheme.typography.headlineLarge
            )
        }
    }
}


