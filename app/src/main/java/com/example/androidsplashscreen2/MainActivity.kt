package com.example.androidsplashscreen2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView> (R.id.imageView)

        imageView.setOnClickListener {
            imageView.animate().apply {
                duration = 2000
                rotationYBy(360f)
            }.start()
        }
    }
    }
