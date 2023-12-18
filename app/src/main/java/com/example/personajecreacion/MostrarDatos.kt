package com.example.personajecreacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MostrarDatos: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mostrar_datos)
        val botonAtras: Button = findViewById(R.id.boton_atras1)
        val textview : TextView = findViewById<TextView>(R.id.Datos)

        var raza = intent.getStringExtra("raza")
        var clase = intent.getStringExtra("clase")
        var edad = intent.getStringExtra("edad")
        var nombre = intent.getStringExtra("nombre")
        textview.text = "raza: $raza clase: $clase edad: $edad nombre: $nombre"

        botonAtras.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }
}
