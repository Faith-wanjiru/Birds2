package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.ImageFilterView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        val btnNext5 = findViewById<ImageView>(R.id.btnNext5)
        btnNext5.setOnClickListener{
            var intent = Intent(this,Bluebird::class.java)
            startActivity((intent))
        }


    }
}