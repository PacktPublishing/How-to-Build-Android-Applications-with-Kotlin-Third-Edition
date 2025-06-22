// nav/AppRoute.kt
package com.example.bottomnavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

@Serializable
sealed class Destinations(
    open val label: String,
    open val badgeCount: Int
) {
    @Serializable
    data object Home : Destinations("Home", 0)

    @Serializable
    data object Shopping : Destinations("Cart", 0)

    @Serializable
    data object Favorites : Destinations("Favorites", 0)

    @Serializable
    data object Calendar : Destinations("Calendar", 1)

    @Serializable
    data object Bin : Destinations("Bin", 0)
}


sealed class BottomNavigation(val label: String, val selectedIcon: ImageVector, val unselectedIcon: ImageVector, val route: Destinations) {
    data object Home : BottomNavigation("Home", Icons.Filled.Home, Icons.Outlined.Home, Destinations.Home )
    data object Shopping : BottomNavigation("Cart", Icons.Filled.ShoppingCart, Icons.Outlined.ShoppingCart, Destinations.Shopping )
    data object Favorites : BottomNavigation("Favorites", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder, Destinations.Favorites )
    data object Calendar : BottomNavigation("Calendar", Icons.Filled.DateRange, Icons.Outlined.DateRange, Destinations.Calendar )
    data object Bin : BottomNavigation("Bin", Icons.Filled.Delete, Icons.Outlined.Delete, Destinations.Bin )
}