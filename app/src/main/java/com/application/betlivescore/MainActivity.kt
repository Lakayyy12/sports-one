package com.application.betlivescore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var btns : Button? = null
    private var abt : Button? = null
    private var exit = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btns = findViewById(R.id.btn_menu)
        btns?.setOnClickListener{
            val intent = Intent(this, SportsActivity::class.java)
            startActivity(intent)
        }
        abt = findViewById(R.id.abt)
        abt?.setOnClickListener{
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        } else {
            finish()
        }
    }
}

