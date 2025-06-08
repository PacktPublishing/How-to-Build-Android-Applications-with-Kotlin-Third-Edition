package com.example.navigationdrawer

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable
sealed class Route(val name: String, @Contextual val icon: ImageVector) {

    @Serializable
    object Home : Route("Home", Icons.Default.Home)

    @Serializable
    object Shopping : Route("Cart", Icons.Default.ShoppingCart)

    @Serializable
    object Favorites : Route("Favorites", Icons.Default.Favorite)

    @Serializable
    object Calendar : Route("Calendar", Icons.Default.DateRange)

    @Serializable
    object Bin : Route("Bin", Icons.Default.Delete)
}