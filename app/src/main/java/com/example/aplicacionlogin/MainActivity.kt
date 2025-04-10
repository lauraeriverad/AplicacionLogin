package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnRegistro = findViewById<Button>(R.id.button)
        btnRegistro.setOnClickListener {

            val intent = Intent(this, ActivityRegistro::class.java)
            startActivity(intent)
        }
    }
}