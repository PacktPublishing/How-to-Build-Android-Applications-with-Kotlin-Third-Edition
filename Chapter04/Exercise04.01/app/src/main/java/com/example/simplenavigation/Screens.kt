package com.example.simplenavigation

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
<<<<<<< HEAD
import androidx.compose.foundation.layout.statusBarsPadding
=======
>>>>>>> main
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
<<<<<<< HEAD
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
=======
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
>>>>>>> main
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
<<<<<<< HEAD
import androidx.compose.ui.res.stringResource
=======
>>>>>>> main
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
<<<<<<< HEAD
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(stringResource(R.string.app_name))
                        },
                modifier = Modifier.statusBarsPadding(),
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor =
                            MaterialTheme.colorScheme.surfaceContainer
                    )
            )
        }
=======
        topBar = { CenterAlignedTopAppBar(title = { Text("HOME SCREEN") }) }
>>>>>>> main
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(150.dp)
<<<<<<< HEAD
                    .border(
                        4.dp, Color(0xFFFF0000), shape =
                            RoundedCornerShape(16.dp)
                    )
                    .clickable {
                        navController.navigate(
                            Color(
                                "RED",
                                0xFFFF0000
                            )
                        )
                    }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "RED", color = Color(0xFFFF0000),
                    fontSize = 24.sp
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(
                        4.dp, Color(0xFF00FF00),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable {
                        navController.navigate(Color("GREEN", 0xFF00FF00))
                    }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "GREEN", color = Color(0xFF00FF00),
                    fontSize = 24.sp
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(
                        4.dp, Color(0xFF0000FF),
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable {
                        navController.navigate(Color("BLUE", 0xFF0000FF))
                    }
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "BLUE", color = Color(0xFF0000FF),
                    fontSize = 24.sp
                ) // Large font size
=======
                    .border(4.dp, Color(0xFFFF0000), shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(Color("RED", 0xFFFF0000))}
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("RED", color = Color.Red, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(4.dp, Color(0xFF00FF00), shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(Color("GREEN", 0xFF00FF00))}
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("GREEN", color = Color.Green, fontSize = 24.sp)
            }

            Spacer(modifier = Modifier.height(24.dp))

            Box(
                modifier = Modifier
                    .size(150.dp)
                    .border(4.dp, Color(0xFF0000FF), shape = RoundedCornerShape(16.dp))
                    .clickable { navController.navigate(Color("BLUE", 0xFF0000FF))}
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Text("BLUE", color = Color.Blue, fontSize = 24.sp) // Large font size
>>>>>>> main
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
<<<<<<< HEAD
fun ColorScreen(
    navController: NavController, colorName: String,
    colorValue: Long
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(stringResource(R.string.app_name))
                        },
                navigationIcon = {
                    IconButton(onClick = {
                        navController.navigateUp()
                    }) {
                        Icon(
                            Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                },
=======
fun ColorScreen(navController: NavController, colorName: String, colorValue: Long) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = Modifier.fillMaxWidth(),
                title = {
                        Text(colorName)
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                    }
                }
>>>>>>> main
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(Color(colorValue)),
            contentAlignment = Alignment.Center
        ) {
<<<<<<< HEAD
            Text(text = "$colorName SCREEN", fontSize = 24.sp)
=======
            Text(text = "$colorName Screen", color = Color(colorValue))
>>>>>>> main
        }
    }
}
