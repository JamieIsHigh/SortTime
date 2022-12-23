package com.example.sorttime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lisBeftex = findViewById<TextView>(R.id.textView6)
        val lisAfttex = findViewById<TextView>(R.id.textView7)
        val sorBab = findViewById<TextView>(R.id.textView)
        val sorWst = findViewById<TextView>(R.id.textView2)
        val sorSca = findViewById<TextView>(R.id.textView3)
        val sorSzy = findViewById<TextView>(R.id.textView4)
        val sorHea = findViewById<TextView>(R.id.textView5)
        val lenLis = findViewById<EditText>(R.id.editTextTextPersonName)
        val sorIlo = findViewById<EditText>(R.id.editTextTextPersonName2)
        val trig = findViewById<Button>(R.id.button)

    }
}