package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.io.InputStream
import java.lang.Exception

class taxCalculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tax_calculator)

        val grossIncome : EditText = findViewById(R.id.grossIncome)
        val taxYear : EditText = findViewById(R.id.taxYear)

        val display : TextView = findViewById(R.id.outputTaxes)

        val btnOutput : Button = findViewById(R.id.enterTaxes)

        btnOutput.setOnClickListener {
            var string : List<String>
            var out : Double = 0.00
            var gross = grossIncome.text.toString().toDouble()
            //val temp = taxYear.text.append(".txt")
            var temp = taxYear.text.toString()
            temp = temp + ".txt"
            try {
                val input: InputStream = assets.open(temp.toString())
                input.bufferedReader().forEachLine{
                    string = it.split(",")
                    var casted : Double? = string[0].toDoubleOrNull()
                    if(out == 0.00 && (casted == null || casted > gross)){
                        out = gross * string[1].toDouble()
                        //gross = -1.00
                    }
                }
                //display.setText(input.toString())
            } catch (ex: Exception){
                display.setText(ex.toString())
            }

            display.setText(out.toString())
        }
    }
}