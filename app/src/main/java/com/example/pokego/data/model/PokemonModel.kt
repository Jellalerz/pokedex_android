package com.example.pokego.data.model

import com.google.gson.annotations.SerializedName

class Pokemon(
    @SerializedName("attack")
    val attack: Int,
    @SerializedName("defense")
    val defense: Int,
    @SerializedName("hp")
    val hp: Int,
    @SerializedName("iD_Pokemon")
    val iDPokemon: Int,
    @SerializedName("pokemon")
    val pokemon: String,
    @SerializedName("special_Attack")
    val specialAttack: Int,
    @SerializedName("special_Defense")
    val specialDefense: Int,
    @SerializedName("speed")
    val speed: Int,
    @SerializedName("img")
    val img: String
)