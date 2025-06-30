package com.example.mysports

import android.R.attr.name
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
import com.example.mysports.AppRoute.CalendarAppRoute
import com.example.mysports.AppRoute.HomeAppRoute
import com.example.mysports.AppRoute.ProfileAppRoute
import kotlinx.serialization.Serializable


@Serializable
sealed class AppRoute(val label: String) {

    @Serializable
    data object HomeAppRoute: AppRoute("Home")

    @Serializable
    data object CalendarAppRoute: AppRoute("Calendar")

    @Serializable
    data object ProfileAppRoute: AppRoute("Profile")

    @Serializable
    data object MySportsAppRoute: AppRoute("Profile")

    @Serializable
    data class MySportItemAppRoute(val name: String): AppRoute(name)
}

sealed class AppBottomNavigation(
    val label: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val route: AppRoute
) {
    data object Home : AppBottomNavigation(
        "Home",
        Icons.Filled.Home,
        Icons.Outlined.Home,
        HomeAppRoute
    )
    data object Calendar : AppBottomNavigation(
        "Calendar",
        Icons.Filled.DateRange,
        Icons.Outlined.DateRange,
        CalendarAppRoute
    )
    data object Profile : AppBottomNavigation(
        "Profile",
        Icons.Filled.Person,
        Icons.Outlined.Person,
        ProfileAppRoute
    )
    data object MySports : AppBottomNavigation(
        "My Sports",
        Icons.Filled.Star,
        Icons.Outlined.Star,
        AppRoute.MySportsAppRoute
    )
}

