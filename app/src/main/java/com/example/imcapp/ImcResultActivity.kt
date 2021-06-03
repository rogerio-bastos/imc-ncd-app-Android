package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ImcResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_result)

        // Declarar os componentes do layout
        val textViewImc: TextView = findViewById(R.id.text_view_imc_result)
        val textViewStatus: TextView = findViewById(R.id.text_view_imc_status)
        val textViewStatusTip: TextView = findViewById(R.id.text_view_status_tip)
        val textViewTitleTip: TextView = findViewById(R.id.text_view_title_tip)
        val textViewTip: TextView = findViewById(R.id.text_view_tip)

        // Recuperando o peso e a altura que estão na intent
        val weight = intent.getDoubleExtra("weight", 0.0)
        val height = intent.getDoubleExtra("height", 0.0)

        // Cálculo do IMC
        val imc = imcCalculate(weight, height)

        // Exibimos o valor do Imc formatado com uma casa decimal
        textViewImc.text = String.format("%.1f", imc)

        // Recupera o status e a frase de status do imc
        val results = getStatus(imc)

        // Exibimos os resultados - Status e Frase
        textViewStatus.text = results[0]
        textViewStatusTip.text = results[1]

        // Recupera a dica do dia, que é um array (list<String>)
        val tips = getTipDay()

        // Exibimos a dica recuperadas no array
        textViewTitleTip.text = tips[0]
        textViewTip.text = tips[1]

    }
}