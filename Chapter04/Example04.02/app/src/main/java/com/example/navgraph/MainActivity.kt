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
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Home,
        builder = (
                {
                    composable<Home> {
                        HomeScreen { navController.navigate(Detail) }
                    }
                    composable<Detail> {
                        DetailScreen { navController.navigate(Home) }
                    }
                })
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NavigationApp()
}