package com.packt.android.api

import com.google.gson.annotations.SerializedName

data class Dog(
    @SerializedName("status") val status: String,
    @SerializedName("message") val urls: List<String>
)