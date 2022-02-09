package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface MainAPI {
    @GET("list.php")
    fun getUrlImage(): Call<MutableList<URLImage>>

// suspend fun getURL():List<URLImage>
}