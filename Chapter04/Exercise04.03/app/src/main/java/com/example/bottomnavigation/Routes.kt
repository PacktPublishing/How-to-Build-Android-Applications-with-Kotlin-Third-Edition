// nav/AppRoute.kt
package com.example.bottomnavigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import kotlinx.serialization.Serializable

sealed interface Route {
    val selectedIcon: ImageVector
    val unselectedIcon: ImageVector
    val label: String
    val badgeCount: Int

    @Serializable
    object Home : Route {
        override val selectedIcon = Icons.Filled.Home
        override val unselectedIcon = Icons.Outlined.Home
        override val label = "Home"
        override val badgeCount = 0
    }

    @Serializable
    object Shopping : Route {
        override val selectedIcon = Icons.Filled.ShoppingCart
        override val unselectedIcon = Icons.Outlined.ShoppingCart
        override val label = "Cart"
        override val badgeCount = 0
    }

    @Serializable
    object Favorites : Route {
        override val selectedIcon = Icons.Filled.Favorite
        override val unselectedIcon = Icons.Outlined.FavoriteBorder
        override val label = "Favorites"
        override val badgeCount = 0
    }

    @Serializable
    object Calendar : Route {
        override val selectedIcon = Icons.Filled.DateRange
        override val unselectedIcon = Icons.Outlined.DateRange
        override val label = "Calendar"
        override val badgeCount = 1
    }

    @Serializable
    object Bin : Route {
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Bin"
        override val badgeCount = 0
    }
}
