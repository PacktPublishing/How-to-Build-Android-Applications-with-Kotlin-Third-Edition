package com.example.simplenavigation

import kotlinx.serialization.Serializable

@Serializable
data object HomeRoute

@Serializable
data class ColorRoute(val colorName: String, val colorHexidecimal: String)
