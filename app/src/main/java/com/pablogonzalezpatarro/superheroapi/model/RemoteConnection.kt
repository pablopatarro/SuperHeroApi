package com.pablogonzalezpatarro.superheroapi.model


import com.pablogonzalezpatarro.superheroapi.Hero
import com.pablogonzalezpatarro.superheroapi.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RemoteConnection {

    //Construimos una instancia de retrofit. Enviamos la url base y la apikey en este momento
    // por claridad de código.
    private val builder: Retrofit = Retrofit.Builder()
        .baseUrl("https://superheroapi.com/api/${R.string.api_key}/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
     suspend fun result(id: String):HeroResult = builder.create(ApiService::class.java).getHeroById(id)





    //Creamos una función que recibe un parámetro para cada llamada a la api.
    //Dentro de esta función hacemos la corrutina.
    fun searchById(id:String): Hero {
        //Me devuelve null a todas las llamadas.
        var resHero: HeroResult? = null
        CoroutineScope(Dispatchers.IO).launch {
           resHero = builder.create(ApiService::class.java).getHeroById(id)

        }

        //Creamos el objeto de la clase Hero y lo devolvemos.
        //Hacemos este paso aquí por comodidad.
        return Hero(resHero?.id,
            resHero?.name,
            resHero?.appearance?.gender,
            resHero?.image?.url,
            resHero?.powerstats)

    }
}