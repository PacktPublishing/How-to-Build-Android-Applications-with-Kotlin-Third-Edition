package com.example.dashboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DashboardTile(
    title: String,
    selectedItem: String,
    onClick: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(12.dp),
        shadowElevation = 4.dp,
        color = if (selectedItem == title)
            Color(0xFFBBDEFB) else Color.White,
        modifier = Modifier
            .size(150.dp)
            .clickable { onClick() }
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment =
                Alignment.CenterHorizontally,
            modifier = Modifier.padding(8.dp)
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Composable
fun DetailedStatistics(selectedItem: String) {
    when (selectedItem) {
        TOTAL_SALES -> {
            Column(
                horizontalAlignment =
                    Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Total Sales Breakdown",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Text(
                    text = "Online Sales: $8,000",
                    fontSize = 16.sp
                )
                Text(
                    text = "In-store Sales: $4,000",
                    fontSize = 16.sp
                )
                Text(
                    text =
                        "Year-over-Year Growth: +10%",
                    fontSize = 16.sp
                )
            }
        }

        ACTIVE_USERS -> {
            Column(
                horizontalAlignment =
                    Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Active Users Breakdown",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Text(
                    text =
                        "Daily Active Users: 1,500",
                    fontSize = 16.sp
                )
                Text(
                    text =
                        "Monthly Active Users: 2,400",
                    fontSize = 16.sp
                )
                Text(
                    text = "User Retention: 75%",
                    fontSize = 16.sp
                )
            }
        }

        CONVERSION_RATE -> {
            Column(
                horizontalAlignment =
                    Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Conversion Rate Details",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Text(
                    text = "Website Conversion: 4.8%",
                    fontSize = 16.sp
                )
                Text(
                    text = "App Conversion: 6.2%",
                    fontSize = 16.sp
                )
                Text(
                    text = "Overall Conversion: 5.4%",
                    fontSize = 16.sp
                )
            }
        }

        REVENUE_GROWTH -> {
            Column(
                horizontalAlignment =
                    Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Revenue Growth Overview",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Spacer(
                    modifier = Modifier
                        .height(8.dp)
                )
                Text(
                    text = "Last Month: +7.8%",
                    fontSize = 16.sp
                )
                Text(
                    text = "Last Quarter: +8.2%",
                    fontSize = 16.sp
                )
                Text(
                    text = "Year-to-Date: +15.5%",
                    fontSize = 16.sp
                )
            }
        }

        else -> {
            Text(
                text =
                    "Select an item to view details",
                fontSize = 16.sp
            )
        }
    }
}



