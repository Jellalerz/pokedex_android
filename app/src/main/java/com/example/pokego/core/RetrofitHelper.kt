package com.example.pokego.core

import com.example.pokego.data.network.ApiClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

        var apiClient: ApiClient? = null

    fun getInstance(): ApiClient {
            if (apiClient == null){
                apiClient = Retrofit.Builder()
                    .baseUrl("https://firstsparklybook70.conveyor.cloud/api/")
                    .addConverterFactory(GsonConverterFactory.create()).
                    build().create(ApiClient::class.java)
            }
            return apiClient!!

        }      }
