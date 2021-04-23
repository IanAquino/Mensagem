package com.example.mensagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MostraMensagemActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostra_mensagem2)

      //  val mensagem = intent.getStringExtra("MENSAGEM")

        val mensagem = intent.getStringExtra((MainActivity.INFO_EXTRA_MENSAGEM))

        val textViewMensagem = findViewById<TextView>(R.id.textViewMesagem)


        textViewMensagem.text = mensagem

      //  val tvDataTime.text = intent.getStringExtra((MainActivity.INFO_EXTRA_TIME))

    }
}