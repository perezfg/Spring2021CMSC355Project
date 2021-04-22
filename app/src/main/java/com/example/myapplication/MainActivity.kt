package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val languages = resources.getStringArray(R.array.Languages)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter
        }
            val taxActivity : Button = findViewById(R.id.taxActivity)
        taxActivity.setOnClickListener {
            val intent = Intent(this, taxCalculator::class.java)
            startActivity(intent)
        }
        val transActivity : Button = findViewById(R.id.translatorActivity)
        transActivity.setOnClickListener {
            val intent = Intent(this, translator::class.java)
            startActivity(intent)
        }
    }
}