package com.example.registerforactivityresult

import android.R.id.message
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.registerforactivityresult.ui.theme.RegisterForActivityResultTheme

class LoginActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val username = intent.getStringExtra(USERNAME_KEY)
        val password = intent.getStringExtra(PASSWORD_KEY)

        val loginResult = (
                username == "username" &&
                        password == "password"
                )
        val resultIntent = Intent().apply {
            putExtra(LOGIN_RESULT, loginResult)
        }
        setResult(RESULT_OK, resultIntent)
        finish()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RegisterForActivityResultTheme {
        Greeting("Android")
    }
}