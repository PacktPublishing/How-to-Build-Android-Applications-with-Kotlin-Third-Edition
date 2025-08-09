package com.example.standardactivity

import android.R.id.message
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.standardactivity.ui.theme.StandardActivityTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val username = intent.getStringExtra(USERNAME_KEY)
        val password = intent.getStringExtra(PASSWORD_KEY)

        setContent {
            StandardActivityTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()) { innerPadding ->
                    val message = if (
                        username == "username" &&
                        password == "password"
                    ) {
                        "Welcome, $username!"
                    } else {
                        "Login failed. Please try again."
                        }
                        Box(
                            Modifier
                                .fillMaxSize()
                                .padding(innerPadding),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = message,
                                modifier = Modifier.padding(16.dp)
                            )
                        }
                    }
            }
        }
    }
}
