package com.example.pokego.data.network

import com.example.pokego.data.model.MyData
import retrofit2.http.GET

interface ApiClient {

    @GET("Pokemon")
    suspend fun getPokemon(): MyData

}