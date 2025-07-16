package com.kidzian.temperatureconverter

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val celsiusEditText= findViewById<EditText>(R.id.celsiusEditText)
        val farenheitEditText= findViewById<EditText>(R.id.farenheitEditText)
        val upButton=findViewById<ImageView>(R.id.upButton)
        val downButton=findViewById<ImageView>(R.id.downButton)


        // Celsius to Farenheit
        downButton.setOnClickListener {

            // check if the EditText is not empty
            if(celsiusEditText.text.isNotEmpty()){
                val celsius=celsiusEditText.text.toString().toDouble()           // get celsius value
                val farenheit= (celsius * 1.8) + 32                              // convert celsius to farenheit
                farenheitEditText.setText(farenheit.toString())                  // set farenheit value in EditText
            }
        }



        // Farenheit to Celsius
        upButton.setOnClickListener {

            // check if the EditText is not empty
            if(farenheitEditText.text.isNotEmpty()){
                val farenheit=farenheitEditText.text.toString().toDouble()       // get farenheit value
                val celsius= (farenheit - 32) / 1.8                              // convert farenheit to celsius
                celsiusEditText.setText(celsius.toString())                      // set celsius value in EditText
            }
        }

    }
}