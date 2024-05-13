package com.example.listspinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnAcpetar : Button
    private lateinit var spin : Spinner
    private lateinit var text : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAcpetar = findViewById(R.id.btnAceptar)
        spin = findViewById(R.id.spinner)
        text = findViewById(R.id.texto)

        var opciones = resources.getStringArray(R.array.Mexico)
        var adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
        var bienvendida = ""
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spin.adapter = adapter

        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                val selectedItem = parent?.getItemAtPosition(position).toString()
                var mensaje = "Holo"
                var textoEstable = ""
                var txtbtn = ""

                when (position) {
                    0 -> {
                        mensaje = "Hello very very good"
                        bienvendida = "Welcome"
                        textoEstable = "Select something"
                        txtbtn = "Accept"
                    }
                    1 -> {
                        mensaje = "Hola Hola esto es UPIICSA"
                        bienvendida = "Bienvenido"
                        textoEstable = "Selecciona algo pedro"
                        txtbtn = "Aceptar"
                    }
                    2 -> {
                        mensaje = "Ola, voce quer sopa de macaco?"
                        bienvendida = "Bem-vindo"
                        textoEstable = "Seleccione algo "
                        txtbtn = "Aceitar"
                    }
                    3 -> {
                        mensaje = "L’Europe entière fut autrefois ennemie de la France"
                        bienvendida = "Accueillir"
                        textoEstable = "Suivant"
                        txtbtn = "Accepter"
                    }
                    4 -> {
                        mensaje = "Es lebe die Sowjetunion!"
                        bienvendida = "Willkommen"
                        textoEstable = "Folgende"
                        txtbtn = "Akzeptieren"
                    }
                    5 -> {
                        mensaje = "Viva la Repubblica Romana! questo è italiano"
                        bienvendida = "Benvenuto"
                        textoEstable = "Seguente"
                        txtbtn = "Accettare"
                    }
                    else -> "Pedro"
                }

                btnAcpetar.text = txtbtn
                text.text = textoEstable
                Toast.makeText(applicationContext, " $mensaje", Toast.LENGTH_SHORT).show()
              }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        btnAcpetar.setOnClickListener(){

            Toast.makeText(applicationContext, "$bienvendida", Toast.LENGTH_SHORT).show()
        }
    }



}