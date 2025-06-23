package com.example.tabnavigation

import kotlinx.serialization.Serializable


@Serializable
sealed class Destinations(val label: String,) {
    @Serializable
    data object TopStories : Destinations("Top Stories")

    @Serializable
    data object UKNews : Destinations("UK News")

    @Serializable
    data object Politics : Destinations("Politics")

    @Serializable
    data object WorldNews : Destinations("World News")

    @Serializable
    data object Business : Destinations("Business")

    @Serializable
    data object Sport : Destinations("Sport")

    @Serializable
    data object Other : Destinations("Other")
}

sealed class TabNavigation(val label: String, val route: Destinations) {
    data object TopStories : TabNavigation("Top Stories",  Destinations.TopStories )
    data object UKNews : TabNavigation("UK News",  Destinations.UKNews )
    data object Politics : TabNavigation("Politics",  Destinations.Politics )
    data object WorldNews : TabNavigation("World News",  Destinations.WorldNews )
    data object Business : TabNavigation("Business",  Destinations.Business )
    data object Sport : TabNavigation("Sport",  Destinations.Sport )
    data object Other : TabNavigation("Other",  Destinations.Other )
}
