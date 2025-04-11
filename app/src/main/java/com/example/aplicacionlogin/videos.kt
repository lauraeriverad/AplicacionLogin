package com.example.aplicacionlogin

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.RadioButton
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class videos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        // Configuración del VideoView
        val videoView = findViewById<VideoView>(R.id.videoView)
        val videoUri = Uri.parse("android.resource://${packageName}/${R.raw.video}")
        videoView.setVideoURI(videoUri)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.setOnPreparedListener {
            videoView.start()
            it.isLooping = true
        }

        // Configuración del RadioButton
        val radioButton = findViewById<RadioButton>(R.id.radioButton)  // Obtén el RadioButton por su ID
        radioButton.setOnClickListener {
            if (radioButton.isChecked) {  // Verificamos si el RadioButton está seleccionado
                // Intent para redirigir a otra actividad, por ejemplo, actividad "vaso"
                val intent = Intent(this, biblioteca::class.java)  // Reemplaza "vaso::class.java" por la actividad que desees
                startActivity(intent)  // Inicia la actividad deseada
            }
        }
    }
}
