package com.example.sorttime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //deklaracja elementów layoutu
        val random = Random()
        val lisBeftex = findViewById<TextView>(R.id.textView6)
        val sorBab = findViewById<TextView>(R.id.textView)
        val sorWst = findViewById<TextView>(R.id.textView2)
        val sorSca = findViewById<TextView>(R.id.textView3)
        val sorSzy = findViewById<TextView>(R.id.textView4)
        val sorHea = findViewById<TextView>(R.id.textView5)
        val lenLis = findViewById<EditText>(R.id.editTextTextPersonName)
        val sorIlo = findViewById<EditText>(R.id.editTextTextPersonName2)
        val trig = findViewById<Button>(R.id.button)
        var czasStart = 100000000000
        var czasStop = 100000000000

        fun bubbleSort(arr:IntArray):IntArray{
            var swap = true
            while(swap){
                swap = false
                for(i in 0 until arr.size-1){
                    if(arr[i] > arr[i+1]){
                        val temp = arr[i]
                        arr[i] = arr[i+1]
                        arr[i + 1] = temp

                        swap = true
                    }
                }
            }
            return arr
        }

        fun heapify(arr: IntArray, n: Int, i: Int) {
            var largest = i
            val left = 2 * i + 1
            val right = 2 * i + 2

            if (left < n && arr[left] > arr[largest]) {
                largest = left
            }

            if (right < n && arr[right] > arr[largest]) {
                largest = right
            }

            if (largest != i) {
                val swap = arr[i]
                arr[i] = arr[largest]
                arr[largest] = swap

                heapify(arr, n, largest)
            }
        }

        fun heapSort(arr: IntArray) {
            for (i in arr.size / 2 - 1 downTo 0) {
                heapify(arr, arr.size, i)
            }
            for (i in arr.size - 1 downTo 0) {
                val temp = arr[0]
                arr[0] = arr[i]
                arr[i] = temp

                heapify(arr, i, 0)
            }
        }

        trig.setOnClickListener {
            var dlugosc = 1
            if (lenLis.length() > 0) {
                dlugosc = lenLis.text.toString().toInt()
            }
            var lista = IntArray(dlugosc) { random.nextInt(10) }
            lisBeftex.text = lista.joinToString(", ", "[", "]")

            var powt = 1
            if (sorIlo.length() > 0) {
                powt = sorIlo.text.toString().toInt()
            }

            czasStart = System.currentTimeMillis()
            for (i in 0 until powt) {
                var listCopy = lista.clone()
                bubbleSort(listCopy)
            }
            czasStop = System.currentTimeMillis()
            sorBab.text = "Sortowanie bąbelkowe: " + (czasStop - czasStart).toString() + " ms"
        }
    }
}