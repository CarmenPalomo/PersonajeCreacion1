package com.example.personajecreacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import java.util.logging.Logger

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    val log: Logger = Logger.getLogger("MainActivity")

    // Creación de variables para saber si han sido seleccionadas o no en el spinner
    var opcionSpinnerClase: String? = null
    var opcionSpinnerRaza: String? = null
    var opcionSpinnerEdad: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creacion de variables
        val boton: Button = findViewById(R.id.boton_siguiente)
        val spinnerRaza: Spinner = findViewById(R.id.spinner_raza)
        val spinnerClase: Spinner = findViewById(R.id.spinner_clase)
        val spinnerEdad: Spinner = findViewById(R.id.spinner_edad)

        // Se esta asociando a quien tiene que llamar el Spinner cuando ocurre el evento onItemSelected.
        spinnerRaza.onItemSelectedListener = this
        spinnerEdad.onItemSelectedListener = this
        spinnerClase.onItemSelectedListener = this

        boton.setOnClickListener {
            val intent = Intent(this@MainActivity, MostrarDatos::class.java)
            startActivity(intent)
        }

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        log.info("objecto del spinner seleccionado")
        log.info("valor de spiner clase $opcionSpinnerClase, raza $opcionSpinnerRaza, edad $opcionSpinnerEdad")

        if (parent?.id == R.id.spinner_clase) {
            opcionSpinnerClase = parent.getItemAtPosition(position) as String
            log.info("se ha obtenido $opcionSpinnerClase")
        } else if (parent?.id == R.id.spinner_raza) {
            opcionSpinnerRaza = parent.getItemAtPosition(position) as String
            log.info("se ha obtenido $opcionSpinnerRaza")
        } else if (parent?.id == R.id.spinner_edad) {
            opcionSpinnerEdad = parent.getItemAtPosition(position) as String
            log.info("se ha obtenido $opcionSpinnerEdad")
        }
        log.info("valor de spiner clase $opcionSpinnerClase, raza $opcionSpinnerRaza, edad $opcionSpinnerEdad")

        if (opcionSpinnerClase != null && opcionSpinnerRaza != null && opcionSpinnerEdad != null) {
            log.info("se cambia el imageView")
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}