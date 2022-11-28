package com.pablogonzalezpatarro.superheroapi.data

import com.google.gson.annotations.SerializedName

data class Biography(
    val aliases: List<String>,
    val alignment: String,
    @SerializedName("alter-egos") val alter_egos: String,
    @SerializedName("first-appearance")val first_appearance: String,
    @SerializedName("full-name")val full_name: String,
    @SerializedName("place-of-birth")val place_of_birth: String,
    val publisher: String
)