package com.ozman.composetutorial1.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.ozman.composetutorial1.nav.AppNavHost
import com.ozman.composetutorial1.ui.theme.ComposeTutorial1Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorial1Theme {
                Surface {
                    AppNavHost()
                }
            }
        }
    }
}