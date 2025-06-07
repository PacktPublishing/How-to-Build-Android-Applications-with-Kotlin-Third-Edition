package com.example.simplenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.simplenavigation.ui.theme.SimpleNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SimpleNavigationTheme {

                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = HomeRoute) {
                    composable<HomeRoute>{
                        HomeScreen(navController)
                    }
                    composable<ColorRoute> { backStackEntry ->

                        val colorRoute = backStackEntry.toRoute<ColorRoute>()
                        ColorScreen({navController.navigateUp()}, colorRoute.colorName, colorRoute.colorHexidecimal )
                    }
                }
            }
        }
    }
}
