package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ImcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        val editTextWeight: EditText = findViewById(R.id.edit_text_weight)
        val editTextHeight: EditText = findViewById(R.id.edit_text_height)
        val buttonCalculate: Button = findViewById(R.id.button_imc_calculate)

        buttonCalculate.setOnClickListener {
            if (editTextWeight.text.isEmpty()) {
                editTextWeight.error = "Por favor, digite o seu peso!"
            } else if (editTextHeight.text.isEmpty()) {
                editTextHeight.error = "Por favor, digite a sua altura!"
            } else if (editTextHeight.text.toString().toDouble() > 2.50) {
                editTextHeight.error = "Por favor, digite uma altura válida!"
            } else {
                val intent = Intent(this, ImcResultActivity::class.java)

                intent.putExtra("weight", editTextWeight.text.toString().toDouble())
                intent.putExtra("height", editTextHeight.text.toString().toDouble())

                startActivity(intent)
            }
        }
    }
}
