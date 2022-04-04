package com.example.githubreposapp

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.githubreposapp.databinding.ActivityHomeBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        setupTextInputLayout()
    }

    private fun setupTextInputLayout() {
        binding.floatingActionButton.setOnClickListener {
            val user = binding.user.text.toString()

            if (binding.user.text.toString().isNotEmpty()) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("Username", binding.user.text?.toString())
                startActivity(intent)
            } else {
                Toast.makeText(
                    applicationContext,
                    "Enter an user name ",
                    Toast.LENGTH_SHORT
                )
                    .show()

            }
        }
    }
}
