package com.example.personajecreacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton : Button = findViewById(R.id.button)
        //prueba error git
        val botonRaza : Spinner = findViewById(R.id.spinner1)
        val botonClase : Spinner = findViewById(R.id.spinner2)
        val botonEstado : Spinner = findViewById(R.id.spinner3)


        ArrayAdapter.createFromResource(this, R.array.raza, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            botonRaza.adapter = adapter
        }
        ArrayAdapter.createFromResource(this, R.array.clase, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            botonRaza.adapter = adapter
        }
        ArrayAdapter.createFromResource(this, R.array.EstadoVital, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            botonRaza.adapter = adapter
        }


        boton.setOnClickListener {
            val intent = Intent(this@MainActivity,MostrarDatos::class.java)
            startActivity(intent)
        }

    }
}