package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface MainAPI {
    @GET("list.php")
    suspend fun getURL():List<URLImage>
//    fun getUrlImage(): Call<MutableList<URLImage>>


}