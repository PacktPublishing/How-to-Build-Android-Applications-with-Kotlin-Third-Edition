<<<<<<< HEAD
=======
// Sealed class to define the app routes without any parameters
>>>>>>> main
package com.example.simplenavigation

import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data class Color(val name: String, val value: Long)