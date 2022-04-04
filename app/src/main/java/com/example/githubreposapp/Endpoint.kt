package com.example.githubreposapp
import model.Users
import retrofit2.Call

import retrofit2.http.GET

interface Endpoint {


    @GET("users")



    fun getUsers() : Call<List<Users>>
}
