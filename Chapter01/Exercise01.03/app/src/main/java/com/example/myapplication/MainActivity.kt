package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val webView = WebView(this)
            webView.settings.javaScriptEnabled = true
            webView.loadUrl("https://www.google.com")
            AndroidView(
                modifier = Modifier.fillMaxSize(),
                factory = { context ->
                    webView
                }
            )
        }
    }
}

@Composable
fun Greeting(
    name: String, modifier: Modifier = Modifier
) {
    Text(
        style = MaterialTheme.typography.displayLarge,
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}