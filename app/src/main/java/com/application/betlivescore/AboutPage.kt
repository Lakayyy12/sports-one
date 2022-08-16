package com.application.betlivescore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutPage : AppCompatActivity() {

    private var btn : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btn = findViewById(R.id.bk)
        btn?.setOnClickListener{
            onBackPressed()
        }
    }
}