package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SegundaActivity : AppCompatActivity() {
    var contador = 0
    lateinit var tercerBoton:Button
    lateinit var cuartoBoton:Button
    lateinit var btnIncrementar:Button
    lateinit var btnDecrementar:Button
    lateinit var tvContador:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        tercerBoton = findViewById(R.id.tercer_boton)
        cuartoBoton = findViewById(R.id.cuarto_boton)
        btnIncrementar = findViewById(R.id.incrementar_boton)
        btnDecrementar = findViewById(R.id.decrementar_boton)
        tvContador = findViewById(R.id.tv_contador)

        tercerBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this, MainActivity::class.java)
            startActivity(miIntent)
        })

        cuartoBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this, TerceraActivity::class.java)
            startActivity(miIntent)
        })

        btnIncrementar.setOnClickListener {
            contador++
            tvContador.text = "$contador"

        }
        btnDecrementar.setOnClickListener {
            contador--
            tvContador.text = "$contador"
        }

    }
}