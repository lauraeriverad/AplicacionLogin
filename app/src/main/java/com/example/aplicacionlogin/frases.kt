package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class frases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_frases)

        // Aplicar los márgenes para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar el RadioButton
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)  // Obtén el RadioButton por su ID
        radioButton2.setOnClickListener {
            if (radioButton2.isChecked) {  // Verificamos si el RadioButton está seleccionado
                // Intent para redirigir a otra actividad, por ejemplo, "vaso"
                val intent = Intent(this, biblioteca::class.java)  // Reemplaza "vaso::class.java" por la actividad que desees
                startActivity(intent)  // Inicia la actividad deseada
            }
        }
    }
}
