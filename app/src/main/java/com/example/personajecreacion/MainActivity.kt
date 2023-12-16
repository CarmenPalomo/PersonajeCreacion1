package com.example.personajecreacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.boton_siguiente)
        val spinnerRaza : Spinner = findViewById(R.id.spinner_raza)
        val spinnerClase : Spinner = findViewById(R.id.spinner_clase)
        val spinnerEstado : Spinner = findViewById(R.id.spinner_edad)


        boton.setOnClickListener {
            val intent = Intent(this@MainActivity,MostrarDatos::class.java)
            startActivity(intent)
        }

    }
}