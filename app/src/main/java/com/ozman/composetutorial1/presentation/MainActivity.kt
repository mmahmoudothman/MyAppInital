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

//
//@AndroidEntryPoint
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            ComposeTutorial1Theme {
//                AppNavigation()
//            }
//        }
//    }
//}
//
//
//@Composable
//fun AppNavigation() {
//    val navController = rememberNavController()
//    NavHost(navController = navController, startDestination = "login") {
//        composable("login") {
//            LoginScreen(viewModel = hiltViewModel(), navController = navController)
//        }
//        composable("home") {
//            HomeScreen()
//        }
//    }
//}
//
//
//@Composable
//fun HomeScreen() {
//    Scaffold(
//        modifier = Modifier.fillMaxSize()
//    ) { innerPadding ->
//        Column(
//            modifier = Modifier.padding(innerPadding).padding(16.dp)
//        ) {
//            Text(text = "Welcome to the Home Screen!")
//        }
//    }
//}