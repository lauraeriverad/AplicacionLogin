package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class biblioteca : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_biblioteca)

        // Configuración del botón para redirigir a la actividad videos
        val btnVideosAutoayuda = findViewById<Button>(R.id.button5) // ID del botón en tu layout XML
        btnVideosAutoayuda.setOnClickListener {
            // Intent para redirigir a la actividad videos
            val intent = Intent(this, videos::class.java)
            startActivity(intent) // Iniciar la actividad videos
        }

        // Configuración para el botón "Reflexiones"
        val btnReflexiones = findViewById<Button>(R.id.button6) // Obtener el botón con ID button6
        btnReflexiones.setOnClickListener {
            // Intent para redirigir a la actividad Reflexiones
            val intent = Intent(this, reflexiones::class.java)
            startActivity(intent) // Iniciar la actividad Reflexiones
        }

        // Configuración para el botón "Frases Motivacionales"
        val btnFrases = findViewById<Button>(R.id.button7) // Obtener el botón con ID button7
        btnFrases.setOnClickListener {
            // Intent para redirigir a la actividad Frases
            val intent = Intent(this, frases::class.java)
            startActivity(intent) // Iniciar la actividad Frases
        }

        // Ajuste de las barras del sistema para Edge to Edge
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
