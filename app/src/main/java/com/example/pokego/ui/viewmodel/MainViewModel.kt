package com.example.pokego.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokego.core.RetrofitHelper
import com.example.pokego.data.model.Pokemon
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    var pokemonListResponse:List<Pokemon> by mutableStateOf(listOf())

    fun getPokemon(){
        viewModelScope.launch {
            val apiService = RetrofitHelper.getInstance()
            try {
                val pokemonList = apiService.getPokemon()
                pokemonListResponse = pokemonList

            }catch (e:Exception){
                println (e)
            }
        }
    }

}