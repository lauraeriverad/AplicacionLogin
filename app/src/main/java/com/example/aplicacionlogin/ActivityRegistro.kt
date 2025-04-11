package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityRegistro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        // Configuración del botón de redirección
        val btnListo = findViewById<Button>(R.id.button3) // Asegúrate de que el ID coincida con el que tienes en tu layout
        btnListo.setOnClickListener {
            val intent = Intent(this, bienvenida::class.java) // Clase de la actividad de bienvenida
            startActivity(intent) // Iniciar la actividad de bienvenida
        }
    }
}
