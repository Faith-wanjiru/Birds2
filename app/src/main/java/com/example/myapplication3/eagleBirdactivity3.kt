package com.example.myapplication3

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class eagleBirdactivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2_eagle_birdactivity3)
      val btnPrev = findViewById<ImageView>(R.id.btnPrev)
        val btnNext2 = findViewById<ImageView>(R.id.btnNext2)
        btnPrev.setOnClickListener{
            finish()}
        btnNext2.setOnClickListener{
            val intent = Intent(this, ForthBirdactivity::class.java)
            startActivity(intent)
        }
    }
}