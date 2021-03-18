package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class TerceraActivity : AppCompatActivity() {
    lateinit var quintoBoton:Button
    lateinit var sextoBoton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tercera)

        quintoBoton = findViewById(R.id.quinto_boton)
        sextoBoton = findViewById(R.id.sexto_boton)

        quintoBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this, MainActivity::class.java)
            startActivity(miIntent)
        })

        sextoBoton.setOnClickListener(View.OnClickListener {
            val miIntent = Intent(this, SegundaActivity::class.java)
            startActivity(miIntent)
        })
    }
}