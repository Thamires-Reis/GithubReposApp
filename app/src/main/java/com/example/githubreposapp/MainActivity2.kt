package com.example.githubreposapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import model.Users
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import okhttp3.*
import java.io.IOException

//const val MAIN2_ACT_KEY = "SecondActivity"
//var users: Array<User> = emptyArray()
class MainActivity2 : AppCompatActivity() {
    //private lateinit var activity_main_view: UsersAdapter



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getData()
    }

    fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance("https://jsonplaceholder.typicode.com")

        val endpoint = retrofitClient.create(Endpoint::class.java)
        val callback = endpoint.getUsers()

        callback.enqueue(object : Callback<List<Users>> {
            override fun onFailure(call: Call<List<Users>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Users>>, response: Response<List<Users>>) {
                response.body()?.forEach {


                //textView.text = textView.text.toString().plus(it.body)
                }
            }
        })

    }
}