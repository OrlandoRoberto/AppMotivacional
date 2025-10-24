package com.example.appmotivacional

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val FraseRepository = FraseRepository()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       var nome = findViewById<TextView>(R.id.text_saldacao)
       var nomeRecupeacao =  this.getSharedPreferences("motivacao",MODE_PRIVATE).getString("nome","Olá Kotlin")
   nome.text =nomeRecupeacao
        var novaFrase = findViewById<TextView>(R.id.text_frase)
        var botaoFrase = findViewById<Button>(R.id.button)
        var imagemall = findViewById<ImageView>(R.id.image_infinito)
        var imagemHappy = findViewById<ImageView>(R.id.image_carinha)
        var imagemsun = findViewById<ImageView>(R.id.image_sol)

        imagemsun.setOnClickListener {
            imagemall.setColorFilter (ContextCompat.getColor(this,R.color.black))
            imagemsun.setColorFilter (ContextCompat.getColor(this,R.color.white))
            imagemHappy.setColorFilter (ContextCompat.getColor(this,R.color.black))
            var fraseSorteada = FraseRepository.getFrase(2)
            novaFrase.text = fraseSorteada
        }
        imagemall.setOnClickListener {
            imagemall.setColorFilter (ContextCompat.getColor(this,R.color.white))
            imagemsun.setColorFilter (ContextCompat.getColor(this,R.color.black))
            imagemHappy.setColorFilter (ContextCompat.getColor(this,R.color.black))
            var fraseSorteada = FraseRepository.getFrase(0)
            novaFrase.text = fraseSorteada
        }
        imagemHappy.setOnClickListener {
            imagemall.setColorFilter (ContextCompat.getColor(this,R.color.black))
            imagemsun.setColorFilter (ContextCompat.getColor(this,R.color.black))
            imagemHappy.setColorFilter (ContextCompat.getColor(this,R.color.white))
            var fraseSorteada = FraseRepository.getFrase(1)
            novaFrase.text = fraseSorteada
        }

        botaoFrase.setOnClickListener {
            var fraseSorteada = FraseRepository.getFrase(0)
            novaFrase.text = fraseSorteada
        }
    }
}