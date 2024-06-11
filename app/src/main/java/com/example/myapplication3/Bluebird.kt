package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bluebird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity1_bluebird)
        val btnNext = findViewById<ImageView>(R.id.btnNext)
        btnNext.setOnClickListener{
            val intent = Intent(this,eagleBirdactivity3::class.java)
            startActivity(intent)

        }
    }
}