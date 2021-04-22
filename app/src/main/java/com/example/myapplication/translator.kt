package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class translator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translator)
        val languages = resources.getStringArray(R.array.TranslateFrom)
        val spinner = findViewById<Spinner>(R.id.fromSpinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter
        }
        val languages1 = resources.getStringArray(R.array.TranslateTo)
        val spinner1 = findViewById<Spinner>(R.id.toSpinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages1
            )
            spinner1.adapter = adapter
        }
    }
}