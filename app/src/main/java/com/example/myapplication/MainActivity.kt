package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var primerBoton:Button
    lateinit var segundoBoton:Button
//pequeño cambio
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("mi_app","Estoy en el metodo onCreate")

        primerBoton = findViewById(R.id.primer_boton)
        segundoBoton = findViewById(R.id.segundo_boton)

        primerBoton.setOnClickListener(View.OnClickListener {
            Log.d("mi_app","Le diste click al primer boton")
            val miIntent = Intent(this, SegundaActivity::class.java)
            startActivity(miIntent)
        })

        segundoBoton.setOnClickListener(View.OnClickListener {
            Log.d("mi_app","Le diste click al segundo boton de una manera mas sencilla")
            val miIntent = Intent(this, TerceraActivity::class.java)
            startActivity(miIntent)
        })
    }

    override fun onStart() {
        super.onStart()
        Log.i("mi_app","Estoy en el metodo onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("mi_app","Estoy en el metodo onPause")
    }
}

