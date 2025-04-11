package com.example.aplicacionlogin

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class vaso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_vaso)

        // Aplicar los márgenes para las barras del sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Configurar el RadioButton
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)  // Obtén el RadioButton por su ID
        radioButton3.setOnClickListener {
            if (radioButton3.isChecked) {  // Verificamos si el RadioButton está seleccionado
                // Intent para redirigir a la actividad "reflexiones"
                val intent = Intent(this, reflexiones::class.java)  // Cambiar a la actividad reflexiones
                startActivity(intent)  // Inicia la actividad deseada
            }
        }
    }
}
