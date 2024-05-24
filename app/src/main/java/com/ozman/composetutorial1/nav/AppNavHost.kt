package com.ozman.composetutorial1.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ozman.composetutorial1.presentation.components.MainScreen
import com.ozman.composetutorial1.presentation.splash.SplashScreen
import com.ozman.composetutorial1.presentation.login.LoginScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") {
            SplashScreen(onTimeout = {
                navController.navigate("login") {
                    popUpTo("splash") { inclusive = true }
                }
            })
        }

        composable("main") {
            MainScreen(onExit ={
                navController.navigate("login") {
                    popUpTo("main") { inclusive = true }
                }
            })
        }


        composable("login"){
            LoginScreen(hiltViewModel(),onLoginSuccess = {
                navController.navigate("main") {
                    popUpTo("login") { inclusive = true }
                }
            })
        }
    }
}

