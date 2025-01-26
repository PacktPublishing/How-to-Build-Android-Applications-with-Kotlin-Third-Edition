package com.example.bottomnavigation

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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.bottomnavigation.SportsScreen
import com.example.bottomnavigation.ui.theme.BottomNavigationTheme

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
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        SportButton(route = SportsItem.Football.route, navController)
        Spacer(modifier = Modifier.height(12.dp))
        SportButton(route = SportsItem.Hockey.route, navController)
        Spacer(modifier = Modifier.height(12.dp))
        SportButton(route = SportsItem.Baseball.route, navController)
    }
}

@Composable
fun SportButton(route: String, navController: NavHostController) {
    OutlinedButton(
        onClick = { navController.navigate(route)},
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
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
    ) {
        Text(
            text = route,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSportsScreen() {
    BottomNavigationTheme {
        SportsScreen(navController = NavHostController(LocalContext.current))
    }
}