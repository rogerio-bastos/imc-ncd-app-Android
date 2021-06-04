package com.example.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NcdResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd_result)

        val ncd = intent.getDoubleExtra("ncd", 0.0)

        val textViewNcdResult : TextView = findViewById(R.id.text_view_ncd_result)
        val textViewTitleTip : TextView = findViewById(R.id.text_view_title_tip)
        val texViewTip : TextView = findViewById(R.id.text_view_tip)

        textViewNcdResult.text = String.format("%.0f", ncd)

        val tips = getTipDay()

        textViewTitleTip.text = tips[0]
        texViewTip.text = tips[1]

    }
}