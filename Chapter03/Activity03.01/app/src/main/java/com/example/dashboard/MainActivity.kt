package com.example.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dashboard.ui.theme.DashboardTheme

const val TOTAL_SALES = "Total Sales"
const val ACTIVE_USERS = "Active Users"
const val CONVERSION_RATE = "Conversion Rate"
const val REVENUE_GROWTH = "Revenue Growth"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            var selectedItem by remember {mutableStateOf("None") }

            DashboardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize().padding(innerPadding),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "Business Dashboard",
                        fontWeight = FontWeight.Bold,
                        fontSize = 22.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(bottom = 16.dp)
                        )

                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            DashboardTile(TOTAL_SALES, selectedItem) { selectedItem =
                                TOTAL_SALES }
                            DashboardTile(ACTIVE_USERS, selectedItem) {
                                selectedItem = ACTIVE_USERS
                            }
                        }
                        Spacer(modifier = Modifier.height(14.dp))
                        Row(
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            DashboardTile(CONVERSION_RATE, selectedItem) {
                                selectedItem = CONVERSION_RATE
                            }
                            DashboardTile(REVENUE_GROWTH, selectedItem) {
                                selectedItem = REVENUE_GROWTH
                            }
                        }
                        Surface(
                            shape = RoundedCornerShape(12.dp),
                            color = Color.LightGray,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(34.dp)
                                .height(150.dp)
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                DetailedStatistics(
                                    selectedItem = selectedItem
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}