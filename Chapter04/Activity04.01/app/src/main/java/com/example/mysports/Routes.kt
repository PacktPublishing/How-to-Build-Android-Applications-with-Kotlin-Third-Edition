package com.example.mysports

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
import kotlinx.serialization.Serializable


@Serializable
sealed class Destination(val label: String) {

    @Serializable
    data object Home: Destination("Home")

    @Serializable
    data object Calendar: Destination("Calendar")

    @Serializable
    data object Profile: Destination("Profile")

    @Serializable
    data object MySports: Destination("Profile")

    @Serializable
    data class MySportItem(val name: String): Destination(name)
}

sealed class BottomNavigation(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: Destination
) {
    data object Home : BottomNavigation(
        "Home",
        Icons.Filled.Home,
        Icons.Outlined.Home,
        Destination.Home
    )
    data object Calendar : BottomNavigation(
        "Calendar",
        Icons.Filled.DateRange,
        Icons.Outlined.DateRange,
        Destination.Calendar
    )
    data object Profile : BottomNavigation(
        "Profile",
        Icons.Filled.Person,
        Icons.Outlined.Person,
        Destination.Profile
    )
    data object MySports : BottomNavigation(
        "My Sports",
        Icons.Filled.Star,
        Icons.Outlined.Star,
        Destination.MySports
    )
}

