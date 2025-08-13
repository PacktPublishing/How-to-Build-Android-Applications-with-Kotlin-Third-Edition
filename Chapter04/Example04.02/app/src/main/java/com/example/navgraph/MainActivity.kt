package com.example.navgraph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationApp()
        }
    }
}

@Composable
fun NavigationApp() {
<<<<<<< HEAD
    val navController = rememberNavController()
    NavHost(
        navController = navController,
=======
    val navHostController = rememberNavController()
    NavHost(
        navController = navHostController,
>>>>>>> main
        startDestination = Home,
        builder = (
                {
                    composable<Home> {
<<<<<<< HEAD
                        HomeScreen(navController)
                    }
                    composable<Detail> {
                        DetailScreen(navController)
=======
                        HomeScreen(navHostController)
                    }
                    composable<Detail> {
                        DetailScreen(navHostController)
>>>>>>> main
                    }
                })
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigationApp()
}