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
sealed class Destinations(val label: String) {
    @Serializable
    data object Home : Destinations("Home")

    @Serializable
    data object Shopping : Destinations("Cart")

    @Serializable
    data object Favorites : Destinations("Favorites")

    @Serializable
    data object Calendar : Destinations("Calendar")

    @Serializable
    data object Bin : Destinations("Bin")
}

sealed class BottomNavigation(val label: String, val selectedIcon: ImageVector, val unselectedIcon: ImageVector, val  badgeCount: Int, val route: Destinations) {
    data object Home : BottomNavigation("Home", Icons.Filled.Home, Icons.Outlined.Home, 0, Destinations.Home )
    data object Shopping : BottomNavigation("Cart", Icons.Filled.ShoppingCart, Icons.Outlined.ShoppingCart, 0, Destinations.Shopping )
    data object Favorites : BottomNavigation("Favorites", Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder,0, Destinations.Favorites )
    data object Calendar : BottomNavigation("Calendar", Icons.Filled.DateRange, Icons.Outlined.DateRange,1, Destinations.Calendar )
    data object Bin : BottomNavigation("Bin", Icons.Filled.Delete, Icons.Outlined.Delete, 0, Destinations.Bin )
}