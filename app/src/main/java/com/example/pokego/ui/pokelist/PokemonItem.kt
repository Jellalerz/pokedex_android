package com.example.pokego.ui.pokelist

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import coil.size.Scale
import coil.transform.CircleCropTransformation
import com.example.pokego.data.model.Pokemon

@Composable
fun PokemonItem(pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .padding(8.dp, 5.dp)
            .fillMaxWidth()
            .height(100.dp,)
        ,
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color(0xFF6200EE),
    ) {
        Image(
            painter = rememberImagePainter(
                data = pokemon.img.replace("http","https"),
                builder = {
                    scale(Scale.FILL)
                    transformations(CircleCropTransformation())
                }),
            contentDescription ="desc",
            modifier = Modifier.fillMaxHeight()
        )
        Text(text = pokemon.iDPokemon.toString(), modifier = Modifier
            .padding(10.dp)
            , fontSize = 20.sp)

        Text(text = pokemon.pokemon, modifier = Modifier
            .padding(40.dp), fontSize = 18.sp

        )
}
}