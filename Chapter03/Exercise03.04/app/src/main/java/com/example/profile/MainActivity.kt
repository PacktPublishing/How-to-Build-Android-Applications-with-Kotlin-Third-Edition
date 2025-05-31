package com.example.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.ui.theme.ProfileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ProfileTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Profile(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }

    }
}


@Composable
fun Profile(modifier: Modifier) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 8.dp,
        color = Color.White
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {

            Box (modifier = Modifier.size(116.dp)) {

                Image(
                    // Replace with your image resource
                    painter = painterResource(id = R.drawable.cat),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Inside,
                    modifier = Modifier
                        .padding(16.dp)
                        .size(100.dp)
                        .clip(RoundedCornerShape(50.dp))
                )

                Card(
                    onClick = {/**/},
                    modifier = Modifier.align(BottomEnd),
                    border = BorderStroke(
                        1.dp, SolidColor(Color.Blue))
                ) {
                    Text(
                        text = "Edit",
                        modifier = Modifier.padding(horizontal = 4.dp),
                        fontSize = 12.sp)

                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Jane Doe",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 16.dp)
            )
            Text(
                text = "Mobile Developer | Tech Enthusiast",
                fontSize = 16.sp,
                color = Color.Gray,
                modifier = Modifier.padding(vertical = 16.dp)
            )

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(onClick = { /* TODO: Add follow action */ }) {
                    Text(text = "Follow")
                }
                Button(onClick = { /* TODO: Add message action */ }) {
                    Text(text = "Message")
                }
            }





        }



    }


}

@Preview(showBackground = true)
@Composable
fun ProfilePreview() {
    Profile(modifier = Modifier.padding(20.dp))
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
    ProfileTheme {
        Greeting("Android")
    }
}