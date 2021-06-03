package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ** Clique no card IMC e NCD
        val cardImc = findViewById<CardView>(R.id.card_imc)
        val cardNcd : CardView = findViewById(R.id.card_ncd)

        cardImc.setOnClickListener {
            val openImcActivity = Intent(this, ImcActivity::class.java)
            startActivity(openImcActivity)
        }

        cardNcd.setOnClickListener {
            val openNcdActivity = Intent(this, NcdActivity::class.java)
            startActivity(openNcdActivity)
        }


    }
}