package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ParrotBird : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity4_parrot_bird)
        val prevbtn3 = findViewById<ImageView>(R.id.btnPrev3)
        val nextbtn4 = findViewById<ImageView>(R.id.btnNext4)
        prevbtn3.setOnClickListener {
            finish()
        }
        nextbtn4.setOnClickListener{
            val intent = Intent(this,activity5_weaver_bird::class.java)
            startActivity(intent)

        }
    }
}