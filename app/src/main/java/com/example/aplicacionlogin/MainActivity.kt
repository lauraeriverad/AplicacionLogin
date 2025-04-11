package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Configuración del botón de redirección
        val btnRegistro = findViewById<Button>(R.id.button) // Aquí va el ID de tu botón
        btnRegistro.setOnClickListener {
            // Intent para redirigir a la actividad biblioteca
            val intent = Intent(this, biblioteca::class.java)
            startActivity(intent) // Iniciar la actividad biblioteca
        }

        // Configuración del botón de iniciar sesión
        val btnIniciarSesion = findViewById<Button>(R.id.button2) // ID del botón en tu layout XML
        btnIniciarSesion.setOnClickListener {
            // Intent para redirigir a la actividad biblioteca
            val intent = Intent(this, biblioteca::class.java) // Cambia 'biblioteca' al nombre correcto de tu actividad
            startActivity(intent) // Iniciar la actividad biblioteca
        }
    }
}
