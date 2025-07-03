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
import com.example.mysports.Destination.CalendarDestination
import com.example.mysports.Destination.HomeDestination
import com.example.mysports.Destination.ProfileDestination
import kotlinx.serialization.Serializable


@Serializable
sealed class Destination(val label: String) {

    @Serializable
    data object HomeDestination: Destination("Home")

    @Serializable
    data object CalendarDestination: Destination("Calendar")

    @Serializable
    data object ProfileDestination: Destination("Profile")

    @Serializable
    data object MySportsDestination: Destination("Profile")

    @Serializable
    data class MySportItemDestination(val name: String): Destination(name)
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
        HomeDestination
    )
    data object Calendar : BottomNavigation(
        "Calendar",
        Icons.Filled.DateRange,
        Icons.Outlined.DateRange,
        CalendarDestination
    )
    data object Profile : BottomNavigation(
        "Profile",
        Icons.Filled.Person,
        Icons.Outlined.Person,
        ProfileDestination
    )
    data object MySports : BottomNavigation(
        "My Sports",
        Icons.Filled.Star,
        Icons.Outlined.Star,
        Destination.MySportsDestination
    )
}

