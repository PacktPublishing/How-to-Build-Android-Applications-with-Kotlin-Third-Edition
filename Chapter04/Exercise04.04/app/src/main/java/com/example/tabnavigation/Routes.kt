package com.example.tabnavigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import kotlinx.serialization.Serializable

sealed interface Route {
    val selectedIcon: ImageVector
    val unselectedIcon: ImageVector
    val label: String

    @Serializable
    object TopStories : Route {
        override val selectedIcon = Icons.Filled.Home
        override val unselectedIcon = Icons.Outlined.Home
        override val label = "Top Stories"
    }

    @Serializable
    object UKNews : Route {
        override val selectedIcon = Icons.Filled.ShoppingCart
        override val unselectedIcon = Icons.Outlined.ShoppingCart
        override val label = "UK News"
    }

    @Serializable
    object Politics : Route {
        override val selectedIcon = Icons.Filled.Favorite
        override val unselectedIcon = Icons.Outlined.FavoriteBorder
        override val label = "Politics"
    }

    @Serializable
    object WorldNews : Route {
        override val selectedIcon = Icons.Filled.DateRange
        override val unselectedIcon = Icons.Outlined.DateRange
        override val label = "World News"
    }

    @Serializable
    object Business : Route {
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Business"
    }

    @Serializable
    object Sport : Route {
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Sport"
    }

    @Serializable
    object Other : Route {
        override val selectedIcon = Icons.Filled.Delete
        override val unselectedIcon = Icons.Outlined.Delete
        override val label = "Other"
    }
}
