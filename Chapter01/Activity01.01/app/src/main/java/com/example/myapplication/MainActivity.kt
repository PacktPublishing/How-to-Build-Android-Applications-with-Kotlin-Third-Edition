package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                modifier = Modifier.fillMaxSize()
            ) { innerPadding ->
                Column(
                    horizontalAlignment =
                        Alignment.CenterHorizontally,
                    verticalArrangement =
                        Arrangement.spacedBy(16.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .padding(16.dp)
                ) {
                    Text("RGB Color Creator", fontSize = 24.sp)

                    Text("Add two hexadecimal characters between 0-9, " +
                            "A-F or a-f without the '#' for each channel")

                    var redChannel by remember { mutableStateOf("") }
                    var greenChannel by remember { mutableStateOf("") }
                    var blueChannel by remember { mutableStateOf("") }
                    var colorToDisplay by remember {  mutableStateOf(Color.White)
                    }

                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = redChannel,
                        onValueChange = { redChannel = it },
                        label = { Text("Red Channel") }
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = greenChannel,
                        onValueChange = { greenChannel = it },
                        label = { Text("Green Channel") }
                    )
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = blueChannel,
                        onValueChange = { blueChannel = it },
                        label = { Text("Blue Channel") }
                    )


                    Button(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = {
                            if (isValidHexInput(
                                    redChannel
                                ) && isValidHexInput(
                                    greenChannel
                                ) && isValidHexInput(
                                    blueChannel
                                )
                            ) {
                                val colorString =
                                "#$redChannel$greenChannel$blueChannel"
                                colorToDisplay =
                                    Color(colorString.toColorInt())
                            }
                        }) {
                        Text("CREATE COLOR")
                    }
                    Text(
                        modifier = Modifier.background(colorToDisplay).padding(24.dp),
                        text = "Created color display panel"
                    )
                }
            }
        }
    }
}

fun isValidHexInput(input: String): Boolean {
    return input.filter {
        it in '0'..'9' ||
        it in 'A'..'F' ||
        it in 'a'..'f'
    }.length == 2
}