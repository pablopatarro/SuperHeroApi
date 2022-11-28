package com.pablogonzalezpatarro.superheroapi.model

import com.pablogonzalezpatarro.superheroapi.data.*

data class HeroResult(
    val appearance: Appearance,
    val biography: Biography,
    val connections: Connections,
    val id: String,
    val image: Image,
    val name: String,
    val powerstats: Powerstats,
    val response: String,
    val work: Work
)