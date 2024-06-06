package com.example.myrecipeapp

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

// Define the API endpoint
interface APIServices {
    @GET("categories.php")
    suspend fun getCategories():CategoriesResponse
}

// Create a Retrofit instance
private val retrofit = Retrofit.Builder()
    .baseUrl("https://www.themealdb.com/api/json/v1/1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

// Create an API service instance
val apiServices = retrofit.create(APIServices::class.java)
