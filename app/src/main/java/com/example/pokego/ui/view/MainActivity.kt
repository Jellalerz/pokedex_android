package com.example.pokego.ui.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pokego.data.model.Pokemon
import com.example.pokego.ui.pokelist.PokemonItem
import com.example.pokego.ui.viewmodel.MainViewModel
import com.example.pokego.ui.theme.PokegoTheme

class MainActivity : ComponentActivity() {
    val mainViewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokegoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    //Greeting("Android")
                    pokemonList(pokemonList = mainViewModel.pokemonListResponse)

                    Column(
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally) {

                        Button(onClick = {mainViewModel.getPokemon()})
                        {
                            Text(text = "GET KANTO DATA!")

                        }



                    }


                }
            }
        }
    }
}


@Composable
fun pokemonList(

    pokemonList:List<Pokemon>
){
    LazyColumn{
        itemsIndexed(pokemonList){index, item ->
            PokemonItem(pokemon = item)
        }
    }
}
