package com.pablogonzalezpatarro.superheroapi

import android.os.Parcelable
import com.pablogonzalezpatarro.superheroapi.data.Powerstats
import kotlinx.parcelize.Parcelize

//Hacemos Hero parcelable para poder enviarlo en la navegación.
@Parcelize
data class Hero (val id:String?,
                 val nombre:String?,
                 val genero:String?,
                 val imagen:String?,
                 val estadísticas: Powerstats?
                 ):Parcelable{}
