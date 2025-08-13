package com.example.navigationdrawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Serializable

@Serializable
sealed class Destination(val label: String) {
    @Serializable
    data object Home : Destination("Home")

    @Serializable
    data object Shopping : Destination("Cart")

    @Serializable
    data object Favorites : Destination("Favorites")

    @Serializable
    data object Calendar : Destination("Calendar")

    @Serializable
    data object Bin : Destination("Bin")
}

sealed class NavigationDrawer(
    val label: String, val selectedIcon:
    ImageVector, val unselectedIcon: ImageVector, val route:
    Destination
) {
    data object Home : NavigationDrawer(
        "Home", Icons.Filled.Home,
        Icons.Outlined.Home, Destination.Home
    )

    data object Shopping : NavigationDrawer(
        "Cart",
        Icons.Filled.ShoppingCart, Icons.Outlined.ShoppingCart,
        Destination.Shopping
    )

    data object Favorites : NavigationDrawer(
        "Favorites",
        Icons.Filled.Favorite, Icons.Outlined.FavoriteBorder,
        Destination.Favorites
    )

    data object Calendar : NavigationDrawer(
        "Calendar",
        Icons.Filled.DateRange, Icons.Outlined.DateRange,
        Destination.Calendar
    )

    data object Bin : NavigationDrawer(
        "Bin", Icons.Filled.Delete,
        Icons.Outlined.Delete, Destination.Bin
    )
}
