package com.pablogonzalezpatarro.superheroapi.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Powerstats(
    val combat: String,
    val durability: String,
    val intelligence: String,
    val power: String,
    val speed: String,
    val strength: String
):Parcelable