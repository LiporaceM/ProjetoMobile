package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_jornadas)

        val editText: EditText = findViewById(R.id.editTextText)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView2)

        button.setOnClickListener{
            val nomeUsuario = editText.text.toString()
            val mensagem = "Bom dia, $nomeUsuario"
            textView.text = mensagem
        }
    }
}