package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class taxCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tax_calculator)

        val grossIncome : EditText = findViewById(R.id.grossIncome)
        val taxYear : EditText = findViewById(R.id.taxYear)

        val display : TextView = findViewById(R.id.outputTaxes)

        val btnOutput : Button = findViewById(R.id.enterTaxes)

        btnOutput.setOnClickListener {
            display.setText(grossIncome.text)
        }
    }
}