package com.example.imcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.view.isEmpty
import kotlin.system.exitProcess

//XP PROGRAMMING - Extreme P - Metodologia de programação - dois programadores por um computador
//Android Activity Lifecycle - Obrigatório o programador android saber

class NcdActivity : AppCompatActivity() {

    lateinit var editTextWeight: EditText
    lateinit var editTextAge: EditText
    lateinit var buttonCalculateNcd: Button
    lateinit var radioFemale: RadioButton
    lateinit var radioMale: RadioButton
    lateinit var spinnerExerciseLevel: Spinner
    lateinit var textViewSextitle: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        editTextWeight = findViewById(R.id.edit_text_weight)
        editTextAge = findViewById(R.id.edit_text_age)
        buttonCalculateNcd = findViewById(R.id.button_ncd_calculate)
        radioFemale = findViewById(R.id.radio_female)
        radioMale = findViewById(R.id.radio_male)
        textViewSextitle = findViewById(R.id.text_view_sex_title)
        spinnerExerciseLevel = findViewById(R.id.spinner_exercise_level)

        buttonCalculateNcd.setOnClickListener {
            if (editTextWeight.text.isEmpty()) {
                editTextWeight.error = "Por favor, digite seu peso."
            } else if (editTextAge.text.isEmpty()) {
                editTextAge.error = "Por favor, digite sua idade."
            } else if (spinnerExerciseLevel.selectedItemPosition < 1){
                Toast.makeText(this, "Selecione Seu nível de atividade", Toast.LENGTH_SHORT).show()
            } else{
                ncdCalculate()
            }
        }
    }

    fun ncdCalculate() {

        val weight = editTextWeight.text.toString().toDouble()
        val age = editTextAge.text.toString().toInt()
        val exerciseLevel = spinnerExerciseLevel.selectedItemPosition
        var sex = 'N'

        if (radioFemale.isChecked || radioMale.isChecked) {
            if (radioFemale.isChecked) sex = 'F' else sex = 'M'
        } else {
            Toast.makeText(this, "Selecione o sexo", Toast.LENGTH_SHORT).show()
        }

        val ncd = ncdCalculate(weight, age, exerciseLevel, sex)

        val intent = Intent(this, NcdResultActivity::class.java)
        intent.putExtra("ncd", ncd)
        startActivity(intent)
    }

}