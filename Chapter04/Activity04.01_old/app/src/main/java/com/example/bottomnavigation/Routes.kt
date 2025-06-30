package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector


@Serializable
sealed class AppDestination(val label: String) {
    @Serializable
    data object Home: AppDestination("Home")

    @Serializable
    data object Calendar: AppDestination("Cart")

    @Serializable
    data object Profile: AppDestination("Profile")

    @Serializable
    data object MySports: AppDestination("MySports")

}

sealed class AppBottomNavigation(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: AppDestination
) {
    data object Home : AppBottomNavigation(
        "Home",
        Icons.Filled.Home,
        Icons.Outlined.Home,
        AppDestination.Home
    )
    data object Calendar : AppBottomNavigation(
        "Calendar",
        Icons.Filled.DateRange,
        Icons.Outlined.DateRange,
        AppDestination.Calendar
    )
    data object Profile : AppBottomNavigation(
        "Calendar",
        Icons.Filled.Person,
        Icons.Outlined.Person,
        AppDestination.Calendar
    )
    data object MySports : AppBottomNavigation(
        "Bin",
        Icons.Filled.Star,
        Icons.Outlined.Star,
        AppDestination.MySports
    )
}

