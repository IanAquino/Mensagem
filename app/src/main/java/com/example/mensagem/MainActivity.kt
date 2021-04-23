package com.example.mensagem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.text.SimpleDateFormat
import java.util.*
import kotlin.time.measureTimedValue

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun enviaMensagem(view: View) {
        val editTextMensagem = findViewById<EditText>(R.id.editTextMensagem)

        val mensagem = editTextMensagem.text.toString()

        if(mensagem.isBlank()){
            editTextMensagem.error = getString(R.string.mensagem_vazia)
            return

        }

       /* val date = Calendar.getInstance().time
        val tvFullDateTime.text = date.toString()
        var dateTimeFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
        val tvDateTime.text = dateTimeFormat.format(date)*/



        val intent = Intent(this, MostraMensagemActivity2::class.java).apply {  }
        intent.putExtra("MENSAGEM", mensagem)
        startActivity(intent)
    }

    companion object {
        const val INFO_EXTRA_MENSAGEM = "MENSAGEM"
    }

}


