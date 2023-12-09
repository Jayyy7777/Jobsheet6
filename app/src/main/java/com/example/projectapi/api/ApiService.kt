package com.example.projectapi.api

import com.example.projectapi.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>
}