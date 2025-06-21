// nav/AppRoute.kt
package com.example.bottomnavigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import kotlinx.serialization.Serializable

sealed interface AppRoute {
    val route: String
    val selectedIcon: ImageVector
    val unselectedIcon: ImageVector
    val label: String
    val badgeCount: Int

    @Serializable
    object Home : AppRoute {
        override val route = "home"
        override val selectedIcon = Icons.Filled.Home
        override val unselectedIcon = Icons.Outlined.Home
        override val label = "Home"
        override val badgeCount = 0
    }

    @Serializable
    object Shopping : AppRoute {
        override val route = "shopping"
        override val selectedIcon = Icons.Filled.ShoppingCart
        override val unselectedIcon = Icons.Outlined.ShoppingCart
        override val label = "Cart"
        override val badgeCount = 3
    }

    @Serializable
    object Favorites : AppRoute {
        override val route = "favorites"
        override val selectedIcon = Icons.Filled.Favorite
        override val unselectedIcon = Icons.Outlined.FavoriteBorder
        override val label = "Favorites"
        override val badgeCount = 2
    }

    @Serializable
    object Calendar : AppRoute {
        override val route = "calendar"
        override val selectedIcon = Icons.Filled.DateRange
        override val unselectedIcon = Icons.Outlined.DateRange
        override val label = "Calendar"
        override val badgeCount = 1
    }

    @Serializable
    object Bin : AppRoute {
        override val route = "bin"
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Bin"
        override val badgeCount = 5
    }

    companion object {
        val all = listOf(Home, Shopping, Favorites, Calendar, Bin)
    }
}
