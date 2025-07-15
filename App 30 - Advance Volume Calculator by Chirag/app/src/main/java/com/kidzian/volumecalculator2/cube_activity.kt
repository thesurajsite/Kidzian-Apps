package com.kidzian.volumecalculator2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class cube_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cube)


        // initialize ui elements
        val side1EditText=findViewById<EditText>(R.id.side1EditText)
        val side2EditText=findViewById<EditText>(R.id.side2EditText)
        val side3EditText=findViewById<EditText>(R.id.side3EditText)
        val calculateButton=findViewById<Button>(R.id.calculateButton)
        val resultTextView=findViewById<TextView>(R.id.resultTextView)

        // set click listener for calculate button
        calculateButton.setOnClickListener {

            // check if all fields are not empty
            if(side1EditText.text.toString().isNotEmpty() && side2EditText.text.toString().isNotEmpty() && side3EditText.text.toString().isNotEmpty())
            {
                // get user input from edit texts
                val side1=side1EditText.text.toString().toInt()
                val side2=side2EditText.text.toString().toInt()
                val side3=side3EditText.text.toString().toInt()

                // calculate volume of cube
                val volume=side1*side2*side3
                // show result in text view
                resultTextView.setText(volume.toString())

            }

        }

    }
}