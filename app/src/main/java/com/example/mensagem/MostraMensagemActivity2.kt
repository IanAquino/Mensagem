package com.example.mensagem

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.annotation.RequiresApi
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MostraMensagemActivity2 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem2)

       // val mensagem = intent.getStringExtra("MENSAGEM")

        val mensagem = intent.getStringExtra((MainActivity.INFO_EXTRA_MENSAGEM))
        val date = intent.getStringExtra((MainActivity.INFO_EXTRA_TIME))

        val textViewMensagem = findViewById<TextView>(R.id.textViewMesagem)

        val textViewDataHora = findViewById<TextView>(R.id.textViewDataHora)

        textViewDataHora.text = date
        textViewMensagem.text = mensagem

    }
}