package com.kidzian.volumecalculator2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class cylinder_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cylinder)


        // initialize ui elements here
        val radiusEditText = findViewById<EditText>(R.id.radiusEditText)
        val heightEditText = findViewById<EditText>(R.id.heightEditText)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val calculateButton = findViewById<Button>(R.id.calculateButton)


        // set click listener for calculate button
        calculateButton.setOnClickListener {

            // check if radius and height are not empty
            if(radiusEditText.text.isNotEmpty() && heightEditText.text.isNotEmpty())
            {
                // get radius and height from edit text
                val radius = radiusEditText.text.toString().toDouble()
                val height = heightEditText.text.toString().toDouble()
                // calculate volume of cylinder
                val volume = 3.14 * radius * radius * height
                // set result text
                resultTextView.setText(volume.toString())
            }

        }
    }
}