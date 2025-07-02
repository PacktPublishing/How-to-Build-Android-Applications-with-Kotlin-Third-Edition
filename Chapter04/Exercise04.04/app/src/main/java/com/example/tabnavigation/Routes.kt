package com.example.tabnavigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination(val label: String,) {
    @Serializable
    data object TopStories : Destination("Top Stories")

    @Serializable
    data object UKNews : Destination("UK News")

    @Serializable
    data object Politics : Destination("Politics")

    @Serializable
    data object Business : Destination("Business")

    @Serializable
    data object WorldNews : Destination("World News")

    @Serializable
    data object Sport : Destination("Sport")

    @Serializable
    data object Other : Destination("Other")
}

sealed class TabNavigation(val label: String, val route: Destination) {
    data object TopStories : TabNavigation("Top Stories",  Destination.TopStories )
    data object UKNews : TabNavigation("UK News",  Destination.UKNews )
    data object Politics : TabNavigation("Politics",  Destination.Politics )
    data object Business : TabNavigation("Business",  Destination.Business )
    data object WorldNews : TabNavigation("World News",  Destination.WorldNews )
    data object Sport : TabNavigation("Sport",  Destination.Sport )
    data object Other : TabNavigation("Other",  Destination.Other )
}
