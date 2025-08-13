package com.example.mysports

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun ContentScreen(route: String) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(route, fontSize = 28.sp)
    }
}

@Composable
fun SportsScreen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(16.dp)
    ) {
        SportButton(navController, "Football")
        Spacer(modifier = Modifier.height(12.dp))
        SportButton(navController, "Hockey")
        Spacer(modifier = Modifier.height(12.dp))
        SportButton(navController, "Basketball")
    }
}

@Composable
fun SportButton(navController: NavHostController, name: String) {
    OutlinedButton(
<<<<<<< HEAD
        onClick = {
            navController.navigate(Destination.MySportItem(name))},
=======
        onClick = { navController.navigate(Destination.MySportItem(name))},
>>>>>>> main
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        shape = RoundedCornerShape(12.dp),
        border = ButtonDefaults.outlinedButtonBorder,
        colors = ButtonDefaults.run {
            outlinedButtonColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            )
        },
<<<<<<< HEAD
        elevation = ButtonDefaults.buttonElevation(defaultElevation
        = 2.dp)
=======
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
>>>>>>> main
    ) {
        Text(
            text = name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> main
