package com.example.navigationgraph

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationgraph.ui.theme.NavigationGraphTheme
import kotlinx.serialization.Serializable



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationGraphTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavigationGraph(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Serializable
data object Home

@Serializable
data object Detail

@Composable
fun NavigationGraph(modifier: Modifier) {

    val navController = rememberNavController()

    NavHost(modifier = modifier, navController = navController, startDestination = Home) {
        composable<Home> {
            HomeScreen(navigateToDetailScreen = { navController.navigate(Detail) })
        }
        composable<Detail> {
            DetailScreen(navigateToHomeScreen = { navController.navigate(Home) })
        }
    }
}

@Composable
fun HomeScreen(navigateToDetailScreen: () -> Unit) {

    Box(modifier = Modifier.fillMaxSize()) {

        Text(text = "Home Screen", fontSize=28.sp, modifier = Modifier.align(Alignment.TopCenter))

        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { navigateToDetailScreen() },
        ) {
            Text(text = "Go to Detail Screen", fontSize= 22.sp)
        }
    }
}

@Composable
fun DetailScreen(navigateToHomeScreen: () -> Unit) {

    Box(modifier = Modifier.fillMaxSize()) {

        Text(text = "Detail Screen", fontSize=28.sp, modifier = Modifier.align(Alignment.TopCenter))

        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { navigateToHomeScreen() },
        ) {
            Text(text = "Go to Home Screen", fontSize= 22.sp)
        }
    }
}


