package com.example.simplenavigation

import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text("HOME SCREEN") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(4.dp, Color.Red, shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(ColorRoute("RED", "#FF0000")) }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("RED", color = Color.Red, fontSize = 28.sp)
            }

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(4.dp, Color.Green, shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(ColorRoute("GREEN", "#00FF00")) }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("GREEN", color = Color.Green, fontSize = 28.sp)
            }

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(4.dp, Color.Blue, shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(ColorRoute("BLUE", "#0000FF")) }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("BLUE", color = Color.Blue, fontSize = 28.sp)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ColorScreen(navigate: () -> Unit, colorName: String, colorHexidecimal: String) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(colorName)
                },
                navigationIcon = {
                    IconButton(onClick = {navigate()}) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(Color(colorHexidecimal.toColorInt())),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "$colorName SCREEN", fontSize = 28.sp)
        }
    }
}
