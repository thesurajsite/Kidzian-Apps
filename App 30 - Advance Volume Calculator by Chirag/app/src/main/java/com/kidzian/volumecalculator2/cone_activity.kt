package com.kidzian.volumecalculator2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class cone_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cone)


        // Initialize ui elements
        val radiusEditText = findViewById<EditText>(R.id.radiusEditText)
        val heightEditText = findViewById<EditText>(R.id.heightEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val calculateButton = findViewById<Button>(R.id.calculateButton)

        // set click listener on calculate button
        calculateButton.setOnClickListener {

            // check if both fields are not empty
            if(radiusEditText.text.isNotEmpty() && heightEditText.text.isNotEmpty())
            {
                // get user input
                val radius = radiusEditText.text.toString().toDouble()
                val height = heightEditText.text.toString().toDouble()
                // calculate volume
                val volume = (3.14 * radius * radius * height) / 3
                // show result in the text view
                resultTextView.setText(volume.toString())
            }

        }
    }
}