package com.pablogonzalezpatarro.superheroapi.data

import com.google.gson.annotations.SerializedName

data class Appearance(
    @SerializedName("eye-color") val eye_color: String,
    val gender: String,
    @SerializedName("hair-color") val hair_color: String,
    val height: List<String>,
    val race: String,
    val weight: List<String>
)