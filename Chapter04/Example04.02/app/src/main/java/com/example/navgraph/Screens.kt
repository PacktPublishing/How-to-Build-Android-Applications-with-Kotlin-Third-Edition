package com.example.navgraph

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text("Home Screen") }) },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Button(
                    onClick = { navController.navigate(Detail) },
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text("Go to Detail Screen")
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(navController: NavController) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text("Detail Screen") }) },
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                Button(
                    onClick = { navController.navigate(Home) },
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text("Go to Home Screen")
                }
            }
        }
    )
}
