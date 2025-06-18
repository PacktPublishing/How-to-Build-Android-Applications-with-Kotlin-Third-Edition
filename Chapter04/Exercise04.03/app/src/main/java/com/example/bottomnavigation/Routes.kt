package com.example.bottomnavigation

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
sealed interface AppRoute {
    val route: String
    val selectedIcon: ImageVector
    val unselectedIcon: ImageVector
    val label: String

    @Serializable
    object Home : AppRoute {
        override val route = "home"
        override val selectedIcon = Icons.Filled.Home
        override val unselectedIcon = Icons.Outlined.Home
        override val label = "Home"
    }

    @Serializable
    object Shopping : AppRoute {
        override val route = "shopping"
        override val selectedIcon = Icons.Filled.ShoppingCart
        override val unselectedIcon = Icons.Outlined.ShoppingCart
        override val label = "Cart"
    }

    @Serializable
    object Favorites : AppRoute {
        override val route = "favorites"
        override val selectedIcon = Icons.Filled.Favorite
        override val unselectedIcon = Icons.Outlined.FavoriteBorder
        override val label = "Favorites"
    }

    @Serializable
    object Calendar : AppRoute {
        override val route = "calendar"
        override val selectedIcon = Icons.Filled.DateRange
        override val unselectedIcon = Icons.Outlined.DateRange
        override val label = "Calendar"
    }

    @Serializable
    object Bin : AppRoute {
        override val route = "bin"
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Bin"
    }
}

