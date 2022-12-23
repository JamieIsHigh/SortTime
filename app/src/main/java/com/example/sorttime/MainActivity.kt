package com.example.sorttime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

        fun bubSor(lis: IntArray) {
            for (i in lis.indices) {
                for (x in 0 until lis.size - i - 1) {
                    if (lis[x] > lis[x + 1]) {
                        val temp = lis[x]
                        lis[x] = lis[x + 1]
                        lis[x + 1] = temp
                    }
                }
            }
        }
    }
}